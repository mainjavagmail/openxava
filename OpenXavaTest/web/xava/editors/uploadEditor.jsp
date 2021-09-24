<%@ page import="org.openxava.model.meta.MetaProperty" %>
<%@ page import="org.openxava.util.Is" %>
<%@ page import="org.openxava.util.XavaException" %>
<%@ page import="org.openxava.web.editors.IUploadFilesIdsProvider" %>

<%
String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String applicationName = request.getParameter("application");
String module = request.getParameter("module");
boolean editable = "true".equals(request.getParameter("editable"));
String dataEditable = editable?"":"data-editable='true'";
Object value = request.getAttribute(propertyKey + ".value");
String dataFiles = "";
String filesIds = null; 
if (!Is.empty(value)) {
	String filesIdsProviderClass = request.getParameter("filesIdsProviderClass");
	if (Is.emptyString(filesIdsProviderClass)) {
		throw new XavaException("files_ids_provider_class_parameter_missed__upload_editor"); 
	}
	IUploadFilesIdsProvider filesIdsProvider = (IUploadFilesIdsProvider) Class.forName(filesIdsProviderClass).newInstance(); 
	filesIds = filesIdsProvider.getFilesIds(value);
	if (filesIds != null) {
		dataFiles = "data-files='" + filesIds + "'"; 
	}
}
String dataEmpty = "null".equals(value) || Is.empty(value) || !Is.empty(value) && filesIds != null && "".equals(filesIds)?"data-empty='true'":""; 
String cssClass = request.getParameter("cssClass");
cssClass = Is.emptyString(cssClass)?"":" " + cssClass;
if (!editable) cssClass = cssClass + " ox-filepond-read-only";  
boolean multiple = "true".equals(request.getParameter("multipleFiles"));
String dataMultiple = multiple?"data-multiple='true'":"";
boolean preview = !"false".equals(request.getParameter("imagePreview"));
String dataPreview = !preview?"data-preview='false'":"";
String script = request.getParameter("script");
boolean throwsChanged = script != null && script.contains(".throwPropertyChanged(");
String dataThrowsChanged = throwsChanged?"data-throws-changed='true'":"";
// tmr ini
String acceptFileTypes = request.getParameter("acceptFileTypes");
System.out.println("[uploadEditor.jsp] acceptFileTypes.1=" + acceptFileTypes); // tmr
if (!Is.emptyString(acceptFileTypes) && acceptFileTypes.toLowerCase().contains("text/csv")) {
	acceptFileTypes += ",.csv";
}
System.out.println("[uploadEditor.jsp] acceptFileTypes.2=" + acceptFileTypes); // tmr 
String accept = Is.emptyString(acceptFileTypes)?"":"accept='" + acceptFileTypes + "'";
System.out.println("[uploadEditor.jsp] accept=" + accept); // tmr
// tmr fin
%>
<input id='<%=propertyKey%>' 
	type="file" class="xava_upload<%=cssClass%>"
	data-application="<%=applicationName%>" 
	data-module="<%=module%>"
	<%=accept%> <%-- tmr --%>
	<%=dataMultiple%>
	<%=dataPreview%>
	<%=dataFiles%> 
	<%=dataEmpty%>
	<%=dataEditable%>
	<%=dataThrowsChanged%>/> 

<input type="hidden" name="<%=propertyKey%>" value="<%=value%>">

<jsp:include page="filePondTranslation.jsp"/>	

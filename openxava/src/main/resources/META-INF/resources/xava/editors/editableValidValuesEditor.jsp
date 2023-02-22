<%@page import="java.util.Map"%>
<%@page import="org.openxava.model.meta.MetaProperty"%>
<%@page import="org.openxava.view.View"%>
<%@page import="java.util.Collections"%>

<jsp:useBean id="style" class="org.openxava.web.style.Style" scope="request"/>
<jsp:useBean id="context" class="org.openxava.controller.ModuleContext" scope="session"/>

<%
String viewObject = request.getParameter("viewObject");
View view = (View) context.get(request, viewObject);
String collectionName = request.getParameter("collectionName");
if (!org.openxava.util.Is.emptyString(collectionName)) {
	view = view.getSubview(collectionName);
   System.out.println("if");
}
String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String script = request.getParameter("script"); 
boolean editable = "true".equals(request.getParameter("editable")); 
boolean label = org.openxava.util.XavaPreferences.getInstance().isReadOnlyAsLabel();
Object value = request.getAttribute(propertyKey + ".value") == null ? "" : request.getAttribute(propertyKey + ".value");
   //nullpointer
Map<Object, Object> validValues = view.getValidValues(p.getName()) == null ? Collections.emptyMap(): view.getValidValues(p.getName()) ;
Object description = validValues.get(value);
%>
    
<%
if (editable) { 
   /*
   System.out.println(viewObject);
   System.out.println(collectionName);
   System.out.println(propertyKey);
   System.out.println(script);
   System.out.println(value);
   System.out.println(view.getValidValues(p.getName()));
   System.out.println(description);
   */
   /*
   xava_view
   null
   ox_facturacion_Dropdown__lista
    onblur="openxava.onBlur('facturacion','Dropdown','ox_facturacion_Dropdown__lista')" onfocus="openxava.onFocus('facturacion','Dropdown','ox_facturacion_Dropdown__lista')"
   holaK
   {holaK=holaV, holaK2=holaV2, holaK3=holaV3, holaK4=holaV4}
   holaV
   */
   
	if (validValues.isEmpty()) { %>
   <input id="<%=propertyKey%>" name="<%=propertyKey%>" 
		type="text" 
		value="<%=value%>"/>
    <%
	} else {
       %>
        <div class="select-editable">
    <select tabindex="1" class=<%=style.getEditor()%> <%=script%> 
		title="<%=p.getDescription(request)%>" 
		onchange="this.nextElementSibling.value=this.value">
		<% if (view.hasBlankValidValue(p.getName())) { %>
			<option value=""></option>
		<% } %>
			<%
			for (Map.Entry e: validValues.entrySet()) {
				String selected = e.getKey().equals(value) ?"selected":"";
			%>
				<option value="<%=e.getKey()%>" <%=selected%>> <%=e.getValue()%> </option>
			<%
			} // while
			%>
	</select>
	<input id="<%=propertyKey%>" name="<%=propertyKey%>" 
		type="text" 
		oninput="this.previousElementSibling.options[0].value=this.value; this.previousElementSibling.options[0].innerHTML=this.value" 
		onchange="this.previousElementSibling.selectedIndex=0" value="<%=value%>" />
	<input type="hidden" name="<%=propertyKey%>__DESCRIPTION__" value="<%=description%>"/>
</div>
<%		
	}
   
%>
    

<% 
} else { 
	if (label) {
%>
	<%=description%>
<%
	}
	else {
%>
	<input name = "<%=propertyKey%>_DESCRIPTION_" class=<%=style.getEditor()%>
	type="text" 
	title="<%=p.getDescription(request)%>"	
	maxlength="<%=p.getSize()%>" 	
	size="<%=p.getSize()%>" 
	value="<%=description%>"
	disabled
	/>
<%  } %>
	<input type="hidden" name="<%=propertyKey%>" value="<%=value%>">	
<% } %>			

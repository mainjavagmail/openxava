/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2020-03-24 11:56:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.web.Actions;
import org.openxava.web.Ids;
import org.openxava.model.meta.MetaProperty;
import org.openxava.tab.Tab;
import org.openxava.util.Is;

public final class comparatorsCombo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1585050824694L));
    _jspx_dependants.put("jar:file:/C:/Users/javie/git/openxava-openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/xava/editors/../imports.jsp", Long.valueOf(1585050811650L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1585050824912L));
    _jspx_dependants.put("jar:file:/C:/Users/javie/git/openxava-openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.web.Actions");
    _jspx_imports_classes.add("org.openxava.tab.Tab");
    _jspx_imports_classes.add("org.openxava.web.Ids");
    _jspx_imports_classes.add("org.openxava.util.Is");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');

String comparator = request.getParameter("comparator");
String prefix = request.getParameter("prefix");
if (prefix == null) prefix = "";
boolean isString = "true".equals(request.getParameter("isString"));
boolean isDate = "true".equals(request.getParameter("isDate"));
boolean isEmpty = "true".equals(request.getParameter("isEmpty"));
String eq = Tab.EQ_COMPARATOR.equals(comparator)?"selected='selected'":"";
String ne = Tab.NE_COMPARATOR.equals(comparator)?"selected='selected'":"";
String ge = Tab.GE_COMPARATOR.equals(comparator)?"selected='selected'":"";
String le = Tab.LE_COMPARATOR.equals(comparator)?"selected='selected'":"";
String gt = Tab.GT_COMPARATOR.equals(comparator)?"selected='selected'":"";
String lt = Tab.LT_COMPARATOR.equals(comparator)?"selected='selected'":"";
String in = Tab.IN_COMPARATOR.equals(comparator)?"selected='selected'":""; 
String notIn = Tab.NOT_IN_COMPARATOR.equals(comparator)?"selected='selected'":""; 
String startsWith = Tab.STARTS_COMPARATOR.equals(comparator)?"selected='selected'":"";
String contains = Tab.CONTAINS_COMPARATOR.equals(comparator)?"selected='selected'":"";
String endsWith = Tab.ENDS_COMPARATOR.equals(comparator)?"selected='selected'":""; 
String empty = Tab.EMPTY_COMPARATOR.equals(comparator)?"selected='selected'":"";
String notEmpty = Tab.NOT_EMPTY_COMPARATOR.equals(comparator)?"selected='selected'":"";
String notContains = Tab.NOT_CONTAINS_COMPARATOR.equals(comparator)?"selected='selected'":"";
String year = Tab.YEAR_COMPARATOR.equals(comparator)?"selected='selected'":"";
String month = Tab.MONTH_COMPARATOR.equals(comparator)?"selected='selected'":"";
String yearMonth = Tab.YEAR_MONTH_COMPARATOR.equals(comparator)?"selected='selected'":"";
String range = Tab.RANGE_COMPARATOR.equals(comparator)?"selected='selected'":"";
String idConditionValue = request.getParameter("idConditionValue");
String idConditionValueTo = request.getParameter("idConditionValueTo");
String propertyKey = request.getParameter("comparatorPropertyKey"); 
String name = null;
String script = null;
if (propertyKey == null) {
	int index = Integer.parseInt(request.getParameter("index"));
	name = Ids.decorate(request, prefix + "conditionComparator." + index);
	script = Actions.getActionOnChangeComparator(name,idConditionValue,idConditionValueTo);
	
	if (org.openxava.util.XavaPreferences.getInstance().isFilterOnChange()) {
		String collection = request.getParameter("collection"); 
		String collectionArgv = Is.emptyString(collection)?"":"collection="+collection;
		script = new StringBuilder(script.replace(")\"", "); "))
				    .append("if (this.options[this.selectedIndex].value.indexOf('range') < 0) { ") 
				    .append("openxava.executeAction('")
				    .append(request.getParameter("application"))	
	 			    .append("', '")
	 			    .append(request.getParameter("module"))
	 			    .append("', '', false, 'List.filter','")
	 			    .append(collectionArgv).append("'); ")		
				    .append("}\"").toString();
	}
}
else {
	name = propertyKey;
	script = request.getParameter("script");
}

      out.write("\n");
      out.write("<select id=\"");
      out.print(name);
      out.write("\" name=\"");
      out.print(name);
      out.write("\" class=");
      out.print(style.getEditor());
      out.write(' ');
      out.print(script);
      out.write(" style=\"width: 100%;\">\n");
      out.write("\t");
 
	if (!isEmpty) { 
	
      out.write('\n');
      out.write('	');

	if (isString) {
	
      out.write("\t\t\t\t\n");
      out.write("\t<option value=\"");
      out.print(Tab.CONTAINS_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(contains);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f0_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f0.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(72,60) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f0.setKey(Tab.CONTAINS_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
        if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
        _jspx_th_xava_005fmessage_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f0_reused);
      }
      out.write("</option>\t\t\n");
      out.write("\t<option value=\"");
      out.print(Tab.STARTS_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(startsWith);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f1 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f1_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f1.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f1.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(73,60) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f1.setKey(Tab.STARTS_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f1 = _jspx_th_xava_005fmessage_005f1.doStartTag();
        if (_jspx_th_xava_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
        _jspx_th_xava_005fmessage_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f1_reused);
      }
      out.write("</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.ENDS_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(endsWith);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f2 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f2_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f2.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f2.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(74,56) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f2.setKey(Tab.ENDS_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f2 = _jspx_th_xava_005fmessage_005f2.doStartTag();
        if (_jspx_th_xava_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
        _jspx_th_xava_005fmessage_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f2, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f2_reused);
      }
      out.write("</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.NOT_CONTAINS_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(notContains);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f3 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f3_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f3.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f3.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(75,67) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f3.setKey(Tab.NOT_CONTAINS_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f3 = _jspx_th_xava_005fmessage_005f3.doStartTag();
        if (_jspx_th_xava_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f3);
        _jspx_th_xava_005fmessage_005f3_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f3, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f3_reused);
      }
      out.write("</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.EMPTY_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(empty);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f4 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f4_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f4.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f4.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(76,54) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f4.setKey(Tab.EMPTY_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f4 = _jspx_th_xava_005fmessage_005f4.doStartTag();
        if (_jspx_th_xava_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f4);
        _jspx_th_xava_005fmessage_005f4_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f4, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f4_reused);
      }
      out.write("</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.NOT_EMPTY_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(notEmpty);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f5 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f5_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f5.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f5.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(77,61) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f5.setKey(Tab.NOT_EMPTY_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f5 = _jspx_th_xava_005fmessage_005f5.doStartTag();
        if (_jspx_th_xava_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f5);
        _jspx_th_xava_005fmessage_005f5_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f5, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f5_reused);
      }
      out.write("</option>\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\t<option value=\"");
      out.print(Tab.EQ_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(eq);
      out.write(">=</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.NE_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(ne);
      out.write("><></option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.GE_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(ge);
      out.write(">>=</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.LE_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(le);
      out.write("><=</option>\t\n");
      out.write("\t<option value=\"");
      out.print(Tab.GT_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(gt);
      out.write(">></option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.LT_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(lt);
      out.write("><</option>\n");
      out.write("\t\n");
      out.write("\t");

	if (isDate) {
	
      out.write("\n");
      out.write("\t<option value=\"");
      out.print(Tab.EMPTY_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(empty);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f6 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f6_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f6.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f6.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(91,54) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f6.setKey(Tab.EMPTY_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f6 = _jspx_th_xava_005fmessage_005f6.doStartTag();
        if (_jspx_th_xava_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f6);
        _jspx_th_xava_005fmessage_005f6_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f6, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f6_reused);
      }
      out.write("</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.NOT_EMPTY_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(notEmpty);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f7 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f7_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f7.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f7.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(92,61) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f7.setKey(Tab.NOT_EMPTY_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f7 = _jspx_th_xava_005fmessage_005f7.doStartTag();
        if (_jspx_th_xava_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f7);
        _jspx_th_xava_005fmessage_005f7_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f7, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f7_reused);
      }
      out.write("</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.YEAR_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(year);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f8 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f8_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f8.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f8.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(93,52) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f8.setKey(Tab.YEAR_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f8 = _jspx_th_xava_005fmessage_005f8.doStartTag();
        if (_jspx_th_xava_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f8);
        _jspx_th_xava_005fmessage_005f8_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f8, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f8_reused);
      }
      out.write("</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.MONTH_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(month);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f9 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f9_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f9.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f9.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(94,54) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f9.setKey(Tab.MONTH_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f9 = _jspx_th_xava_005fmessage_005f9.doStartTag();
        if (_jspx_th_xava_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f9);
        _jspx_th_xava_005fmessage_005f9_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f9, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f9_reused);
      }
      out.write("</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.YEAR_MONTH_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(yearMonth);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f10 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f10_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f10.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f10.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(95,63) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f10.setKey(Tab.YEAR_MONTH_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f10 = _jspx_th_xava_005fmessage_005f10.doStartTag();
        if (_jspx_th_xava_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f10);
        _jspx_th_xava_005fmessage_005f10_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f10, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f10_reused);
      }
      out.write("</option>\n");
      out.write("\t");

	}	
	
      out.write("\n");
      out.write("\t<option value=\"");
      out.print(Tab.IN_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(in);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f11 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f11_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f11.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f11.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(99,48) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f11.setKey(Tab.IN_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f11 = _jspx_th_xava_005fmessage_005f11.doStartTag();
        if (_jspx_th_xava_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f11);
        _jspx_th_xava_005fmessage_005f11_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f11, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f11_reused);
      }
      out.write("</option>\n");
      out.write("\t<option value=\"");
      out.print(Tab.NOT_IN_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(notIn);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f12 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f12_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f12.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f12.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(100,55) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f12.setKey(Tab.NOT_IN_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f12 = _jspx_th_xava_005fmessage_005f12.doStartTag();
        if (_jspx_th_xava_005fmessage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f12);
        _jspx_th_xava_005fmessage_005f12_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f12, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f12_reused);
      }
      out.write("</option>\n");
      out.write("\t");
 
	if (propertyKey == null) { 
	
      out.write("\t\n");
      out.write("\t<option value=\"");
      out.print(Tab.RANGE_COMPARATOR);
      out.write('"');
      out.write(' ');
      out.print(range);
      out.write('>');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f13 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      boolean _jspx_th_xava_005fmessage_005f13_reused = false;
      try {
        _jspx_th_xava_005fmessage_005f13.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fmessage_005f13.setParent(null);
        // /xava/editors/comparatorsCombo.jsp(104,54) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fmessage_005f13.setKey(Tab.RANGE_COMPARATOR);
        int _jspx_eval_xava_005fmessage_005f13 = _jspx_th_xava_005fmessage_005f13.doStartTag();
        if (_jspx_th_xava_005fmessage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f13);
        _jspx_th_xava_005fmessage_005f13_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f13, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f13_reused);
      }
      out.write("</option>\n");
      out.write("\t");

	}
	
      out.write('\n');
      out.write('	');

	} // isEmpty
	
      out.write("\n");
      out.write("</select>\t\n");
      out.write("\t");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

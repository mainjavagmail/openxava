/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-09-16 11:41:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.naviox;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.util.Users;

public final class leftMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1568634030858L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1568634030862L));
    _jspx_dependants.put("/naviox/organizationNameExt.jsp", Long.valueOf(1561465294835L));
    _jspx_dependants.put("/naviox/../xava/imports.jsp", Long.valueOf(1568634030399L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.util.Users");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody;
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
    _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      com.openxava.naviox.Modules modules = null;
      synchronized (session) {
        modules = (com.openxava.naviox.Modules) _jspx_page_context.getAttribute("modules", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (modules == null){
          modules = new com.openxava.naviox.Modules();
          _jspx_page_context.setAttribute("modules", modules, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"modules_list\"> \r\n");
      out.write("\r\n");
      out.write("\t<div id=\"modules_list_top\"> \r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"application_title\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div id=\"application_name\">\r\n");
      out.write("\t\t\t\t");
      out.print(modules.getApplicationLabel(request));
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div id=\"organization_name\">\r\n");
      out.write("\t\t\t\t");
 String organizationName = modules.getOrganizationName(request); 
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print(organizationName);
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 if (Users.getCurrent() != null && modules.showsIndexLink()) { 
      out.write("\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/m/Index\">\r\n");
      out.write("\t\t\t\t<div id='organizations_index' class='");
      out.print("Index".equals(request.getParameter("module"))?"selected":"");
      out.write("'>\t\r\n");
      out.write("\t\t\t\t\t<i class=\"mdi mdi-apps\"></i>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_xava_005flabel_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "selectModules.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("fixedModules", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "selectModules.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bookmarkModules", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("true", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 if (modules.showsSearchModules(request)) { 
      out.write("\r\n");
      out.write("\t\t<div id=\"search_modules\">\r\n");
      out.write("\t\t<input id=\"search_modules_text\" type=\"text\" size=\"38\" placeholder='");
      if (_jspx_meth_xava_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("'/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div> \t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t<div id=\"modules_list_outbox\">\r\n");
      out.write("\t\t<table id=\"modules_list_box\">\r\n");
      out.write("\t\t\t<tr id=\"modules_list_content\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "modulesMenu.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</td>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_xava_005flabel_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:label
    org.openxava.web.taglib.LabelTag _jspx_th_xava_005flabel_005f0 = (org.openxava.web.taglib.LabelTag) _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.get(org.openxava.web.taglib.LabelTag.class);
    boolean _jspx_th_xava_005flabel_005f0_reused = false;
    try {
      _jspx_th_xava_005flabel_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flabel_005f0.setParent(null);
      // /naviox/leftMenu.jsp(30,5) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005flabel_005f0.setKey("myOrganizations");
      int _jspx_eval_xava_005flabel_005f0 = _jspx_th_xava_005flabel_005f0.doStartTag();
      if (_jspx_th_xava_005flabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005flabel_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005flabel_005f0);
      _jspx_th_xava_005flabel_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005flabel_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005flabel_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    boolean _jspx_th_xava_005fmessage_005f0_reused = false;
    try {
      _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f0.setParent(null);
      // /naviox/leftMenu.jsp(47,69) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fmessage_005f0.setKey("search_modules");
      int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
      if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
      _jspx_th_xava_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f0_reused);
    }
    return false;
  }
}

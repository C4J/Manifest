/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.48
 * Generated at: 2021-09-28 15:04:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=240\"/>\r\n");
      out.write("	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("	<meta http-equiv=\"Pragma\" content=\"no-cache\">\r\n");
      out.write("	<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("	<META HTTP-Equiv=\"quitbutton\" Content=\"hide\">\r\n");
      out.write("	<META HTTP-Equiv=\"scanner\" Content=\"disabled\">\r\n");
      out.write("	<META HTTP-Equiv=\"scanner\" Content=\"autoenter\">\r\n");
      out.write("	<META HTTP-Equiv=\"acceleratekey\" content=\"all\">\r\n");
      out.write("	<title>Menu</title>\r\n");
      out.write("	<link href=\"style/commander.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      com.commander4j.bean.JLanguage Lang = null;
      Lang = (com.commander4j.bean.JLanguage) _jspx_page_context.getAttribute("Lang", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (Lang == null){
        Lang = new com.commander4j.bean.JLanguage();
        _jspx_page_context.setAttribute("Lang", Lang, javax.servlet.jsp.PageContext.PAGE_SCOPE);
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Lang"), "hostID",
session.getAttribute("selectedHost"));
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Lang"), "sessionID",
session.getId());
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("Lang"), "languageID",
session.getAttribute("language"));
        out.write('\r');
        out.write('\n');
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body onLoad=\"focusIt()\">\r\n");
      out.write("\r\n");
      out.write("	<form id=\"menus\" name=\"menus\" action=\"Process\" method=\"post\">\r\n");
      out.write("	\r\n");
      out.write("		<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"width=\"238\">\r\n");
      out.write("			<tr>\r\n");
      out.write("			 	<th bgcolor=\"#FFFFFF\"><div align=\"center\"><font color=\"#FF0000\">");
      out.print(Lang.getText("mod_root"));
      out.write("</font></div></th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>&nbsp;</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		\r\n");
      out.write("		<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"width=\"238\">	\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"2%\" height=\"20\"></td>\r\n");
      out.write("				<td width=\"98%\" height=\"20\" align=\"left\">\r\n");
      out.write("					");

						String menuList = (String) session.getAttribute("menuList");
						if (menuList == null)
							menuList = "";
						menuList = menuList.trim();
						out.println(menuList);
					
      out.write("\r\n");
      out.write("				</td>\r\n");
      out.write("				<td width=\"2%\" height=\"20\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>&nbsp;</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		\r\n");
      out.write("		<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"238\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td width=\"49\" height=\"20\" align=\"right\">\r\n");
      out.write("					<input tabindex=\"1\"	name=\"buttonSubmit\" id=\"buttonSubmit\" value=\"");
      out.print(Lang.getText("web_Submit"));
      out.write("\" onclick=\"document.menus.button.value='Submit';\" type=\"submit\">\r\n");
      out.write("				</td>\r\n");
      out.write("				<td width=\"2%\" height=\"20\"></td>\r\n");
      out.write("				<td width=\"49%\" height=\"20\" align=\"left\">\r\n");
      out.write("					<input tabindex=\"2\" name=\"buttonCancel\" id=\"buttonCancel\" value=\"");
      out.print(Lang.getText("web_Cancel"));
      out.write("\" onclick=\"document.menus.button.value='Cancel';\" type=\"submit\">\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		\r\n");
      out.write("		<br> \r\n");
      out.write("		<label for=\"Submit\"></label>\r\n");
      out.write("	    <input type=\"hidden\" name=\"formName\" value=\"menu.jsp\" /> \r\n");
      out.write("		<input type=\"hidden\" id=\"button\" name=\"button\" value=\"Submit\" />\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("	</form>\r\n");
      out.write("	");

		String menuIndexFocus = (String) session.getAttribute("menuIndexFocus");
		out.println(menuIndexFocus);
	
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

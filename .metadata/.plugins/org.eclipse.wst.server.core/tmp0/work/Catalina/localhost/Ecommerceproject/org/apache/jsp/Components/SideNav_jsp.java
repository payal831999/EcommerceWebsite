/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2020-10-23 20:55:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SideNav_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Components/common_css_js.jsp", Long.valueOf(1603474869995L));
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<!-- css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write(" \r\n");
      out.write(" <!-- js -->\r\n");
      out.write("<script\r\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.5.1.min.js\"\r\n");
      out.write("  integrity=\"sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"js/script.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#wrapper {\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper {\r\n");
      out.write("  min-height: 100vh;\r\n");
      out.write("  margin-left: -15rem;\r\n");
      out.write("  -webkit-transition: margin .25s ease-out;\r\n");
      out.write("  -moz-transition: margin .25s ease-out;\r\n");
      out.write("  -o-transition: margin .25s ease-out;\r\n");
      out.write("  transition: margin .25s ease-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .sidebar-heading {\r\n");
      out.write("  padding: 0.875rem 1.25rem;\r\n");
      out.write("  font-size: 1.2rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .list-group {\r\n");
      out.write("  width: 15rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#page-content-wrapper {\r\n");
      out.write("  min-width: 100vw;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#wrapper.toggled #sidebar-wrapper {\r\n");
      out.write("  margin-left: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (min-width: 768px) {\r\n");
      out.write("  #sidebar-wrapper {\r\n");
      out.write("    margin-left: 0;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #page-content-wrapper {\r\n");
      out.write("    min-width: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #wrapper.toggled #sidebar-wrapper {\r\n");
      out.write("    margin-left: -15rem;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"d-flex\" id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Sidebar -->\r\n");
      out.write("    <div class=\"bg-light border-right\" id=\"sidebar-wrapper\">\r\n");
      out.write("      <div class=\"sidebar-heading\">Start Bootstrap </div>\r\n");
      out.write("      <div class=\"list-group list-group-flush\">\r\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Dashboard</a>\r\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Shortcuts</a>\r\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Overview</a>\r\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Events</a>\r\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Profile</a>\r\n");
      out.write("        <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Status</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /#sidebar-wrapper -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Content -->\r\n");
      out.write("    <div id=\"page-content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-light bg-light border-bottom\">\r\n");
      out.write("        <button class=\"btn btn-primary\" id=\"menu-toggle\">Toggle Menu</button>\r\n");
      out.write("\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("          <ul class=\"navbar-nav ml-auto mt-2 mt-lg-0\">\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">Link</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                Dropdown\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /#page-content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript -->\r\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Menu Toggle Script -->\r\n");
      out.write("  <script>\r\n");
      out.write("    $(\"#menu-toggle\").click(function(e) {\r\n");
      out.write("      e.preventDefault();\r\n");
      out.write("      $(\"#wrapper\").toggleClass(\"toggled\");\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

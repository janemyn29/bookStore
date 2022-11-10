package org.apache.jsp.Seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sellerProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("        <title>THE5 BookStore</title>\r\n");
      out.write("        <!-- Favicon icon -->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../admin/images/favicon.png\">\r\n");
      out.write("        <!-- Custom Stylesheet -->\r\n");
      out.write("        <link href=\"../admin/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!--*******************\r\n");
      out.write("            Preloader start\r\n");
      out.write("        ********************-->\r\n");
      out.write("        <div id=\"preloader\">\r\n");
      out.write("            <div class=\"loader\">\r\n");
      out.write("                <svg class=\"circular\" viewBox=\"25 25 50 50\">\r\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\r\n");
      out.write("                </svg>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--*******************\r\n");
      out.write("            Preloader end\r\n");
      out.write("        ********************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Main wrapper start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <div id=\"main-wrapper\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sellerHeader.jsp", out, false);
      out.write("\r\n");
      out.write("                <!--**********************************\r\n");
      out.write("                    Sidebar start\r\n");
      out.write("                ***********************************-->\r\n");
      out.write("                <div class=\"nk-sidebar\">           \r\n");
      out.write("                    <div class=\"nk-nav-scroll\">\r\n");
      out.write("                        <ul class=\"metismenu\" id=\"menu\">\r\n");
      out.write("                            <li class=\"nav-label\" style=\"background-color: #c96;\">Hello Seller ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"active\" href=\"#\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-speedometer menu-icon\"></i><span class=\"nav-text\">Dashboard</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                            <a href=\"sellerOrder\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-list\"></i><span class=\"nav-text\">Order Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                        <a href=\"sellerReturn\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"icon-list\"></i><span class=\"nav-text\">Order Management</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        \r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Sidebar end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"content-body\">\r\n");
      out.write("                <div class=\"row page-titles mx-0\">\r\n");
      out.write("                    <div class=\"col p-md-0\">\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li class=\"breadcrumb-item\">Home</li>\r\n");
      out.write("                            <li class=\"breadcrumb-item \">My Account</li>\r\n");
      out.write("                            <li class=\"breadcrumb-item active\">Profile</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-12\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                                    <h4 class=\"card-title\">Profile</h4>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"basic-form\">\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Email</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Username</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Phone</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"number\" name=\"phone\" class=\"form-control\" placeholder=\"Phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <div class=\"basic-form\">\r\n");
      out.write("                                                        <a href=\"sellereditProfileNav\" ><button class=\"btn mb-1 btn-warning\" ><span style=\"margin-left: 23px;margin-right: 22px\">Edit Profile</span></button></a>\r\n");
      out.write("\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"basic-form\">\r\n");
      out.write("                                                        <a href=\"sellerchangenav\"><button  class=\"btn mb-1 btn-warning\" >Change Password</button></a>\r\n");
      out.write("                                                        \r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- #/ container -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Content body end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Main wrapper end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Scripts\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <script src=\"../admin/plugins/common/common.min.js\"></script>\r\n");
      out.write("        <script src=\"../admin/js/custom.min.js\"></script>\r\n");
      out.write("        <script src=\"../admin/js/settings.js\"></script>\r\n");
      out.write("        <script src=\"../admin/js/gleek.js\"></script>\r\n");
      out.write("        <script src=\"../admin/js/styleSwitcher.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

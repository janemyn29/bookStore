package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adEditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\r\n");
      out.write("        <!-- Custom Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            function myfun() {\r\n");
      out.write("                var a = document.getElementById(\"phone\").value;\r\n");
      out.write("                if (a.length < 10) {\r\n");
      out.write("                    alert(\"Phone number must be 10 digit!\");\r\n");
      out.write("                    return false;\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("                if (a.length > 10) {\r\n");
      out.write("                    alert(\"Phone number must be 10 digit!\");\r\n");
      out.write("                    return false;\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function validatephone(phone)\r\n");
      out.write("            {\r\n");
      out.write("\r\n");
      out.write("                phone = phone.replace(/[^0-9]/g, '');\r\n");
      out.write("                $(\"#phone\").val(phone);\r\n");
      out.write("                if (phone == '' || !phone.match(/^0[0-9]{9}$/))\r\n");
      out.write("                {\r\n");
      out.write("                    $(\"#phone\").css({'background': '#FFEDEF', 'border': 'solid 1px red'});\r\n");
      out.write("\r\n");
      out.write("                    return false;\r\n");
      out.write("                } else\r\n");
      out.write("                {\r\n");
      out.write("                    $(\"#phone\").css({'background': '#99FF99', 'border': 'solid 1px #99FF99'});\r\n");
      out.write("                    return true;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adHeader.jsp", out, false);
      out.write("\r\n");
      out.write("                <!--**********************************\r\n");
      out.write("                    Sidebar start\r\n");
      out.write("                ***********************************-->\r\n");
      out.write("                <div class=\"nk-sidebar\">           \r\n");
      out.write("                    <div class=\"nk-nav-scroll\">\r\n");
      out.write("                        <ul class=\"metismenu\" id=\"menu\">\r\n");
      out.write("                            <li class=\"nav-label\" style=\"background-color: #c96;\">Hello Admin ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"home\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-home\"></i><span class=\"nav-text\">Home</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"adbook\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-book-open\"></i><span class=\"nav-text\">Book Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"addiscount\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-percent\"></i><span class=\"nav-text\">Discount Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                            <a href=\"adcustomer\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-user\"></i><span class=\"nav-text\">Customer Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a  href=\"adseller\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-cart-plus menu-icon\"></i> <span class=\"nav-text\">Seller Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"\" href=\"adimporter\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-arrow-circle-right menu-icon\"></i><span class=\"nav-text\">Importer Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"blacklist\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-close\"></i> <span class=\"nav-text\">Blacklist Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"feedback\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-envelope menu-icon\"></i><span class=\"nav-text\">Feedback Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"adprofit\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-money menu-icon\"></i><span class=\"nav-text\">Profit Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
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
      out.write("                            <li class=\"breadcrumb-item \">Profile</li>\r\n");
      out.write("                            <li class=\"breadcrumb-item active\">Edit Profile</li>\r\n");
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
      out.write("                                    <h4 class=\"card-title\">Edit Profile</h4>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"basic-form\">\r\n");
      out.write("                                        <form action=\"adEditProfile\" method=\"POST\" onsubmit=\"return myfun()\">\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Email</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Username</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Phone</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input id=\"phone\" type=\"number\" name=\"phone\" class=\"form-control\" placeholder=\"Phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" onkeyup=\" return validatephone(this.value); \" required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <input type=\"hidden\" name=\"accID\" class=\"form-control\" placeholder=\"Phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getAccID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <div class=\"basic-form\">\r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn mb-1 btn-warning\" ><span style=\"margin-left: 23px;margin-right: 22px\">Save Change</span></button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
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
      out.write("        <script src=\"plugins/common/common.min.js\"></script>\r\n");
      out.write("        <script src=\"js/custom.min.js\"></script>\r\n");
      out.write("        <script src=\"js/settings.js\"></script>\r\n");
      out.write("        <script src=\"js/gleek.js\"></script>\r\n");
      out.write("        <script src=\"js/styleSwitcher.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check == \"This username already existed! Please input another username.\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <div class=\"alert alert-danger\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check == \"This phone already used! Please input another phone number.\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <div class=\"alert alert-danger\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}

package org.apache.jsp.importer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class impDetailReceipt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    ");
      com.bookstore.Receipt.ReceiptDAO rd = null;
      synchronized (request) {
        rd = (com.bookstore.Receipt.ReceiptDAO) _jspx_page_context.getAttribute("rd", PageContext.REQUEST_SCOPE);
        if (rd == null){
          rd = new com.bookstore.Receipt.ReceiptDAO();
          _jspx_page_context.setAttribute("rd", rd, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Favicon icon -->\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\n");
      out.write("    <!-- Custom Stylesheet -->\n");
      out.write("    <link href=\"./plugins/tables/css/datatable/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!--*******************\n");
      out.write("        Preloader start\n");
      out.write("    ********************-->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <svg class=\"circular\" viewBox=\"25 25 50 50\">\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\n");
      out.write("            </svg>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"main-wrapper\">\n");
      out.write("\n");
      out.write("        <div class=\"nav-header\">\n");
      out.write("\n");
      out.write("            <div class=\"brand-logo\">\n");
      out.write("\n");
      out.write("                <a href=\"index.html\">\n");
      out.write("                    <img src=\"images/logo.png\" alt=\"\" width=\"120\" height=\"56.5\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Nav header end\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Header start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header-content clearfix\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"header-left\">\n");
      out.write("                    <div class=\"nav-control\">\n");
      out.write("                        <div class=\"hamburger\">\n");
      out.write("                            <span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header-right\">\n");
      out.write("                    <ul class=\"clearfix\">\n");
      out.write("                        <li class=\"icons dropdown\">\n");
      out.write("                            <h6>Hello Importer</h6>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Header end ti-comment-alt\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Sidebar start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"nk-sidebar\">\n");
      out.write("            <div class=\"nk-nav-scroll\">\n");
      out.write("                <ul class=\"metismenu\" id=\"menu\">\n");
      out.write("                    <li class=\"mega-menu mega-menu-sm\">\n");
      out.write("                    <li class=\"nav-label\">Management</li>\n");
      out.write("\n");
      out.write("                    <li class=\"mega-menu mega-menu-sm\">\n");
      out.write("                        <a href=\"./index.html\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-speedometer menu-icon\"></i><span class=\"nav-text\">Dash Board</span>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    <li class=\"mega-menu mega-menu-sm\">\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-people menu-icon\"></i><span class=\"nav-text\">Receipt</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./table-datatable.html\">List Receipt</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-note menu-icon\"></i><span class=\"nav-text\">Publish Company</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./table-basic.html\" aria-expanded=\"false\">List Publish Company</a></li>\n");
      out.write("                            <!-- <li><a href=\"./table-datatable.html\" aria-expanded=\"false\">Data Table</a></li> -->\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"mega-menu mega-menu-sm\">\n");
      out.write("                        <a href=\"./app-profile.html\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-user menu-icon\"></i><span class=\"nav-text\">My Account</span>\n");
      out.write("                        </a>\n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"page-login.html\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-logout menu-icon\"></i><span class=\"nav-text\">LogOut</span>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <!--***********************************-->\n");
      out.write("          \n");
      out.write("       \n");
      out.write("        <!--**********************************\n");
      out.write("            Sidebar end\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Content body start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"content-body\">\n");
      out.write("\n");
      out.write("            <div class=\"row page-titles mx-0\">\n");
      out.write("                <div class=\"col p-md-0\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">Receipt Detail</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">List Receipt</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item active\"><a href=\"javascript:void(0)\">Home</a></li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- row -->\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"form-validation\">\n");
      out.write("                              \n");
      out.write("                                        <form class=\"form-valide\" action=\"#\" method=\"post\">\n");
      out.write("                                    \n");
      out.write("                                           <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-lg-4 col-form-label\" for=\"val-password\">RECEIPT DATE <span class=\"text-danger\">*</span>                                                    \n");
      out.write("                                                </label>\n");
      out.write("                                                <div class=\"col-lg-6\">\n");
      out.write("                                                    <input type=\"date\" class=\"form-control\" id=\"val-password\" name=\"val-password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.detailReceipt.orderDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <lable class=\"col-lg-4 col-form-label\" for=\"val-password\">PUBLISH COMPANY <span class=\"text-danger\">*</span>\n");
      out.write("                                                </lable>\n");
      out.write("                                                <div class=\"col-lg-6\">\n");
      out.write("                                                    <input type=\"Text\" class=\"form-control\" id=\"val-currency\" name=\"val-currency\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailReceipt.companyName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-lg-4 col-form-label\" for=\"val-currency\">TOTAL PRICE<span class=\"text-danger\">*</span>\n");
      out.write("                                                </label>\n");
      out.write("                                                <div class=\"col-lg-6\">\n");
      out.write("                                                    <input type=\"Text\" class=\"form-control\" id=\"val-currency\" name=\"val-currency\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailReceipt.getTotalImportPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                    \n");
      out.write("                                            <div class=\"table-responsive\">\n");
      out.write("                                                <table class=\"table table-striped table-bordered zero-configuration\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <th>BookCode</th>\n");
      out.write("                                                            <th>BookName</th>                                         \n");
      out.write("                                                            <th>Total Import Price</th>\n");
      out.write("                                                            <th>Quantity</th>\n");
      out.write("                                                            <th>ReceiptID</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("\n");
      out.write("                                                    \n");
      out.write("                                                </table><br>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            <!-- #/ container -->\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Content body end\n");
      out.write("        ***********************************-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--**********************************\n");
      out.write("            Footer start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <p>Copyright &copy; Designed & Developed by <a href=\"https://themeforest.net/user/quixlab\">Quixlab</a> 2018</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Footer end\n");
      out.write("        ***********************************-->\n");
      out.write("    </div>\n");
      out.write("    <!--**********************************\n");
      out.write("        Main wrapper end\n");
      out.write("    ***********************************-->\n");
      out.write("\n");
      out.write("    <!--**********************************\n");
      out.write("        Scripts\n");
      out.write("    ***********************************-->\n");
      out.write("    <script src=\"plugins/common/common.min.js\"></script>\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\n");
      out.write("    <script src=\"js/settings.js\"></script>\n");
      out.write("    <script src=\"js/gleek.js\"></script>\n");
      out.write("    <script src=\"js/styleSwitcher.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"./plugins/tables/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/tables/js/datatable/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/tables/js/datatable-init/datatable-basic.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailReceipt.getReceiptByReceiptID(receiptID)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("detailReceipt");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <tr>\n");
          out.write("                                                      \n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailReceipt.bookCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailReceipt.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailReceipt.totalImportPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailReceipt.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailReceipt.receiptID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                        </tr>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

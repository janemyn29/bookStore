package org.apache.jsp.importer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class impListReceipt_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      com.bookstore.Receipt.ReceiptDAO r = null;
      synchronized (request) {
        r = (com.bookstore.Receipt.ReceiptDAO) _jspx_page_context.getAttribute("r", PageContext.REQUEST_SCOPE);
        if (r == null){
          r = new com.bookstore.Receipt.ReceiptDAO();
          _jspx_page_context.setAttribute("r", r, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("            <meta charset=\"utf-8\">\r\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Favicon icon -->\r\n");
      out.write("            <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\r\n");
      out.write("            <!-- Custom Stylesheet -->\r\n");
      out.write("            <link href=\"./plugins/tables/css/datatable/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("            <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("\r\n");
      out.write("            <!--*******************\r\n");
      out.write("                Preloader start\r\n");
      out.write("            ********************-->\r\n");
      out.write("            <div id=\"preloader\">\r\n");
      out.write("                <div class=\"loader\">\r\n");
      out.write("                    <svg class=\"circular\" viewBox=\"25 25 50 50\">\r\n");
      out.write("                    <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\r\n");
      out.write("                    </svg>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"main-wrapper\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"nav-header\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"brand-logo\">\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"index.html\">\r\n");
      out.write("                            <img src=\"images/logo.png\" alt=\"\" width=\"120\" height=\"56.5\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--**********************************\r\n");
      out.write("                    Nav header end\r\n");
      out.write("                ***********************************-->\r\n");
      out.write("\r\n");
      out.write("                <!--**********************************\r\n");
      out.write("                    Header start\r\n");
      out.write("                ***********************************-->\r\n");
      out.write("                <div class=\"header\">\r\n");
      out.write("                    <div class=\"header-content clearfix\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"header-left\">\r\n");
      out.write("                            <div class=\"nav-control\">\r\n");
      out.write("                                <div class=\"hamburger\">\r\n");
      out.write("                                    <span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"header-right\">\r\n");
      out.write("                            <li class=\"icons dropdown\">\r\n");
      out.write("                                <div class=\"user-img c-pointer position-relative\"   data-toggle=\"dropdown\"><br/>\r\n");
      out.write("                                    <h6>Hello Importer</h6>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"drop-down dropdown-profile   dropdown-menu\">\r\n");
      out.write("                                    <div class=\"dropdown-content-body\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"app-profile.html\"><i class=\"icon-user\"></i> <span>Profile</span></a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li><a href=\"page-login.html\"><i class=\"icon-key\"></i> <span>Logout</span></a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--**********************************\r\n");
      out.write("                    Header end ti-comment-alt\r\n");
      out.write("                ***********************************-->\r\n");
      out.write("\r\n");
      out.write("                <!--**********************************\r\n");
      out.write("                    Sidebar start\r\n");
      out.write("                ***********************************-->\r\n");
      out.write("                <div class=\"nk-sidebar\">\r\n");
      out.write("                    <div class=\"nk-nav-scroll\">\r\n");
      out.write("                        <ul class=\"metismenu\" id=\"menu\">\r\n");
      out.write("                            <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                            <li class=\"nav-label\">Management</li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                                <a href=\"./index.html\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"icon-speedometer menu-icon\"></i><span class=\"nav-text\">Dash Board</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                                <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"icon-people menu-icon\"></i><span class=\"nav-text\">Receipt</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul aria-expanded=\"false\">\r\n");
      out.write("                                    <li><a href=\"ImpReceiptController\">List Receipt</a></li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"icon-note menu-icon\"></i><span class=\"nav-text\">Publish Company</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <ul aria-expanded=\"false\">\r\n");
      out.write("                                    <li><a href=\"ImpCompanyController\" aria-expanded=\"false\">List Publish Company</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a  href=\"/SWP391_BookStore/logout\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"icon-logout menu-icon\"></i><span class=\"nav-text\">LogOut</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--**********************************\r\n");
      out.write("                    Sidebar end\r\n");
      out.write("                ***********************************-->\r\n");
      out.write("\r\n");
      out.write("                <!--**********************************\r\n");
      out.write("                    Content body start\r\n");
      out.write("                ***********************************-->\r\n");
      out.write("                <div class=\"content-body\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row page-titles mx-0\">\r\n");
      out.write("                        <div class=\"col p-md-0\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">Receipt Importer</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\"><a href=\"javascript:void(0)\">Home</a></li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- row -->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <h4 class=\"pub\">List Receipt</h4>\r\n");
      out.write("                                        <div class=\"header-right\">\r\n");
      out.write("                                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                                <a class=\"create\" href=\"ImpCreateReceiptController\">New RECEIPT</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"table-responsive\">\r\n");
      out.write("                                            <table class=\"table table-striped table-bordered zero-configuration\">                                           \r\n");
      out.write("                                                <thead>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th>ReceiptID</th>\r\n");
      out.write("                                                        <th>AccountID</th>\r\n");
      out.write("                                                        <th>Order Date</th>\r\n");
      out.write("                                                        <th>Total Import Price</th>\r\n");
      out.write("                                                        <th>CompanyID</th>\r\n");
      out.write("                                                        <th>Action</th>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </thead>\r\n");
      out.write("\r\n");
      out.write("                                                <tbody>\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- #/ container -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Content body end\r\n");
      out.write("            ***********************************-->\r\n");
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
      out.write("        <script src=\"./plugins/tables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/tables/js/datatable/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"./plugins/tables/js/datatable-init/datatable-basic.min.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listR}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("r");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <tr>\r\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.receiptID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.accountID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \r\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.orderDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.totalImportPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("đ</td>\r\n");
          out.write("                                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.companyID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                        <td><a href=\"ImpDetailReceipt?breceiptID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${r.receiptID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"icon-eye menu-icon\"></i></a></td>\r\n");
          out.write("                                                    </tr>\r\n");
          out.write("                                                ");
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

package org.apache.jsp.imp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class impReceiptDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("        <title>THE5 BookStore</title>\n");
      out.write("        <!-- Favicon icon -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../admin/images/favicon.png\">\n");
      out.write("        <!-- Custom Stylesheet -->\n");
      out.write("        <link href=\"../admin/plugins/tables/css/datatable/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../admin/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--*******************\n");
      out.write("            Preloader start\n");
      out.write("        ********************-->\n");
      out.write("        <div id=\"preloader\">\n");
      out.write("            <div class=\"loader\">\n");
      out.write("                <svg class=\"circular\" viewBox=\"25 25 50 50\">\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\n");
      out.write("                </svg>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--*******************\n");
      out.write("            Preloader end\n");
      out.write("        ********************-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Main wrapper start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div id=\"main-wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--**********************************\n");
      out.write("                    Sidebar start\n");
      out.write("                ***********************************-->\n");
      out.write("                <div class=\"nk-sidebar\">           \n");
      out.write("                    <div class=\"nk-nav-scroll\">\n");
      out.write("                        <ul class=\"metismenu\" id=\"menu\">\n");
      out.write("                            <li class=\"nav-label\" style=\"background-color: #c96;\">Hello Seller ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"pcompany\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"icon-speedometer menu-icon\"></i><span class=\"nav-text\">Publish Company</span>\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"listReceipt\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"icon-book-open\"></i><span class=\"nav-text\">Receipt Management</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--**********************************\n");
      out.write("                Sidebar end\n");
      out.write("            ***********************************-->\n");
      out.write("\n");
      out.write("            <!--**********************************\n");
      out.write("                Content body start\n");
      out.write("            ***********************************-->\n");
      out.write("            <div class=\"content-body\">\n");
      out.write("\n");
      out.write("                <div class=\"row page-titles mx-0\">\n");
      out.write("                    <div class=\"col p-md-0\">\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\">Home</li>\n");
      out.write("\n");
      out.write("                            <li class=\"breadcrumb-item \"><a href=\"sellerOrder\">Order Management</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Order Detail</li>\n");
      out.write("\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <span class=\"card-title\">Order Detail</span>\n");
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group row\" style=\"margin-top: 10px\">\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Receipt ID:</label>\n");
      out.write("                                        <div class=\"col-sm-10\">\n");
      out.write("                                            <input type=\"type\" name=\"text\" class=\"form-control\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${receipt.receiptID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' readonly>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Publish Company Name:</label>\n");
      out.write("                                        <div class=\"col-sm-10\">\n");
      out.write("                                            <input type=\"type\" name=\"text\" class=\"form-control\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${receipt.companyName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'  readonly>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Importer Name:</label>\n");
      out.write("                                        <div class=\"col-sm-10\">\n");
      out.write("                                            <input type=\"email\" name=\"email\" class=\"form-control\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${receipt.accName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'  readonly>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Receipted Date</label>\n");
      out.write("                                        <div class=\"col-sm-10\">\n");
      out.write("                                            <input type=\"type\" name=\"text\" class=\"form-control\"  value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${receipt.orderDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' readonly>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Total Imported Price</label>\n");
      out.write("                                        <div class=\"col-sm-10\">\n");
      out.write("                                            <input type=\"text\" name=\"email\" class=\"form-control\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${receipt.totalImportPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'  readonly>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"table-responsive\">\n");
      out.write("                                        <table class=\"table table-striped table-bordered zero-configuration\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>Detail ID</th>\n");
      out.write("                                                    <th>BookCode</th>\n");
      out.write("                                                    <th>BookName</th>\n");
      out.write("                                                    <th>Quantity</th>\n");
      out.write("                                                    <th>Price</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                        <a style=\"margin-left: 70px\" href=\"listReceipt\" class=\"btn mb-1 btn-warning\">Close</a>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- #/ container -->\n");
      out.write("            </div>\n");
      out.write("            <!--**********************************\n");
      out.write("                Content body end\n");
      out.write("            ***********************************-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--**********************************\n");
      out.write("                Footer start\n");
      out.write("            ***********************************-->\n");
      out.write("\n");
      out.write("            <!--**********************************\n");
      out.write("                Footer end\n");
      out.write("            ***********************************-->\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Main wrapper end\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Scripts\n");
      out.write("        ***********************************-->\n");
      out.write("        <script src=\"../admin/plugins/common/common.min.js\"></script>\n");
      out.write("        <script src=\"../admin/js/custom.min.js\"></script>\n");
      out.write("        <script src=\"../admin/js/settings.js\"></script>\n");
      out.write("        <script src=\"../admin/js/gleek.js\"></script>\n");
      out.write("        <script src=\"../admin/js/styleSwitcher.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../admin/plugins/tables/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"../admin/plugins/tables/js/datatable/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("        <script src=\"../admin/plugins/tables/js/datatable-init/datatable-basic.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"alert alert-success\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems(new String("listD"));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.rdID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.bookcode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                </tr>);\n");
          out.write("                                                \n");
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

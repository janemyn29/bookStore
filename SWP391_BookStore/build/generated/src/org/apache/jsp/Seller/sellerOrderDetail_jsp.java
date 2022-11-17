package org.apache.jsp.Seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bookstore.Format.MoneyFormat;
import com.bookstore.OrderDetail.OrderDetail;
import java.util.List;

public final class sellerOrderDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
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
      out.write("        <link href=\"../admin/plugins/tables/css/datatable/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
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
      out.write("\r\n");
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
      out.write("                        \r\n");
      out.write("                        <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                            <a href=\"sellerOrder\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-list\"></i><span class=\"nav-text\">Order Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                        <a href=\"sellerReturn\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"icon-list\"></i><span class=\"nav-text\">Return Management</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        \r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Sidebar end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Content body start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"content-body\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row page-titles mx-0\">\r\n");
      out.write("                    <div class=\"col p-md-0\">\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li class=\"breadcrumb-item\">Home</li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"breadcrumb-item \"><a href=\"sellerOrder\">Order Management</a></li>\r\n");
      out.write("                            <li class=\"breadcrumb-item active\">Order Detail</li>\r\n");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <span class=\"card-title\">Order Detail</span>\r\n");
      out.write("                                    \r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-group row\" style=\"margin-top: 10px\">\r\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Order ID:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                            <input type=\"type\" name=\"text\" class=\"form-control\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getOrderID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' readonly>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group row\">\r\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Customer Name:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                            <input type=\"type\" name=\"text\" class=\"form-control\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getAccName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'  readonly>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group row\">\r\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Email:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                            <input type=\"email\" name=\"email\" class=\"form-control\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'  readonly>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group row\">\r\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Phone:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                            <input type=\"type\" name=\"text\" class=\"form-control\"  value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' readonly>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group row\">\r\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Address:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                            <input type=\"text\" name=\"email\" class=\"form-control\" value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'  readonly>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group row\">\r\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Order Date:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                            <input type=\"text\" name=\"email\" class=\"form-control\"  value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getOrderDate()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' readonly>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group row\">\r\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Total Price:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("                                            <input type=\"text\" name=\"email\" class=\"form-control\"  value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getTotal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' readonly>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group row\">\r\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Order Note:</label>\r\n");
      out.write("                                        <div class=\"col-sm-10\">\r\n");
      out.write("\r\n");
      out.write("                                            <textarea class=\"form-control h-150px\" rows=\"4\" id=\"comment\" readonly>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getNote()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group row\">\r\n");
      out.write("                                        <label class=\"col-sm-2 col-form-label\">Status:</label>\r\n");
      out.write("                                        <div  class=\"col-sm-10\">\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                    <div class=\"table-responsive\">\r\n");
      out.write("                                        <table class=\"table table-striped table-bordered zero-configuration\">\r\n");
      out.write("                                            <thead>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Detail ID</th>\r\n");
      out.write("                                                    <th>BookCode</th>\r\n");
      out.write("                                                    <th>BookName</th>\r\n");
      out.write("                                                    <th>Image</th>\r\n");
      out.write("                                                    <th>Quantity</th>\r\n");
      out.write("                                                    <th>Price</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </thead>\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                                ");

                                                    List<OrderDetail> detail= (List<OrderDetail>)request.getAttribute("detail");
                                                    for (OrderDetail o : detail) {
                                                        MoneyFormat fm = new MoneyFormat();
                                                        String foString = fm.formatMoney(o.getPrice());
                                                            out.print("<tr>"
                                                        +"<td>"+o.getDetailID()+"</td>"
                                                        +"<td>"+o.getBookcode()+"</td>"
                                                        +"<td>"+o.getbName()+"</td>"
                                                        +"<td><img width='80px' src='"+o.getImg()+"'></td>"
                                                       +" <td>"+o.getQuantity()+"</td>"
                                                        +"<td>"+foString+"</td>"
                                                    +"</tr>");
                                                        }
                                                
      out.write("\r\n");
      out.write("                                               \r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("            <!--**********************************\r\n");
      out.write("                Footer start\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Footer end\r\n");
      out.write("            ***********************************-->\r\n");
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
      out.write("        <script src=\"../admin/plugins/tables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"../admin/plugins/tables/js/datatable/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("        <script src=\"../admin/plugins/tables/js/datatable-init/datatable-basic.min.js\"></script>\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <div class=\"alert alert-success\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getStatus().equals(\"confirming\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <input style=\"color: #c96\" type=\"text\"  class=\"form-control\"  value='Confirming' readonly>\r\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getStatus().equals(\"delivering\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <input style=\"color: #c96\" type=\"text\"  class=\"form-control\"  value='Delivering' readonly>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getStatus().equals(\"not confirm\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <input style=\"color: red\" type=\"text\"  class=\"form-control\"  value='Not Confirm' readonly>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getStatus().equals(\"cancelled\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <input style=\"color: red\" type=\"text\"  class=\"form-control\"  value='Cancelled' readonly>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getStatus().equals(\"delivery fail\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <input style=\"color: red\" type=\"text\"  class=\"form-control\"  value='Delivery Fail' readonly>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getStatus().equals(\"received\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <input style=\"color: #14CF43\" type=\"text\"  class=\"form-control\"  value='Received' readonly>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getStatus().equals(\"received\")||order.getStatus().equals(\"not confirm\")||order.getStatus().equals(\"delivery fail\") ||order.getStatus().equals(\"canceled\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \r\n");
        out.write("                                        <div style=\"margin-top: 18px\" class=\"form-group row\">\r\n");
        out.write("\r\n");
        out.write("                                            <a style=\"margin-left: 415px\" href=\"sellerOrder\"><button style=\"margin-left: 5px;margin-right: 5px\" class=\"btn mb-1 btn-warning\">Cancel</button></a>\r\n");
        out.write("                                        </div>\r\n");
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getStatus().equals(\"confirming\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \r\n");
        out.write("                                        <form action=\"selledUpdate\">\r\n");
        out.write("                                            <div style=\"margin-top: 18px\" class=\"form-group row\">\r\n");
        out.write("                                                <label class=\"col-sm-2 col-form-label\">Update status:</label>\r\n");
        out.write("                                                <div  class=\"col-sm-10\">\r\n");
        out.write("\r\n");
        out.write("                                                    <div class=\"input-group\">\r\n");
        out.write("                                                        <select name='check' class=\"custom-select\">\r\n");
        out.write("                                                            <option value=\"delivering\" style=\"color: green\">Approve</option>\r\n");
        out.write("                                                            <option value=\"not confirm\" style=\"color: red\">Not Confirm</option>   \r\n");
        out.write("                                                        </select>\r\n");
        out.write("                                                    </div>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <input type=\"hidden\" name=\"orderid\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getOrderID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'>\r\n");
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                            <div class=\"form-group row\">\r\n");
        out.write("                                                <<table style=\"border: none\">\r\n");
        out.write("                                                    <tr>\r\n");
        out.write("                                                    <button style=\"margin-left: 350px\" type=\"submit\" class=\"btn mb-1 btn-warning\" >Update</button>\r\n");
        out.write("                                                    </tr>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </form>\r\n");
        out.write("                                        <tr>\r\n");
        out.write("                                        <a style=\"margin-left: 70px\" href=\"sellerOrder\" class=\"btn mb-1 btn-warning\">Cancel</a>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            </table>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getStatus().equals(\"delivering\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \r\n");
        out.write("                                            <form action=\"selledUpdate\" method=\"POST\">\r\n");
        out.write("                                                <div style=\"margin-top: 18px\" class=\"form-group row\">\r\n");
        out.write("                                                    <label class=\"col-sm-2 col-form-label\">Update status:</label>\r\n");
        out.write("                                                    <div  class=\"col-sm-10\">\r\n");
        out.write("\r\n");
        out.write("                                                        <div class=\"input-group\">\r\n");
        out.write("                                                            <select name='check' class=\"custom-select\">\r\n");
        out.write("                                                                <option value=\"received\" style=\"color: #14CF43\">Recieved</option>\r\n");
        out.write("                                                                <option value=\"delivery fail\" style=\"color: red\">Delivery Fail</option>   \r\n");
        out.write("                                                            </select>\r\n");
        out.write("                                                        </div>\r\n");
        out.write("                                                    </div>\r\n");
        out.write("                                                    <input type=\"hidden\" name=\"orderid\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getOrderID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'>\r\n");
        out.write("\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                                <div class=\"form-group row\">\r\n");
        out.write("                                                    <table style=\"border: none\">\r\n");
        out.write("                                                        <tr>\r\n");
        out.write("                                                        <button style=\"margin-left: 350px\" type=\"submit\" class=\"btn mb-1 btn-warning\" >Update</button>\r\n");
        out.write("                                                        </tr>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                            </form>\r\n");
        out.write("                                        <tr>\r\n");
        out.write("                                        <a style=\"margin-left: 70px\" href=\"sellerOrder\" class=\"btn mb-1 btn-warning\">Cancel</a>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            </table>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }
}

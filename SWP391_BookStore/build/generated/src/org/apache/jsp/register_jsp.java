package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- molla/login.html  22 Nov 2019 10:04:03 GMT -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Molla - Bootstrap eCommerce Template</title>\n");
      out.write("        <meta name=\"keywords\" content=\"HTML5 Template\">\n");
      out.write("        <meta name=\"description\" content=\"Molla - Bootstrap eCommerce Template\">\n");
      out.write("        <meta name=\"author\" content=\"p-themes\">\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"assets/images/icons/apple-touch-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"assets/images/icons/favicon-32x32.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"assets/images/icons/favicon-16x16.png\">\n");
      out.write("        <link rel=\"manifest\" href=\"assets/images/icons/site.html\">\n");
      out.write("        <link rel=\"mask-icon\" href=\"assets/images/icons/safari-pinned-tab.svg\" color=\"#666666\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/images/icons/favicon.ico\">\n");
      out.write("        <meta name=\"apple-mobile-web-app-title\" content=\"Molla\">\n");
      out.write("        <meta name=\"application-name\" content=\"Molla\">\n");
      out.write("        <meta name=\"msapplication-TileColor\" content=\"#cc9966\">\n");
      out.write("        <meta name=\"msapplication-config\" content=\"assets/images/icons/browserconfig.xml\">\n");
      out.write("        <meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("        <!-- Plugins CSS File -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <!-- Main CSS File -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("                <main class=\"main\">\n");
      out.write("\n");
      out.write("                    <nav aria-label=\"breadcrumb\" class=\"breadcrumb-nav border-0 mb-0\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">Login</li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div><!-- End .container -->\n");
      out.write("                    </nav><!-- End .breadcrumb-nav -->\n");
      out.write("\n");
      out.write("                    <div class=\"login-page bg-image pt-8 pb-8 pt-md-12 pb-md-12 pt-lg-17 pb-lg-17\" style=\"background-image: url('assets/images/backgrounds/login-bg.jpg')\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"form-box\">\n");
      out.write("                                <div class=\"form-tab\">\n");
      out.write("                                    <ul class=\"nav nav-pills nav-fill\" role=\"tablist\">\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link active\" id=\"signin-tab-2\" href=\"register.jsp\">Register</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" id=\"register-tab-2\" href=\"login.jsp\">Sign In</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <div class=\"tab-content\">\n");
      out.write("                                        <div class=\"tab-pane fade show active\" id=\"register-2\" role=\"tabpanel\" aria-labelledby=\"register-tab-2\">\n");
      out.write("\n");
      out.write("                                            <form action=\"register\" method=\"POST\">\n");
      out.write("\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"register-email-2\">Your email address *</label>\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                 ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                \n");
      out.write("                                            </div><!-- End .form-group -->\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"register-password-2\">Username *</label>\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                 ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                \n");
      out.write("                                            </div><!-- End .form-group -->\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"register-password-2\">Phone Number *</label>\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                \n");
      out.write("                                            </div><!-- End .form-group -->\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"register-password-2\">Password *</label>\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    ");
      if (_jspx_meth_c_if_12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                \n");
      out.write("                                            </div><!-- End .form-group -->\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"register-password-2\">Confirm Password *</label>\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_13(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                 ");
      if (_jspx_meth_c_if_14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_16(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                \n");
      out.write("                                            </div><!-- End .form-group -->\n");
      out.write("\n");
      out.write("                                            <div class=\"form-footer\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-primary-2\">\n");
      out.write("                                                    <span>SIGN UP</span>\n");
      out.write("                                                    <i class=\"icon-long-arrow-right\"></i>\n");
      out.write("                                                </button>\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\">\n");
      out.write("\n");
      out.write("                                                </div><!-- End .custom-checkbox -->\n");
      out.write("\n");
      out.write("                                                <a href=\"login.jsp\" class=\"forgot-link\">Back to Login</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div><!-- End .form-footer -->\n");
      out.write("\n");
      out.write("                                        </form>\n");
      out.write("\n");
      out.write("                                    </div><!-- .End .tab-pane -->\n");
      out.write("\n");
      out.write("                                </div><!-- End .tab-content -->\n");
      out.write("                            </div><!-- End .form-tab -->\n");
      out.write("                        </div><!-- End .form-box -->\n");
      out.write("                    </div><!-- End .container -->\n");
      out.write("                </div><!-- End .login-page section-bg -->\n");
      out.write("            </main><!-- End .main -->\n");
      out.write("\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <div class=\"footer-middle\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("                                <div class=\"widget widget-about\">\n");
      out.write("                                    <img src=\"assets/images/logo.png\" class=\"footer-logo\" alt=\"Footer Logo\" width=\"105\" height=\"25\">\n");
      out.write("                                    <p>Praesent dapibus, neque id cursus ucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. </p>\n");
      out.write("\n");
      out.write("                                    <div class=\"social-icons\">\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Facebook\"><i class=\"icon-facebook-f\"></i></a>\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Twitter\"><i class=\"icon-twitter\"></i></a>\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Instagram\"><i class=\"icon-instagram\"></i></a>\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Youtube\"><i class=\"icon-youtube\"></i></a>\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Pinterest\"><i class=\"icon-pinterest\"></i></a>\n");
      out.write("                                    </div><!-- End .soial-icons -->\n");
      out.write("                                </div><!-- End .widget about-widget -->\n");
      out.write("                            </div><!-- End .col-sm-6 col-lg-3 -->\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("                                <div class=\"widget\">\n");
      out.write("                                    <h4 class=\"widget-title\">Useful Links</h4><!-- End .widget-title -->\n");
      out.write("\n");
      out.write("                                    <ul class=\"widget-list\">\n");
      out.write("                                        <li><a href=\"about.html\">About Molla</a></li>\n");
      out.write("                                        <li><a href=\"#\">How to shop on Molla</a></li>\n");
      out.write("                                        <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                                        <li><a href=\"contact.html\">Contact us</a></li>\n");
      out.write("                                        <li><a href=\"login.html\">Log in</a></li>\n");
      out.write("                                    </ul><!-- End .widget-list -->\n");
      out.write("                                </div><!-- End .widget -->\n");
      out.write("                            </div><!-- End .col-sm-6 col-lg-3 -->\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("                                <div class=\"widget\">\n");
      out.write("                                    <h4 class=\"widget-title\">Customer Service</h4><!-- End .widget-title -->\n");
      out.write("\n");
      out.write("                                    <ul class=\"widget-list\">\n");
      out.write("                                        <li><a href=\"#\">Payment Methods</a></li>\n");
      out.write("                                        <li><a href=\"#\">Money-back guarantee!</a></li>\n");
      out.write("                                        <li><a href=\"#\">Returns</a></li>\n");
      out.write("                                        <li><a href=\"#\">Shipping</a></li>\n");
      out.write("                                        <li><a href=\"#\">Terms and conditions</a></li>\n");
      out.write("                                        <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                    </ul><!-- End .widget-list -->\n");
      out.write("                                </div><!-- End .widget -->\n");
      out.write("                            </div><!-- End .col-sm-6 col-lg-3 -->\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("                                <div class=\"widget\">\n");
      out.write("                                    <h4 class=\"widget-title\">My Account</h4><!-- End .widget-title -->\n");
      out.write("\n");
      out.write("                                    <ul class=\"widget-list\">\n");
      out.write("                                        <li><a href=\"#\">Sign In</a></li>\n");
      out.write("                                        <li><a href=\"cart.html\">View Cart</a></li>\n");
      out.write("                                        <li><a href=\"#\">My Wishlist</a></li>\n");
      out.write("                                        <li><a href=\"#\">Track My Order</a></li>\n");
      out.write("                                        <li><a href=\"#\">Help</a></li>\n");
      out.write("                                    </ul><!-- End .widget-list -->\n");
      out.write("                                </div><!-- End .widget -->\n");
      out.write("                            </div><!-- End .col-sm-6 col-lg-3 -->\n");
      out.write("                        </div><!-- End .row -->\n");
      out.write("                    </div><!-- End .container -->\n");
      out.write("                </div><!-- End .footer-middle -->\n");
      out.write("\n");
      out.write("                <div class=\"footer-bottom\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <p class=\"footer-copyright\">Copyright © 2019 Molla Store. All Rights Reserved.</p><!-- End .footer-copyright -->\n");
      out.write("                        <figure class=\"footer-payments\">\n");
      out.write("                            <img src=\"assets/images/payments.png\" alt=\"Payment methods\" width=\"272\" height=\"20\">\n");
      out.write("                        </figure><!-- End .footer-payments -->\n");
      out.write("                    </div><!-- End .container -->\n");
      out.write("                </div><!-- End .footer-bottom -->\n");
      out.write("            </footer><!-- End .footer -->\n");
      out.write("        </div><!-- End .page-wrapper -->\n");
      out.write("        <button id=\"scroll-top\" title=\"Back to Top\"><i class=\"icon-arrow-up\"></i></button>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Plugins JS File -->\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.hoverIntent.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/superfish.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- Main JS File -->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- molla/login.html  22 Nov 2019 10:04:03 GMT -->\n");
      out.write("</html>");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <label for=\"singin-email-2\" style=\"color: red;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label>\n");
        out.write("                                            ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == \"Username was existed!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"email\" class=\"form-control\" id=\"register-email-2\" name=\"email\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' required>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"email\" class=\"form-control\" id=\"register-email-2\" name=\"email\" required>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == \"Confirmation password is incorrect!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"email\" class=\"form-control\" id=\"register-email-2\" name=\"email\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' required>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == \"Email was registered!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"email\" class=\"form-control\" id=\"register-email-2\" name=\"email\" required>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == \"Username was existed!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"register-password-2\" name=\"username\" required>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"register-password-2\" name=\"username\" required>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == \"Confirmation password is incorrect!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"register-password-2\" name=\"username\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' required>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == \"Email was registered!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"register-password-2\" name=\"username\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' required>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"number\" class=\"form-control\" id=\"register-password-2\" name=\"phone\" required>\n");
        out.write("                                                ");
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

  private boolean _jspx_meth_c_if_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(null);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <input type=\"number\" class=\"form-control\" id=\"register-password-2\" name=\"phone\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' required>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent(null);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"register-password-2\" name=\"password\" required>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_if_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent(null);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <input type=\"password\" class=\"form-control\" id=\"register-password-2\" name=\"password\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' required>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_if_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent(null);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == \"Username was existed!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"register-password-2\" name=\"confirm-password\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${confirm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' required>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_c_if_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent(null);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"register-password-2\" name=\"confirm-password\" required>                                                ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_c_if_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent(null);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == \"Confirmation password is incorrect!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"register-password-2\" name=\"confirm-password\" required>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_c_if_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent(null);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess == \"Email was registered!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <input type=\"password\" class=\"form-control\" id=\"register-password-2\" name=\"confirm-password\" value='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${confirm}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' required>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }
}

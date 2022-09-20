package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- molla/login.html  22 Nov 2019 10:04:03 GMT -->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Molla - Bootstrap eCommerce Template</title>\r\n");
      out.write("        <meta name=\"keywords\" content=\"HTML5 Template\">\r\n");
      out.write("        <meta name=\"description\" content=\"Molla - Bootstrap eCommerce Template\">\r\n");
      out.write("        <meta name=\"author\" content=\"p-themes\">\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"assets/images/icons/apple-touch-icon.png\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"assets/images/icons/favicon-32x32.png\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"assets/images/icons/favicon-16x16.png\">\r\n");
      out.write("        <link rel=\"manifest\" href=\"assets/images/icons/site.html\">\r\n");
      out.write("        <link rel=\"mask-icon\" href=\"assets/images/icons/safari-pinned-tab.svg\" color=\"#666666\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/images/icons/favicon.ico\">\r\n");
      out.write("        <meta name=\"apple-mobile-web-app-title\" content=\"Molla\">\r\n");
      out.write("        <meta name=\"application-name\" content=\"Molla\">\r\n");
      out.write("        <meta name=\"msapplication-TileColor\" content=\"#cc9966\">\r\n");
      out.write("        <meta name=\"msapplication-config\" content=\"assets/images/icons/browserconfig.xml\">\r\n");
      out.write("        <meta name=\"theme-color\" content=\"#ffffff\">\r\n");
      out.write("        <!-- Plugins CSS File -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <!-- Main CSS File -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"page-wrapper\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("            <main class=\"main\">\r\n");
      out.write("\r\n");
      out.write("                <nav aria-label=\"breadcrumb\" class=\"breadcrumb-nav border-0 mb-0\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("                            <li class=\"breadcrumb-item active\" aria-current=\"page\">Login</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div><!-- End .container -->\r\n");
      out.write("                </nav><!-- End .breadcrumb-nav -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"login-page bg-image pt-8 pb-8 pt-md-12 pb-md-12 pt-lg-17 pb-lg-17\" style=\"background-image: url('assets/images/backgrounds/login-bg.jpg')\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"form-box\">\r\n");
      out.write("                            <div class=\"form-tab\">\r\n");
      out.write("                                <ul class=\"nav nav-pills nav-fill\" role=\"tablist\">\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" id=\"signin-tab-2\" data-toggle=\"tab\" href=\"#signin-2\" role=\"tab\" aria-controls=\"signin-2\" aria-selected=\"false\">Register</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link active\" id=\"register-tab-2\" data-toggle=\"tab\" href=\"#register-2\" role=\"tab\" aria-controls=\"register-2\" aria-selected=\"true\">Sign In</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <div class=\"tab-content\">\r\n");
      out.write("                                    <div class=\"tab-pane fade\" id=\"signin-2\" role=\"tabpanel\" aria-labelledby=\"signin-tab-2\">\r\n");
      out.write("                                        <form action=\"login\" method=\"POST\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"register-email-2\">Your email address *</label>\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" id=\"register-email-2\" name=\"email\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"register-password-2\">Username *</label>\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"register-password-2\" name=\"username\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"register-password-2\">Password *</label>\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"register-password-2\" name=\"password\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("                                            <div c<lass=\"form-group\">\r\n");
      out.write("                                                <label for=\"register-password-2\">Confirm Password *</label>\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"register-password-2\" name=\"confirm-password\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-footer\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-primary-2\">\r\n");
      out.write("                                                    <span>SIGN UP</span>\r\n");
      out.write("                                                    <i class=\"icon-long-arrow-right\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </div><!-- End .form-footer -->\r\n");
      out.write("                                            \r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
      out.write("                                    </div><!-- .End .tab-pane -->\r\n");
      out.write("                                    <div class=\"tab-pane fade show active\" id=\"register-2\" role=\"tabpanel\" aria-labelledby=\"register-tab-2\">\r\n");
      out.write("                                        <form action=\"login\" method=\"POST\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"singin-email-2\">Email address *</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"singin-email-2\" name=\"email\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"singin-password-2\">Password *</label>\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"singin-password-2\" name=\"password\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("                                            <input type=\"hidden\" class=\"form-control\" id=\"singin-password-2\" name=\"\" >\r\n");
      out.write("                                            <div class=\"form-footer\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-primary-2\">\r\n");
      out.write("                                                    <span>LOG IN</span>\r\n");
      out.write("                                                    <i class=\"icon-long-arrow-right\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("\r\n");
      out.write("                                                </div><!-- End .custom-checkbox -->\r\n");
      out.write("\r\n");
      out.write("                                                <a href=\"#\" class=\"forgot-link\">Forgot Your Password?</a>\r\n");
      out.write("                                            </div><!-- End .form-footer -->\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div><!-- .End .tab-pane -->\r\n");
      out.write("                                </div><!-- End .tab-content -->\r\n");
      out.write("                            </div><!-- End .form-tab -->\r\n");
      out.write("                        </div><!-- End .form-box -->\r\n");
      out.write("                    </div><!-- End .container -->\r\n");
      out.write("                </div><!-- End .login-page section-bg -->\r\n");
      out.write("            </main><!-- End .main -->\r\n");
      out.write("\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("                <div class=\"footer-middle\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\r\n");
      out.write("                                <div class=\"widget widget-about\">\r\n");
      out.write("                                    <img src=\"assets/images/logo.png\" class=\"footer-logo\" alt=\"Footer Logo\" width=\"105\" height=\"25\">\r\n");
      out.write("                                    <p>Praesent dapibus, neque id cursus ucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. </p>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"social-icons\">\r\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Facebook\"><i class=\"icon-facebook-f\"></i></a>\r\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Twitter\"><i class=\"icon-twitter\"></i></a>\r\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Instagram\"><i class=\"icon-instagram\"></i></a>\r\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Youtube\"><i class=\"icon-youtube\"></i></a>\r\n");
      out.write("                                        <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Pinterest\"><i class=\"icon-pinterest\"></i></a>\r\n");
      out.write("                                    </div><!-- End .soial-icons -->\r\n");
      out.write("                                </div><!-- End .widget about-widget -->\r\n");
      out.write("                            </div><!-- End .col-sm-6 col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\r\n");
      out.write("                                <div class=\"widget\">\r\n");
      out.write("                                    <h4 class=\"widget-title\">Useful Links</h4><!-- End .widget-title -->\r\n");
      out.write("\r\n");
      out.write("                                    <ul class=\"widget-list\">\r\n");
      out.write("                                        <li><a href=\"about.html\">About Molla</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">How to shop on Molla</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("                                        <li><a href=\"contact.html\">Contact us</a></li>\r\n");
      out.write("                                        <li><a href=\"login.html\">Log in</a></li>\r\n");
      out.write("                                    </ul><!-- End .widget-list -->\r\n");
      out.write("                                </div><!-- End .widget -->\r\n");
      out.write("                            </div><!-- End .col-sm-6 col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\r\n");
      out.write("                                <div class=\"widget\">\r\n");
      out.write("                                    <h4 class=\"widget-title\">Customer Service</h4><!-- End .widget-title -->\r\n");
      out.write("\r\n");
      out.write("                                    <ul class=\"widget-list\">\r\n");
      out.write("                                        <li><a href=\"#\">Payment Methods</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Money-back guarantee!</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Returns</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Shipping</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Terms and conditions</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("                                    </ul><!-- End .widget-list -->\r\n");
      out.write("                                </div><!-- End .widget -->\r\n");
      out.write("                            </div><!-- End .col-sm-6 col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\r\n");
      out.write("                                <div class=\"widget\">\r\n");
      out.write("                                    <h4 class=\"widget-title\">My Account</h4><!-- End .widget-title -->\r\n");
      out.write("\r\n");
      out.write("                                    <ul class=\"widget-list\">\r\n");
      out.write("                                        <li><a href=\"#\">Sign In</a></li>\r\n");
      out.write("                                        <li><a href=\"cart.html\">View Cart</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">My Wishlist</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Track My Order</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Help</a></li>\r\n");
      out.write("                                    </ul><!-- End .widget-list -->\r\n");
      out.write("                                </div><!-- End .widget -->\r\n");
      out.write("                            </div><!-- End .col-sm-6 col-lg-3 -->\r\n");
      out.write("                        </div><!-- End .row -->\r\n");
      out.write("                    </div><!-- End .container -->\r\n");
      out.write("                </div><!-- End .footer-middle -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"footer-bottom\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <p class=\"footer-copyright\">Copyright © 2019 Molla Store. All Rights Reserved.</p><!-- End .footer-copyright -->\r\n");
      out.write("                        <figure class=\"footer-payments\">\r\n");
      out.write("                            <img src=\"assets/images/payments.png\" alt=\"Payment methods\" width=\"272\" height=\"20\">\r\n");
      out.write("                        </figure><!-- End .footer-payments -->\r\n");
      out.write("                    </div><!-- End .container -->\r\n");
      out.write("                </div><!-- End .footer-bottom -->\r\n");
      out.write("            </footer><!-- End .footer -->\r\n");
      out.write("        </div><!-- End .page-wrapper -->\r\n");
      out.write("        <button id=\"scroll-top\" title=\"Back to Top\"><i class=\"icon-arrow-up\"></i></button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Plugins JS File -->\r\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.hoverIntent.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/superfish.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <!-- Main JS File -->\r\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- molla/login.html  22 Nov 2019 10:04:03 GMT -->\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check == \"fail\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <label for=\"singin-email-2\" style=\"color: red;\">Email or Password is incorrect! Please login again!</label>\r\n");
        out.write("                                        ");
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
}

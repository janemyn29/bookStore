package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cusEditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>THE5 BookStore</title>\r\n");
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
      out.write("    <body>\r\n");
      out.write("        <div class=\"page-wrapper\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cusHeader.jsp", out, false);
      out.write("\r\n");
      out.write("                <main class=\"main\">\r\n");
      out.write("                    <div class=\"page-header text-center\" style=\"background-image: url('assets/images/page-header-bg.jpg')\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <h1 class=\"page-title\">My Account</h1>\r\n");
      out.write("                        </div><!-- End .container -->\r\n");
      out.write("                    </div><!-- End .page-header -->\r\n");
      out.write("                    <nav aria-label=\"breadcrumb\" class=\"breadcrumb-nav mb-3\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"#\">Shop</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">My Account</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                        </div><!-- End .container -->\r\n");
      out.write("                    </nav><!-- End .breadcrumb-nav -->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"page-content\">\r\n");
      out.write("                        <div class=\"dashboard\">\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <aside class=\"col-md-4 col-lg-3\">\r\n");
      out.write("                                        <ul class=\"nav nav-dashboard flex-column mb-3 mb-md-0\" role=\"tablist\">\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link active\" id=\"tab-account-link\" data-toggle=\"tab\" href=\"#tab-account\" role=\"tab\" aria-controls=\"tab-account\" aria-selected=\"true\">Profile</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" id=\"tab-orders-link\" data-toggle=\"tab\" href=\"#tab-orders\" role=\"tab\" aria-controls=\"tab-orders\" aria-selected=\"false\">My Orders</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"cusHistory.jsp\">My History</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"cusChangePass.jsp\">Change Password</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li class=\"nav-item\">\r\n");
      out.write("                                                <a class=\"nav-link\" href=\"cusHome.jsp\">Sign Out</a>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </aside><!-- End .col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-md-8 col-lg-9\">\r\n");
      out.write("                                        <div class=\"tab-content\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"tab-pane fade show\" id=\"tab-orders\" role=\"tabpanel\" aria-labelledby=\"tab-orders-link\">\r\n");
      out.write("                                                <p>No order has been made yet.</p>\r\n");
      out.write("                                                <a href=\"cusShopping.jsp\" class=\"btn btn-outline-primary-2\"><span>GO SHOP</span><i class=\"icon-long-arrow-right\"></i></a>\r\n");
      out.write("                                            </div><!-- .End .tab-pane -->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"tab-pane fade show active\" id=\"tab-account\" role=\"tabpanel\" aria-labelledby=\"tab-account-link\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                <form name=\"formEditProfile\" action=\"cuseditprofile\" method=\"post\">\r\n");
      out.write("                                                    <div>\r\n");
      out.write("                                                        <label>User Name *</label>\r\n");
      out.write("                                                        <small class=\"form-text\">(This will be how your name will be displayed in the account section and in reviews)</small>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"txtUserName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <label>Phone Number *</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"txtPhoneNumber\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" maxlength=\"10\" required>\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <label>Email address *</label>\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" name=\"txtEmailAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"readonly>\r\n");
      out.write("                                                <small class=\"form-text\">(Email is read only, u can change your email when login)</small>\r\n");
      out.write("\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-primary-2\" onclick=\"alertShow()\">\r\n");
      out.write("                                                    <span>SAVE CHANGES</span>\r\n");
      out.write("                                                    <i class=\"icon-arrow-down\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                </script>\r\n");
      out.write("                                            </form>\r\n");
      out.write("\r\n");
      out.write("                                        </div><!-- .End .tab-pane -->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div><!-- End .col-lg-9 -->\r\n");
      out.write("                            </div><!-- End .row -->\r\n");
      out.write("                        </div><!-- End .container -->\r\n");
      out.write("                    </div><!-- End .dashboard -->\r\n");
      out.write("                </div><!-- End .page-content -->\r\n");
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
      out.write("        <!-- Mobile Menu -->\r\n");
      out.write("        <div class=\"mobile-menu-overlay\"></div><!-- End .mobil-menu-overlay -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"mobile-menu-container\">\r\n");
      out.write("            <div class=\"mobile-menu-wrapper\">\r\n");
      out.write("                <span class=\"mobile-menu-close\"><i class=\"icon-close\"></i></span>\r\n");
      out.write("\r\n");
      out.write("                <form action=\"#\" method=\"get\" class=\"mobile-search\">\r\n");
      out.write("                    <label for=\"mobile-search\" class=\"sr-only\">Search</label>\r\n");
      out.write("                    <input type=\"search\" class=\"form-control\" name=\"mobile-search\" id=\"mobile-search\" placeholder=\"Search in...\" required>\r\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"submit\"><i class=\"icon-search\"></i></button>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <nav class=\"mobile-nav\">\r\n");
      out.write("                    <ul class=\"mobile-menu\">\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"index.html\">Home</a>\r\n");
      out.write("\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"index-1.html\">01 - furniture store</a></li>\r\n");
      out.write("                                <li><a href=\"index.html\">02 - furniture store</a></li>\r\n");
      out.write("                                <li><a href=\"index-3.html\">03 - electronic store</a></li>\r\n");
      out.write("                                <li><a href=\"index-4.html\">04 - electronic store</a></li>\r\n");
      out.write("                                <li><a href=\"index-5.html\">05 - fashion store</a></li>\r\n");
      out.write("                                <li><a href=\"index-6.html\">06 - fashion store</a></li>\r\n");
      out.write("                                <li><a href=\"index-7.html\">07 - fashion store</a></li>\r\n");
      out.write("                                <li><a href=\"index-8.html\">08 - fashion store</a></li>\r\n");
      out.write("                                <li><a href=\"index-9.html\">09 - fashion store</a></li>\r\n");
      out.write("                                <li><a href=\"index-10.html\">10 - shoes store</a></li>\r\n");
      out.write("                                <li><a href=\"index-11.html\">11 - furniture simple store</a></li>\r\n");
      out.write("                                <li><a href=\"index-12.html\">12 - fashion simple store</a></li>\r\n");
      out.write("                                <li><a href=\"index-13.html\">13 - market</a></li>\r\n");
      out.write("                                <li><a href=\"index-14.html\">14 - market fullwidth</a></li>\r\n");
      out.write("                                <li><a href=\"index-15.html\">15 - lookbook 1</a></li>\r\n");
      out.write("                                <li><a href=\"index-16.html\">16 - lookbook 2</a></li>\r\n");
      out.write("                                <li><a href=\"index-17.html\">17 - fashion store</a></li>\r\n");
      out.write("                                <li><a href=\"index-18.html\">18 - fashion store (with sidebar)</a></li>\r\n");
      out.write("                                <li><a href=\"index-19.html\">19 - games store</a></li>\r\n");
      out.write("                                <li><a href=\"index-20.html\">20 - book store</a></li>\r\n");
      out.write("                                <li><a href=\"index-21.html\">21 - sport store</a></li>\r\n");
      out.write("                                <li><a href=\"index-22.html\">22 - tools store</a></li>\r\n");
      out.write("                                <li><a href=\"index-23.html\">23 - fashion left navigation store</a></li>\r\n");
      out.write("                                <li><a href=\"index-24.html\">24 - extreme sport store</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"category.html\">Shop</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"category-list.html\">Shop List</a></li>\r\n");
      out.write("                                <li><a href=\"category-2cols.html\">Shop Grid 2 Columns</a></li>\r\n");
      out.write("                                <li><a href=\"category.html\">Shop Grid 3 Columns</a></li>\r\n");
      out.write("                                <li><a href=\"category-4cols.html\">Shop Grid 4 Columns</a></li>\r\n");
      out.write("                                <li><a href=\"category-boxed.html\"><span>Shop Boxed No Sidebar<span class=\"tip tip-hot\">Hot</span></span></a></li>\r\n");
      out.write("                                <li><a href=\"category-fullwidth.html\">Shop Fullwidth No Sidebar</a></li>\r\n");
      out.write("                                <li><a href=\"product-category-boxed.html\">Product Category Boxed</a></li>\r\n");
      out.write("                                <li><a href=\"product-category-fullwidth.html\"><span>Product Category Fullwidth<span class=\"tip tip-new\">New</span></span></a></li>\r\n");
      out.write("                                <li><a href=\"cart.html\">Cart</a></li>\r\n");
      out.write("                                <li><a href=\"checkout.html\">Checkout</a></li>\r\n");
      out.write("                                <li><a href=\"wishlist.html\">Wishlist</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Lookbook</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"product.html\" class=\"sf-with-ul\">Product</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"product.html\">Default</a></li>\r\n");
      out.write("                                <li><a href=\"product-centered.html\">Centered</a></li>\r\n");
      out.write("                                <li><a href=\"product-extended.html\"><span>Extended Info<span class=\"tip tip-new\">New</span></span></a></li>\r\n");
      out.write("                                <li><a href=\"product-gallery.html\">Gallery</a></li>\r\n");
      out.write("                                <li><a href=\"product-sticky.html\">Sticky Info</a></li>\r\n");
      out.write("                                <li><a href=\"product-sidebar.html\">Boxed With Sidebar</a></li>\r\n");
      out.write("                                <li><a href=\"product-fullwidth.html\">Full Width</a></li>\r\n");
      out.write("                                <li><a href=\"product-masonry.html\">Masonry Sticky Info</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Pages</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"about.html\">About</a>\r\n");
      out.write("\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"about.html\">About 01</a></li>\r\n");
      out.write("                                        <li><a href=\"about-2.html\">About 02</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"contact.html\">Contact</a>\r\n");
      out.write("\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"contact.html\">Contact 01</a></li>\r\n");
      out.write("                                        <li><a href=\"contact-2.html\">Contact 02</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li><a href=\"login.html\">Login</a></li>\r\n");
      out.write("                                <li><a href=\"faq.html\">FAQs</a></li>\r\n");
      out.write("                                <li><a href=\"404.html\">Error 404</a></li>\r\n");
      out.write("                                <li><a href=\"coming-soon.html\">Coming Soon</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"blog.html\">Blog</a>\r\n");
      out.write("\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"blog.html\">Classic</a></li>\r\n");
      out.write("                                <li><a href=\"blog-listing.html\">Listing</a></li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\">Grid</a>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"blog-grid-2cols.html\">Grid 2 columns</a></li>\r\n");
      out.write("                                        <li><a href=\"blog-grid-3cols.html\">Grid 3 columns</a></li>\r\n");
      out.write("                                        <li><a href=\"blog-grid-4cols.html\">Grid 4 columns</a></li>\r\n");
      out.write("                                        <li><a href=\"blog-grid-sidebar.html\">Grid sidebar</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\">Masonry</a>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"blog-masonry-2cols.html\">Masonry 2 columns</a></li>\r\n");
      out.write("                                        <li><a href=\"blog-masonry-3cols.html\">Masonry 3 columns</a></li>\r\n");
      out.write("                                        <li><a href=\"blog-masonry-4cols.html\">Masonry 4 columns</a></li>\r\n");
      out.write("                                        <li><a href=\"blog-masonry-sidebar.html\">Masonry sidebar</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\">Mask</a>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"blog-mask-grid.html\">Blog mask grid</a></li>\r\n");
      out.write("                                        <li><a href=\"blog-mask-masonry.html\">Blog mask masonry</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\">Single Post</a>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"single.html\">Default with sidebar</a></li>\r\n");
      out.write("                                        <li><a href=\"single-fullwidth.html\">Fullwidth no sidebar</a></li>\r\n");
      out.write("                                        <li><a href=\"single-fullwidth-sidebar.html\">Fullwidth with sidebar</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"elements-list.html\">Elements</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"elements-products.html\">Products</a></li>\r\n");
      out.write("                                <li><a href=\"elements-typography.html\">Typography</a></li>\r\n");
      out.write("                                <li><a href=\"elements-titles.html\">Titles</a></li>\r\n");
      out.write("                                <li><a href=\"elements-banners.html\">Banners</a></li>\r\n");
      out.write("                                <li><a href=\"elements-product-category.html\">Product Category</a></li>\r\n");
      out.write("                                <li><a href=\"elements-video-banners.html\">Video Banners</a></li>\r\n");
      out.write("                                <li><a href=\"elements-buttons.html\">Buttons</a></li>\r\n");
      out.write("                                <li><a href=\"elements-accordions.html\">Accordions</a></li>\r\n");
      out.write("                                <li><a href=\"elements-tabs.html\">Tabs</a></li>\r\n");
      out.write("                                <li><a href=\"elements-testimonials.html\">Testimonials</a></li>\r\n");
      out.write("                                <li><a href=\"elements-blog-posts.html\">Blog Posts</a></li>\r\n");
      out.write("                                <li><a href=\"elements-portfolio.html\">Portfolio</a></li>\r\n");
      out.write("                                <li><a href=\"elements-cta.html\">Call to Action</a></li>\r\n");
      out.write("                                <li><a href=\"elements-icon-boxes.html\">Icon Boxes</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav><!-- End .mobile-nav -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"social-icons\">\r\n");
      out.write("                    <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Facebook\"><i class=\"icon-facebook-f\"></i></a>\r\n");
      out.write("                    <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Twitter\"><i class=\"icon-twitter\"></i></a>\r\n");
      out.write("                    <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Instagram\"><i class=\"icon-instagram\"></i></a>\r\n");
      out.write("                    <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Youtube\"><i class=\"icon-youtube\"></i></a>\r\n");
      out.write("                </div><!-- End .social-icons -->\r\n");
      out.write("            </div><!-- End .mobile-menu-wrapper -->\r\n");
      out.write("        </div><!-- End .mobile-menu-container -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Sign in / Register Modal -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"signin-modal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                            <span aria-hidden=\"true\"><i class=\"icon-close\"></i></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-box\">\r\n");
      out.write("                            <div class=\"form-tab\">\r\n");
      out.write("                                <ul class=\"nav nav-pills nav-fill\" role=\"tablist\">\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link active\" id=\"signin-tab\" data-toggle=\"tab\" href=\"#signin\" role=\"tab\" aria-controls=\"signin\" aria-selected=\"true\">Sign In</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link\" id=\"register-tab\" data-toggle=\"tab\" href=\"#register\" role=\"tab\" aria-controls=\"register\" aria-selected=\"false\">Register</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <div class=\"tab-content\" id=\"tab-content-5\">\r\n");
      out.write("                                    <div class=\"tab-pane fade show active\" id=\"signin\" role=\"tabpanel\" aria-labelledby=\"signin-tab\">\r\n");
      out.write("                                        <form action=\"#\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"singin-email\">Username or email address *</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"singin-email\" name=\"singin-email\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"singin-password\">Password *</label>\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"singin-password\" name=\"singin-password\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-footer\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-primary-2\">\r\n");
      out.write("                                                    <span>LOG IN</span>\r\n");
      out.write("                                                    <i class=\"icon-long-arrow-right\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"signin-remember\">\r\n");
      out.write("                                                    <label class=\"custom-control-label\" for=\"signin-remember\">Remember Me</label>\r\n");
      out.write("                                                </div><!-- End .custom-checkbox -->\r\n");
      out.write("\r\n");
      out.write("                                                <a href=\"#\" class=\"forgot-link\">Forgot Your Password?</a>\r\n");
      out.write("                                            </div><!-- End .form-footer -->\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        <div class=\"form-choice\">\r\n");
      out.write("                                            <p class=\"text-center\">or sign in with</p>\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-sm-6\">\r\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-login btn-g\">\r\n");
      out.write("                                                        <i class=\"icon-google\"></i>\r\n");
      out.write("                                                        Login With Google\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                </div><!-- End .col-6 -->\r\n");
      out.write("                                                <div class=\"col-sm-6\">\r\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-login btn-f\">\r\n");
      out.write("                                                        <i class=\"icon-facebook-f\"></i>\r\n");
      out.write("                                                        Login With Facebook\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                </div><!-- End .col-6 -->\r\n");
      out.write("                                            </div><!-- End .row -->\r\n");
      out.write("                                        </div><!-- End .form-choice -->\r\n");
      out.write("                                    </div><!-- .End .tab-pane -->\r\n");
      out.write("                                    <div class=\"tab-pane fade\" id=\"register\" role=\"tabpanel\" aria-labelledby=\"register-tab\">\r\n");
      out.write("                                        <form action=\"#\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"register-email\">Your email address *</label>\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" id=\"register-email\" name=\"register-email\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"register-password\">Password *</label>\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"register-password\" name=\"register-password\" required>\r\n");
      out.write("                                            </div><!-- End .form-group -->\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-footer\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-primary-2\">\r\n");
      out.write("                                                    <span>SIGN UP</span>\r\n");
      out.write("                                                    <i class=\"icon-long-arrow-right\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"register-policy\" required>\r\n");
      out.write("                                                    <label class=\"custom-control-label\" for=\"register-policy\">I agree to the <a href=\"#\">privacy policy</a> *</label>\r\n");
      out.write("                                                </div><!-- End .custom-checkbox -->\r\n");
      out.write("                                            </div><!-- End .form-footer -->\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        <div class=\"form-choice\">\r\n");
      out.write("                                            <p class=\"text-center\">or sign in with</p>\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-sm-6\">\r\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-login btn-g\">\r\n");
      out.write("                                                        <i class=\"icon-google\"></i>\r\n");
      out.write("                                                        Login With Google\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                </div><!-- End .col-6 -->\r\n");
      out.write("                                                <div class=\"col-sm-6\">\r\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-login  btn-f\">\r\n");
      out.write("                                                        <i class=\"icon-facebook-f\"></i>\r\n");
      out.write("                                                        Login With Facebook\r\n");
      out.write("                                                    </a>\r\n");
      out.write("                                                </div><!-- End .col-6 -->\r\n");
      out.write("                                            </div><!-- End .row -->\r\n");
      out.write("                                        </div><!-- End .form-choice -->\r\n");
      out.write("                                    </div><!-- .End .tab-pane -->\r\n");
      out.write("                                </div><!-- End .tab-content -->\r\n");
      out.write("                            </div><!-- End .form-tab -->\r\n");
      out.write("                        </div><!-- End .form-box -->\r\n");
      out.write("                    </div><!-- End .modal-body -->\r\n");
      out.write("                </div><!-- End .modal-content -->\r\n");
      out.write("            </div><!-- End .modal-dialog -->\r\n");
      out.write("        </div><!-- End .modal -->\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check == \"The user name is already used!!!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <small style=\"color: red;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</small>\r\n");
        out.write("                                                    ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check == \"The phone numer is already used!!!\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <small style=\"color: red;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</small>\r\n");
        out.write("                                                    ");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check == \"UPDATE SUCCESS\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <label  style=\"color: greenyellow;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${check}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</label>\r\n");
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
}

package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cusReturnManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>THE5 BookStore</title>\n");
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
      out.write("    <body>\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cusHeader.jsp", out, false);
      out.write("\n");
      out.write("                <main class=\"main\">\n");
      out.write("                    <div class=\"page-header text-center\" style=\"background-image: url('assets/images/page-header-bg.jpg')\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"page-title\">My Return Management</h1>\n");
      out.write("                        </div><!-- End .container -->\n");
      out.write("                    </div><!-- End .page-header -->\n");
      out.write("                    <nav aria-label=\"breadcrumb\" class=\"breadcrumb-nav mb-3\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"cushome\">Home</a></li>\n");
      out.write("                                <!--                                <li class=\"breadcrumb-item\"><a href=\"shopping.jsp\">Shop</a></li>-->\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">My Return Management</li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div><!-- End .container -->\n");
      out.write("                    </nav><!-- End .breadcrumb-nav -->\n");
      out.write("\n");
      out.write("                    <div class=\"page-content\">\n");
      out.write("                        <div class=\"dashboard\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <aside class=\"col-md-4 col-lg-3\">\n");
      out.write("                                        <ul class=\"nav nav-dashboard flex-column mb-3 mb-md-0\" role=\"tablist\">\n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link active\" id=\"tab-orders-link\" data-toggle=\"tab\" href=\"#tab-orders\" role=\"tab\" aria-controls=\"tab-orders\" aria-selected=\"false\">My Return Management</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"nav-item\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"/SWP391_BookStore/logout\">Sign Out</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                            <small>Notice:<br> - You can click on</small><i class=\"icon-eye\"></i> <small> in the action column to view history details.<br>\n");
      out.write("                                            </small>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </aside><!-- End .col-lg-3 -->\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-8 col-lg-9\">\n");
      out.write("                                        <div class=\"tab-content\">\n");
      out.write("                                            <div class=\"tab-pane fade show active\" id=\"tab-orders\" role=\"tabpanel\" aria-labelledby=\"tab-orders-link\">\n");
      out.write("                                                <div class=\"table-responsive\">\n");
      out.write("                                                    <table class=\"table table-striped table-bordered zero-configuration\">\n");
      out.write("                                                        <thead>\n");
      out.write("                                                            <tr class=\"center-parent\">\n");
      out.write("                                                                <th>Number</th>\n");
      out.write("                                                                <th>Order Date</th>\n");
      out.write("                                                                <th>Order Address</th>\n");
      out.write("                                                                <th>Status</th>\n");
      out.write("                                                                <th>Action</th>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                        </thead>\n");
      out.write("\n");
      out.write("                                                        <tbody>\n");
      out.write("                                                        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </tbody>                                        \n");
      out.write("                                                </table>\n");
      out.write("\n");
      out.write("                                                <a href=\"cusEditProfile.jsp\" class=\"btn btn-outline-primary-2\">\n");
      out.write("                                                    <span>BACK</span>\n");
      out.write("                                                    <i class=\"icon-arrow-left\"></i>\n");
      out.write("                                                </a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div><!-- .End .tab-pane -->\n");
      out.write("                                    </div><!-- End .container -->\n");
      out.write("                                </div><!-- End .col-lg-9 --> \n");
      out.write("                            </div><!-- End .row -->\n");
      out.write("                        </div><!-- End .container -->\n");
      out.write("                    </div><!-- End .dashboard -->\n");
      out.write("                </div><!-- End .page-content -->\n");
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
      out.write("                                    <h4 class=\"widget-title\">My Orders</h4><!-- End .widget-title -->\n");
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
      out.write("        <!-- Mobile Menu -->\n");
      out.write("        <div class=\"mobile-menu-overlay\"></div><!-- End .mobil-menu-overlay -->\n");
      out.write("\n");
      out.write("        <div class=\"mobile-menu-container\">\n");
      out.write("            <div class=\"mobile-menu-wrapper\">\n");
      out.write("                <span class=\"mobile-menu-close\"><i class=\"icon-close\"></i></span>\n");
      out.write("\n");
      out.write("                <form action=\"#\" method=\"get\" class=\"mobile-search\">\n");
      out.write("                    <label for=\"mobile-search\" class=\"sr-only\">Search</label>\n");
      out.write("                    <input type=\"search\" class=\"form-control\" name=\"mobile-search\" id=\"mobile-search\" placeholder=\"Search in...\" required>\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"submit\"><i class=\"icon-search\"></i></button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <nav class=\"mobile-nav\">\n");
      out.write("                    <ul class=\"mobile-menu\">\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"index.html\">Home</a>\n");
      out.write("\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"index-1.html\">01 - furniture store</a></li>\n");
      out.write("                                <li><a href=\"index.html\">02 - furniture store</a></li>\n");
      out.write("                                <li><a href=\"index-3.html\">03 - electronic store</a></li>\n");
      out.write("                                <li><a href=\"index-4.html\">04 - electronic store</a></li>\n");
      out.write("                                <li><a href=\"index-5.html\">05 - fashion store</a></li>\n");
      out.write("                                <li><a href=\"index-6.html\">06 - fashion store</a></li>\n");
      out.write("                                <li><a href=\"index-7.html\">07 - fashion store</a></li>\n");
      out.write("                                <li><a href=\"index-8.html\">08 - fashion store</a></li>\n");
      out.write("                                <li><a href=\"index-9.html\">09 - fashion store</a></li>\n");
      out.write("                                <li><a href=\"index-10.html\">10 - shoes store</a></li>\n");
      out.write("                                <li><a href=\"index-11.html\">11 - furniture simple store</a></li>\n");
      out.write("                                <li><a href=\"index-12.html\">12 - fashion simple store</a></li>\n");
      out.write("                                <li><a href=\"index-13.html\">13 - market</a></li>\n");
      out.write("                                <li><a href=\"index-14.html\">14 - market fullwidth</a></li>\n");
      out.write("                                <li><a href=\"index-15.html\">15 - lookbook 1</a></li>\n");
      out.write("                                <li><a href=\"index-16.html\">16 - lookbook 2</a></li>\n");
      out.write("                                <li><a href=\"index-17.html\">17 - fashion store</a></li>\n");
      out.write("                                <li><a href=\"index-18.html\">18 - fashion store (with sidebar)</a></li>\n");
      out.write("                                <li><a href=\"index-19.html\">19 - games store</a></li>\n");
      out.write("                                <li><a href=\"index-20.html\">20 - book store</a></li>\n");
      out.write("                                <li><a href=\"index-21.html\">21 - sport store</a></li>\n");
      out.write("                                <li><a href=\"index-22.html\">22 - tools store</a></li>\n");
      out.write("                                <li><a href=\"index-23.html\">23 - fashion left navigation store</a></li>\n");
      out.write("                                <li><a href=\"index-24.html\">24 - extreme sport store</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"category.html\">Shop</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"category-list.html\">Shop List</a></li>\n");
      out.write("                                <li><a href=\"category-2cols.html\">Shop Grid 2 Columns</a></li>\n");
      out.write("                                <li><a href=\"category.html\">Shop Grid 3 Columns</a></li>\n");
      out.write("                                <li><a href=\"category-4cols.html\">Shop Grid 4 Columns</a></li>\n");
      out.write("                                <li><a href=\"category-boxed.html\"><span>Shop Boxed No Sidebar<span class=\"tip tip-hot\">Hot</span></span></a></li>\n");
      out.write("                                <li><a href=\"category-fullwidth.html\">Shop Fullwidth No Sidebar</a></li>\n");
      out.write("                                <li><a href=\"product-category-boxed.html\">Product Category Boxed</a></li>\n");
      out.write("                                <li><a href=\"product-category-fullwidth.html\"><span>Product Category Fullwidth<span class=\"tip tip-new\">New</span></span></a></li>\n");
      out.write("                                <li><a href=\"cart.html\">Cart</a></li>\n");
      out.write("                                <li><a href=\"checkout.html\">Checkout</a></li>\n");
      out.write("                                <li><a href=\"wishlist.html\">Wishlist</a></li>\n");
      out.write("                                <li><a href=\"#\">Lookbook</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"product.html\" class=\"sf-with-ul\">Product</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"product.html\">Default</a></li>\n");
      out.write("                                <li><a href=\"product-centered.html\">Centered</a></li>\n");
      out.write("                                <li><a href=\"product-extended.html\"><span>Extended Info<span class=\"tip tip-new\">New</span></span></a></li>\n");
      out.write("                                <li><a href=\"product-gallery.html\">Gallery</a></li>\n");
      out.write("                                <li><a href=\"product-sticky.html\">Sticky Info</a></li>\n");
      out.write("                                <li><a href=\"product-sidebar.html\">Boxed With Sidebar</a></li>\n");
      out.write("                                <li><a href=\"product-fullwidth.html\">Full Width</a></li>\n");
      out.write("                                <li><a href=\"product-masonry.html\">Masonry Sticky Info</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Pages</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"about.html\">About</a>\n");
      out.write("\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"about.html\">About 01</a></li>\n");
      out.write("                                        <li><a href=\"about-2.html\">About 02</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"contact.html\">Contact</a>\n");
      out.write("\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"contact.html\">Contact 01</a></li>\n");
      out.write("                                        <li><a href=\"contact-2.html\">Contact 02</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"login.html\">Login</a></li>\n");
      out.write("                                <li><a href=\"faq.html\">FAQs</a></li>\n");
      out.write("                                <li><a href=\"404.html\">Error 404</a></li>\n");
      out.write("                                <li><a href=\"coming-soon.html\">Coming Soon</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"blog.html\">Blog</a>\n");
      out.write("\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"blog.html\">Classic</a></li>\n");
      out.write("                                <li><a href=\"blog-listing.html\">Listing</a></li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Grid</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"blog-grid-2cols.html\">Grid 2 columns</a></li>\n");
      out.write("                                        <li><a href=\"blog-grid-3cols.html\">Grid 3 columns</a></li>\n");
      out.write("                                        <li><a href=\"blog-grid-4cols.html\">Grid 4 columns</a></li>\n");
      out.write("                                        <li><a href=\"blog-grid-sidebar.html\">Grid sidebar</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Masonry</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"blog-masonry-2cols.html\">Masonry 2 columns</a></li>\n");
      out.write("                                        <li><a href=\"blog-masonry-3cols.html\">Masonry 3 columns</a></li>\n");
      out.write("                                        <li><a href=\"blog-masonry-4cols.html\">Masonry 4 columns</a></li>\n");
      out.write("                                        <li><a href=\"blog-masonry-sidebar.html\">Masonry sidebar</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Mask</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"blog-mask-grid.html\">Blog mask grid</a></li>\n");
      out.write("                                        <li><a href=\"blog-mask-masonry.html\">Blog mask masonry</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Single Post</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"single.html\">Default with sidebar</a></li>\n");
      out.write("                                        <li><a href=\"single-fullwidth.html\">Fullwidth no sidebar</a></li>\n");
      out.write("                                        <li><a href=\"single-fullwidth-sidebar.html\">Fullwidth with sidebar</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"elements-list.html\">Elements</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"elements-products.html\">Products</a></li>\n");
      out.write("                                <li><a href=\"elements-typography.html\">Typography</a></li>\n");
      out.write("                                <li><a href=\"elements-titles.html\">Titles</a></li>\n");
      out.write("                                <li><a href=\"elements-banners.html\">Banners</a></li>\n");
      out.write("                                <li><a href=\"elements-product-category.html\">Product Category</a></li>\n");
      out.write("                                <li><a href=\"elements-video-banners.html\">Video Banners</a></li>\n");
      out.write("                                <li><a href=\"elements-buttons.html\">Buttons</a></li>\n");
      out.write("                                <li><a href=\"elements-accordions.html\">Accordions</a></li>\n");
      out.write("                                <li><a href=\"elements-tabs.html\">Tabs</a></li>\n");
      out.write("                                <li><a href=\"elements-testimonials.html\">Testimonials</a></li>\n");
      out.write("                                <li><a href=\"elements-blog-posts.html\">Blog Posts</a></li>\n");
      out.write("                                <li><a href=\"elements-portfolio.html\">Portfolio</a></li>\n");
      out.write("                                <li><a href=\"elements-cta.html\">Call to Action</a></li>\n");
      out.write("                                <li><a href=\"elements-icon-boxes.html\">Icon Boxes</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav><!-- End .mobile-nav -->\n");
      out.write("\n");
      out.write("                <div class=\"social-icons\">\n");
      out.write("                    <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Facebook\"><i class=\"icon-facebook-f\"></i></a>\n");
      out.write("                    <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Twitter\"><i class=\"icon-twitter\"></i></a>\n");
      out.write("                    <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Instagram\"><i class=\"icon-instagram\"></i></a>\n");
      out.write("                    <a href=\"#\" class=\"social-icon\" target=\"_blank\" title=\"Youtube\"><i class=\"icon-youtube\"></i></a>\n");
      out.write("                </div><!-- End .social-icons -->\n");
      out.write("            </div><!-- End .mobile-menu-wrapper -->\n");
      out.write("        </div><!-- End .mobile-menu-container -->\n");
      out.write("\n");
      out.write("        <!-- Sign in / Register Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"signin-modal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\"><i class=\"icon-close\"></i></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"form-box\">\n");
      out.write("                            <div class=\"form-tab\">\n");
      out.write("                                <ul class=\"nav nav-pills nav-fill\" role=\"tablist\">\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a class=\"nav-link active\" id=\"signin-tab\" data-toggle=\"tab\" href=\"#signin\" role=\"tab\" aria-controls=\"signin\" aria-selected=\"true\">Sign In</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a class=\"nav-link\" id=\"register-tab\" data-toggle=\"tab\" href=\"#register\" role=\"tab\" aria-controls=\"register\" aria-selected=\"false\">Register</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"tab-content\" id=\"tab-content-5\">\n");
      out.write("                                    <div class=\"tab-pane fade show active\" id=\"signin\" role=\"tabpanel\" aria-labelledby=\"signin-tab\">\n");
      out.write("                                        <form action=\"#\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"singin-email\">Username or email address *</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"singin-email\" name=\"singin-email\" required>\n");
      out.write("                                            </div><!-- End .form-group -->\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"singin-password\">Password *</label>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"singin-password\" name=\"singin-password\" required>\n");
      out.write("                                            </div><!-- End .form-group -->\n");
      out.write("\n");
      out.write("                                            <div class=\"form-footer\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-primary-2\">\n");
      out.write("                                                    <span>LOG IN</span>\n");
      out.write("                                                    <i class=\"icon-long-arrow-right\"></i>\n");
      out.write("                                                </button>\n");
      out.write("\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\">\n");
      out.write("                                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"signin-remember\">\n");
      out.write("                                                    <label class=\"custom-control-label\" for=\"signin-remember\">Remember Me</label>\n");
      out.write("                                                </div><!-- End .custom-checkbox -->\n");
      out.write("\n");
      out.write("                                                <a href=\"#\" class=\"forgot-link\">Forgot Your Password?</a>\n");
      out.write("                                            </div><!-- End .form-footer -->\n");
      out.write("                                        </form>\n");
      out.write("                                        <div class=\"form-choice\">\n");
      out.write("                                            <p class=\"text-center\">or sign in with</p>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-login btn-g\">\n");
      out.write("                                                        <i class=\"icon-google\"></i>\n");
      out.write("                                                        Login With Google\n");
      out.write("                                                    </a>\n");
      out.write("                                                </div><!-- End .col-6 -->\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-login btn-f\">\n");
      out.write("                                                        <i class=\"icon-facebook-f\"></i>\n");
      out.write("                                                        Login With Facebook\n");
      out.write("                                                    </a>\n");
      out.write("                                                </div><!-- End .col-6 -->\n");
      out.write("                                            </div><!-- End .row -->\n");
      out.write("                                        </div><!-- End .form-choice -->\n");
      out.write("                                    </div><!-- .End .tab-pane -->\n");
      out.write("                                    <div class=\"tab-pane fade\" id=\"register\" role=\"tabpanel\" aria-labelledby=\"register-tab\">\n");
      out.write("                                        <form action=\"#\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"register-email\">Your email address *</label>\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" id=\"register-email\" name=\"register-email\" required>\n");
      out.write("                                            </div><!-- End .form-group -->\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label for=\"register-password\">Password *</label>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"register-password\" name=\"register-password\" required>\n");
      out.write("                                            </div><!-- End .form-group -->\n");
      out.write("\n");
      out.write("                                            <div class=\"form-footer\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-primary-2\">\n");
      out.write("                                                    <span>SIGN UP</span>\n");
      out.write("                                                    <i class=\"icon-long-arrow-right\"></i>\n");
      out.write("                                                </button>\n");
      out.write("\n");
      out.write("                                                <div class=\"custom-control custom-checkbox\">\n");
      out.write("                                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"register-policy\" required>\n");
      out.write("                                                    <label class=\"custom-control-label\" for=\"register-policy\">I agree to the <a href=\"#\">privacy policy</a> *</label>\n");
      out.write("                                                </div><!-- End .custom-checkbox -->\n");
      out.write("                                            </div><!-- End .form-footer -->\n");
      out.write("                                        </form>\n");
      out.write("                                        <div class=\"form-choice\">\n");
      out.write("                                            <p class=\"text-center\">or sign in with</p>\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-login btn-g\">\n");
      out.write("                                                        <i class=\"icon-google\"></i>\n");
      out.write("                                                        Login With Google\n");
      out.write("                                                    </a>\n");
      out.write("                                                </div><!-- End .col-6 -->\n");
      out.write("                                                <div class=\"col-sm-6\">\n");
      out.write("                                                    <a href=\"#\" class=\"btn btn-login  btn-f\">\n");
      out.write("                                                        <i class=\"icon-facebook-f\"></i>\n");
      out.write("                                                        Login With Facebook\n");
      out.write("                                                    </a>\n");
      out.write("                                                </div><!-- End .col-6 -->\n");
      out.write("                                            </div><!-- End .row -->\n");
      out.write("                                        </div><!-- End .form-choice -->\n");
      out.write("                                    </div><!-- .End .tab-pane -->\n");
      out.write("                                </div><!-- End .tab-content -->\n");
      out.write("                            </div><!-- End .form-tab -->\n");
      out.write("                        </div><!-- End .form-box -->\n");
      out.write("                    </div><!-- End .modal-body -->\n");
      out.write("                </div><!-- End .modal-content -->\n");
      out.write("            </div><!-- End .modal-dialog -->\n");
      out.write("        </div><!-- End .modal -->\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("count");
    _jspx_th_c_set_0.setValue(new String("0"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listOrd}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("ord");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                                <tr class=\"center-parent\">\n");
          out.write("                                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.orderDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\n");
          out.write("                                                                <td><a class=\"icon-eye\" href=\"cusreturnmanagementdetail?orderID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a></td>\n");
          out.write("\n");
          out.write("                                                            </tr>\n");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("count");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count=count+1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}

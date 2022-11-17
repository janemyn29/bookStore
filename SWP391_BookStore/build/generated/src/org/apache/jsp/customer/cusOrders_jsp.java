package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cusOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("                            <h1 class=\"page-title\">My Orders</h1>\r\n");
      out.write("                        </div><!-- End .container -->\r\n");
      out.write("                    </div><!-- End .page-header -->\r\n");
      out.write("                    <nav aria-label=\"breadcrumb\" class=\"breadcrumb-nav mb-3\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"cushome\">Home</a></li>\r\n");
      out.write("                                <!--                                <li class=\"breadcrumb-item\"><a href=\"shopping.jsp\">Shop</a></li>-->\r\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">My Orders</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                        </div><!-- End .container -->\r\n");
      out.write("                    </nav><!-- End .breadcrumb-nav -->\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <style>\r\n");
      out.write("                    p {\r\n");
      out.write("                        text-align: center;\r\n");
      out.write("                    }\r\n");
      out.write("                </style>\r\n");
      out.write("                <div class=\"page-content\">\r\n");
      out.write("                    <div class=\"dashboard\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <aside class=\"col-md-4 col-lg-3\">\r\n");
      out.write("                                    <ul class=\"nav nav-dashboard flex-column mb-3 mb-md-0\" role=\"tablist\">\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link active\" id=\"tab-orders-link\" data-toggle=\"tab\" href=\"#tab-orders\" role=\"tab\" aria-controls=\"tab-orders\" aria-selected=\"false\">My Orders</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"/SWP391_BookStore/logout\">Sign Out</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <small>Notice:<br> - You can click on</small><i class=\"icon-eye\"></i> <small> in the action column to view order details.<br>\r\n");
      out.write("                                                - Or confirm receipt of goods with order status as \"delivering\".\r\n");
      out.write("                                            </small>\r\n");
      out.write("                                            <small style=\"color: green\"> \r\n");
      out.write("                                                <br>\r\n");
      out.write("                                                Any questions contact:\r\n");
      out.write("                                                <br> <i class=\"icon-facebook-f\"></i> Tran My\r\n");
      out.write("                                                <br> <i class=\"icon-google\">mail</i> : mytran@gmail.com\r\n");
      out.write("                                                <br> <i class=\"icon-phone\"></i> 0837462988\r\n");
      out.write("                                            </small>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </aside><!-- End .col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-md-8 col-lg-9\">\r\n");
      out.write("                                    <div class=\"tab-content\">\r\n");
      out.write("                                        <div class=\"tab-pane fade show active\" id=\"tab-orders\" role=\"tabpanel\" aria-labelledby=\"tab-orders-link\">\r\n");
      out.write("                                            <div class=\"table-responsive\">\r\n");
      out.write("                                                <table class=\"table table-striped table-bordered zero-configuration\">\r\n");
      out.write("\r\n");
      out.write("                                                    <thead>\r\n");
      out.write("                                                        <tr class=\"center-parent\">\r\n");
      out.write("                                                            <th>Number</th>\r\n");
      out.write("                                                            <th>Order Date</th>\r\n");
      out.write("                                                            <th>Order Address</th>\r\n");
      out.write("                                                            <th>Status</th>\r\n");
      out.write("                                                            <th>Action</th>\r\n");
      out.write("                                                            <th>Cancel</th>\r\n");
      out.write("                                                        </tr>\r\n");
      out.write("                                                    </thead>\r\n");
      out.write("\r\n");
      out.write("                                                    <tbody>\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                    <script>\r\n");
      out.write("                                                        function showMess1(id) {\r\n");
      out.write("                                                            var option = confirm(\"Are you sure to cancel this order ?\");\r\n");
      out.write("                                                            if (option === true) {\r\n");
      out.write("                                                                window.location.href = \"cuscancelorder?orderID=\" + id;\r\n");
      out.write("                                                            }\r\n");
      out.write("                                                        }\r\n");
      out.write("                                                    </script>\r\n");
      out.write("                                                    </tbody>                                        \r\n");
      out.write("                                                </table>\r\n");
      out.write("\r\n");
      out.write("                                                <a href=\"cusEditProfile.jsp\" class=\"btn btn-outline-primary-2\">\r\n");
      out.write("                                                    <span>BACK</span>\r\n");
      out.write("                                                    <i class=\"icon-arrow-left\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div><!-- .End .tab-pane -->\r\n");
      out.write("                                    </div><!-- End .container -->\r\n");
      out.write("                                </div><!-- End .col-lg-9 --> \r\n");
      out.write("                            </div><!-- End .row -->\r\n");
      out.write("                        </div><!-- End .container -->\r\n");
      out.write("                    </div><!-- End .dashboard -->\r\n");
      out.write("                </div><!-- End .page-content -->\r\n");
      out.write("            </main><!-- End .main -->\r\n");
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cusFooter.jsp", out, false);
      out.write("\r\n");
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
      out.write("        <script>\r\n");
      out.write("                                                        // Get all elements with class=\"closebtn\"\r\n");
      out.write("                                                        var close = document.getElementsByClassName(\"closebtn\");\r\n");
      out.write("                                                        var i;\r\n");
      out.write("\r\n");
      out.write("                                                        // Loop through all close buttons\r\n");
      out.write("                                                        for (i = 0; i < close.length; i++) {\r\n");
      out.write("                                                            // When someone clicks on a close button\r\n");
      out.write("                                                            close[i].onclick = function () {\r\n");
      out.write("\r\n");
      out.write("                                                                // Get the parent of <span class=\"closebtn\"> (<div class=\"alert\">)\r\n");
      out.write("                                                                var div = this.parentElement;\r\n");
      out.write("\r\n");
      out.write("                                                                // Set the opacity of div to 0 (transparent)\r\n");
      out.write("                                                                div.style.opacity = \"0\";\r\n");
      out.write("\r\n");
      out.write("                                                                // Hide the div after 600ms (the same amount of milliseconds it takes to fade out)\r\n");
      out.write("                                                                setTimeout(function () {\r\n");
      out.write("                                                                    div.style.display = \"none\";\r\n");
      out.write("                                                                }, 600);\r\n");
      out.write("                                                            }\r\n");
      out.write("                                                        }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .alert2 {\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: honeydew; /* Red */\r\n");
      out.write("            color: green;\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* The close button */\r\n");
      out.write("        .closebtn {\r\n");
      out.write("            margin-left: 15px;\r\n");
      out.write("            color: black;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            float: right;\r\n");
      out.write("            font-size: 22px;\r\n");
      out.write("            line-height: 20px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* When moving the mouse over the close button */\r\n");
      out.write("        .closebtn:hover {\r\n");
      out.write("            color: black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .alert {\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("            transition: opacity 0.6s; /* 600ms to fade out */\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checkstatus == \"Cancel order success\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <div class=\"alert2\">\r\n");
        out.write("                        <span class=\"closebtn\" onclick=\"this.parentElement.style.display = 'none';\">&times;</span>\r\n");
        out.write("                        <p align=\"center\" > CANCEL ORDER SUCCESSFULLY YOUR ORDER HAS BEEN MOVED TO HISTORY PAGE WITH STATUS \"CANCELED\"</p> \r\n");
        out.write("                    </div>\r\n");
        out.write("                ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${confirm == \"confirm\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <div class=\"alert2\">\r\n");
        out.write("                        <span class=\"closebtn\" onclick=\"this.parentElement.style.display = 'none';\">&times;</span>\r\n");
        out.write("                        <p align=\"center\" > \r\n");
        out.write("                            CONFIRMED SUCCESSFULLY RECEIVED <br> YOUR ORDER HAS BEEN MOVED TO HISTORY PAGE WITH STATUS \"RECEIVED\" </p> \r\n");
        out.write("                    </div>\r\n");
        out.write("                ");
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
          out.write("\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                                <tr class=\"center-parent\">\r\n");
          out.write("                                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.orderDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("                                                                <td><a class=\"icon-eye\" href=\"cusorderdetailhome?orderID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a></td>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                                ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("  \r\n");
          out.write("                                                                ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("  \r\n");
          out.write("                                                            </tr>\r\n");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.status == \"confirming\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <td>\r\n");
        out.write("                                                                        <a class=\"icon-close\" onclick='showMess1(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(")'></a>\r\n");
        out.write("                                                                    </td> \r\n");
        out.write("                                                                ");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ord.status == \"delivering\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <td>\r\n");
        out.write("                                                                    </td> \r\n");
        out.write("                                                                ");
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
}

package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cusproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forTokens_var_items_delims;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forTokens_var_items_delims = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.release();
    _jspx_tagPool_c_forTokens_var_items_delims.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/plugins/owl-carousel/owl.carousel.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/plugins/magnific-popup/magnific-popup.css\">\r\n");
      out.write("        <!-- Main CSS File -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/plugins/nouislider/nouislider.css\">\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            .product-content-desc {\r\n");
      out.write("                margin-bottom: 0;\r\n");
      out.write("                height: 100px;\r\n");
      out.write("                overflow: hidden\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"page-wrapper\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cusHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <main class=\"main\">\r\n");
      out.write("                    <nav aria-label=\"breadcrumb\" class=\"breadcrumb-nav border-0 mb-0\">\r\n");
      out.write("                        <div class=\"container d-flex align-items-center\">\r\n");
      out.write("                            <ol class=\"breadcrumb\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"cushome\">Home</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"cusshopping?index=1\">Shopping</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                        <nav class=\"product-pager ml-auto\" aria-label=\"Product\">\r\n");
      out.write("                            <a class=\"product-pager-link product-pager-prev\" href=\"#\" aria-label=\"Previous\" tabindex=\"-1\">\r\n");
      out.write("                                <i class=\"icon-angle-left\"></i>\r\n");
      out.write("                                <span>Prev</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"product-pager-link product-pager-next\" href=\"#\" aria-label=\"Next\" tabindex=\"-1\">\r\n");
      out.write("                                <span>Next</span>\r\n");
      out.write("                                <i class=\"icon-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </nav><!-- End .pager-nav -->\r\n");
      out.write("                    </div><!-- End .container -->\r\n");
      out.write("                </nav><!-- End .breadcrumb-nav -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"page-content\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"product-details-top\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"product-gallery product-gallery-vertical\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <figure class=\"product-main-image\">\r\n");
      out.write("                                                <img id=\"product-zoom\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" data-zoom-image=\"\" alt=\"product image\">\r\n");
      out.write("\r\n");
      out.write("                                                <a href=\"#\" id=\"btn-product-gallery\" class=\"btn-product-gallery\">\r\n");
      out.write("                                                    <i class=\"icon-arrows\"></i>\r\n");
      out.write("                                                </a>\r\n");
      out.write("                                            </figure><!-- End .product-main-image -->\r\n");
      out.write("\r\n");
      out.write("                                        </div><!-- End .row -->\r\n");
      out.write("                                    </div><!-- End .product-gallery -->\r\n");
      out.write("                                </div><!-- End .col-md-6 -->\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <div class=\"product-details\">\r\n");
      out.write("                                        <h1 class=\"product-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1><!-- End .product-title -->\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"discount-price\"  style=\"text-decoration: line-through\"  >\r\n");
      out.write("                                            Old Price: ");
      if (_jspx_meth_fmt_formatNumber_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </div><!-- End .product-price -->\r\n");
      out.write("                                        <div class=\"product-price\">\r\n");
      out.write("                                            Sale Price: ");
      if (_jspx_meth_fmt_formatNumber_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("        \r\n");
      out.write("                                        <div class=\"product-content\">\r\n");
      out.write("                                            <p id=\"product-content-desc\" class=\"product-content-desc\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                            <button onclick=\"handleMoreLessClick()\">show more/less</button>\r\n");
      out.write("                                            <script>\r\n");
      out.write("                                                const element = document.getElementById(\"product-content-desc\");\r\n");
      out.write("                                                function handleMoreLessClick() {\r\n");
      out.write("                                                    console.log({element});\r\n");
      out.write("                                                    element.classList.toggle(\"product-content-desc\");\r\n");
      out.write("                                                }\r\n");
      out.write("                                            </script>\r\n");
      out.write("                                        </div><!-- End .product-content -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"product-details-footer\">\r\n");
      out.write("                                            <div class=\"product-cat\">\r\n");
      out.write("                                                <span>Category:</span>\r\n");
      out.write("                                                <a href=\"cuscategory?categoryName=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                                            </div><!-- End .product-cat -->\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"product-details-footer\">\r\n");
      out.write("                                            <div class=\"product-cat\">\r\n");
      out.write("                                                <span>Author:</span>\r\n");
      out.write("                                                <div class=\"product\">\r\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forTokens_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                </div><!-- End .ratings -->\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div><!-- End .product-cat -->\r\n");
      out.write("\r\n");
      out.write("                                        <!-- End .product-details-footer -->\r\n");
      out.write("                                    </div><!-- End .product-details -->\r\n");
      out.write("                                </div><!-- End .col-md-6 -->\r\n");
      out.write("                            </div><!-- End .row -->\r\n");
      out.write("                        </div><!-- End .product-details-top -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"heading heading-center mb-6\">\r\n");
      out.write("                                <h2 class=\"title\">Related products</h2><!-- End .title -->\r\n");
      out.write("                            </div><!-- End .heading -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"tab-content\">\r\n");
      out.write("                                <div class=\"tab-pane p-0 fade show active\" id=\"top-all-tab\" role=\"tabpanel\" aria-labelledby=\"top-all-link\">\r\n");
      out.write("                                    <div class=\"products\">\r\n");
      out.write("                                        <div class=\"row justify-content-center\">\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </div><!-- End .row -->\r\n");
      out.write("                                    </div><!-- End .products -->\r\n");
      out.write("                                </div><!-- .End .tab-pane -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div><!-- End .row -->\r\n");
      out.write("                        </div><!-- End .products -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"owl-carousel owl-simple carousel-equal-height carousel-with-shadow\" data-toggle=\"owl\" \r\n");
      out.write("                             data-owl-options='{\r\n");
      out.write("                             \"nav\": false, \r\n");
      out.write("                             \"dots\": true,\r\n");
      out.write("                             \"margin\": 20,\r\n");
      out.write("                             \"loop\": false,\r\n");
      out.write("                             \"responsive\": {\r\n");
      out.write("                             \"0\": {\r\n");
      out.write("                             \"items\":1\r\n");
      out.write("                             },\r\n");
      out.write("                             \"480\": {\r\n");
      out.write("                             \"items\":2\r\n");
      out.write("                             },\r\n");
      out.write("                             \"768\": {\r\n");
      out.write("                             \"items\":3\r\n");
      out.write("                             },\r\n");
      out.write("                             \"992\": {\r\n");
      out.write("                             \"items\":4\r\n");
      out.write("                             },\r\n");
      out.write("                             \"1200\": {\r\n");
      out.write("                             \"items\":4,\r\n");
      out.write("                             \"nav\": true,\r\n");
      out.write("                             \"dots\": false\r\n");
      out.write("                             }\r\n");
      out.write("                             }\r\n");
      out.write("                             }'>\r\n");
      out.write("                        </div><!-- End .owl-carousel -->\r\n");
      out.write("                    </div><!-- End .container -->\r\n");
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
      out.write("\r\n");
      out.write("        </div><!-- End .page-wrapper -->\r\n");
      out.write("        <button id=\"scroll-top\" title=\"Back to Top\"><i class=\"icon-arrow-up\"></i></button>\r\n");
      out.write("\r\n");
      out.write("        <!-- Sticky Bar -->\r\n");
      out.write("        <div class=\"sticky-bar\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-6\">\r\n");
      out.write("                        <figure class=\"product-media\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Product image\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </figure><!-- End .product-media -->\r\n");
      out.write("                        <h4 class=\"product-title\"><a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></h4><!-- End .product-title -->\r\n");
      out.write("                    </div><!-- End .col-6 -->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-6 justify-content-end\">\r\n");
      out.write("                        <div class=\"product-price\">\r\n");
      out.write("                            ");
      if (_jspx_meth_fmt_formatNumber_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        </div><!-- End .product-price -->\r\n");
      out.write("                        <div class=\"product-details-quantity\">\r\n");
      out.write("                            <input type=\"number\" id=\"sticky-cart-qty\" class=\"form-control\" value=\"1\" min=\"1\" max=\"10\" step=\"1\" data-decimals=\"0\" required>\r\n");
      out.write("                        </div><!-- End .product-details-quantity -->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"product-details-action\">\r\n");
      out.write("                            <a href=\"#\" class=\"btn-product btn-cart\"><span>Add to Cart</span></a>\r\n");
      out.write("                        </div><!-- End .product-details-action -->\r\n");
      out.write("                    </div><!-- End .col-6 -->\r\n");
      out.write("                </div><!-- End .row -->\r\n");
      out.write("            </div><!-- End .container -->\r\n");
      out.write("        </div><!-- End .sticky-bar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        <script src=\"assets/js/bootstrap-input-spinner.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.elevateZoom.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap-input-spinner.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("        <!-- Main JS File -->\r\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- molla/product.jsp  22 Nov 2019 09:55:05 GMT -->\r\n");
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

  private boolean _jspx_meth_fmt_formatNumber_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent(null);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.buyPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_0.setPattern(" #,##0 VND");
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent(null);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.buyPrice-((detailProduct.discountPercent*detailProduct.buyPrice)/100)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_1.setPattern(" #,##0 VND");
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.qty==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <div style=\"color: red\" class=\"product-price\">\r\n");
        out.write("                                               SOLD OUT\r\n");
        out.write("                                            </div>\r\n");
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

  private boolean _jspx_meth_c_forTokens_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forTokens
    org.apache.taglibs.standard.tag.rt.core.ForTokensTag _jspx_th_c_forTokens_0 = (org.apache.taglibs.standard.tag.rt.core.ForTokensTag) _jspx_tagPool_c_forTokens_var_items_delims.get(org.apache.taglibs.standard.tag.rt.core.ForTokensTag.class);
    _jspx_th_c_forTokens_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forTokens_0.setParent(null);
    _jspx_th_c_forTokens_0.setVar("token");
    _jspx_th_c_forTokens_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.author}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forTokens_0.setDelims(",");
    int[] _jspx_push_body_count_c_forTokens_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forTokens_0 = _jspx_th_c_forTokens_0.doStartTag();
      if (_jspx_eval_c_forTokens_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                        <li>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forTokens_0, _jspx_page_context, _jspx_push_body_count_c_forTokens_0))
            return true;
          out.write("</li>\r\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forTokens_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forTokens_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forTokens_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forTokens_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forTokens_0.doFinally();
      _jspx_tagPool_c_forTokens_var_items_delims.reuse(_jspx_th_c_forTokens_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forTokens_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forTokens_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forTokens_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${token}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listRecentArrival}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("listAll");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-6 col-md-4 col-lg-4 col-xl-3\">\r\n");
          out.write("                                        <div class=\"product\">\r\n");
          out.write("                                            <figure class=\"product-media\">\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                <a href=\"cusdetail?pbookCode=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.bookCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&categoryBook=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                    <img style=\"width: \t277px; height: \t375px;\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Product image\" class=\"product-image\">\r\n");
          out.write("                                                </a>\r\n");
          out.write("                                                \r\n");
          out.write("                                                <div class=\"product-action\">\r\n");
          out.write("                                                    <a href=\"#\" class=\"btn-product btn-cart\"><span>Add to Cart</span></a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </figure><!-- End .product-media -->\r\n");
          out.write("\r\n");
          out.write("                                            <div class=\"product-body\">\r\n");
          out.write("                                                <div class=\"product-cat\">\r\n");
          out.write("                                                    <a href=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                                </div><!-- End .product-cat -->\r\n");
          out.write("                                                <h3 class=\"product-title\"><a href=\"cusdetail?pbookCode=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.bookCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&categoryBook=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3><!-- End .product-title -->\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                <div class=\"product-author\">\r\n");
          out.write("                                                    Author: \r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                </div><!-- End .rating-container -->\r\n");
          out.write("                                            </div><!-- End .product-body -->\r\n");
          out.write("                                        </div><!-- End .product -->\r\n");
          out.write("                                    </div><!-- End .col-sm-6 col-lg-4 col-xl-3 -->\r\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.discountPercent > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <span class=\"product-label label-new\">Discount</span>\r\n");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.discountPercent == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <div class=\"product-price\">\r\n");
        out.write("                                                        Price ");
        if (_jspx_meth_fmt_formatNumber_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("                                                        \r\n");
        out.write("                                                    </div><!-- End .product-price -->\r\n");
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

  private boolean _jspx_meth_fmt_formatNumber_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.buyPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_2.setPattern(" #,##0 VND");
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_2);
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.discountPercent > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <div class=\"product-price\" style=\"text-decoration: line-through\">\r\n");
        out.write("                                                        Old Price: ");
        if (_jspx_meth_fmt_formatNumber_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("                                                    </div><!-- End .product-price -->\r\n");
        out.write("                                                    <div class=\"product-price\">\r\n");
        out.write("                                                        Sale Price: ");
        if (_jspx_meth_fmt_formatNumber_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("                                                    </div><!-- End .product-price -->\r\n");
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

  private boolean _jspx_meth_fmt_formatNumber_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_fmt_formatNumber_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.buyPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_3.setPattern(" #,##0 VND");
    int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
    if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_fmt_formatNumber_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.buyPrice- (listAll.discountPercent *listAll.buyPrice/100)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_4.setPattern(" #,##0 VND");
    int _jspx_eval_fmt_formatNumber_4 = _jspx_th_fmt_formatNumber_4.doStartTag();
    if (_jspx_th_fmt_formatNumber_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_4);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_4);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.getAuthorNum()==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.getAuthorNum()!=1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                        <div class=\"product\">\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_forTokens_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                        </div><!-- End .ratings -->\r\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_forTokens_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forTokens
    org.apache.taglibs.standard.tag.rt.core.ForTokensTag _jspx_th_c_forTokens_1 = (org.apache.taglibs.standard.tag.rt.core.ForTokensTag) _jspx_tagPool_c_forTokens_var_items_delims.get(org.apache.taglibs.standard.tag.rt.core.ForTokensTag.class);
    _jspx_th_c_forTokens_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forTokens_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_c_forTokens_1.setVar("token");
    _jspx_th_c_forTokens_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.author}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forTokens_1.setDelims(",");
    int[] _jspx_push_body_count_c_forTokens_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forTokens_1 = _jspx_th_c_forTokens_1.doStartTag();
      if (_jspx_eval_c_forTokens_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                <li>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forTokens_1, _jspx_page_context, _jspx_push_body_count_c_forTokens_1))
            return true;
          out.write("</li>\r\n");
          out.write("                                                                ");
          int evalDoAfterBody = _jspx_th_c_forTokens_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forTokens_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forTokens_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forTokens_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forTokens_1.doFinally();
      _jspx_tagPool_c_forTokens_var_items_delims.reuse(_jspx_th_c_forTokens_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forTokens_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forTokens_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forTokens_1);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${token}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_5.setParent(null);
    _jspx_th_fmt_formatNumber_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailProduct.buyPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_5.setPattern(" #,##0 VND");
    int _jspx_eval_fmt_formatNumber_5 = _jspx_th_fmt_formatNumber_5.doStartTag();
    if (_jspx_th_fmt_formatNumber_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_5);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_5);
    return false;
  }
}

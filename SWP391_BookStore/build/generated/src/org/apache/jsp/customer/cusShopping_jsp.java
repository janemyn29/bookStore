package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bookstore.Book.BookShop;
import com.bookstore.Author.Author;
import java.util.List;
import com.bookstore.Format.MoneyFormat;

public final class cusShopping_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
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
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forTokens_var_items_delims = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- molla/category-boxed.html  22 Nov 2019 10:03:00 GMT -->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>THE5 Bookstore</title>\r\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/plugins/owl-carousel/owl.carousel.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/plugins/magnific-popup/magnific-popup.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/plugins/nouislider/nouislider.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .navigation-item.active {\r\n");
      out.write("            color:red\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"page-wrapper\">\r\n");
      out.write("            <header class=\"header\">\r\n");
      out.write("                <div class=\"header-top\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"header-left\">\r\n");
      out.write("\r\n");
      out.write("                        </div><!-- End .header-left -->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"header-right\">\r\n");
      out.write("                            <ul class=\"top-menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"/SWP391_BookStore/logout\">Logout</a></li>\r\n");
      out.write("                                        <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("                                        <li><a href=\"contact.html\">Contact Us</a></li>\r\n");
      out.write("\r\n");
      out.write("                                        <li><a href=\"editprofile\">Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul><!-- End .top-menu -->\r\n");
      out.write("                        </div><!-- End .header-right -->\r\n");
      out.write("                    </div><!-- End .container -->\r\n");
      out.write("                </div><!-- End .header-top -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"header-middle sticky-header\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"header-left\">\r\n");
      out.write("                            <button class=\"mobile-menu-toggler\">\r\n");
      out.write("                                <span class=\"sr-only\">Toggle mobile menu</span>\r\n");
      out.write("                                <i class=\"icon-bars\"></i>\r\n");
      out.write("                            </button>\r\n");
      out.write("\r\n");
      out.write("                            <a href=\"cushome\" class=\"logo\">\r\n");
      out.write("                                <img src=\"assets/images/logo.png\" alt=\"Molla Logo\" width=\"105\" height=\"25\">\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                            <nav class=\"main-nav\" >\r\n");
      out.write("                                <ul class=\"menu sf-arrows\" id=\"menu-active-Class\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"cushome\" class=\"navigation-item \">Home</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"cusshopping?index=1\" class=\"navigation-item\">Shopping</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"\" id=\"sf-with-ul\" class=\"navigation-item\">Category</a>\r\n");
      out.write("                                        <div class=\"megamenu megamenu-sm\">\r\n");
      out.write("                                            <div class=\"row no-gutters\">\r\n");
      out.write("                                                <div class=\"col-md-12\">\r\n");
      out.write("                                                    <div class=\"menu-col\">\r\n");
      out.write("                                                        <ul>\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </div><!-- End .menu-col -->\r\n");
      out.write("                                                </div><!-- End .col-md-6 -->\r\n");
      out.write("                                            </div><!-- End .row -->\r\n");
      out.write("                                        </div><!-- End .megamenu megamenu-sm -->\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <script>\r\n");
      out.write("                                        const navList = document.querySelectorAll('.navigation-item');\r\n");
      out.write("                                        const path = window.location.href.replace(\"http://localhost:8084/SWP391_BookStore/\", \"\");\r\n");
      out.write("                                        switch (path) {\r\n");
      out.write("                                            case \"cushome\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[0].classList.toggle(\"active\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"cusshopping\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[1].classList.toggle(\"active\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"cusdetail\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[2].classList.toggle(\"\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"cuscategory?categoryName=Art%20-%20Literary\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[3].classList.toggle(\"active\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"cuscategory?categoryName=Comics\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[4].classList.toggle(\"active\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"cuscategory?categoryName=Textbook%20-%20Syllabus\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[5].classList.toggle(\"active\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"cuscategory?categoryName=Novel\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[6].classList.toggle(\"active\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"cuscategory?categoryName=Foreign%20language\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[7].classList.toggle(\"active\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"cuscategory?categoryName=Science\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[8].classList.toggle(\"active\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"cuscategory?categoryName=Horror\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[9].classList.toggle(\"active\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            case \"\":\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[10].classList.toggle(\"\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                            default:\r\n");
      out.write("                                            {\r\n");
      out.write("                                                navList[11].classList.toggle(\"\")\r\n");
      out.write("                                                break;\r\n");
      out.write("                                            }\r\n");
      out.write("                                        }\r\n");
      out.write("\r\n");
      out.write("                                    </script>\r\n");
      out.write("                                    <!--                        <script>\r\n");
      out.write("                                                                // Add active class to the current button (highlight it)\r\n");
      out.write("                                                                var header = document.getElementById(\"menu-active-Class\");\r\n");
      out.write("                                                                var btns = header.getElementsByClassName(\"navigation-item\");\r\n");
      out.write("                                                                for (var i = 0; i < btns.length; i++) {\r\n");
      out.write("                                                                    btns[i].addEventListener(\"click\", function () {\r\n");
      out.write("                                                                        var current = document.getElementsByClassName(\"active\");\r\n");
      out.write("                                                                        current[0].className = current[0].className.replace(\" active\", \"\");\r\n");
      out.write("                                                                        this.className += \" active\";\r\n");
      out.write("                                                                    });\r\n");
      out.write("                                                                }\r\n");
      out.write("                                                            </script>-->\r\n");
      out.write("                                </ul><!-- End .menu -->\r\n");
      out.write("                            </nav><!-- End .main-nav -->\r\n");
      out.write("                        </div><!-- End .header-left -->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"header-right\">\r\n");
      out.write("                            <div class=\"header-search\">\r\n");
      out.write("                                <a href=\"#\" class=\"search-toggle\" role=\"button\" title=\"Search\"><i class=\"icon-search\"></i></a>\r\n");
      out.write("                                <form action=\"cusSearchController?index=1\" method=\"post\">\r\n");
      out.write("                                    <div class=\"header-search-wrapper\">\r\n");
      out.write("                                        <label for=\"q\" class=\"sr-only\">Search</label>\r\n");
      out.write("                                        <input type=\"search\" class=\"form-control\" name=\"searchKey\" \r\n");
      out.write("                                               placeholder=\"Search in...\" required>\r\n");
      out.write("                                        <input type=\"submit\" class=\"search-btn\" value=\"Search\" />\r\n");
      out.write("\r\n");
      out.write("                                    </div><!-- End .header-search-wrapper -->\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div><!-- End .header-search -->\r\n");
      out.write("\r\n");
      out.write("                            ");


                                if (session.getAttribute("cart") == null) {
                            
      out.write("\r\n");
      out.write("                            <div class=\"dropdown cart-dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" data-display=\"static\">\r\n");
      out.write("                                    <i class=\"icon-shopping-cart\"></i>\r\n");
      out.write("                                    <span class=\"cart-count\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                    <div class=\"dropdown-cart-products\">\r\n");
      out.write("                                        <label>\r\n");
      out.write("                                            <img style=\"width: 320px; height: 200px;\" src=\"assets/images/mini-cart-empty.png\" alt=\"Product image\">\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"dropdown-cart-action\">\r\n");
      out.write("                                        <a href=\"cusCart.jsp\" class=\"btn btn-outline-primary-2\"><span>View Cart</span><i class='fas'>&#xf07a;</i></a>\r\n");
      out.write("                                        <a href=\"cusCheckOut.jsp\" class=\"btn btn-outline-primary-2\"><span>Checkout</span><i class='fas'>&#xf53d;</i></a>\r\n");
      out.write("                                    </div><!-- End .dropdown-cart-total -->\r\n");
      out.write("                                </div><!-- End .dropdown-menu -->\r\n");
      out.write("                            </div><!-- End .cart-dropdown -->\r\n");
      out.write("                            ");
} else {
      out.write("\r\n");
      out.write("                            <div class=\"dropdown cart-dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" data-display=\"static\">\r\n");
      out.write("                                    <i class=\"icon-shopping-cart\"></i>\r\n");
      out.write("                                    <span class=\"cart-count\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"dropdown-cart-action\">\r\n");
      out.write("                                        <a href=\"cusCart.jsp\" class=\"btn btn-outline-primary-2\"><span>View Cart</span><i class='fas'>&#xf07a;</i></a>\r\n");
      out.write("                                        <a href=\"cusCheckOut.jsp\" class=\"btn btn-outline-primary-2\"><span>Checkout</span><i class='fas'>&#xf53d;</i></a>\r\n");
      out.write("                                    </div><!-- End .dropdown-cart-total -->\r\n");
      out.write("                                </div><!-- End .dropdown-menu -->\r\n");
      out.write("                            </div><!-- End .cart-dropdown -->\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </div><!-- End .header-right -->\r\n");
      out.write("                    </div><!-- End .container -->\r\n");
      out.write("                </div><!-- End .header-middle -->\r\n");
      out.write("            </header><!-- End .header -->\r\n");
      out.write("\r\n");
      out.write("            <main class=\"main\">\r\n");
      out.write("                <!--                    <div class=\"page-header text-center\" style=\"background-image: url('assets/images/page-header-bg.jpg')\">\r\n");
      out.write("                                        <div class=\"container\">\r\n");
      out.write("                                            <h1 class=\"page-title\">Boxed No Sidebar<span>Shop</span></h1>\r\n");
      out.write("                                        </div> End .container \r\n");
      out.write("                                    </div> End .page-header -->\r\n");
      out.write("                <nav aria-label=\"breadcrumb\" class=\"breadcrumb-nav mb-2\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"cushome\">Home</a></li>\r\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"cusshopping?index=1\">Shopping</a></li>\r\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">\r\n");
      out.write("                                    ");

                                        String categoryName = request.getParameter("categoryName");
                                        if (categoryName != null) {
                                    
      out.write("\r\n");
      out.write("                                    ");
 out.print(categoryName); 
      out.write("\r\n");
      out.write("                                    ");

                                    } else {
                                    
      out.write("\r\n");
      out.write("                                    ");
 out.print("All"); 
      out.write("\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div><!-- End .container -->\r\n");
      out.write("                </nav><!-- End .breadcrumb-nav -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"page-content\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"toolbox\">\r\n");
      out.write("                            <div class=\"toolbox-left\">\r\n");
      out.write("                                <a href=\"#\" class=\"sidebar-toggler\"><i class=\"icon-bars\"></i>Filters</a>\r\n");
      out.write("                            </div><!-- End .toolbox-left -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"toolbox-center\">\r\n");
      out.write("                            </div><!-- End .toolbox-center -->\r\n");
      out.write("\r\n");
      out.write("                        </div><!-- End .toolbox -->\r\n");
      out.write("                        <div class=\"products\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <style>\r\n");
      out.write("                                p {\r\n");
      out.write("                                    text-align: center;\r\n");
      out.write("                                }\r\n");
      out.write("                            </style>\r\n");
      out.write("                            <div class=\"row\" id=\"content\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"load-more-container text-center\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div><!-- End .load-more-container -->\r\n");
      out.write("                            </div><!-- End .products -->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"sidebar-filter-overlay\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!-- End .page-content -->\r\n");
      out.write("                    <div class=\"sidebar-filter-overlay\"></div><!-- End .sidebar-filter-overlay -->\r\n");
      out.write("                        <aside class=\"sidebar-shop sidebar-filter\">\r\n");
      out.write("                            <div class=\"sidebar-filter-wrapper\">\r\n");
      out.write("                                <div class=\"widget widget-clean\">\r\n");
      out.write("                                    <label><i class=\"icon-close\"></i>Filters</label>\r\n");
      out.write("                                    <a href=\"#\" class=\"sidebar-filter-clear\">Clean All</a>\r\n");
      out.write("                                </div><!-- End .widget -->\r\n");
      out.write("                                <div class=\"widget widget-collapsible\">\r\n");
      out.write("                                    <h3 class=\"widget-title\">\r\n");
      out.write("                                        <a data-toggle=\"collapse\" href=\"#widget-1\" role=\"button\" aria-expanded=\"true\" aria-controls=\"widget-1\">\r\n");
      out.write("                                            Category\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </h3><!-- End .widget-title -->\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"collapse show\" id=\"widget-1\">\r\n");
      out.write("                                        <div class=\"widget-body\">\r\n");
      out.write("                                            <div class=\"filter-items filter-items-count\">\r\n");
      out.write("                                                <div class=\"filter-item\">\r\n");
      out.write("                                                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"cat-1\">\r\n");
      out.write("                                                        <label class=\"custom-control-label\" for=\"cat-1\">Art - Literary </label>\r\n");
      out.write("                                                    </div><!-- End .custom-checkbox -->\r\n");
      out.write("                                                </div><!-- End .filter-item -->\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"filter-item\">\r\n");
      out.write("                                                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"cat-2\">\r\n");
      out.write("                                                        <label class=\"custom-control-label\" for=\"cat-2\">Comics</label>\r\n");
      out.write("                                                    </div><!-- End .custom-checkbox -->\r\n");
      out.write("                                                </div><!-- End .filter-item -->\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"filter-item\">\r\n");
      out.write("                                                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"cat-3\">\r\n");
      out.write("                                                        <label class=\"custom-control-label\" for=\"cat-3\">Textbook - Syllabus </label>\r\n");
      out.write("                                                    </div><!-- End .custom-checkbox -->\r\n");
      out.write("                                                </div><!-- End .filter-item -->\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"filter-item\">\r\n");
      out.write("                                                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"cat-4\">\r\n");
      out.write("                                                        <label class=\"custom-control-label\" for=\"cat-4\">Novel </label>\r\n");
      out.write("                                                    </div><!-- End .custom-checkbox -->\r\n");
      out.write("                                                </div><!-- End .filter-item -->\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"filter-item\">\r\n");
      out.write("                                                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"cat-5\">\r\n");
      out.write("                                                        <label class=\"custom-control-label\" for=\"cat-5\">Foreign language </label>\r\n");
      out.write("                                                    </div><!-- End .custom-checkbox -->\r\n");
      out.write("                                                </div><!-- End .filter-item -->\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"filter-item\">\r\n");
      out.write("                                                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"cat-6\">\r\n");
      out.write("                                                        <label class=\"custom-control-label\" for=\"cat-6\">Science </label>\r\n");
      out.write("                                                    </div><!-- End .custom-checkbox -->\r\n");
      out.write("                                                </div><!-- End .filter-item -->\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"filter-item\">\r\n");
      out.write("                                                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"cat-7\">\r\n");
      out.write("                                                        <label class=\"custom-control-label\" for=\"cat-7\">Horror </label>\r\n");
      out.write("                                                    </div><!-- End .custom-checkbox -->\r\n");
      out.write("                                                </div><!-- End .filter-item -->\r\n");
      out.write("\r\n");
      out.write("                                            </div><!-- End .filter-items -->\r\n");
      out.write("                                        </div><!-- End .widget-body -->\r\n");
      out.write("                                    </div><!-- End .collapse -->\r\n");
      out.write("                                </div><!-- End .widget -->\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"widget widget-collapsible\">\r\n");
      out.write("                                    <h3 class=\"widget-title\">\r\n");
      out.write("                                        <a data-toggle=\"collapse\" href=\"#widget-5\" role=\"button\" aria-expanded=\"true\" aria-controls=\"widget-5\">\r\n");
      out.write("                                            Price\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </h3><!-- End .widget-title -->\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"collapse show\" id=\"widget-5\">\r\n");
      out.write("                                        <div class=\"widget-body\">\r\n");
      out.write("                                            <div class=\"filter-price\">\r\n");
      out.write("                                                <div class=\"filter-price-text\">\r\n");
      out.write("                                                    Price Range:\r\n");
      out.write("                                                    <span id=\"filter-price-range\"></span>\r\n");
      out.write("                                                </div><!-- End .filter-price-text -->\r\n");
      out.write("\r\n");
      out.write("                                                <div id=\"price-slider\"></div><!-- End #price-slider -->\r\n");
      out.write("                                            </div><!-- End .filter-price -->\r\n");
      out.write("                                            <button onclick=\"handleClick()\" >Sort</button>\r\n");
      out.write("                                            <script>\r\n");
      out.write("                                                function handleClick() {\r\n");
      out.write("                                                const list = document.querySelectorAll(\".noUi-tooltip\");\r\n");
      out.write("                                                const test = document.querySelectorAll(\".custom-control-input\");\r\n");
      out.write("                                                let price;\r\n");
      out.write("                                                if (list.length > 1) {\r\n");
      out.write("                                                    \r\n");
      out.write("                                                        price = list[list.length - 1].innerText.replace(\"VND\", \"\");\r\n");
      out.write("                                                        }\r\n");
      out.write("                                                        const categoryLists = Array.from(test).map(v => v.checked);\r\n");
      out.write("                                                        $.ajax({url: \"cusshopping\",  data: {price: price, categories: categoryLists.join(\"-\")}, success: function (result) {\r\n");
      out.write("                                                                console.log({result})\r\n");
      out.write("                                                                \r\n");
      out.write("                                                    const htmlString = result.map((o) => `\r\n");
      out.write("                                                            <div class=\\\"col-6 col-md-4 col-lg-4 col-xl-3\\\">\r\n");
      out.write("                                                                <div class=\\\"product\\\">\r\n");
      out.write("                                                                    <figure class=\\\"product-media\\\">\r\n");
      out.write("                                                                        ${o.discountPercent > 1 ? \"<span class=\\\"product-label label-new\\\">Discount</span>\" : \"\"}\r\n");
      out.write("                                                                        <a href=\\\"detail?pbookCode=${o.bookCode}&categoryBook=${o.cateName}\\\">\r\n");
      out.write("                                                                            <img style=\"width:277px; height:375px;\" src=\"${o.image}\" alt=\"Product image\" class=\"product-image\">\r\n");
      out.write("                                                                        </a>\r\n");
      out.write("                                                                        <div class=\\\"product-action\\\">\r\n");
      out.write("                                                                            <a href=\\\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart?&action=addToCart&bookCode=${o.bookCode}\\\" class=\\\"btn-product btn-cart\\\"><span>Add to Cart</span></a>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </figure>\r\n");
      out.write("                                                                    <div class=\\\"product-body\\\">\r\n");
      out.write("                                                                        <div class=\\\"product-cat\\\">\r\n");
      out.write("                                                                            <a href=\"\">${o.cateName}</a>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                        <h3 class=\"product-title\">\r\n");
      out.write("                                                                            <a href=\"detail?pbookCode=${o.bookCode}&categoryBook=${o.cateName}\">${o.bookName}</a>\r\n");
      out.write("                                                                        </h3>\r\n");
      out.write("                                                                        ${o.discountPercent == 0 ? \"<div class=\\\"product-price\\\">Price: \" + o.buyPrice + \"</div>\" :\"<div class=\\\"product-price\\\">Sale Price: \" + (o.buyPrice-(o.discountPercent *o.buyPrice/100)) + \"</div>\"}\r\n");
      out.write("                                                                        <div class=\"product-author\">Author: ${o.authorNum == 1 ? o.author : \"\"+o.author+\"\"}</div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                                    `);\r\n");
      out.write("                                                            console.log({htmlString});\r\n");
      out.write("                                                            $(\"#content\").html(htmlString);\r\n");
      out.write("                                                                \r\n");
      out.write("                                                        }\r\n");
      out.write("                                                    });\r\n");
      out.write("                                                }\r\n");
      out.write("\r\n");
      out.write("                                            </script>\r\n");
      out.write("                                        </div><!-- End .widget-body -->\r\n");
      out.write("                                    </div><!-- End .collapse -->\r\n");
      out.write("                                </div><!-- End .widget -->\r\n");
      out.write("                            </div><!-- End .sidebar-filter-wrapper -->\r\n");
      out.write("                        </aside><!-- End .sidebar-filter -->\r\n");
      out.write("            </main><!-- End .main -->\r\n");
      out.write("             \r\n");
      out.write("                                    \r\n");
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cusFooter.jsp", out, false);
      out.write("\r\n");
      out.write("        </div><!-- End .page-wrapper -->\r\n");
      out.write("        <button id=\"scroll-top\" title=\"Back to Top\"><i class=\"icon-arrow-up\"></i></button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Plugins JS File -->\r\n");
      out.write("        ");

            String nullProduct = (String) request.getAttribute("nullProduct");
            if (nullProduct != null) {
        
      out.write("\r\n");
      out.write("        <h3 color=\"red\" >No Product was found</h3>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.hoverIntent.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/superfish.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/wNumb.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap-input-spinner.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/nouislider.min.js\"></script>\r\n");
      out.write("        <!-- Main JS File -->\r\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                                        // Get all elements with class=\"closebtn\"\r\n");
      out.write("                                        var close = document.getElementsByClassName(\"closebtn\");\r\n");
      out.write("                                        var i;\r\n");
      out.write("\r\n");
      out.write("                                        // Loop through all close buttons\r\n");
      out.write("                                        for (i = 0; i < close.length; i++) {\r\n");
      out.write("                                            // When someone clicks on a close button\r\n");
      out.write("                                            close[i].onclick = function () {\r\n");
      out.write("\r\n");
      out.write("                                                // Get the parent of <span class=\"closebtn\"> (<div class=\"alert\">)\r\n");
      out.write("                                                var div = this.parentElement;\r\n");
      out.write("\r\n");
      out.write("                                                // Set the opacity of div to 0 (transparent)\r\n");
      out.write("                                                div.style.opacity = \"0\";\r\n");
      out.write("\r\n");
      out.write("                                                // Hide the div after 600ms (the same amount of milliseconds it takes to fade out)\r\n");
      out.write("                                                setTimeout(function () {\r\n");
      out.write("                                                    div.style.display = \"none\";\r\n");
      out.write("                                                }, 600);\r\n");
      out.write("                                            }\r\n");
      out.write("                                        }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .alert2 {\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: #f44336; /* Red */\r\n");
      out.write("            color: white;\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* The close button */\r\n");
      out.write("        .closebtn {\r\n");
      out.write("            margin-left: 15px;\r\n");
      out.write("            color: white;\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- molla/category-boxed.html  22 Nov 2019 10:03:02 GMT -->\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                <li><a href=\"cuscategory?categoryName=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                                                                <!--href giúp truyền đường dẫn--> \r\n");
          out.write("                                                            ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("cart");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <div class=\"dropdown-cart-products\">\r\n");
          out.write("                                            <div class=\"product\">\r\n");
          out.write("                                                <div class=\"product-cart-details\">\r\n");
          out.write("                                                    <h4 class=\"product-title\">\r\n");
          out.write("                                                        <a href=\"product.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.book.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                                    </h4>\r\n");
          out.write("\r\n");
          out.write("                                                    <span class=\"cart-product-info\">\r\n");
          out.write("                                                        <span class=\"cart-product-qty\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" x\r\n");
          out.write("                                                            ");
          if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("   \r\n");
          out.write("                                                        </span>\r\n");
          out.write("                                                    </span>\r\n");
          out.write("                                                </div><!-- End .product-cart-details -->\r\n");
          out.write("\r\n");
          out.write("                                                <figure class=\"product-image-container\">\r\n");
          out.write("                                                    <a href=\"product.html\" class=\"product-image\">\r\n");
          out.write("                                                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.book.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"product\">\r\n");
          out.write("                                                    </a>\r\n");
          out.write("                                                </figure>\r\n");
          out.write("                                                <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/customer/cusshoppingpage?action=remove&bookCode=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.book.bookCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\"return confirm('Are you sure?')\" class=\"btn-remove\"><i class=\"icon-close\"></i></a>\r\n");
          out.write("                                            </div><!-- End .product -->\r\n");
          out.write("\r\n");
          out.write("                                        </div><!-- End .cart-product -->    \r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.book.buyPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_0.setPattern(" #,##0 VND");
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_0);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checkQuanityAddShop4 == \"Store has no more quantity of this book left. We apologize for the inconvenience.\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <div class=\"alert2\">\r\n");
        out.write("                                    <span class=\"closebtn\" onclick=\"this.parentElement.style.display = 'none';\">&times;</span>\r\n");
        out.write("                                    <p align=\"center\" style=\"color: white\"> Store has no more quantity of this book left. We apologize for the inconvenience. </p> \r\n");
        out.write("                                </div>\r\n");
        out.write("                            ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checkQuanityAddShop5 == \"Store has no more quantity of this book left. We apologize for the inconvenience.\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <div class=\"alert2\">\r\n");
        out.write("                                    <span class=\"closebtn\" onclick=\"this.parentElement.style.display = 'none';\">&times;</span>\r\n");
        out.write("                                    <p align=\"center\" style=\"color: white\"> Store has no more quantity of this book left. We apologize for the inconvenience. </p> \r\n");
        out.write("                                </div>\r\n");
        out.write("                            ");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checkQuanityAddShop6 == \"Store has no more quantity of this book left. We apologize for the inconvenience.\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <div class=\"alert2\">\r\n");
        out.write("                                    <span class=\"closebtn\" onclick=\"this.parentElement.style.display = 'none';\">&times;</span>\r\n");
        out.write("                                    <p align=\"center\" style=\"color: white\"> Store has no more quantity of this book left. We apologize for the inconvenience. </p> \r\n");
        out.write("                                </div>\r\n");
        out.write("                            ");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("listAll");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-6 col-md-4 col-lg-4 col-xl-3\">\r\n");
          out.write("                                        <div class=\"product\">\r\n");
          out.write("                                            <figure class=\"product-media\">\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
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
          out.write("                                                <div class=\"product-action action-icon-top\">\r\n");
          out.write("                                                    <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/customer/cusshoppingpage?&action=addToCart&bookCode=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.bookCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn-product btn-cart\"><span>add to cart</span></a>\r\n");
          out.write("                                                </div><!-- End .product-action -->\r\n");
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
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                <div class=\"product-author\">\r\n");
          out.write("                                                    Author: \r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                                </div><!-- End .rating-container -->\r\n");
          out.write("                                            </div><!-- End .product-body -->\r\n");
          out.write("                                        </div><!-- End .product -->\r\n");
          out.write("                                    </div><!-- End .col-sm-6 col-lg-4 col-xl-3 -->\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.discountPercent > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <span class=\"product-label label-new\">Discount</span>\r\n");
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

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.discountPercent == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <div class=\"product-price\">\r\n");
        out.write("                                                        Price ");
        if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                    </div><!-- End .product-price -->\r\n");
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

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.buyPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_1.setPattern(" #,##0 VND");
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.discountPercent > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <div class=\"product-price\" style=\"text-decoration: line-through\">\r\n");
        out.write("                                                        Old Price: ");
        if (_jspx_meth_fmt_formatNumber_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                                    </div><!-- End .product-price -->\r\n");
        out.write("                                                    <div class=\"product-price\">\r\n");
        out.write("                                                        Sale Price: ");
        if (_jspx_meth_fmt_formatNumber_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                                    </div><!-- End .product-price -->\r\n");
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

  private boolean _jspx_meth_fmt_formatNumber_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
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

  private boolean _jspx_meth_fmt_formatNumber_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_formatNumber_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.buyPrice- (listAll.discountPercent *listAll.buyPrice/100)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_3.setPattern(" #,##0 VND");
    int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
    if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_pattern_nobody.reuse(_jspx_th_fmt_formatNumber_3);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.getAuthorNum()==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.getAuthorNum()!=1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                        <div class=\"product\">\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_forTokens_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                                        </div><!-- End .ratings -->\r\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_forTokens_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forTokens
    org.apache.taglibs.standard.tag.rt.core.ForTokensTag _jspx_th_c_forTokens_0 = (org.apache.taglibs.standard.tag.rt.core.ForTokensTag) _jspx_tagPool_c_forTokens_var_items_delims.get(org.apache.taglibs.standard.tag.rt.core.ForTokensTag.class);
    _jspx_th_c_forTokens_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forTokens_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_forTokens_0.setVar("token");
    _jspx_th_c_forTokens_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll.author}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forTokens_0.setDelims(",");
    int[] _jspx_push_body_count_c_forTokens_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forTokens_0 = _jspx_th_c_forTokens_0.doStartTag();
      if (_jspx_eval_c_forTokens_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                                <li>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forTokens_0, _jspx_page_context, _jspx_push_body_count_c_forTokens_0))
            return true;
          out.write("</li>\r\n");
          out.write("                                                                ");
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

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setBegin(1);
    _jspx_th_c_forEach_3.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <a href=\"cusSearchController?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&searchKey=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${searchKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-darker btn-load-more\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <i class=\"icon-refresh\"></i></a>\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}

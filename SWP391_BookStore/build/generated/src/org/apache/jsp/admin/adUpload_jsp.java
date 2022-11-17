package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("        <title>THE5 BookStore</title>\r\n");
      out.write("        <!-- Favicon icon -->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\r\n");
      out.write("        <!-- Custom Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            #error{\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
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
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adHeader.jsp", out, false);
      out.write("\r\n");
      out.write("                <!--**********************************\r\n");
      out.write("                    Sidebar start\r\n");
      out.write("                ***********************************-->\r\n");
      out.write("                <div class=\"nk-sidebar\">           \r\n");
      out.write("                    <div class=\"nk-nav-scroll\">\r\n");
      out.write("                        <ul class=\"metismenu\" id=\"menu\">\r\n");
      out.write("                            <li class=\"nav-label\" style=\"background-color: #c96;\">Hello Admin ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"home\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-home\"></i><span class=\"nav-text\">Home</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"adbook\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-book-open\"></i><span class=\"nav-text\">Book Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"addiscount\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-percent\"></i><span class=\"nav-text\">Discount Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"mega-menu mega-menu-sm\">\r\n");
      out.write("                            <a href=\"adcustomer\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-user\"></i><span class=\"nav-text\">Customer Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a  href=\"adseller\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-cart-plus menu-icon\"></i> <span class=\"nav-text\">Seller Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"\" href=\"adimporter\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-arrow-circle-right menu-icon\"></i><span class=\"nav-text\">Importer Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"blacklist\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-close\"></i> <span class=\"nav-text\">Blacklist Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"feedback\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"icon-envelope menu-icon\"></i><span class=\"nav-text\">Feedback Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"adprofit\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fa fa-money menu-icon\"></i><span class=\"nav-text\">Profit Management</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--**********************************\r\n");
      out.write("                Sidebar end\r\n");
      out.write("            ***********************************-->\r\n");
      out.write("            <div class=\"content-body\">\r\n");
      out.write("                <div class=\"row page-titles mx-0\">\r\n");
      out.write("                    <div class=\"col p-md-0\">\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li class=\"breadcrumb-item\">Home</li>\r\n");
      out.write("                            <li class=\"breadcrumb-item \">Book Management</li>\r\n");
      out.write("                            <li class=\"breadcrumb-item active\">Upload Book</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-12\">\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h4 class=\"card-title\">Upload New Book</h4>\r\n");
      out.write("                                    <div id=\"error\" class=\"alert alert-danger\"></div>\r\n");
      out.write("                                    <div class=\"basic-form\">\r\n");
      out.write("                                        <form name='myform' action=\"adUpload\" method=\"Post\" enctype=\"multipart/form-data\" onsubmit=\"return validation()\">\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Bookcode :</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"email\" name=\"code\" class=\"form-control\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Bookname :</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  readonly>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Category :</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <div class=\"input-group mb-3\">\r\n");
      out.write("                                                        <select name='cate' class=\"custom-select\">\r\n");
      out.write("                                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                        </select>\r\n");
      out.write("\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Image Link:</label>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input id=\"fileUpload\" type=\"file\" name='image' class=\"form-control\" onchange=\"return fileValidation()\"  required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Quantity :</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"text\"  class=\"form-control\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Imported Price :</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"text\" name=\"import\" class=\"form-control\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.importPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Sell Price :</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"text\" name=\"sell\" class=\"form-control\" placeholder=\"Sell Price\"  required>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Publish Company :</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("                                                    <input type=\"text\" name=\"company\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.publish}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  readonly>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div id=\"wap\" class=\"basic-form\">\r\n");
      out.write("                                                <div class=\"form-group row\">\r\n");
      out.write("                                                    <label class=\"col-sm-2 col-form-label\">Author :</label>\r\n");
      out.write("                                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                                        <div class=\"input-group mb-3\">\r\n");
      out.write("                                                            <input name=\"author\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                                                            <div class=\"input-group-append\">\r\n");
      out.write("                                                                <button id=\"add\" class=\"btn btn-outline-dark\" type=\"button\"><i\r\n");
      out.write("                                                                        class=\"fa fa-plus\"></i></button>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <label class=\"col-sm-2 col-form-label\">Description :</label>\r\n");
      out.write("                                                <div class=\"col-sm-10\">\r\n");
      out.write("\r\n");
      out.write("                                                    <textarea name=\"des\" class=\"form-control h-150px\" rows=\"4\" id=\"comment\" required></textarea>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <center>\r\n");
      out.write("                                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                                        \r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn mb-1 btn-warning\" ><span >Upload</span></button>\r\n");
      out.write("                                                        <a href=\"adbook\"><button  style=\"margin-left: 70px;\"class=\"btn mb-1 btn-warning\" ><span >Cancel</span></button></a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </center>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"form-group row\">\r\n");
      out.write("                                                <table style=\"border: none\">\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button type=\"submit\" style=\"margin-left: 370px;\"class=\"btn mb-1 btn-warning\" ><span >Upload</span></button>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <a href=\"adbook\"><button  style=\"margin-left: 70px;\"class=\"btn mb-1 btn-warning\" ><span >Cancel</span></button></a>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- #/ container -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Content body end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--**********************************\r\n");
      out.write("        Main wrapper end\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("\r\n");
      out.write("    <!--**********************************\r\n");
      out.write("        Scripts\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("    <script src=\"plugins/common/common.min.js\"></script>\r\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\r\n");
      out.write("    <script src=\"js/settings.js\"></script>\r\n");
      out.write("    <script src=\"js/gleek.js\"></script>\r\n");
      out.write("    <script src=\"js/styleSwitcher.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("                                                        var numb = document.forms['myform']['sell'];\r\n");
      out.write("                                                        var err = document.getElementById('error');\r\n");
      out.write("                                                        function validation() {\r\n");
      out.write("\r\n");
      out.write("                                                            if (numb.value <= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.importPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(") {\r\n");
      out.write("                                                                err.innerHTML = \"Sell Price must be larger than imported Price. Please input again!\";\r\n");
      out.write("                                                                err.style.display = \"block\";\r\n");
      out.write("                                                                return false;\r\n");
      out.write("                                                            }\r\n");
      out.write("                                                            return true;\r\n");
      out.write("                                                        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("        function fileValidation() {\r\n");
      out.write("            var fileInput = document.getElementById('fileUpload');\r\n");
      out.write("            var filePath = fileInput.value;\r\n");
      out.write("            var allowedExtensions = /(\\.jpg|\\.jpeg|\\.png|\\.gif)$/i;\r\n");
      out.write("            if (!allowedExtensions.exec(filePath)) {\r\n");
      out.write("                alert('Please upload file having extensions .jpeg/.jpg/.png/.gif only.');\r\n");
      out.write("                fileInput.value = '';\r\n");
      out.write("                return false;\r\n");
      out.write("            } else {\r\n");
      out.write("                //Image preview\r\n");
      out.write("                if (fileInput.files && fileInput.files[0]) {\r\n");
      out.write("                    var reader = new FileReader();\r\n");
      out.write("                    reader.onload = function (e) {\r\n");
      out.write("                        document.getElementById('imagePreview').innerHTML = '<img src=\"' + e.target.result + '\"/>';\r\n");
      out.write("                    };\r\n");
      out.write("                    reader.readAsDataURL(fileInput.files[0]);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("        var max_fields = 10;\r\n");
      out.write("                var wrapper = $(\"#wap\");\r\n");
      out.write("                var add_button = $(\"#add\");\r\n");
      out.write("                var x = 1;\r\n");
      out.write("                $(add_button).click(function (e) {\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("                if (x < max_fields) {\r\n");
      out.write("        x++;\r\n");
      out.write("                $(wrapper).append('<div class=\"form-group row\" ><label  class=\"col-sm-2 col-form-label\">Author ' + x + ' :</label><div class=\"col-sm-10\"><div class=\"input-group mb-3\"><input name=\"author\" type=\"text\" class=\"form-control\" required><div class=\"input-group-append\"> <button class=\"btn btn-outline-dark\" type=\"button\"><a href=\"#\" class=\"remove_field\"><i class=\"icon-close\"></i></a></button></div></div></div></div>');\r\n");
      out.write("        }\r\n");
      out.write("        });\r\n");
      out.write("                $(wrapper).on(\"click\", \".remove_field\", function (e) { //user click on remove text\r\n");
      out.write("\r\n");
      out.write("        e.preventDefault();\r\n");
      out.write("                $(this).parent().parent().parent().parent().parent().remove();\r\n");
      out.write("                x--;\r\n");
      out.write("        });\r\n");
      out.write("                maxFileSize = 10 * 1024 * 1024;\r\n");
      out.write("                $(\"#fileUpload\").change(function(){\r\n");
      out.write("        fileSize = this.files[0].size;\r\n");
      out.write("                if (fileSize > maxFileSize){\r\n");
      out.write("        this.setCustomValidity(\"You can upload only files under 10MB\");\r\n");
      out.write("                this.reportValidity();\r\n");
      out.write("        } else{\r\n");
      out.write("        his.setCustomValidity(\"\");\r\n");
      out.write("        }\r\n");
      out.write("        });\r\n");
      out.write("        });\r\n");
      out.write("                                </script >\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                            </body>\r\n");
      out.write("                        \r\n");
      out.write("                        </html>\r\n");
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
          out.write("                                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
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
}

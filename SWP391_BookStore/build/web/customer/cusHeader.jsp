<%-- 
    Document   : header
    Created on : Sep 19, 2022, 6:12:02 PM
    Author     : tramy
--%>

<%@page import="com.bookstore.Account.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<header class="header">
    <div class="header-top">
        <div class="container">
            <div class="header-left">

            </div><!-- End .header-left -->

            <div class="header-right">
                <ul class="top-menu">
                    <li>
                        <ul>
                            <li><a href="/SWP391_BookStore/logout">Logout</a></li>
                            <li><a href="about.html">About Us</a></li>
                            <li><a href="contact.html">Contact Us</a></li>
                                <%
                                    Account acc = (Account) request.getSession().getAttribute("acc");
                                    if (acc == null) {
                                %>
                            <li><a href="login.jsp">Login</li>
                                <%
                                } else {%>
                            <li><a href="editprofile">Hello ${acc.getUsername()}</a></li>
                                <%}%>
                        </ul>
                    </li>
                </ul><!-- End .top-menu -->
            </div><!-- End .header-right -->
        </div><!-- End .container -->
    </div><!-- End .header-top -->

    <div class="header-middle sticky-header">
        <div class="container">
            <div class="header-left">
                <button class="mobile-menu-toggler">
                    <span class="sr-only">Toggle mobile menu</span>
                    <i class="icon-bars"></i>
                </button>

                <a href="cusHome.jsp" class="logo">
                    <img src="assets/images/logo.png" alt="Molla Logo" width="105" height="25">
                </a>

                <nav class="main-nav">
                    <ul class="menu sf-arrows">
                        <li class="megamenu-container active">
                            <a href="home" class="sf-with-ul">Home</a>
                        </li>
                        <li>
                            <a href="shopping" class="sf-with-ul">Shopping</a>

                        </li>
                        <li>
                            <a href="" id="sf-with-ul">Category</a>

                            <div class="megamenu megamenu-sm">
                                <div class="row no-gutters">
                                    <div class="col-md-12">
                                        <div class="menu-col">
                                            <ul>
                                                <c:forEach items="${listC}" var="o">
                                                    <li><a href="category?categoryIDBook=${o.id}">${o.name}</a></li>
                                                    <!--href giúp truyền đường dẫn--> 
                                                </c:forEach>
                                            </ul>
                                        </div><!-- End .menu-col -->
                                    </div><!-- End .col-md-6 -->
                                </div><!-- End .row -->
                            </div><!-- End .megamenu megamenu-sm -->
                        </li>
                    </ul><!-- End .menu -->
                </nav><!-- End .main-nav -->
            </div><!-- End .header-left -->

            <div class="header-right">
                <div class="header-search">
                    <a href="#" class="search-toggle" role="button" title="Search"><i class="icon-search"></i></a>
                    <form action="#" method="get">
                        <div class="header-search-wrapper">
                            <label for="q" class="sr-only">Search</label>
                            <input type="search" class="form-control" name="q" id="q" placeholder="Search in..." required>
                        </div><!-- End .header-search-wrapper -->
                    </form>
                </div><!-- End .header-search -->

                <div class="dropdown cart-dropdown">
                    <a href="#" class="dropdown-toggle" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" data-display="static">
                        <i class="icon-shopping-cart"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <div class="dropdown-cart-action">
                            <a href="cart.html" class="btn btn-primary">View Cart</a>
                            <a href="checkout.html" class="btn btn-outline-primary-2"><span>Checkout</span><i class="icon-long-arrow-right"></i></a>
                        </div><!-- End .dropdown-cart-total -->
                    </div><!-- End .dropdown-menu -->
                </div><!-- End .cart-dropdown -->
            </div><!-- End .header-right -->
        </div><!-- End .container -->
    </div><!-- End .header-middle -->
</header><!-- End .header -->
<%-- 
    Document   : home.jsp
    Created on : Sep 19, 2022, 6:09:05 PM
    Author     : tramy
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">


    <!-- molla/index-2.html  22 Nov 2019 09:55:32 GMT -->
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>THE5 BookStore</title>
        <meta name="keywords" content="HTML5 Template">
        <meta name="description" content="Molla - Bootstrap eCommerce Template">
        <meta name="author" content="p-themes">
        <!-- Favicon -->
        <link rel="apple-touch-icon" sizes="180x180" href="assets/images/icons/apple-touch-icon.png">
        <link rel="icon" type="image/png" sizes="32x32" href="assets/images/icons/favicon-32x32.png">
        <link rel="icon" type="image/png" sizes="16x16" href="assets/images/icons/favicon-16x16.png">
        <link rel="manifest" href="assets/images/icons/site.html">
        <link rel="mask-icon" href="assets/images/icons/safari-pinned-tab.svg" color="#666666">
        <link rel="shortcut icon" href="assets/images/icons/favicon.ico">
        <meta name="apple-mobile-web-app-title" content="Molla">
        <meta name="application-name" content="Molla">
        <meta name="msapplication-TileColor" content="#cc9966">
        <meta name="msapplication-config" content="assets/images/icons/browserconfig.xml">
        <meta name="theme-color" content="#ffffff">
        <!-- Plugins CSS File -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/plugins/owl-carousel/owl.carousel.css">
        <link rel="stylesheet" href="assets/css/plugins/magnific-popup/magnific-popup.css">
        <!-- Main CSS File -->
        <link rel="stylesheet" href="assets/css/style.css">
    </head>

    <body>
        <div class="page-wrapper">
            <jsp:include page="cusHeader.jsp"></jsp:include>


                <main class="main">
                    <div class="intro-section bg-lighter pt-5 pb-6">


                        <div class="container">
                            <div class="heading heading-center mb-3">
                            <c:if test='${checkQuanityAddHome4 == "Store has no more quantity of this book left. We apologize for the inconvenience."}'>
                                <div class="alert2">
                                    <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span>
                                    ${checkQuanityAddHome4}
                                </div>
                            </c:if>
                            <c:if test='${checkQuanityAddHome5 == "Store has no more quantity of this book left. We apologize for the inconvenience."}'>
                                <div class="alert2">
                                    <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span>
                                    ${checkQuanityAddHome5}
                                </div>
                            </c:if>

                            <c:if test='${checkQuanityAddHome6 == "Store has no more quantity of this book left. We apologize for the inconvenience."}'>
                                <div class="alert2">
                                    <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span>
                                    ${checkQuanityAddHome6}
                                </div>
                            </c:if>
                            <h2 class="title-lg">Discount Books</h2><!-- End .title -->
                            <ul class="nav nav-pills justify-content-center" role="tablist">
                            </ul>
                        </div><!-- End .heading -->

                        <div class="tab-content tab-content-carousel">
                            <div class="tab-pane p-0 fade show active" id="trendy-all-tab" role="tabpanel" aria-labelledby="trendy-all-link">
                                <div class="owl-carousel owl-simple carousel-equal-height carousel-with-shadow" data-toggle="owl" 
                                     data-owl-options='{
                                     "nav": false, 
                                     "dots": true,
                                     "margin": 20,
                                     "loop": false,
                                     "responsive": {
                                     "0": {
                                     "items":2
                                     },
                                     "480": {
                                     "items":2
                                     },
                                     "768": {
                                     "items":3
                                     },
                                     "992": {
                                     "items":4
                                     },
                                     "1200": {
                                     "items":4,
                                     "nav": true,
                                     "dots": false
                                     }
                                     }
                                     }'>
                                    <c:forEach items="${listDiscountBook}" var="discount">
                                        <div class="product product-11 text-center">
                                            <figure class="product-media">
                                                <c:if test="${discount.discountPercent > 0}">
                                                    <span class="product-label label-new">Discount ${discount.discountPercent}%</span>
                                                </c:if>
                                                <a href="cusdetail?pbookCode=${discount.bookCode}&categoryBook=${discount.cateName}">
                                                    <img style="width: 	277px; height: 	375px;" src="${discount.image}" alt="Product image" class="product-image">
                                                    <!--<img src="assets/images/demos/demo-2/products/product-1-2.jpg" alt="Product image" class="product-image-hover">-->
                                                </a>

                                            </figure><!-- End .product-media -->

                                            <div class="product-body">
                                                <h3 class="product-title"><a href="cusdetail?pbookCode=${discount.bookCode}
                                                                             &categoryBook=${discount.cateName}">${discount.bookName}</a></h3><!-- End .product-title -->
                                                <div class="product-price"  style="text-decoration: line-through"  >
                                                    Old Price: <fmt:formatNumber value="${discount.buyPrice}" pattern=" #,##0 VND" />
                                                </div><!-- End .product-price -->
                                                <div class="product-price">
                                                    Sale Price: <fmt:formatNumber value="${discount.buyPrice-((discount.discountPercent*discount.buyPrice)/100)}" pattern=" #,##0 VND" />
                                                </div>

                                            </div><!-- End .product-body -->
                                            <div class="product-action action-icon-top">
                                                <a href="${pageContext.request.contextPath }/customer/cuscart?&action=addToCart&bookCode=${discount.bookCode}" class="btn-product btn-cart"><span>add to cart</span></a>
                                            </div><!-- End .product-action -->
                                        </div><!-- End .product -->
                                    </c:forEach>

                                </div><!-- End .owl-carousel -->
                            </div><!-- .End .tab-pane -->
                            <div class="tab-pane p-0 fade" id="trendy-fur-tab" role="tabpanel" aria-labelledby="trendy-fur-link">
                                <div class="owl-carousel owl-simple carousel-equal-height carousel-with-shadow" data-toggle="owl" 
                                     data-owl-options='{
                                     "nav": false, 
                                     "dots": true,
                                     "margin": 20,
                                     "loop": false,
                                     "responsive": {
                                     "0": {
                                     "items":2
                                     },
                                     "480": {
                                     "items":2
                                     },
                                     "768": {
                                     "items":3
                                     },
                                     "992": {
                                     "items":4
                                     },
                                     "1200": {
                                     "items":4,
                                     "nav": true,
                                     "dots": false
                                     }
                                     }
                                     }'>





                                </div><!-- End .owl-carousel -->
                            </div><!-- .End .tab-pane -->
                            <div class="tab-pane p-0 fade" id="trendy-decor-tab" role="tabpanel" aria-labelledby="trendy-decor-link">
                                <div class="owl-carousel owl-simple carousel-equal-height carousel-with-shadow" data-toggle="owl" 
                                     data-owl-options='{
                                     "nav": false, 
                                     "dots": true,
                                     "margin": 20,
                                     "loop": false,
                                     "responsive": {
                                     "0": {
                                     "items":2
                                     },
                                     "480": {
                                     "items":2
                                     },
                                     "768": {
                                     "items":3
                                     },
                                     "992": {
                                     "items":4
                                     },
                                     "1200": {
                                     "items":4,
                                     "nav": true,
                                     "dots": false
                                     }
                                     }
                                     }'>


                                </div><!-- End .owl-carousel -->
                            </div><!-- .End .tab-pane -->
                            <div class="tab-pane p-0 fade" id="trendy-light-tab" role="tabpanel" aria-labelledby="trendy-light-link">
                                <div class="owl-carousel owl-simple carousel-equal-height carousel-with-shadow" data-toggle="owl" 
                                     data-owl-options='{
                                     "nav": false, 
                                     "dots": true,
                                     "margin": 20,
                                     "loop": false,
                                     "responsive": {
                                     "0": {
                                     "items":2
                                     },
                                     "480": {
                                     "items":2
                                     },
                                     "768": {
                                     "items":3
                                     },
                                     "992": {
                                     "items":4
                                     },
                                     "1200": {
                                     "items":4,
                                     "nav": true,
                                     "dots": false
                                     }
                                     }
                                     }'>


                                </div><!-- End .owl-carousel -->
                            </div><!-- .End .tab-pane -->
                        </div><!-- End .tab-content -->
                    </div><!-- End .container -->



                    <div class="mb-5"></div><!-- End .mb-6 -->


                    <div class="container">
                        <div class="heading heading-center mb-6">
                            <h2 class="title">Recent Arrivals</h2><!-- End .title -->
                        </div><!-- End .heading -->

                        <div class="tab-content">
                            <div class="tab-pane p-0 fade show active" id="top-all-tab" role="tabpanel" aria-labelledby="top-all-link">
                                <div class="products">
                                    <div class="row justify-content-center">
                                        <c:forEach items="${listRecentArrival}" var="o">
                                            <div class="col-6 col-md-4 col-lg-3">
                                                <div class="product product-11 mt-v3 text-center">
                                                    <figure class="product-media">
                                                        <c:if test="${o.discountPercent > 0}">
                                                            <span class="product-label label-new">Discount ${o.discountPercent}%</span>
                                                        </c:if>
                                                        <a href="cusdetail?pbookCode=${o.bookCode}&categoryBook=${o.cateName}">
                                                            <img style="width: 	277px; height: 	375px;" src="${o.image}" alt="Product image" class="product-image">
                                                        </a>
                                                        <!--
                                                                                                    <div class="product-action-vertical">
                                                                                                        <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                                                                                    </div> End .product-action-vertical -->
                                                    </figure><!-- End .product-media -->

                                                    <div class="product-body">
                                                        <h3 class="product-title">${o.bookName}<a href="cusdetail?pbookCode=${o.bookCode}&categoryBook=${o.cateName}"</a></h3><!-- End .product-title -->
                                                        <c:if test="${o.discountPercent == 0}">
                                                            <div class="product-price">
                                                                Price <fmt:formatNumber value="${o.buyPrice}" pattern=" #,##0 VND" />

                                                            </div><!-- End .product-price -->
                                                        </c:if>
                                                        <c:if test="${o.discountPercent > 0}">
                                                            <div class="product-price" style="text-decoration: line-through">
                                                                Old Price: <fmt:formatNumber value="${o.buyPrice}" pattern=" #,##0 VND" />
                                                            </div><!-- End .product-price -->
                                                            <div class="product-price">
                                                                Sale Price: <fmt:formatNumber value="${o.buyPrice- (o.discountPercent *o.buyPrice/100)}" pattern=" #,##0 VND" />
                                                            </div><!-- End .product-price -->
                                                        </c:if>


                                                        <!--                                            <div class="product-nav product-nav-dots">
                                                                                                        <a href="#" class="active" style="background: #333333;"><span class="sr-only">Color name</span></a>
                                                                                                        <a href="#" style="background: #e8e8e8;"><span class="sr-only">Color name</span></a>
                                                                                                    </div> End .product-nav -->
                                                    </div><!-- End .product-body -->
                                                    <div class="product-action action-icon-top">
                                                        <a href="${pageContext.request.contextPath }/customer/cuscart?&action=addToCart&bookCode=${o.bookCode}" class="btn-product btn-cart"><span>add to cart</span></a>
                                                    </div><!-- End .product-action -->
                                                </div><!-- End .product -->
                                            </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->
                                        </c:forEach>

                                    </div><!-- End .row -->
                                </div><!-- End .products -->
                            </div><!-- .End .tab-pane -->
                        </div><!-- End .row -->
                    </div><!-- End .products -->
                </div><!-- .End .tab-pane -->
                <div class="tab-pane p-0 fade" id="top-decor-tab" role="tabpanel" aria-labelledby="top-decor-link">
                    <div class="products">
                        <div class="row justify-content-center">


                        </div><!-- End .row -->
                    </div><!-- End .products -->
                </div><!-- .End .tab-pane -->
                <div class="tab-pane p-0 fade" id="top-light-tab" role="tabpanel" aria-labelledby="top-light-link">
                    <div class="products">
                        <div class="row justify-content-center">
                        </div><!-- End .row -->
                    </div><!-- End .products -->
                </div><!-- .End .tab-pane -->
        </div><!-- End .tab-content -->
    </div><!-- End .container -->

</main><!-- End .main -->

<jsp:include page="cusFooter.jsp"></jsp:include>

</div><!-- End .page-wrapper -->
<button id="scroll-top" title="Back to Top"><i class="icon-arrow-up"></i></button>



<!-- Sign in / Register Modal -->
<div class="modal fade" id="signin-modal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true"><i class="icon-close"></i></span>
                </button>

                <div class="form-box">
                    <div class="form-tab">
                        <ul class="nav nav-pills nav-fill" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="signin-tab" data-toggle="tab" href="#signin" role="tab" aria-controls="signin" aria-selected="true">Sign In</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="register-tab" data-toggle="tab" href="#register" role="tab" aria-controls="register" aria-selected="false">Register</a>
                            </li>
                        </ul>
                        <div class="tab-content" id="tab-content-5">
                            <div class="tab-pane fade show active" id="signin" role="tabpanel" aria-labelledby="signin-tab">
                                <form action="#">
                                    <div class="form-group">
                                        <label for="singin-email">Username or email address *</label>
                                        <input type="text" class="form-control" id="singin-email" name="singin-email" required>
                                    </div><!-- End .form-group -->

                                    <div class="form-group">
                                        <label for="singin-password">Password *</label>
                                        <input type="password" class="form-control" id="singin-password" name="singin-password" required>
                                    </div><!-- End .form-group -->

                                    <div class="form-footer">
                                        <button type="submit" class="btn btn-outline-primary-2">
                                            <span>LOG IN</span>
                                            <i class="icon-long-arrow-right"></i>
                                        </button>

                                        <div class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input" id="signin-remember">
                                            <label class="custom-control-label" for="signin-remember">Remember Me</label>
                                        </div><!-- End .custom-checkbox -->

                                        <a href="#" class="forgot-link">Forgot Your Password?</a>
                                    </div><!-- End .form-footer -->
                                </form>
                                <div class="form-choice">
                                    <p class="text-center">or sign in with</p>
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <a href="#" class="btn btn-login btn-g">
                                                <i class="icon-google"></i>
                                                Login With Google
                                            </a>
                                        </div><!-- End .col-6 -->
                                        <div class="col-sm-6">
                                            <a href="#" class="btn btn-login btn-f">
                                                <i class="icon-facebook-f"></i>
                                                Login With Facebook
                                            </a>
                                        </div><!-- End .col-6 -->
                                    </div><!-- End .row -->
                                </div><!-- End .form-choice -->
                            </div><!-- .End .tab-pane -->
                            <div class="tab-pane fade" id="register" role="tabpanel" aria-labelledby="register-tab">
                                <form action="#">
                                    <div class="form-group">
                                        <label for="register-email">Your email address *</label>
                                        <input type="email" class="form-control" id="register-email" name="register-email" required>
                                    </div><!-- End .form-group -->

                                    <div class="form-group">
                                        <label for="register-password">Password *</label>
                                        <input type="password" class="form-control" id="register-password" name="register-password" required>
                                    </div><!-- End .form-group -->

                                    <div class="form-footer">
                                        <button type="submit" class="btn btn-outline-primary-2">
                                            <span>SIGN UP</span>
                                            <i class="icon-long-arrow-right"></i>
                                        </button>

                                        <div class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input" id="register-policy" required>
                                            <label class="custom-control-label" for="register-policy">I agree to the <a href="#">privacy policy</a> *</label>
                                        </div><!-- End .custom-checkbox -->
                                    </div><!-- End .form-footer -->
                                </form>
                                <div class="form-choice">
                                    <p class="text-center">or sign in with</p>
                                    <div class="row">
                                        <div class="col-sm-6">
                                            <a href="#" class="btn btn-login btn-g">
                                                <i class="icon-google"></i>
                                                Login With Google
                                            </a>
                                        </div><!-- End .col-6 -->
                                        <div class="col-sm-6">
                                            <a href="#" class="btn btn-login  btn-f">
                                                <i class="icon-facebook-f"></i>
                                                Login With Facebook
                                            </a>
                                        </div><!-- End .col-6 -->
                                    </div><!-- End .row -->
                                </div><!-- End .form-choice -->
                            </div><!-- .End .tab-pane -->
                        </div><!-- End .tab-content -->
                    </div><!-- End .form-tab -->
                </div><!-- End .form-box -->
            </div><!-- End .modal-body -->
        </div><!-- End .modal-content -->
    </div><!-- End .modal-dialog -->
</div><!-- End .modal -->


<!-- Plugins JS File -->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap.bundle.min.js"></script>
<script src="assets/js/jquery.hoverIntent.min.js"></script>
<script src="assets/js/jquery.waypoints.min.js"></script>
<script src="assets/js/superfish.min.js"></script>
<script src="assets/js/owl.carousel.min.js"></script>
<script src="assets/js/jquery.magnific-popup.min.js"></script>
<!-- Main JS File -->
<script src="assets/js/main.js"></script>
<script>
                                        // Get all elements with class="closebtn"
                                        var close = document.getElementsByClassName("closebtn");
                                        var i;

                                        // Loop through all close buttons
                                        for (i = 0; i < close.length; i++) {
                                            // When someone clicks on a close button
                                            close[i].onclick = function () {

                                                // Get the parent of <span class="closebtn"> (<div class="alert">)
                                                var div = this.parentElement;

                                                // Set the opacity of div to 0 (transparent)
                                                div.style.opacity = "0";

                                                // Hide the div after 600ms (the same amount of milliseconds it takes to fade out)
                                                setTimeout(function () {
                                                    div.style.display = "none";
                                                }, 600);
                                            }
                                        }
</script>
</body>

<style>
    .alert2 {
        padding: 20px;
        background-color: #f44336; /* Red */
        color: white;
        margin-bottom: 15px;
    }

    /* The close button */
    .closebtn {
        margin-left: 15px;
        color: white;
        font-weight: bold;
        float: right;
        font-size: 22px;
        line-height: 20px;
        cursor: pointer;
        transition: 0.3s;
    }

    /* When moving the mouse over the close button */
    .closebtn:hover {
        color: black;
    }

</style>

<style>
    .alert {
        opacity: 1;
        transition: opacity 0.6s; /* 600ms to fade out */
    }
</style>


<!-- molla/index-2.html  22 Nov 2019 09:55:42 GMT -->
</html>

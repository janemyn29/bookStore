<%-- 
    Document   : home.jsp
    Created on : Sep 19, 2022, 6:09:05 PM
    Author     : tramy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


<!-- molla/index-2.html  22 Nov 2019 09:55:32 GMT -->
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Molla - Bootstrap eCommerce Template</title>
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
                    <h2 class="title-lg">Discount Books</h2><!-- End .title -->
                    <ul class="nav nav-pills justify-content-center" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" id="trendy-all-link" data-toggle="tab" href="#trendy-all-tab" role="tab" aria-controls="trendy-all-tab" aria-selected="true">All</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="trendy-fur-link" data-toggle="tab" href="#trendy-fur-tab" role="tab" aria-controls="trendy-fur-tab" aria-selected="false">Furniture</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="trendy-decor-link" data-toggle="tab" href="#trendy-decor-tab" role="tab" aria-controls="trendy-decor-tab" aria-selected="false">Decor</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="trendy-light-link" data-toggle="tab" href="#trendy-light-tab" role="tab" aria-controls="trendy-light-tab" aria-selected="false">Lighting</a>
                        </li>
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
                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-1-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-1-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->
                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Butler Stool Ladder</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $251,00
                                    </div><!-- End .product-price -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->

                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-2-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-2-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->
                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Octo 4240</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $746,00
                                    </div><!-- End .product-price -->

                                    <div class="product-nav product-nav-dots">
                                        <a href="#" class="active" style="background: #1f1e18;"><span class="sr-only">Color name</span></a>
                                        <a href="#" style="background: #e8e8e8;"><span class="sr-only">Color name</span></a>
                                    </div><!-- End .product-nav -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->

                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <span class="product-label label-new">NEW</span>
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-3-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-3-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->

                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Flow Slim Armchair</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $970,00
                                    </div><!-- End .product-price -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->

                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <span class="product-label label-sale">30% OFF</span>
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-4-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-4-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->

                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Roots Sofa Bed</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        <span class="new-price">$337,00</span>
                                        <span class="old-price">Was $449,00</span>
                                    </div><!-- End .product-price -->

                                    <div class="product-nav product-nav-dots">
                                        <a href="#" class="active" style="background: #878883;"><span class="sr-only">Color name</span></a>
                                        <a href="#" style="background: #dfd5c2;"><span class="sr-only">Color name</span></a>
                                    </div><!-- End .product-nav -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->

                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-5-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-5-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->

                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Petite Table Lamp</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $675,00
                                    </div><!-- End .product-price -->

                                    <div class="product-nav product-nav-dots">
                                        <a href="#" class="active" style="background: #74543e;"><span class="sr-only">Color name</span></a>
                                        <a href="#" style="background: #e8e8e8;"><span class="sr-only">Color name</span></a>
                                    </div><!-- End .product-nav -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->

                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-6-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-6-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->

                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Elephant Armchair</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $457,00
                                    </div><!-- End .product-price -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->

                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-1-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-1-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->

                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Butler Stool Ladder</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $251,00
                                    </div><!-- End .product-price -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->
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
                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <span class="product-label label-new">NEW</span>
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-3-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-3-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->

                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Flow Slim Armchair</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $970,00
                                    </div><!-- End .product-price -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->

                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <span class="product-label label-sale">30% OFF</span>
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-4-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-4-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->

                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Roots Sofa Bed</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        <span class="new-price">$337,00</span>
                                        <span class="old-price">Was $449,00</span>
                                    </div><!-- End .product-price -->

                                    <div class="product-nav product-nav-dots">
                                        <a href="#" class="active" style="background: #878883;"><span class="sr-only">Color name</span></a>
                                        <a href="#" style="background: #dfd5c2;"><span class="sr-only">Color name</span></a>
                                    </div><!-- End .product-nav -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->
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
                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-1-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-1-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->
                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Butler Stool Ladder</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $251,00
                                    </div><!-- End .product-price -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->
                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-6-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-6-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->

                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Elephant Armchair</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $457,00
                                    </div><!-- End .product-price -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->
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
                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-2-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-2-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->
                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Octo 4240</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $746,00
                                    </div><!-- End .product-price -->

                                    <div class="product-nav product-nav-dots">
                                        <a href="#" class="active" style="background: #1f1e18;"><span class="sr-only">Color name</span></a>
                                        <a href="#" style="background: #e8e8e8;"><span class="sr-only">Color name</span></a>
                                    </div><!-- End .product-nav -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->
                            <div class="product product-11 text-center">
                                <figure class="product-media">
                                    <a href="product.html">
                                        <img src="assets/images/demos/demo-2/products/product-5-1.jpg" alt="Product image" class="product-image">
                                        <img src="assets/images/demos/demo-2/products/product-5-2.jpg" alt="Product image" class="product-image-hover">
                                    </a>

                                    <div class="product-action-vertical">
                                        <a href="#" class="btn-product-icon btn-wishlist"><span>add to wishlist</span></a>
                                    </div><!-- End .product-action-vertical -->

                                </figure><!-- End .product-media -->

                                <div class="product-body">
                                    <h3 class="product-title"><a href="product.html">Petite Table Lamp</a></h3><!-- End .product-title -->
                                    <div class="product-price">
                                        $675,00
                                    </div><!-- End .product-price -->

                                    <div class="product-nav product-nav-dots">
                                        <a href="#" class="active" style="background: #74543e;"><span class="sr-only">Color name</span></a>
                                        <a href="#" style="background: #e8e8e8;"><span class="sr-only">Color name</span></a>
                                    </div><!-- End .product-nav -->
                                </div><!-- End .product-body -->
                                <div class="product-action">
                                    <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                </div><!-- End .product-action -->
                            </div><!-- End .product -->
                        </div><!-- End .owl-carousel -->
                    </div><!-- .End .tab-pane -->
                </div><!-- End .tab-content -->
            </div><!-- End .container -->

    		<div class="container categories pt-6">
        		<h2 class="title-lg text-center mb-4">Shop by Categories</h2><!-- End .title-lg text-center -->

        		<div class="row">
        			<div class="col-6 col-lg-4">
        				<div class="banner banner-display banner-link-anim">
                			<a href="#">
                				<img src="assets/images/banners/home/banner-1.jpg" alt="Banner">
                			</a>

                			<div class="banner-content banner-content-center">
                				<h3 class="banner-title text-white"><a href="#">Outdoor</a></h3><!-- End .banner-title -->
                				<a href="#" class="btn btn-outline-white banner-link">Shop Now<i class="icon-long-arrow-right"></i></a>
                			</div><!-- End .banner-content -->
            			</div><!-- End .banner -->
        			</div><!-- End .col-sm-6 col-lg-3 -->
        			<div class="col-6 col-lg-4 order-lg-last">
        				<div class="banner banner-display banner-link-anim">
                			<a href="#">
                				<img src="assets/images/banners/home/banner-4.jpg" alt="Banner">
                			</a>

                			<div class="banner-content banner-content-center">
                				<h3 class="banner-title text-white"><a href="#">Lighting</a></h3><!-- End .banner-title -->
                				<a href="#" class="btn btn-outline-white banner-link">Shop Now<i class="icon-long-arrow-right"></i></a>
                			</div><!-- End .banner-content -->
            			</div><!-- End .banner -->
        			</div><!-- End .col-sm-6 col-lg-3 -->
        			<div class="col-sm-12 col-lg-4 banners-sm">
                        <div class="row">
            				<div class="banner banner-display banner-link-anim col-lg-12 col-6">
                    			<a href="#">
                    				<img src="assets/images/banners/home/banner-2.jpg" alt="Banner">
                    			</a>

                    			<div class="banner-content banner-content-center">
                    				<h3 class="banner-title text-white"><a href="#">Furniture and Design</a></h3><!-- End .banner-title -->
                    				<a href="#" class="btn btn-outline-white banner-link">Shop Now<i class="icon-long-arrow-right"></i></a>
                    			</div><!-- End .banner-content -->
                			</div><!-- End .banner -->

                			<div class="banner banner-display banner-link-anim col-lg-12 col-6">
                    			<a href="#">
                    				<img src="assets/images/banners/home/banner-3.jpg" alt="Banner">
                    			</a>

                    			<div class="banner-content banner-content-center">
                    				<h3 class="banner-title text-white"><a href="#">Kitchen & Utensil</a></h3><!-- End .banner-title -->
                    				<a href="#" class="btn btn-outline-white banner-link">Shop Now<i class="icon-long-arrow-right"></i></a>
                    			</div><!-- End .banner-content -->
                			</div><!-- End .banner -->
                        </div>
        			</div><!-- End .col-sm-6 col-lg-3 -->
        		</div><!-- End .row -->
    		</div><!-- End .container -->

            <div class="mb-5"></div><!-- End .mb-6 -->

            
            <div class="container">
                <div class="heading heading-center mb-6">
                    <h2 class="title">Recent Arrivals</h2><!-- End .title -->

                    <ul class="nav nav-pills nav-border-anim justify-content-center" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" id="top-all-link" data-toggle="tab" href="#top-all-tab" role="tab" aria-controls="top-all-tab" aria-selected="true">All</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="top-fur-link" data-toggle="tab" href="#top-fur-tab" role="tab" aria-controls="top-fur-tab" aria-selected="false">Furniture</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="top-decor-link" data-toggle="tab" href="#top-decor-tab" role="tab" aria-controls="top-decor-tab" aria-selected="false">Decor</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="top-light-link" data-toggle="tab" href="#top-light-tab" role="tab" aria-controls="top-light-tab" aria-selected="false">Lighting</a>
                        </li>
                    </ul>
                </div><!-- End .heading -->

                <div class="tab-content">
                    <div class="tab-pane p-0 fade show active" id="top-all-tab" role="tabpanel" aria-labelledby="top-all-link">
                        <div class="products">
                            <div class="row justify-content-center">
                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-12-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-12-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Block Side Table/Trolley</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $229,00
                                            </div><!-- End .product-price -->

                                            <div class="product-nav product-nav-dots">
                                                <a href="#" class="active" style="background: #333333;"><span class="sr-only">Color name</span></a>
                                                <a href="#" style="background: #e8e8e8;"><span class="sr-only">Color name</span></a>
                                            </div><!-- End .product-nav -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-10-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-10-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Carronade Suspension Lamp</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $892,00
                                            </div><!-- End .product-price -->

                                            <div class="product-nav product-nav-dots">
                                                <a href="#" class="active" style="background: #e8e8e8;"><span class="sr-only">Color name</span></a>
                                                <a href="#" style="background: #333333;"><span class="sr-only">Color name</span></a>
                                            </div><!-- End .product-nav -->

                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <span class="product-label label-new">NEW</span>
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-9-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-9-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Garden Armchair</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $94,00
                                            </div><!-- End .product-price -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-8-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-8-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Madra Log Holder</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $104,00
                                            </div><!-- End .product-price -->

                                            <div class="product-nav product-nav-dots">
                                                <a href="#" class="active" style="background: #333333;"><span class="sr-only">Color name</span></a>
                                                <a href="#" style="background: #927764;"><span class="sr-only">Color name</span></a>
                                            </div><!-- End .product-nav -->

                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-11-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-11-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Original Outdoor Beanbag</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $259,00
                                            </div><!-- End .product-price -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-13-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-13-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">2-Seater</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $3.107,00
                                            </div><!-- End .product-price -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-14-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-14-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Wingback Chair</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $2.486,00
                                            </div><!-- End .product-price -->

                                            <div class="product-nav product-nav-dots">
                                                <a href="#" class="active" style="background: #999999;"><span class="sr-only">Color name</span></a>
                                                <a href="#" style="background: #cc9999;"><span class="sr-only">Color name</span></a>
                                            </div><!-- End .product-nav -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <span class="product-label label-new">NEW</span>
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-16-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-16-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <div class="product-cat">
                                                <a href="#">Decor</a>
                                            </div><!-- End .product-cat -->
                                            <h3 class="product-title"><a href="product.html">Cushion Set 3 Pieces</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $199,00
                                            </div><!-- End .product-price -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->
                            </div><!-- End .row -->
                        </div><!-- End .products -->
                    </div><!-- .End .tab-pane -->
                    <div class="tab-pane p-0 fade" id="top-fur-tab" role="tabpanel" aria-labelledby="top-fur-link">
                        <div class="products">
                            <div class="row justify-content-center">
                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <span class="product-label label-new">NEW</span>
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-9-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-9-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Garden Armchair</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $94,00
                                            </div><!-- End .product-price -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-12-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-12-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Block Side Table/Trolley</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $229,00
                                            </div><!-- End .product-price -->

                                            <div class="product-nav product-nav-dots">
                                                <a href="#" class="active" style="background: #333333;"><span class="sr-only">Color name</span></a>
                                                <a href="#" style="background: #e8e8e8;"><span class="sr-only">Color name</span></a>
                                            </div><!-- End .product-nav -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->
                                
                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-13-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-13-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">2-Seater</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $3.107,00
                                            </div><!-- End .product-price -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->
                            </div><!-- End .row -->
                        </div><!-- End .products -->
                    </div><!-- .End .tab-pane -->
                    <div class="tab-pane p-0 fade" id="top-decor-tab" role="tabpanel" aria-labelledby="top-decor-link">
                        <div class="products">
                            <div class="row justify-content-center">
                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-8-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-8-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Madra Log Holder</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $104,00
                                            </div><!-- End .product-price -->

                                            <div class="product-nav product-nav-dots">
                                                <a href="#" class="active" style="background: #333333;"><span class="sr-only">Color name</span></a>
                                                <a href="#" style="background: #927764;"><span class="sr-only">Color name</span></a>
                                            </div><!-- End .product-nav -->

                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-11-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-11-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Original Outdoor Beanbag</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $259,00
                                            </div><!-- End .product-price -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-14-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-14-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Wingback Chair</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $2.486,00
                                            </div><!-- End .product-price -->

                                            <div class="product-nav product-nav-dots">
                                                <a href="#" class="active" style="background: #999999;"><span class="sr-only">Color name</span></a>
                                                <a href="#" style="background: #cc9999;"><span class="sr-only">Color name</span></a>
                                            </div><!-- End .product-nav -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->
                            </div><!-- End .row -->
                        </div><!-- End .products -->
                    </div><!-- .End .tab-pane -->
                    <div class="tab-pane p-0 fade" id="top-light-tab" role="tabpanel" aria-labelledby="top-light-link">
                        <div class="products">
                            <div class="row justify-content-center">
                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-10-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-10-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <h3 class="product-title"><a href="product.html">Carronade Suspension Lamp</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $892,00
                                            </div><!-- End .product-price -->

                                            <div class="product-nav product-nav-dots">
                                                <a href="#" class="active" style="background: #e8e8e8;"><span class="sr-only">Color name</span></a>
                                                <a href="#" style="background: #333333;"><span class="sr-only">Color name</span></a>
                                            </div><!-- End .product-nav -->

                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->

                                <div class="col-6 col-md-4 col-lg-3">
                                    <div class="product product-11 mt-v3 text-center">
                                        <figure class="product-media">
                                            <span class="product-label label-new">NEW</span>
                                            <a href="product.html">
                                                <img src="assets/images/demos/demo-2/products/product-16-1.jpg" alt="Product image" class="product-image">
                                                <img src="assets/images/demos/demo-2/products/product-16-2.jpg" alt="Product image" class="product-image-hover">
                                            </a>

                                            <div class="product-action-vertical">
                                                <a href="#" class="btn-product-icon btn-wishlist "><span>add to wishlist</span></a>
                                            </div><!-- End .product-action-vertical -->
                                        </figure><!-- End .product-media -->

                                        <div class="product-body">
                                            <div class="product-cat">
                                                <a href="#">Decor</a>
                                            </div><!-- End .product-cat -->
                                            <h3 class="product-title"><a href="product.html">Cushion Set 3 Pieces</a></h3><!-- End .product-title -->
                                            <div class="product-price">
                                                $199,00
                                            </div><!-- End .product-price -->
                                        </div><!-- End .product-body -->
                                        <div class="product-action">
                                            <a href="#" class="btn-product btn-cart"><span>add to cart</span></a>
                                        </div><!-- End .product-action -->
                                    </div><!-- End .product -->
                                </div><!-- End .col-sm-6 col-md-4 col-lg-3 -->
                            </div><!-- End .row -->
                        </div><!-- End .products -->
                    </div><!-- .End .tab-pane -->
                </div><!-- End .tab-content -->
                <div class="more-container text-center">
                    <a href="#" class="btn btn-outline-darker btn-more"><span>Load more products</span><i class="icon-long-arrow-down"></i></a>
                </div><!-- End .more-container -->
            </div><!-- End .container -->

            <div class="container">
                <hr>
            	<div class="row justify-content-center">
                    <div class="col-lg-4 col-sm-6">
                        <div class="icon-box icon-box-card text-center">
                            <span class="icon-box-icon">
                                <i class="icon-rocket"></i>
                            </span>
                            <div class="icon-box-content">
                                <h3 class="icon-box-title">Payment & Delivery</h3><!-- End .icon-box-title -->
                                <p>Free shipping for orders over $50</p>
                            </div><!-- End .icon-box-content -->
                        </div><!-- End .icon-box -->
                    </div><!-- End .col-lg-4 col-sm-6 -->

                    <div class="col-lg-4 col-sm-6">
                        <div class="icon-box icon-box-card text-center">
                            <span class="icon-box-icon">
                                <i class="icon-rotate-left"></i>
                            </span>
                            <div class="icon-box-content">
                                <h3 class="icon-box-title">Return & Refund</h3><!-- End .icon-box-title -->
                                <p>Free 100% money back guarantee</p>
                            </div><!-- End .icon-box-content -->
                        </div><!-- End .icon-box -->
                    </div><!-- End .col-lg-4 col-sm-6 -->

                    <div class="col-lg-4 col-sm-6">
                        <div class="icon-box icon-box-card text-center">
                            <span class="icon-box-icon">
                                <i class="icon-life-ring"></i>
                            </span>
                            <div class="icon-box-content">
                                <h3 class="icon-box-title">Quality Support</h3><!-- End .icon-box-title -->
                                <p>Alway online feedback 24/7</p>
                            </div><!-- End .icon-box-content -->
                        </div><!-- End .icon-box -->
                    </div><!-- End .col-lg-4 col-sm-6 -->
                </div><!-- End .row -->

                <div class="mb-2"></div><!-- End .mb-2 -->
            </div><!-- End .container -->
            <div class="blog-posts pt-7 pb-7" style="background-color: #fafafa;">
                <div class="container">
                   <h2 class="title-lg text-center mb-3 mb-md-4">From Our Blog</h2><!-- End .title-lg text-center -->

                    <div class="owl-carousel owl-simple carousel-with-shadow" data-toggle="owl" 
                        data-owl-options='{
                            "nav": false, 
                            "dots": true,
                            "items": 3,
                            "margin": 20,
                            "loop": false,
                            "responsive": {
                                "0": {
                                    "items":1
                                },
                                "600": {
                                    "items":2
                                },
                                "992": {
                                    "items":3
                                }
                            }
                        }'>
                        <article class="entry entry-display">
                            <figure class="entry-media">
                                <a href="single.html">
                                    <img src="assets/images/blog/home/post-1.jpg" alt="image desc">
                                </a>
                            </figure><!-- End .entry-media -->

                            <div class="entry-body pb-4 text-center">
                                <div class="entry-meta">
                                    <a href="#">Nov 22, 2018</a>, 0 Comments
                                </div><!-- End .entry-meta -->

                                <h3 class="entry-title">
                                    <a href="single.html">Sed adipiscing ornare.</a>
                                </h3><!-- End .entry-title -->

                                <div class="entry-content">
                                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Phasellus hendrerit.<br>Pelletesque aliquet nibh necurna. </p>
                                    <a href="single.html" class="read-more">Read More</a>
                                </div><!-- End .entry-content -->
                            </div><!-- End .entry-body -->
                        </article><!-- End .entry -->

                        <article class="entry entry-display">
                            <figure class="entry-media">
                                <a href="single.html">
                                    <img src="assets/images/blog/home/post-2.jpg" alt="image desc">
                                </a>
                            </figure><!-- End .entry-media -->

                            <div class="entry-body pb-4 text-center">
                                <div class="entry-meta">
                                    <a href="#">Dec 12, 2018</a>, 0 Comments
                                </div><!-- End .entry-meta -->

                                <h3 class="entry-title">
                                    <a href="single.html">Fusce lacinia arcuet nulla.</a>
                                </h3><!-- End .entry-title -->

                                <div class="entry-content">
                                    <p>Sed pretium, ligula sollicitudin laoreet<br>viverra, tortor libero sodales leo, eget blandit nunc tortor eu nibh. Nullam mollis justo. </p>
                                    <a href="single.html" class="read-more">Read More</a>
                                </div><!-- End .entry-content -->
                            </div><!-- End .entry-body -->
                        </article><!-- End .entry -->

                        <article class="entry entry-display">
                            <figure class="entry-media">
                                <a href="single.html">
                                    <img src="assets/images/blog/home/post-3.jpg" alt="image desc">
                                </a>
                            </figure><!-- End .entry-media -->

                            <div class="entry-body pb-4 text-center">
                                <div class="entry-meta">
                                    <a href="#">Dec 19, 2018</a>, 2 Comments
                                </div><!-- End .entry-meta -->

                                <h3 class="entry-title">
                                    <a href="single.html">Quisque volutpat mattis eros.</a>
                                </h3><!-- End .entry-title -->

                                <div class="entry-content">
                                    <p>Suspendisse potenti. Sed egestas, ante et vulputate volutpat, eros pede semper est, vitae luctus metus libero eu augue. </p>
                                    <a href="single.html" class="read-more">Read More</a>
                                </div><!-- End .entry-content -->
                            </div><!-- End .entry-body -->
                        </article><!-- End .entry -->
                    </div><!-- End .owl-carousel -->
                </div><!-- container -->

                <div class="more-container text-center mb-0 mt-3">
                    <a href="blog.html" class="btn btn-outline-darker btn-more"><span>View more articles</span><i class="icon-long-arrow-right"></i></a>
                </div><!-- End .more-container -->
            </div>
            <div class="cta cta-display bg-image pt-4 pb-4" style="background-image: url(assets/images/backgrounds/cta/bg-6.jpg);">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-md-10 col-lg-9 col-xl-8">
                            <div class="row no-gutters flex-column flex-sm-row align-items-sm-center">
                                <div class="col">
                                    <h3 class="cta-title text-white">Sign Up & Get 10% Off</h3><!-- End .cta-title -->
                                    <p class="cta-desc text-white">Molla presents the best in interior design</p><!-- End .cta-desc -->
                                </div><!-- End .col -->

                                <div class="col-auto">
                                    <a href="login.html" class="btn btn-outline-white"><span>SIGN UP</span><i class="icon-long-arrow-right"></i></a>
                                </div><!-- End .col-auto -->
                            </div><!-- End .row no-gutters -->
                        </div><!-- End .col-md-10 col-lg-9 -->
                    </div><!-- End .row -->
                </div><!-- End .container -->
            </div><!-- End .cta -->
        </main><!-- End .main -->

        <footer class="footer footer-dark">
        	<div class="footer-middle">
	            <div class="container">
	            	<div class="row">
	            		<div class="col-sm-6 col-lg-3">
	            			<div class="widget widget-about">
	            				<img src="assets/images/logo-footer.png" class="footer-logo" alt="Footer Logo" width="105" height="25">
	            				<p>Praesent dapibus, neque id cursus ucibus, tortor neque egestas augue, eu vulputate magna eros eu erat. </p>

	            				<div class="social-icons">
	            					<a href="#" class="social-icon" title="Facebook" target="_blank"><i class="icon-facebook-f"></i></a>
	            					<a href="#" class="social-icon" title="Twitter" target="_blank"><i class="icon-twitter"></i></a>
	            					<a href="#" class="social-icon" title="Instagram" target="_blank"><i class="icon-instagram"></i></a>
	            					<a href="#" class="social-icon" title="Youtube" target="_blank"><i class="icon-youtube"></i></a>
	            					<a href="#" class="social-icon" title="Pinterest" target="_blank"><i class="icon-pinterest"></i></a>
	            				</div><!-- End .soial-icons -->
	            			</div><!-- End .widget about-widget -->
	            		</div><!-- End .col-sm-6 col-lg-3 -->

	            		<div class="col-sm-6 col-lg-3">
	            			<div class="widget">
	            				<h4 class="widget-title">Useful Links</h4><!-- End .widget-title -->

	            				<ul class="widget-list">
	            					<li><a href="about.html">About Molla</a></li>
	            					<li><a href="#">How to shop on Molla</a></li>
	            					<li><a href="#">FAQ</a></li>
	            					<li><a href="contact.html">Contact us</a></li>
	            					<li><a href="login.html">Log in</a></li>
	            				</ul><!-- End .widget-list -->
	            			</div><!-- End .widget -->
	            		</div><!-- End .col-sm-6 col-lg-3 -->

	            		<div class="col-sm-6 col-lg-3">
	            			<div class="widget">
	            				<h4 class="widget-title">Customer Service</h4><!-- End .widget-title -->

	            				<ul class="widget-list">
	            					<li><a href="#">Payment Methods</a></li>
	            					<li><a href="#">Money-back guarantee!</a></li>
	            					<li><a href="#">Returns</a></li>
	            					<li><a href="#">Shipping</a></li>
	            					<li><a href="#">Terms and conditions</a></li>
	            					<li><a href="#">Privacy Policy</a></li>
	            				</ul><!-- End .widget-list -->
	            			</div><!-- End .widget -->
	            		</div><!-- End .col-sm-6 col-lg-3 -->

	            		<div class="col-sm-6 col-lg-3">
	            			<div class="widget">
	            				<h4 class="widget-title">My Account</h4><!-- End .widget-title -->

	            				<ul class="widget-list">
	            					<li><a href="#">Sign In</a></li>
	            					<li><a href="cart.html">View Cart</a></li>
	            					<li><a href="#">My Wishlist</a></li>
	            					<li><a href="#">Track My Order</a></li>
	            					<li><a href="#">Help</a></li>
	            				</ul><!-- End .widget-list -->
	            			</div><!-- End .widget -->
	            		</div><!-- End .col-sm-6 col-lg-3 -->
	            	</div><!-- End .row -->
	            </div><!-- End .container -->
	        </div><!-- End .footer-middle -->

	        <div class="footer-bottom">
	        	<div class="container">
	        		<p class="footer-copyright">Copyright © 2019 Molla Store. All Rights Reserved.</p><!-- End .footer-copyright -->
	        		<figure class="footer-payments">
	        			<img src="assets/images/payments.png" alt="Payment methods" width="272" height="20">
	        		</figure><!-- End .footer-payments -->
	        	</div><!-- End .container -->
	        </div><!-- End .footer-bottom -->
        </footer><!-- End .footer -->
    </div><!-- End .page-wrapper -->
    <button id="scroll-top" title="Back to Top"><i class="icon-arrow-up"></i></button>

    <!-- Mobile Menu -->
    <div class="mobile-menu-overlay"></div><!-- End .mobil-menu-overlay -->

    <div class="mobile-menu-container">
        <div class="mobile-menu-wrapper">
            <span class="mobile-menu-close"><i class="icon-close"></i></span>

            <form action="#" method="get" class="mobile-search">
                <label for="mobile-search" class="sr-only">Search</label>
                <input type="search" class="form-control" name="mobile-search" id="mobile-search" placeholder="Search in..." required>
                <button class="btn btn-primary" type="submit"><i class="icon-search"></i></button>
            </form>
            
            <nav class="mobile-nav">
                <ul class="mobile-menu">
                    <li class="active">
                        <a href="index.html">Home</a>

                        <ul>
                            <li><a href="index-1.html">01 - furniture store</a></li>
                            <li><a href="index.html">02 - furniture store</a></li>
                            <li><a href="index-3.html">03 - electronic store</a></li>
                            <li><a href="index-4.html">04 - electronic store</a></li>
                            <li><a href="index-5.html">05 - fashion store</a></li>
                            <li><a href="index-6.html">06 - fashion store</a></li>
                            <li><a href="index-7.html">07 - fashion store</a></li>
                            <li><a href="index-8.html">08 - fashion store</a></li>
                            <li><a href="index-9.html">09 - fashion store</a></li>
                            <li><a href="index-10.html">10 - shoes store</a></li>
                            <li><a href="index-11.html">11 - furniture simple store</a></li>
                            <li><a href="index-12.html">12 - fashion simple store</a></li>
                            <li><a href="index-13.html">13 - market</a></li>
                            <li><a href="index-14.html">14 - market fullwidth</a></li>
                            <li><a href="index-15.html">15 - lookbook 1</a></li>
                            <li><a href="index-16.html">16 - lookbook 2</a></li>
                            <li><a href="index-17.html">17 - fashion store</a></li>
                            <li><a href="index-18.html">18 - fashion store (with sidebar)</a></li>
                            <li><a href="index-19.html">19 - games store</a></li>
                            <li><a href="index-20.html">20 - book store</a></li>
                            <li><a href="index-21.html">21 - sport store</a></li>
                            <li><a href="index-22.html">22 - tools store</a></li>
                            <li><a href="index-23.html">23 - fashion left navigation store</a></li>
                            <li><a href="index-24.html">24 - extreme sport store</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="category.html">Shop</a>
                        <ul>
                            <li><a href="category-list.html">Shop List</a></li>
                            <li><a href="category-2cols.html">Shop Grid 2 Columns</a></li>
                            <li><a href="category.html">Shop Grid 3 Columns</a></li>
                            <li><a href="category-4cols.html">Shop Grid 4 Columns</a></li>
                            <li><a href="category-boxed.html"><span>Shop Boxed No Sidebar<span class="tip tip-hot">Hot</span></span></a></li>
                            <li><a href="category-fullwidth.html">Shop Fullwidth No Sidebar</a></li>
                            <li><a href="product-category-boxed.html">Product Category Boxed</a></li>
                            <li><a href="product-category-fullwidth.html"><span>Product Category Fullwidth<span class="tip tip-new">New</span></span></a></li>
                            <li><a href="cart.html">Cart</a></li>
                            <li><a href="checkout.html">Checkout</a></li>
                            <li><a href="wishlist.html">Wishlist</a></li>
                            <li><a href="#">Lookbook</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="product.html" class="sf-with-ul">Product</a>
                        <ul>
                            <li><a href="product.html">Default</a></li>
                            <li><a href="product-centered.html">Centered</a></li>
                            <li><a href="product-extended.html"><span>Extended Info<span class="tip tip-new">New</span></span></a></li>
                            <li><a href="product-gallery.html">Gallery</a></li>
                            <li><a href="product-sticky.html">Sticky Info</a></li>
                            <li><a href="product-sidebar.html">Boxed With Sidebar</a></li>
                            <li><a href="product-fullwidth.html">Full Width</a></li>
                            <li><a href="product-masonry.html">Masonry Sticky Info</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">Pages</a>
                        <ul>
                            <li>
                                <a href="about.html">About</a>

                                <ul>
                                    <li><a href="about.html">About 01</a></li>
                                    <li><a href="about-2.html">About 02</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="contact.html">Contact</a>

                                <ul>
                                    <li><a href="contact.html">Contact 01</a></li>
                                    <li><a href="contact-2.html">Contact 02</a></li>
                                </ul>
                            </li>
                            <li><a href="login.html">Login</a></li>
                            <li><a href="faq.html">FAQs</a></li>
                            <li><a href="404.html">Error 404</a></li>
                            <li><a href="coming-soon.html">Coming Soon</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="blog.html">Blog</a>

                        <ul>
                            <li><a href="blog.html">Classic</a></li>
                            <li><a href="blog-listing.html">Listing</a></li>
                            <li>
                                <a href="#">Grid</a>
                                <ul>
                                    <li><a href="blog-grid-2cols.html">Grid 2 columns</a></li>
                                    <li><a href="blog-grid-3cols.html">Grid 3 columns</a></li>
                                    <li><a href="blog-grid-4cols.html">Grid 4 columns</a></li>
                                    <li><a href="blog-grid-sidebar.html">Grid sidebar</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">Masonry</a>
                                <ul>
                                    <li><a href="blog-masonry-2cols.html">Masonry 2 columns</a></li>
                                    <li><a href="blog-masonry-3cols.html">Masonry 3 columns</a></li>
                                    <li><a href="blog-masonry-4cols.html">Masonry 4 columns</a></li>
                                    <li><a href="blog-masonry-sidebar.html">Masonry sidebar</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">Mask</a>
                                <ul>
                                    <li><a href="blog-mask-grid.html">Blog mask grid</a></li>
                                    <li><a href="blog-mask-masonry.html">Blog mask masonry</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">Single Post</a>
                                <ul>
                                    <li><a href="single.html">Default with sidebar</a></li>
                                    <li><a href="single-fullwidth.html">Fullwidth no sidebar</a></li>
                                    <li><a href="single-fullwidth-sidebar.html">Fullwidth with sidebar</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="elements-list.html">Elements</a>
                        <ul>
                            <li><a href="elements-products.html">Products</a></li>
                            <li><a href="elements-typography.html">Typography</a></li>
                            <li><a href="elements-titles.html">Titles</a></li>
                            <li><a href="elements-banners.html">Banners</a></li>
                            <li><a href="elements-product-category.html">Product Category</a></li>
                            <li><a href="elements-video-banners.html">Video Banners</a></li>
                            <li><a href="elements-buttons.html">Buttons</a></li>
                            <li><a href="elements-accordions.html">Accordions</a></li>
                            <li><a href="elements-tabs.html">Tabs</a></li>
                            <li><a href="elements-testimonials.html">Testimonials</a></li>
                            <li><a href="elements-blog-posts.html">Blog Posts</a></li>
                            <li><a href="elements-portfolio.html">Portfolio</a></li>
                            <li><a href="elements-cta.html">Call to Action</a></li>
                            <li><a href="elements-icon-boxes.html">Icon Boxes</a></li>
                        </ul>
                    </li>
                </ul>
            </nav><!-- End .mobile-nav -->

            <div class="social-icons">
                <a href="#" class="social-icon" target="_blank" title="Facebook"><i class="icon-facebook-f"></i></a>
                <a href="#" class="social-icon" target="_blank" title="Twitter"><i class="icon-twitter"></i></a>
                <a href="#" class="social-icon" target="_blank" title="Instagram"><i class="icon-instagram"></i></a>
                <a href="#" class="social-icon" target="_blank" title="Youtube"><i class="icon-youtube"></i></a>
            </div><!-- End .social-icons -->
        </div><!-- End .mobile-menu-wrapper -->
    </div><!-- End .mobile-menu-container -->

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
</body>


<!-- molla/index-2.html  22 Nov 2019 09:55:42 GMT -->
</html>
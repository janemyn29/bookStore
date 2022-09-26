<%-- 
    Document   : addNewSeller
    Created on : Sep 27, 2022, 12:10:56 AM
    Author     : tramy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Quixlab - Bootstrap Admin Dashboard Template by Themefisher.com</title>
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
        <!-- Custom Stylesheet -->
        <link href="css/style.css" rel="stylesheet">

    </head>

    <body>

        <!--*******************
            Preloader start
        ********************-->
        <div id="preloader">
            <div class="loader">
                <svg class="circular" viewBox="25 25 50 50">
                <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
                </svg>
            </div>
        </div>
        <!--*******************
            Preloader end
        ********************-->


        <!--**********************************
            Main wrapper start
        ***********************************-->
        <div id="main-wrapper">
            <jsp:include page="adHeader.jsp"></jsp:include>
                <!--**********************************
                    Sidebar start
                ***********************************-->
                <div class="nk-sidebar">           
                    <div class="nk-nav-scroll">
                        <ul class="metismenu" id="menu">
                            <li class="nav-label" style="background-color: #c96;">Hello Admin ${acc.getUsername()}</li>
                        <li>
                            <a href="home" aria-expanded="false">
                                <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dashboard</span>
                            </a>

                        </li>
                        <li class="mega-menu mega-menu-sm">
                            <a href="widgets.html" aria-expanded="false">
                                <i class="icon-globe-alt menu-icon"></i><span class="nav-text">Customer Management</span>
                            </a>

                        </li>
                        <li>
                            <a class="active" href="" aria-expanded="false">
                                <i class="icon-envelope menu-icon"></i> <span class="nav-text">Seller Management</span>
                            </a>

                        </li>
                        <li>
                            <a  href="adimporter" aria-expanded="false">
                                <i class="icon-screen-tablet menu-icon"></i><span class="nav-text">Importer Management</span>
                            </a>

                        </li>
                        <li>
                            <a href="widgets.html" aria-expanded="false">
                                <i class="icon-graph menu-icon"></i> <span class="nav-text">Blacklist Management</span>
                            </a>

                        </li>
                        <li>
                            <a href="widgets.html" aria-expanded="false">
                                <i class="icon-grid menu-icon"></i><span class="nav-text">Feedback Management</span>
                            </a>

                        </li>
                        <li>
                            <a href="widgets.html" aria-expanded="false">
                                <i class="icon-badge menu-icon"></i><span class="nav-text">Profit Management</span>
                            </a>
                        </li>

                    </ul>
                </div>
            </div>
            <!--**********************************
                Sidebar end
            ***********************************-->
            <div class="content-body">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <c:if test='${role == "seller"}'>
                                        <h4 class="card-title">Add New Seller</h4>
                                    </c:if>
                                    <c:if test='${role == "importer"}'>
                                        <h4 class="card-title">Add New Importer</h4>
                                    </c:if>
                                    <div class="basic-form">
                                        <c:if test='${role == "seller"}'>
                                            <form action="addnewseller" method="POST">
                                            </c:if>
                                            <c:if test='${role == "importer"}'>
                                                <form action="addnewimp" method="POST">
                                                </c:if>
                                                <c:if test='${temMess == "This username already existed!"}'>
                                                    <dive  style="color: red ;width: 300px;" >${temMess}</div>
                                                </c:if>
                                                <c:if test='${temMess == "This email is registered!"}'>
                                                    <div style="color: red" class="col-sm-2 col-form-label">${temMess}</div>
                                                </c:if>

                                                <div class="form-group row">
                                                    <label class="col-sm-2 col-form-label">Email</label>
                                                    <div class="col-sm-10">
                                                        <input type="email" name="email" class="form-control" placeholder="Email">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label class="col-sm-2 col-form-label">Username</label>
                                                    <div class="col-sm-10">
                                                        <input type="text" name="username" class="form-control" placeholder="Username">
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label class="col-sm-2 col-form-label">Phone</label>
                                                    <div class="col-sm-10">
                                                        <input type="number" name="phone" class="form-control" placeholder="Phone">
                                                    </div>
                                                </div>
                                                     

                                                <div class="form-group row">
                                                    <div class="col-sm-10">
                                                        <div class="basic-form">
                                                            <c:if test='${role == "seller"}'>
                                                                <input type="hidden" name="rolename" class="form-control" value="seller">
                                                                <button type="submit" class="btn mb-1 btn-warning">Add New Seller</button>
                                                                </c:if>
                                                                <c:if test='${role == "importer"}'>
                                                                    <input type="hidden" name="rolename" class="form-control" value="importer">
                                                                    <button type="submit" class="btn mb-1 btn-warning">Add New Importer</button>
                                                                    </c:if>
                                                                    
                                                                    </div>
                                                                    </div>
                                                                </form>
                                                        </div>
                                                    </div>
                                                </div>
                                                </div>


                                                </div>
                                                </div>
                                                <!-- #/ container -->
                                                </div>
                                                <!--**********************************
                                                    Content body end
                                                ***********************************-->


                                                <!--**********************************
                                                    Footer start
                                                ***********************************-->
                                                <div class="footer">
                                                    <div class="copyright">
                                                        <p>Copyright &copy; Designed & Developed by <a href="https://themeforest.net/user/quixlab">Quixlab</a> 2018</p>
                                                    </div>
                                                </div>
                                                <!--**********************************
                                                    Footer end
                                                ***********************************-->
                                                </div>
                                                <!--**********************************
                                                    Main wrapper end
                                                ***********************************-->

                                                <!--**********************************
                                                    Scripts
                                                ***********************************-->
                                                <script src="plugins/common/common.min.js"></script>
                                                <script src="js/custom.min.js"></script>
                                                <script src="js/settings.js"></script>
                                                <script src="js/gleek.js"></script>
                                                <script src="js/styleSwitcher.js"></script>

                                                </body>

                                                </html>

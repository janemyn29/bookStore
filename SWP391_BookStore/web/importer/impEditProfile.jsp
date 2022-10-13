<!DOCTYPE html>
<html lang="en">
    <%@page import="com.bookstore.Account.Account"%>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Accont</title>
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
        <!-- Custom Stylesheet -->
        <link href="./plugins/jquery-steps/css/jquery.steps.css" rel="stylesheet">
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

        <div id="main-wrapper">

            <div class="nav-header">

                <div class="brand-logo">

                    <a href="index.html">
                        <img src="images/logo.png" alt="" width="120" height="56.5" >
                    </a>
                </div>
            </div>
            <!--**********************************
                Nav header end
            ***********************************-->

            <!--**********************************
                Header start
            ***********************************-->
            <div class="header">    
                <div class="header-content clearfix">


                    <div class="header-left">
                        <div class="nav-control">
                            <div class="hamburger">
                                <span class="toggle-icon"><i class="icon-menu"></i></span>
                            </div>
                        </div>
                    </div>
                    <div class="header-right">
                        <ul class="top-menu">
                            <li>
                                <ul>
                                        <%
                                            Account acc = (Account) request.getSession().getAttribute("acc");
                                            if (acc == null) {
                                        %>
                                    <li><a href="login">Login</li>
                                        <%
                                } else {%>
                                    <li><a href="editprofile">Hello ${acc.getUsername()}</a></li>
                                        <%}%>
                                </ul>
                            </li>
                        </ul><!-- End .top-menu -->
                    </div>
                </div>
            </div>
            <!--**********************************
                Header end ti-comment-alt
            ***********************************-->

            <!--**********************************
                Sidebar start
            ***********************************-->
            <div class="nk-sidebar">           
                <div class="nk-nav-scroll">
                    <ul class="metismenu" id="menu">
                        <li class="mega-menu mega-menu-sm">
                        <li class="nav-label">Management</li>

                        <li  class="mega-menu mega-menu-sm" > 
                            <a href="./index.html" aria-expanded="false">
                                <i  class="icon-speedometer menu-icon"></i><span class="nav-text">Dash Board</span>
                            </a>

                        <li class="mega-menu mega-menu-sm">
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-people menu-icon"></i><span class="nav-text">Receipt</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="./table-datatable.html">Receipter Importer</a></li>

                            </ul>

                        </li>


                        <li>
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-note menu-icon"></i><span class="nav-text">Publish Company</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="./table-basic.html" aria-expanded="false">List Publish Company</a></li>
                                <!-- <li><a href="./table-datatable.html" aria-expanded="false">Data Table</a></li> -->
                            </ul>
                        </li>

                
                            <a  href="page-login.html" aria-expanded="false">
                                <i class="icon-logout menu-icon"></i><span class="nav-text">LogOut</span>
                            </a>

                        </li>
                    </ul>
                </div>
            </div>
            <!--**********************************
                Sidebar end
            ***********************************-->

            <!--**********************************
                Content body start
            ***********************************-->
            <div class="content-body">

                <div class="row page-titles mx-0">
                    <div class="col p-md-0">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="javascript:void(0)">Confirm Account</a></li>
                            <li class="breadcrumb-item active"><a href="./index.html">Home</a></li>
                        </ol>
                    </div>
                </div>
                <!-- row -->

                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <form action="editprofile" id="step-form-horizontal" class="step-form-horizontal">
                                <div>
                                    <h4>Account Details</h4>
                                    <section>
                                        <div class="row">
                                            <div class="col-lg-6">
                                                <div class="form-group">
                                                    <input type="text" name="username" class="form-control" placeholder="Username" required>
                                                </div>
                                            </div>
                                            <div class="col-lg-6">
                                                <div class="form-group">
                                                    <input type="email" name="email" class="form-control" placeholder="Email" required>
                                                </div>
                                            </div>
                                            <div class="col-lg-6">
                                                <div class="form-group">
                                                    <input type="password" name="password" class="form-control" placeholder="Password" required>
                                                </div>
                                            </div>
                                            <div class="col-lg-6">
                                                <div class="form-group">
                                                    <input type="password" name="confirmPassword" class="form-control" placeholder="Confirm Password" required>
                                                </div>
                                            </div>
                                        </div>
                                        <button type="submit" class="btn btn-outline-primary-2">
                                            <span>SAVE CHANGES</span>
                                        </button>
                                    </section>
                                </div>
                            </form>
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


        <!--        <script src="./plugins/jquery-steps/build/jquery.steps.min.js"></script>-->
        <script src="./plugins/jquery-validation/jquery.validate.min.js"></script>
        <script src="./js/plugins-init/jquery-steps-init.js"></script>

    </body>

</html>
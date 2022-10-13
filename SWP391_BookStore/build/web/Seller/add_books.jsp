<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Seller: Add books</title>
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
        <!-- Pignose Calender -->
        <link href="./plugins/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
        <!-- Chartist -->
        <link rel="stylesheet" href="./plugins/chartist/css/chartist.min.css">
        <link rel="stylesheet" href="./plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css">
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

        <div id="main-wrapper">

            <div class="nav-header">

                <div class="brand-logo">

                    <a href="home.jsp">
                        <img src="images/logo.png" alt="" width="150" height="56.5" >
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
                        <ul class="clearfix">
                            <li class="icons dropdown">
                                <div class="user-img c-pointer position-relative"   data-toggle="dropdown">
                                    <span class="activity active"></span>
                                    <img src="images/user/1.png" height="40" width="40" alt="">
                                </div>
                                <div class="drop-down dropdown-profile animated fadeIn dropdown-menu">
                                    <div class="dropdown-content-body">
                                        <ul>
                                            <li>
                                                <a href="app-profile.html"><i class="icon-user"></i> <span>Profile</span></a>
                                            </li>                              
                                            <li><a href="page-login.html"><i class="icon-key"></i> <span>Logout</span></a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
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
                        <li class="nav-label">Seller</li>
                        <li>  
                            <a  href="dashboard.jsp" aria-expanded="false">
                                <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dashboard</span>
                            </a>               


                        </li>

                        <li class="mega-menu mega-menu-sm">
                            <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                <i class="icon-docs menu-icon"></i><span class="nav-text">Book Management</span>
                            </a>
                            <ul aria-expanded="false">
                                <li><a href="add_books.jsp">Add Books</a></li>
                                <li><a href="displaybook">Display Books</a></li>
                            </ul>

                        </li>


                        <li>
                            <a  href="./order_manage.jsp" aria-expanded="false">
                                <i class="icon-book-open menu-icon"></i><span class="nav-text">Order Management</span>
                            </a>
                        </li>
                        <li>
                            <a  href="javascript:void()" aria-expanded="false">
                                <i class="icon-present menu-icon"></i><span class="nav-text">Discount Management</span>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void()" aria-expanded="false">
                                <i class="icon-pencil menu-icon"></i><span class="nav-text">Author Management</span>
                            </a>
                        </li>
                        <li>
                            <a href="javascript:void()" aria-expanded="false">
                                <i class="icon-user menu-icon"></i><span class="nav-text">My Account</span>
                            </a>
                        </li>

                        <li>
                            <a  href="javascript:void()" aria-expanded="false">
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

                <div class="container-fluid mt-3">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <h1 class="card-title">Add New Book</h1>
                                    <div class="basic-form">
                                        <form action="addbooks" method ="POST" >
                                            <c:forEach items="${listB}" var="b">
                                            <div class="form-group">
                                                <label>Book Name</label>
                                                <input name="bookName" type="text" class="form-control" placeholder="Book Name">
                                            </div>
                                            <div class="form-row">
                                                <div class="form-group col-md-6">
                                                    <label>Image</label>
                                                    <input name="image" type="text" class="form-control" placeholder="Paste Image's Link">

                                                </div>
                                                <div class="form-group col-md-6">
                                                    <label> Author </label>
                                                     <input name="author" type="text" class="form-control" placeholder="Author">
                                                </div>
                                            </div>



                                            <div class="form-group">
                                                <label>Sale Price</label>
                                                <input name="buyprice" type="number" class="form-control" >
                                            </div>
                                            <div class="form-group">
                                                <label>Description</label>
                                                <input name="description" type="text" class="form-control" placeholder="Write Brief Description">
                                            </div>

                                            <div class="form-row">
                                                <div class="form-group col-md-6">
                                                    <button type="submit" class="btn mb-1 btn-rounded btn-primary" >Submit</button>
                                                </div>
                                                <div class="form-group col-md-6">
                                                   <button type="button" onclick="location.href='displaybook';" class="btn mb-1 btn-rounded btn-dark" >Cancel</button>
                                                   
                                                </div>
                                            </div>
                                            </c>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
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

        <!-- Chartjs -->
        <script src="./plugins/chart.js/Chart.bundle.min.js"></script>
        <!-- Circle progress -->
        <script src="./plugins/circle-progress/circle-progress.min.js"></script>
        <!-- Datamap -->
        <script src="./plugins/d3v3/index.js"></script>
        <script src="./plugins/topojson/topojson.min.js"></script>
        <script src="./plugins/datamaps/datamaps.world.min.js"></script>
        <!-- Morrisjs -->
        <script src="./plugins/raphael/raphael.min.js"></script>
        <script src="./plugins/morris/morris.min.js"></script>
        <!-- Pignose Calender -->
        <script src="./plugins/moment/moment.min.js"></script>
        <script src="./plugins/pg-calendar/js/pignose.calendar.min.js"></script>
        <!-- ChartistJS -->
        <script src="./plugins/chartist/js/chartist.min.js"></script>
        <script src="./plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js"></script>



        <script src="./js/dashboard/dashboard-1.js"></script>

    </body>

</html>
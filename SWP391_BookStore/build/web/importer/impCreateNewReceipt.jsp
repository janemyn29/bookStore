<%-- 
    Document   : impCreateNewReceipt
    Created on : Oct 9, 2022, 4:17:23 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link href="./plugins/tables/css/datatable/dataTables.bootstrap4.min.css" rel="stylesheet">
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
                        <img src="images/logo.png" alt="" width="120" height="56.5">
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
                                <h6>Hello Importer</h6>
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
                        <li class="nav-label">Management</li>

                        <li class="mega-menu mega-menu-sm">
                            <a href="./index.html" aria-expanded="false">
                                <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dash Board</span>
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
                                <li><a href="./table-basic.html" aria-expanded="false"> List Publish Company </a></li>
                                <!-- <li><a href="./table-datatable.html" aria-expanded="false">Data Table</a></li> -->
                            </ul>
                        </li>

                        <li class="mega-menu mega-menu-sm">
                            <a href="./app-profile.html" aria-expanded="false">
                                <i class="icon-user menu-icon"></i><span class="nav-text">My Account</span>
                            </a>
                        <li>
                            <a  href="page-login.html" aria-expanded="false">
                                <i class="icon-logout menu-icon"></i><span class="nav-text">LogOut</span>
                            </a>

                        </li>
                    </ul>
                </div>
            </div>

            <!--***********************************-->


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
                            <li class="breadcrumb-item"><a href="./form-editor.html">Create New Receipt</a></li>
                            <li class="breadcrumb-item"><a href="./table-datatable.html">Receipt</a></li>
                            <li class="breadcrumb-item active"><a href="index.html">Home</a></li>
                        </ol>
                    </div>
                </div>
                <!-- row -->


                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-body">

                                    <div class="form-validation">
                                        <form class="form-valide" action="#" method="post">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-password">RECEIPT DATE <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="date" class="form-control" id="val-password" name="val-password" >
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <lable class="col-lg-4 col-form-label" for="val-password">PUBLISH COMPANY NAME<span class="text-danger">*</span>
                                                </lable>
                                                <div class="col-lg-6">
                                                    <input type="Text" class="form-control" id="val-currency" name="val-currency" placeholder="Company">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-currency">TOTAL PRICE<span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="Text" class="form-control" id="val-currency" name="val-currency" placeholder="$21.60">
                                                </div>
                                            </div>


                                            <div class="table-responsive">
                                                <table class="table table-striped table-bordered zero-configuration">
                                                    <thead>
                                                        <tr>
                                                            <th>BookCode</th>
                                                            <th>BookName</th>                                         
                                                            <th>Total Import Price</th>
                                                            <th>Quantity</th> 

                                                        </tr>
                                                    </thead>
                                                    <tbody>

                                                    </tbody>


                                                </table><br>


                                            </div>
                                            <div class="header-right">
                                                <div class="input-group-prepend">
                                                    <a class="create" href="form-editor.html">   Create   </a>
                                                </div>




                                            </div>

                                        </form>
                                    </div>
                                </div>

                            </div>           
                        </div>
                    </div>
                </div>
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

<script src="./plugins/tables/js/jquery.dataTables.min.js"></script>
<script src="./plugins/tables/js/datatable/dataTables.bootstrap4.min.js"></script>
<script src="./plugins/tables/js/datatable-init/datatable-basic.min.js"></script>

</body>

</html>

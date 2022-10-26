<%-- 
    Document   : impCreateNewCompany
    Created on : Oct 11, 2022, 2:38:29 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <jsp:useBean id="rd" class="com.bookstore.Company.CompanyDAO" scope="request"></jsp:useBean>
        <%@page import="com.bookstore.Account.Account"%>
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

                            <li class="mega-menu mega-menu-sm">
                                <a href="./index.html" aria-expanded="false">
                                    <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dash Board</span>
                                </a>

                            <li class="mega-menu mega-menu-sm">
                                <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                    <i class="icon-people menu-icon"></i><span class="nav-text">Receipt</span>
                                </a>
                                <ul aria-expanded="false">
                                    <li><a href="ImpReceiptController">List Receipt</a></li>

                                </ul>

                            </li>


                            <li>
                                <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                                    <i class="icon-note menu-icon"></i><span class="nav-text">Publish Company</span>
                                </a>
                                <ul aria-expanded="false">
                                    <li><a href="ImpCompanyController" aria-expanded="false"> List Publish Company </a></li>

                                </ul>
                            </li>
                            <li>
                        <a  href="/SWP391_BookStore/logout" aria-expanded="false">
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
                                <li class="breadcrumb-item"><a href="./table-basic.html">Create New Publish Company</a></li>
                                <li class="breadcrumb-item"><a href="./table-basic.html">Publish Company</a></li>
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
                                            <form class="form-valide" action="ImpCreateCompanyController" method="post">                                              
                                                <div class="form-group row">
                                                    <label class="col-lg-4 col-form-label" for="val-username">PUBLISH COMPANY NAME<span class="text-danger">*</span>
                                                    </label>
                                                    <div class="col-lg-6">
                                                        <input type="text" class="form-control" id="val-uusername" name="val-username" value="${companyName}">
                                                </div>
                                                <c:if test='${check == "Insert fail company existed!!!"}'>
                                                    <small style="color: red;">${check}</small>
                                                </c:if>
                                            </div>
                                            <div class="header-right">
                                                <div class="input-group-prepend">
                                                    <button class="btn btn-outline-primary-2"  type="submit"> Create </button>
                                                    <c:if test='${check == "Insert Success"}'>
                                                        <label style="color: greenyellow;">${check}</label>
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
<%-- 
    Document   : impListCompany
    Created on : Oct 9, 2022, 2:36:49 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
      <jsp:useBean id="c" class="com.bookstore.Company.CompanyDAO" scope="request"></jsp:useBean>
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
                            <li><a href="ImpCompanyController" aria-expanded="false">List Publish Company</a></li>
                            <!-- <li><a href="./table-datatable.html" aria-expanded="false">Data Table</a></li> -->
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
                        <li class="breadcrumb-item"><a href="ImpCompanyController">Publish Company</a></li>
                        <li class="breadcrumb-item active"><a href="login.jsp">Home</a></li>
                    </ol>
                </div>
            </div>
            <!-- row -->

            <div class="container-fluid">
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="pub">Publish Company</h4> <br>
                                <div class="header-right">
                                <div class="input-group-prepend">
                                    <a class="create" href="impCreateNewCompany.jsp">ADD COMPANY</a>
                                </div>
                                </div>
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered zero-configuration">
                                        <thead>
                                            <tr>
                                                <th>Publish CompanyID</th>
                                                <th>Publish Company Name</th>                                         
                                            </tr>
                                        </thead>
                                        
                                        <tbody>
                                        <c:forEach items ="${listC}" var="c">
                                            <tr>
                                                <td>${c.companyID}</td>
                                                <td>${c.companyName}</td>
                                            </tr>
                                                </c:forEach>
                                        </tbody>                                        
                                    </table>

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
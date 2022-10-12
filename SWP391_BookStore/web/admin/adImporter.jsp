<%-- 
    Document   : adImporter
    Created on : Sep 26, 2022, 11:51:04 AM
    Author     : tramy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>THE5 BookStore</title>
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
                        <a href="adcustomer" aria-expanded="false">
                            <i class="fa fa-cart-plus menu-icon"></i><span class="nav-text">Customer Management</span>
                        </a>
                        
                    </li>
                    <li>
                        <a href="adseller" aria-expanded="false">
                            <i class="fa fa-user menu-icon"></i> <span class="nav-text">Seller Management</span>
                        </a>
                        
                    </li>
                    <li>
                        <a class="active" href="adimporter" aria-expanded="false">
                            <i class="fa fa-arrow-circle-right menu-icon"></i><span class="nav-text">Importer Management</span>
                        </a>
                        
                    </li>
                    <li>
                        <a href="blacklist" aria-expanded="false">
                            <i class="fa fa-minus-circle menu-icon"></i> <span class="nav-text">Blacklist Management</span>
                        </a>
                        
                    </li>
                    <li>
                        <a href="widgets.html" aria-expanded="false">
                            <i class="icon-envelope menu-icon"></i><span class="nav-text">Feedback Management</span>
                        </a>
                       
                    </li>
                    <li>
                        <a href="widgets.html" aria-expanded="false">
                            <i class="fa fa-money menu-icon"></i><span class="nav-text">Profit Management</span>
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

           

            <div class="container-fluid">
                <div class="row">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <span class="card-title">Importer Management</span>
                                <button style="margin-left: 600px" type="button" class="btn mb-1 btn-rounded btn-outline-warning"><a style="padding-left: 10px;padding-right: 10px"  class="fa fa-plus" href="addimpnav"></a></button>
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered zero-configuration">
                                        <thead>
                                            <tr>
                                                <th>AccountID</th>
                                                <th>Usermame</th>
                                                <th>Phone</th>
                                                <th>Email</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${listImp}" var="o">
                                            <tr>
                                                <td>${o.getAccID()}</td>
                                                <td>${o.getUsername()}</td>
                                                <td>${o.getPhone()}</td>
                                                <td>${o.getEmail()}</td>
                                                <td>
                                                    <a style="margin-left: 43px ;" href="addBlacklist?page=importer&id=${o.getAccID()}" class="fa fa-minus-circle"></a>
                                                </td>
                                            </tr>
                                            </c:forEach>
                                            
                                        </tbody>
                                        <tfoot>
                                            <tr>
                                                <th>AccountID</th>
                                                <th>Usermame</th>
                                                <th>Phone</th>
                                                <th>Email</th>
                                                <th>Action</th>                                            
                                            </tr>
                                        </tfoot>
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
<%@page import="java.sql.ResultSet"%>
<%@page import="com.bookstore.Utils.DBUtils"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <title>Display book</title>
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
        <!-- Custom Stylesheet -->
        <link href="./plugins/tables/css/datatable/dataTables.bootstrap4.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

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

            <!--**********************************
                Nav header start
            ***********************************-->
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

                    
                    <div class="header-right">
                        <ul class="clearfix">
                            
                            
                            
                            <li class="icons dropdown">
                                <div class="user-img c-pointer position-relative"   data-toggle="dropdown">
                                    <span class="activity active"></span>
                                    <img src="images/user/1.png" height="40" width="40" alt="">
                                </div>
                                <div class="drop-down dropdown-profile   dropdown-menu">
                                    <div class="dropdown-content-body">
                                        <ul>
                                            <li>
                                                <a href="app-profile.html"><i class="icon-user"></i> <span>Profile</span></a>
                                            </li>
                                            <li>
                                                <a href="email-inbox.html"><i class="icon-envelope-open"></i> <span>Inbox</span> <div class="badge gradient-3 badge-pill badge-primary">3</div></a>
                                            </li>

                                            <hr class="my-2">
                                            <li>
                                                <a href="page-lock.html"><i class="icon-lock"></i> <span>Lock Screen</span></a>
                                            </li>
                                            <li><a href="page-login.html"><i class="icon-key"></i> <span>Logout</span></a></li>
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
                    </li>
                    </ul>
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
                            <li class="breadcrumb-item"><a href="javascript:void(0)">Dashboard</a></li>
                            <li class="breadcrumb-item active"><a href="javascript:void(0)">Home</a></li>
                        </ol>
                    </div>
                </div>
                <!-- row -->

                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Data Table</h4>
                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered zero-configuration">
                                            <thead>
                                                <tr>
                                                    <th>Book Code</th>
                                                    <th>Book Name</th>
                                                    <th>Image</th>
                                                    <th>Author</th>
                                                    <th>Publish Company</th>
                                                    <th>Quantity</th>
                                                    <th>Description</th>
                                                    <th>Imported Price</th>
                                                    <th>Sale Price</th>
                                                    <th>Post Status</th>
                                                    <th>Action</th>
                                                </tr>
                                            </thead>
                                            <c:forEach items="${listB}" var="b">
                                                <tbody>
                                                    <tr>
                                                        <td>${b.bookCode}</td>
                                                        <td>${b.bookName}</td>
                                                        <td><img class="card-img-top" src="${b.image}" alt="Card image cap"></td>
                                                        <td>
                                                            ${b.author}
                                                        </td>
                                                        <td>${b.companyName}</td>
                                                        <td>${b.qty}</td>
                                                        <td>

                                                            ${fn:substring(b.description, 0, 20 )}... </br>
                                                            
                                                             <input type="button" id="btn1-${b.bookCode}" value="Hide"/>
                                                             <input type="button" id="btn2-${b.bookCode}" value="Show All"/>
                                                             <div id="b-${b.bookCode}" style="border: solid 1px; padding: 20px; background: #ddd;">
                                                                 ${b.description}
                                                                    <script>
                                                                     document.getElementById("b-${b.bookCode}").style.display = 'none';
                                                                   </script>
                                                             <br/>
                                                             
                                                             <script language="javascript">
                                                                 document.getElementById("btn1-${b.bookCode}").onclick = function () {
                                                                     document.getElementById("b-${b.bookCode}").style.display = 'none';
                                                                 };

                                                                document.getElementById("btn2-${b.bookCode}").onclick = function () {
                                                                    document.getElementById("b-${b.bookCode}").style.display = 'block';
                                                                };
                                                            </script> 
                                                            </div> 
                                                        </td>
                                                        <td>${b.importPrice}</td>
                                                        <td>${b.buyPrice}</td>
                                                        <td>
                                                            <c:if test="${b.postName == 'posted'}">
                                                                <span class="badge badge-success px-2">Posted</span>
                                                            </c:if>
                                                            <c:if test="${b.postName == 'new'}">
                                                                <span class="badge badge-danger px-2">New</span>
                                                            </c:if>
                                                        </td>
                                                        <td>
                                                            <a style="margin-left: 43px ;" href="" class="fa fa-minus-circle"></a>

                                                        </td>
                                                        
                                                       
                                                    </tr>
                                                </tbody>
                                                
                                            </c:forEach>
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
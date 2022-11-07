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
        <link rel="icon" type="image/png" sizes="16x16" href="../admin/images/favicon.png">
        <!-- Custom Stylesheet -->
        <link href="../admin/plugins/tables/css/datatable/dataTables.bootstrap4.min.css" rel="stylesheet">
        <link href="../admin/css/style.css" rel="stylesheet">

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

            <jsp:include page="imHeader.jsp"></jsp:include>
                <!--**********************************
                    Sidebar start
                ***********************************-->
                <div class="nk-sidebar">           
                    <div class="nk-nav-scroll">
                        <ul class="metismenu" id="menu">
                            <li class="nav-label" style="background-color: #c96;">Hello Importer ${acc.getUsername()}</li>
                        <li>
                            <a class="active" href="#" aria-expanded="false">
                                <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dashboard</span>
                            </a>

                        </li>
                        <li >
                        <a href="pcompany" aria-expanded="false">
                            <i class="icon-list"></i><span class="nav-text">Publish Company Management</span>
                        </a>
                        
                    </li>
                    <li >
                        <a href="" aria-expanded="false">
                            <i class="icon-list"></i><span class="nav-text">Receipt Management</span>
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
                            <li class="breadcrumb-item">Home</li>
                            <li class="breadcrumb-item active">Publish Company Management</li>
                        </ol>
                    </div>
                </div>


                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-body">
                                    <span class="card-title">Publish Company Management</span>
                                    <br>
                                    <c:if test='${check!=null}'>
                                        <div class="alert alert-success">${check}</div>
                                    </c:if>
                                    
                                    <a href="imCreatCom" style="margin-top: 10px"><button  class="btn btn-outline-dark" >Add New Company</button></a>
                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered zero-configuration">
                                            <thead>
                                                <tr>
                                                    <th>CompanyID</th>
                                                    <th>Company Name</th>     
                                                    <th>Company Address</th>
                                                    <th>Company Phone</th>
                                                    <th>Company Email</th>
                                                    <th>Action</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items ="${listC}" var="c">
                                                    <tr>
                                                        <td>${c.companyID}</td>
                                                        <td>${c.companyName}</td>
                                                        <td>${c.comAddress}</td>
                                                        <td>${c.phone}</td>
                                                        <td>${c.comEmail}</td>
                                                        <td>
                                                            <c:if test="${c.title == 0}">
                                                                <a onclick='showMess(${c.companyID})' ><i class="icon-close menu-icon"></i></a>
                                                            </c:if>
                                                                <a href="editCompNav?companyID=${c.companyID}""><i class="icon-pencil menu-icon"></i></a>
                                                                
                                                        </td>
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
                Footer start
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
        <script src="../admin/plugins/common/common.min.js"></script>
        <script src="../admin/js/custom.min.js"></script>
        <script src="../admin/js/settings.js"></script>
        <script src="../admin/js/gleek.js"></script>
        <script src="../admin/js/styleSwitcher.js"></script>

        <script src="../admin/plugins/tables/js/jquery.dataTables.min.js"></script>
        <script src="../admin/plugins/tables/js/datatable/dataTables.bootstrap4.min.js"></script>
        <script src="../admin/plugins/tables/js/datatable-init/datatable-basic.min.js"></script>
        <script>
                                                                $(document).ready(function () {
                                                                    // Activate tooltip
                                                                    $('[data-toggle="tooltip"]').tooltip();

                                                                    // Select/Deselect checkboxes
                                                                    var checkbox = $('table tbody input[type="checkbox"]');
                                                                    $("#selectAll").click(function () {
                                                                        if (this.checked) {
                                                                            checkbox.each(function () {
                                                                                this.checked = true;
                                                                            });
                                                                        } else {
                                                                            checkbox.each(function () {
                                                                                this.checked = false;
                                                                            });
                                                                        }
                                                                    });
                                                                    checkbox.click(function () {
                                                                        if (!this.checked) {
                                                                            $("#selectAll").prop("checked", false);
                                                                        }
                                                                    });
                                                                });

                                                                function showMess(id) {
                                                                    var option = confirm("Are you sure to remove the publish company have id = " + id + " to BlackList ?");
                                                                    if (option === true) {
                                                                        window.location.href = "removeComp?companyID=" + id;
                                                                    }
                                                                }
        </script>

    </body>

</html>

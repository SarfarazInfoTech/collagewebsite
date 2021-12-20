<%-- 
    Document   : TeachersAll
    Created on : 3 Oct, 2021, 1:24:33 PM
    Author     : HP
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="com.webapp.modal.TeachersModal"%>
<%@page import="com.webapp.controller.TeachersController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Teachers Table</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.11.1/css/dataTables.bootstrap4.min.css">

    </head>

    <body>

        <div class="container-fluid">
            <div class="text-dark bg-info bg-opacity-10"> 

                <h1>Data Teachers</h1>

                <%
                    TeachersController tc = new TeachersController();
                    ArrayList<TeachersModal> teacher = tc.selectAll();

                %>
                <table id="example" class="table table-striped table-bordered text-white" style="width:100%">
                    <thead>
                        <tr>
                            <th>Sr No.</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Phone</th>
                            <th>Salary</th>
                            <th>Subject</th>
                            <th>Class</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>

                        <% for (TeachersModal teach : teacher) {


                        %>
                        <tr>


                            <td> <%= teach.getE_d()%> </td>
                            <td> <%= teach.getName()%> </td>
                            <td> <%= teach.getEmail()%> </td>
                            <td> <%= teach.getPhone()%> </td>
                            <td> <%= teach.getSalary()%> </td>
                            <td> <%= teach.getSubject_t()%> </td>
                            <td> <%= teach.getClass_t()%> </td>
                            <td> 
                                <a href="#" class="btn btn-primary"> View </a>
                                <a href="#" class="btn btn-success"> Update </a>
                                <a href="#" class="btn btn-danger"> Delete </a>
                            </td>


                        </tr>

                        <%  } %>
                    </tbody>


                </table>
            </div>
        </div>


        <!-- javasprit -->
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.11.1/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.11.1/js/dataTables.bootstrap4.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>
        <h2>${param.msg}</h2>
    </body>

</html>
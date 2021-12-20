<%-- 
    Document   : StudentAll
    Created on : 30 Sep, 2021, 1:28:50 PM
    Author     : HP
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.webapp.modal.StudentModal"%>
<%@page import="com.webapp.controller.StudentController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Show Student</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.11.1/css/dataTables.bootstrap4.min.css">

    </head>

    <body>

        <div class="container-fluid">
            <div class="text-dark bg-info bg-opacity-10"> 

                <h1>Student Data Table</h1>

                <%
                    StudentController sc = new StudentController();
                    ArrayList<StudentModal> student = sc.selectAll();


                %>
                <table id="example" class="table table-striped table-bordered text-white" style="width:100%">
                    <thead>
                        <tr>
                            <th>Sr No.</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Phone</th>
                            <th>Branch</th>
                            <th>Address</th>
                            <th>City</th>
                            <th>State</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>

                        <% for (StudentModal stud : student) 
                        {

                            
                        %>
                        <tr>
                            
                            
                            <td> <%= stud.getId() %> </td>
                            <td> <%= stud.getName()%> </td>
                            <td> <%= stud.getEmail()%> </td>
                            <td> <%= stud.getPhone()%> </td>
                            <td> <%= stud.getBranch()%> </td>
                            <td> <%= stud.getAddress()%> </td>
                            <td> <%= stud.getCity()%> </td>
                            <td> <%= stud.getState()%> </td>
                            <td> 
                                <a href="studentDetails.jsp?id=<%= stud.getId() %>" class="btn btn-primary"> View </a>
                                <a href="updateStudent.jsp?id=<%= stud.getId() %>" class="btn btn-success"> Update </a>
                                <a href="StudentController?action=delete&id=<%= stud.getId() %>" class="btn btn-danger"> Delete </a>
                  
                            </td>
                            
                            
                        </tr>
                        
                        <%  }  %>
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
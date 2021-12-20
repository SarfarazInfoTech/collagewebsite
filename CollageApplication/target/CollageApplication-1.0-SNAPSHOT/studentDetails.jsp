<%-- 
    Document   : studentDetails
    Created on : 5 Oct, 2021, 2:15:36 PM
    Author     : HP
--%>

<%@page import="com.webapp.modal.StudentModal"%>
<%@page import="com.webapp.controller.StudentController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details</title>
    </head>
    <body>
        <% 
            StudentController sc = new StudentController();
            StudentModal sm = sc.selectById(Integer.parseInt(request.getParameter("id")));   //id selrct
            
            
        %>
        
        <table>
            <tr>
                <td>id </td>
                <td> <%=  sm.getId() %> </td>
            </tr>
            <tr>
                <td>Name </td>
                <td> <%=  sm.getName() %> </td>
            </tr>
            <tr>
                <td>Email </td>
                <td> <%=  sm.getEmail()%> </td>
            </tr>
            <tr>
                <td>Phone </td>
                <td> <%=  sm.getPhone()%> </td>
            </tr>
            <tr>
                <td>Branch </td>
                <td> <%=  sm.getBranch()%> </td>
            </tr>
            <tr>
                <td>Address </td>
                <td> <%=  sm.getAddress()%> </td>
            </tr>
            <tr>
                <td>City </td>
                <td> <%=  sm.getCity()%> </td>
            </tr>
            <tr>
                <td>State </td>
                <td> <%=  sm.getState()%> </td>
            </tr>
            <tr>
                <td>Created </td>
                <td> <%=  sm.getCreatedAt()%> </td>
            </tr>
            <tr>
                <td>Modified </td>
                <td> <%=  sm.getModifiedAt()%> </td>
            </tr>
        </table>
        
        
        
        
        
        
    </body>
</html>

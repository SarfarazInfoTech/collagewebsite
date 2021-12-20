package com.webapp.controller;

import com.webapp.modal.StudentModal;
import com.webapp.services.StudentServices;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentController", urlPatterns = {"/StudentController"})
public class StudentController extends HttpServlet {

    String message = null;
    StudentServices ss = new StudentServices();
    StudentModal sm = new StudentModal();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action) {
            case "insert":
                // code for insert data
                insertStudent(request, response);
                break;
            case "update":
                // code for update data
                updateStudent(request, response);
                break;
            case "delete":
                // code for Delete record
                deleteStudent(request, response);
                break;
            case "login":
                // code for Login
                loginStudent(request, response);
                break;
            
            default:
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // create obj of studmodal for usind setters methods
       
        sm.setName(request.getParameter("name"));
        sm.setEmail(request.getParameter("email"));
        sm.setPhone(request.getParameter("phone"));
        sm.setBranch(request.getParameter("branch"));
        sm.setAddress(request.getParameter("address"));
        sm.setCity(request.getParameter("city"));
        sm.setState(request.getParameter("state"));
        
        message = ss.insertStudent(sm);


        response.sendRedirect("StudentAll.jsp?msg=" + message);
    }

    // Select Method to show all record
    public ArrayList<StudentModal> selectAll(){
        
        return ss.selectAll();
    }
    
    
    
    //Show only one record by id
    
    public StudentModal selectById(int id){
            
        return ss.selectById(id);
        
        
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        sm.setName(request.getParameter("name"));
        sm.setEmail(request.getParameter("email"));
        sm.setPhone(request.getParameter("phone"));
        sm.setBranch(request.getParameter("branch"));
        sm.setAddress(request.getParameter("address"));
        sm.setCity(request.getParameter("city"));
        sm.setState(request.getParameter("state"));
        sm.setId(Integer.parseInt(request.getParameter("id")));
        
        message = ss.updateStudent(sm);


        response.sendRedirect("StudentAll.jsp?msg=" + message);
        
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        int id = Integer.parseInt( request.getParameter("id"));
        
        message = ss.deleteStudent(id);
        
        response.sendRedirect("StudentAll.jsp?msg=" + message);
    }

    private void loginStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        String phone = request.getParameter("phone");
        String pass = request.getParameter("pass");
        int status = ss.doLogin(phone, pass);
        
        if(status == 1){
            response.sendRedirect("home.jsp?msg=login successful");
        }else {
            response.sendRedirect("index.jsp?msg=Invalid User ! ");
        }
    }

  
}

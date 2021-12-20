package com.webapp.controller;

import com.webapp.modal.TeachersModal;
import com.webapp.services.TeachersServices;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TeachersController", urlPatterns = {"/TeachersController"})
public class TeachersController extends HttpServlet {

    String message = null;
    TeachersServices ts = new TeachersServices();
    TeachersModal tm = new TeachersModal();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String action = request.getParameter("action");

        switch (action) {
            case "insert":
                // code for insert data
                insertTeachers(request, response);
                break;
            case "update":
                // code for update data
                break;
            case "delete":
                // code for Delete record
                break;
            default:
                break;
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private void insertTeachers(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {

        // create obj of teachmodal for usind setters methods
        tm.setName(request.getParameter("name"));
        tm.setEmail(request.getParameter("email"));
        tm.setPhone(request.getParameter("phone"));
        tm.setSalary(request.getParameter("salary"));
        tm.setSubject_t(request.getParameter("subject_t"));
        tm.setClass_t(request.getParameter("class_t"));

        message = ts.insertTeachers(tm);

        response.sendRedirect("TeachersAll.jsp?msg=" + message);
    }

    // Select Method to show all record
    public ArrayList<TeachersModal> selectAll() {

        return ts.selectAll();
    }

    // Show only record by id
    public TeachersModal selectById(int id) {

        return ts.selectById(id);

    }
}

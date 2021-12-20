package com.webapp.services;
import com.webapp.dao.StudentDao;
import com.webapp.modal.StudentModal;
import java.util.ArrayList;

public class StudentServices {

    StudentDao sd = new StudentDao();

    public String insertStudent(StudentModal sm) {
        return sd.insertStudent(sm);
    }

    public ArrayList<StudentModal> selectAll() {
        return sd.selectAll();
    }

    public StudentModal selectById(int id) {
        return sd.selectById(id);
    }

    public String updateStudent(StudentModal sm) {
        return sd.updateStudent(sm);
    }

    public String deleteStudent(int id) {
        return sd.deleteStudent(id);
    }

    public int doLogin(String phone, String pass) {
        return sd.doLogin(phone, pass);
    }

}
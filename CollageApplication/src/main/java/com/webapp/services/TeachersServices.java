package com.webapp.services;
import com.webapp.dao.TeachersDao;
import com.webapp.modal.TeachersModal;
import java.util.ArrayList;

public class TeachersServices {
    
    TeachersDao td = new TeachersDao();
    
    public String insertTeachers (TeachersModal tm) {
        return td.insertTeachers(tm);  
    }

    public ArrayList<TeachersModal> selectAll() {
        return td.selectAll();
    }
    
    public TeachersModal selectById(int id){
        return td.selectById(id);
    }

}
package com.webapp.dao;

import com.webapp.database.DataBase;
import com.webapp.modal.StudentModal;
import com.webapp.modal.TeachersModal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TeachersDao {

    String sql = null;
    CallableStatement cs = null;
    ResultSet rs = null;
    String message = null;

    public String insertTeachers(TeachersModal tm) {

        Connection con = DataBase.connectDb();

        try {
            sql = "insert into student (name, email, phone, salary, subject_t, class_t) values(?,?,?,?,?,?)";
            cs = con.prepareCall(sql);  // prepare call for execute insert query
            cs.setString(1, tm.getName());
            cs.setString(2, tm.getEmail());
            cs.setString(3, tm.getPhone());
            cs.setString(4, tm.getSalary());
            cs.setString(5, tm.getSubject_t());
            cs.setString(6, tm.getClass_t());

            int rows = cs.executeUpdate(); // for check reco is inser or not

            if (rows >= 1) {
                message = "record insert successfull";
            }
        } catch (SQLException e) {
            message = "unable to insert bcoz of :" + e.getMessage();
        } finally {

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                message = e.getMessage();
            }

            return message;
        }

    }

    public ArrayList<TeachersModal> selectAll() {
        ArrayList<TeachersModal> teacher = new ArrayList<>();
        Connection con = DataBase.connectDb();

        try {
            sql = "select * from teachers";
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {
                teacher.add(
                        new TeachersModal(
                                rs.getInt("e_d"),
                                rs.getString("name"),
                                rs.getString("email"),
                                rs.getString("phone"),
                                rs.getString("salary"),
                                rs.getString("subject_teacher"),
                                rs.getString("class_teacher"),
                                rs.getString("created_at"),
                                rs.getString("modifed_at")
                        ));

            }

        } catch (SQLException e) {
            System.out.println("error : " + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }

            }

        }
        return teacher;

    }

    public TeachersModal selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

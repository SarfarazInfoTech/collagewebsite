package com.webapp.dao;

import com.webapp.database.DataBase;
import com.webapp.modal.StudentModal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {

    String sql = null;
    CallableStatement cs = null;
    ResultSet rs = null;
    String message = null;

    public String insertStudent(StudentModal sm) {

        Connection con = DataBase.connectDb();

        try {
            sql = "insert into student (name, email, phone, branch, address, city, state) values(?,?,?,?,?,?,?)";
            cs = con.prepareCall(sql);  // prepare call for execute insert query
            cs.setString(1, sm.getName());
            cs.setString(2, sm.getEmail());
            cs.setString(3, sm.getPhone());
            cs.setString(4, sm.getBranch());
            cs.setString(5, sm.getAddress());
            cs.setString(6, sm.getCity());
            cs.setString(7, sm.getState());

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

    public ArrayList<StudentModal> selectAll() {
        ArrayList<StudentModal> student = new ArrayList<>();
        Connection con = DataBase.connectDb();

        try {
            sql = "select * from student";
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {
                student.add(
                        new StudentModal(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("email"),
                                rs.getString("phone"),
                                rs.getString("branch"),
                                rs.getString("address"),
                                rs.getString("city"),
                                rs.getString("state"),
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
        return student;

    }

    // method for show only one record by id 
    public StudentModal selectById(int id) {

        Connection con = DataBase.connectDb();
        StudentModal sm = null;
        try {
            sql = "select * from student where id = " + id;
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {

                sm = new StudentModal(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("branch"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("state"),
                        rs.getString("created_at"),
                        rs.getString("modifed_at"));

            }

        } catch (SQLException e) {
            System.out.println("com.webapp.dao.StudentDao.selectById()" + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {

                }
            }

        }
        return sm;
    }

    public String updateStudent(StudentModal sm) {
        
        Connection con = DataBase.connectDb();
        try { 
            sql = "update Student set name = ?, email = ?, phone = ?, branch = ?, address = ?, city = ?, state = ? where id = ? ";
            cs = con.prepareCall(sql);
            cs.setString(1, sm.getName());
            cs.setString(2, sm.getEmail());
            cs.setString(3, sm.getPhone());
            cs.setString(4, sm.getBranch());
            cs.setString(5, sm.getAddress());
            cs.setString(6, sm.getCity());
            cs.setString(7, sm.getState());
            cs.setInt(8, sm.getId());
            
            int rows = cs.executeUpdate();
            if (rows >= 1){
                message = "update Succesfull";
            }
            
        } catch (SQLException e){
            message = "unable to update becoz of this : " +e.getMessage();
            
        } finally{
            if (con != null){
                try {
                    con.close();
                } catch (SQLException ex) {
                    
                }
            }
            
        }
        return message;
    }

    public String deleteStudent(int id) {
        Connection con = DataBase.connectDb();
        
        try {
            sql = "delete from student where id = " +id;
            cs = con.prepareCall(sql);
            
            int rows = cs.executeUpdate();
            
            if (rows >= 1){
                
                message = "student delete success";
            }
            
        } catch (Exception e) {
            message = "unable to update becoz of this resion : "+e.getMessage();
            
        }finally{
            if (con != null){
                try {
                    con.close();
                } catch (Exception e) {
                }
            }
        }
        return message;

    }

    public int doLogin(String phone, String pass) {
        
        Connection con = DataBase.connectDb();
        int status = 0 ;
        try {
            sql = "select * from admin where phone = " + phone + " AND password = " +pass ;
            cs = con.prepareCall(sql);
            rs = cs.executeQuery();
            
           if(rs != null){
           status = 1 ;
              }
           
        } catch (SQLException e) {
            System.out.println("com.webapp.dao.StudentDao.doLogin()" +e.getMessage());
        }finally{
            if(con != null){
                try {
                    con.close();
                } catch (SQLException ex) {
                }
            }
        }
        return status;
    
    }

}

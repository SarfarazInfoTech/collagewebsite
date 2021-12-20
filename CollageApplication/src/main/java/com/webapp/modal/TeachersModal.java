
package com.webapp.modal;


public class TeachersModal {
    private int e_d;
    private String name;
    private String email;
    private String phone;
    private String salary;
    private String subject_t;
    private String class_t;
    private String createdAt;
    private String modifiedAt;

    public TeachersModal() {
    }

    public TeachersModal(int e_d, String name, String email, String phone, String salary, String subject_t, String class_t, String createdAt, String modifiedAt) {
        this.e_d = e_d;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.subject_t = subject_t;
        this.class_t = class_t;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }


    public int getE_d() {
        return e_d;
    }

    public void setE_d(int e_d) {
        this.e_d = e_d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSubject_t() {
        return subject_t;
    }

    public void setSubject_t(String subject_t) {
        this.subject_t = subject_t;
    }

    public String getClass_t() {
        return class_t;
    }

    public void setClass_t(String class_t) {
        this.class_t = class_t;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
    
}

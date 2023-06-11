package com.ajal.tech.model;

public class StudentModel {
    Long idStudent = null;
    String names = null;
    String lastName = null;
    String secondLastName = null;
    Boolean isActive = null;

    public StudentModel(Long id, String names, String lastName, String secondLastName, Boolean isActive) {
        this.idStudent = id;
        this.names = names;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.isActive = isActive;
    }

    public StudentModel() {
    }


    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}

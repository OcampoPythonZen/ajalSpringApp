package com.ajal.tech.model;

public class SubjectModel {
    Long id = null;
    String name = null;
    Boolean isActive = null;

    public SubjectModel(Long id, String name, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
    }

    public SubjectModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}

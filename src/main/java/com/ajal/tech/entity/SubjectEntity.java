package com.ajal.tech.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "subject")
public class SubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_subject")
    private Long idSubject;

    private String name;

    @Column(name = "is_active")
    private Boolean isActive = true;

    @Column(name = "created_at")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = null;

    private Boolean deleted = false;

    public SubjectEntity() {
    }

    public SubjectEntity(Long idSubject, String name, Boolean isActive, LocalDateTime createdAt, LocalDateTime updatedAt, Boolean deleted) {
        this.idSubject = idSubject;
        this.name = name;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deleted = deleted;
    }

    public Long getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Long idSubject) {
        this.idSubject = idSubject;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}

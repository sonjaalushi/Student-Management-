package com.join.demo.entity;
import javax.persistence.*;
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer subject_id;
    private String subject_name;
    private Integer Credits;

    public Integer getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public Integer getCredits() {
        return Credits;
    }

    public void setCredits(Integer credits) {
        Credits = credits;
    }

    public Subject() {
    }
}

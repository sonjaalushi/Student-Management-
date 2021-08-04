package com.join.demo.entity;

import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "roll_number")
    private String rollNumber;

    @Column(name = "university")
    String university;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    Address address;

    @OneToMany(targetEntity = Subject.class, cascade = {CascadeType.DETACH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @ToString.Exclude
    @JoinColumn(name = "student_subject_foreignKey", referencedColumnName = "id")
    private List<Subject> subjects = new ArrayList<>();

    public Student(int id, String name, String rollNumber, String university, Address address, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.university = university;
        this.address = address;
        this.subjects = subjects;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public Optional<Student> setId(int id) {
        this.id = id;
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
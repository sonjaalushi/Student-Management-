package com.join.demo.entity;

import junitparams.JUnitParamsRunner;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testSetId() {
        Student student = new Student();
        student.setId(1);
        assertTrue(student.getId() == 1);
    }

    @Test
    public void testGetId() {
        Student student = new Student();
        student.setId(1);
        assertTrue(student.getId() == 1);
    }

    @Test
    public void testSetName() {
        Student student = new Student();
        student.setName("Sonja");
        assertTrue(student.getName() == "Sonja");
    }

    @Test
    public void testGetName() {
        Student student = new Student();
        student.setName("Sonja");
        assertTrue(student.getName() == "Sonja");
    }

    @Test
    public void testSetRollNumber() {
        Student student = new Student();
        student.setRollNumber("10");
        assertTrue(student.getRollNumber() == "10");
    }

    @Test
    public void testGetRollNumber() {
        Student student = new Student();
        student.setRollNumber("10");
        assertTrue(student.getRollNumber() == "10");
    }

    @Test
    public void testSetUniversity() {
        Student student = new Student();
        student.setUniversity("University of Technology");
        assertTrue(student.getUniversity() == "University of Technology");
    }

    @Test
    public void testGetUniversity() {
        Student student = new Student();
        student.setUniversity("University of Technology");
        assertTrue(student.getUniversity() == "University of Technology");
    }

    @Test
    public void testSetAddress() {
        Student student = new Student();
        student.setAddress(student.address);
        assertTrue(student.getAddress() == (student.address));
    }

    @Test
    public void testGetAddress() {
        Student student = new Student();
        student.setAddress(student.address);
        assertTrue(student.getAddress() == (student.address));
    }

    @Test
    public void constructor() {
        Student student = new Student(1, "Sonja", "123", "fshn", null, null);
        assertEquals(1, student.getId());
        assertEquals("Sonja", student.getName());
        assertEquals("fshn", student.getUniversity());
        assertEquals("123", student.getRollNumber());
        assertEquals(null, student.getAddress());

    }


}
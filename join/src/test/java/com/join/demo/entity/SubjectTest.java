package com.join.demo.entity;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
class SubjectTest {
    @Test
    public void testSetSubject_Id() {
        Subject subject = new Subject();
        subject.setSubject_id(1);
        assertTrue(subject.getSubject_id() == 1);
    }

    @Test
    public void testGetSubject_Id() {
        Subject subject = new Subject();
        subject.setSubject_id(1);
        assertTrue(subject.getSubject_id() == 1);
    }

    @Test
    public void testSetSubject_Name() {
        Subject subject = new Subject();
        subject.setSubject_name("math");
        assertTrue(subject.getSubject_name() == "math");
    }

    @Test
    public void testGetSubject_Name() {
        Subject subject = new Subject();
        subject.setSubject_name("math");
        assertTrue(subject.getSubject_name() == "math");
    }

    @Test
    public void testSetCredits() {
        Subject subject = new Subject();
        subject.setCredits(6);
        assertTrue(subject.getCredits() == 6);
    }


    @Test
    public void testGetCredits() {
        Subject subject = new Subject();
        subject.setCredits(6);
        assertTrue(subject.getCredits() == 6);
    }

    @Test
    public void testSubject() {
        Subject subject = new Subject();
        subject.setCredits(6);
        subject.setSubject_id(1);
        subject.setSubject_name("math");
        assertTrue(subject.getCredits() == 6);
        assertTrue(subject.getSubject_name() == "math");
        assertTrue(subject.getSubject_id() == 1);
    }


}
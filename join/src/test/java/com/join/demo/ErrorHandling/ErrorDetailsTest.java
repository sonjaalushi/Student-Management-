package com.join.demo.ErrorHandling;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ErrorDetailsTest {


    @Test
    public void testSetTimestamp() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setTimestamp(errorDetails.getTimestamp());
        assertTrue(errorDetails.getTimestamp() == errorDetails.getTimestamp());
    }

    @Test
    public void testGetTimestamp() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setTimestamp(errorDetails.getTimestamp());
        assertTrue(errorDetails.getTimestamp() == errorDetails.getTimestamp());
    }

    @Test
    public void testSetMessage() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Message");
        assertTrue(errorDetails.getMessage() == ("Message"));
    }

    @Test
    public void testGetMessage() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Message");
        assertTrue(errorDetails.getMessage() == ("Message"));
    }

    @Test
    public void testSetDetails() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setDetails("Test");
        assertTrue(errorDetails.getDetails() == ("Test"));
    }

    @Test
    public void testGetDetails() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setDetails("Test");
        assertTrue(errorDetails.getDetails() == ("Test"));
    }

}
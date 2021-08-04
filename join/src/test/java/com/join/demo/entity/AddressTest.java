package com.join.demo.entity;

import junitparams.JUnitParamsRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
class AddressTest {

    @Test
    public void testSetId() {
        Address address = new Address();
        address.setAddress_id(1);
        assertTrue(address.getAddress_id() == 1);
    }

    @Test
    public void testGetId() {
        Address address = new Address();
        address.setAddress_id(1);
        assertTrue(address.getAddress_id() == 1);
    }

    @Test
    public void testSetHouseNumber() {
        Address address = new Address();
        address.setHouseNumber("123");
        assertTrue(address.getHouseNumber() == "123");
    }

    @Test
    public void testGetHouseNumber() {
        Address address = new Address();
        address.setHouseNumber("123");
        assertTrue(address.getHouseNumber() == "123");
    }

    @Test
    public void testSetCity() {
        Address address = new Address();
        address.setCity("New Street");
        assertTrue(address.getCity() == "New Street");
    }


}
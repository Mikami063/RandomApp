package com.uottawa.randomapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilTest{
    @Test
    public void loginTestTrue(){
        assertTrue(Util.login("admin","pass"));
    }
    @Test
    public void loginTestFalse(){
        assertFalse(Util.login("user","oop"));
    }
    @Test
    public void loginTestNothing(){
        assertFalse(Util.login("",""));
    }
}
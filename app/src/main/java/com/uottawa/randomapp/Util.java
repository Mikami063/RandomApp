package com.uottawa.randomapp;

public class Util {
    public static boolean login(String ac,String pwd){
        if(ac.equals("admin")&&pwd.equals("pass")) {
            return true;
        }
        return false;
    }
}

package com.example.innovace.myoops.model;

/**
 * Created by innovace on 19/1/18.
 */

public class Data {
    private String fname,lname;
    int age ;

    public Data(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public void dataFuction(){
System.out.println("first name"+fname);
    }


}

package com.company.OOP_Test;

public class MyMainClass {

    public static void main(String[] args) {
        Saeugetier s1 = new Saeugetier();
        System.out.println(s1);

        Saeugetier s2 = new Saeugetier(36);
        System.out.println(s2);

        s1.setAge(-100);
        s1.setSize(2000);

        Saeugetier s3 = new Saeugetier(40,185);
        System.out.println(s3);
    }
}

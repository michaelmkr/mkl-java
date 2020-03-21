package com.company.Mensch;

public class Main {

    public static void main(String[] args) {
        Mensch p1 = new Mensch();
        System.out.println(p1);

        Mensch p2 = new Mensch(36);
        System.out.println(p2);

        p1.setAge(-100);
        p1.setSize(2000);

        Mensch p3 = new Mensch(40, 185);
        System.out.println(p3);
    }
}

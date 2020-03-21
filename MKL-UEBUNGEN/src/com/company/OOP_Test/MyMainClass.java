package com.company.OOP_Test;

public class MyMainClass {

    public static void main(String[] args) {
        Saeugetier s1 = new Saeugetier();
        System.out.println("Säugetier 1: " + s1);

        Saeugetier s2 = new Saeugetier(36);
        System.out.println("Säugetier 2: " + s2);

        s1.setAge(-100);
        s1.setSize(2000);
        System.out.println("Säugetier 1 neu: " + s1);

        Mensch m1 = new Mensch();

        m1.setLanguage("Deutsch");
        System.out.println("Mensch 1 neu: " + m1);


        // Instanzmethoden -> verändern "ID" für alle (Menschen, Säugetiere, ..)
        Saeugetier.setId(10);
        System.out.println("Mensch 1 nach neuem Setzen der ID: " + m1);
        System.out.println("Säugetier 1 nach neuem Setzen der ID: " + s1);
    }
}

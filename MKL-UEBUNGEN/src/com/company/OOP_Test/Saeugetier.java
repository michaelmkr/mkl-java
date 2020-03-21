package com.company.OOP_Test;

public class Saeugetier {

    private int age;
    private int size;

    // geben wir keinen Parameter an -> Age wired mit 0 angelegt
    Saeugetier() {
        //ruft den größten Konstruktor auf -> also OOP_Person(int age, int size) & überprüft
        this(0,0);
        // so wars vorher:
        // this.age = 0;
        // this.size = 0;
    }

    // geben wir einen Parameter an -> Age wird mit dem übergebenen Wert angelegt und Size mit 0
    Saeugetier(int age) {
        this.setAge(age);
    }

    // geben wir zwei Parameter an -> Age & Size werden mit dem übergebenen Wert angelegt
    Saeugetier(int age, int size) {
        this.setAge(age);
        this.setSize(size);
    }

    public int getAge() {
        return age;
    }

    //    Age darf nicht kleiner 0 und nicht größer 130 sein
    public void setAge(int age) {
        // Statische Variablen zuerst schreiben, damit man keine Fehler bekommt
        if (0 > age) {
            this.age = 0;
        } else if (130 < age) {
            this.age = 130;
        } else {
            this.age = age;
        }
    }

    public int getSize() {
        return size;
    }

    // Size darf nicht kleiner 0 und nicht größer 250 sein
    public void setSize(int size) {
        if (0 > size) {
            this.size = 0;
        } else if (250 < size) {
            this.size = 250;
        } else {
            this.size = size;
        }
    }

    // POLYMORPHIE
    // Wenn dieselbe Methode in verschiedenen Klassen verschiedene Dinge macht
    @Override
    // ToString gibt uns normal nur die ID aus
    // so geben wir Age & Size aus wenn wir die Person mit println ausgeben
    public String toString() {
        return "Age: " + age + " | Size: " + size;
    }

}

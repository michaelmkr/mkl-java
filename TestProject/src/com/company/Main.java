package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("MASTERKLASSE - SEMESTER 2 - JAVA MIT MARKUS");

// ------DATENTYPEN--------------------------------------------------------------------------------------------------------------------------------
/*
        char c = 'a';
        System.out.println(c);

        short s = Short.MAX_VALUE;
        System.out.println(s);

        int i = 100;
        System.out.println(i);

        // TYPECAST
        long l = ((long) (Integer.MAX_VALUE)) + 1;
        System.out.println(l);

        // Markus will unbedingt L bei Long und das F bei Float sehen
        long ll = 100L;
        System.out.println(ll);

        // Markus will unbedingt das F bei Float und L bei Long sehen
        float f = 1.3F; // oder 2.0F; 3F; 4f; 5.F, 6.f
        System.out.println(f);

        double d = 3.14;
        System.out.println(d);
*/

// ------ARRAYS--------------------------------------------------------------------------------------------------------------------------------

        // Deklariert ein Array von Integern mit einer Größe von 10 -> also können in diesem Array 10 Werte gespeichert werden
        int[] myInt1;
        int size = 10;
        myInt1 = new int[size];

        // Ist genau die selbe Deklaration die die 3 Zeilen von myInt1 nur in Kurzform
        int[] myInt2 = new int[10];

        // Deklariert wieder ein Array mit der size=10 ABER das Array wird gleich mit 10 konkreten werden befüllt (nämlich 0 bis 9)
        int[] myInt3 = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(myInt3));


// ------SCHLEIFEN--------------------------------------------------------------------------------------------------------------------------------
        //FOR SCHLEIFE
        // int i = 0;           -->   i ist die Laufvariable, die jeden Durchlauf der Schleife zählt
        // i < myInt3.length;   -->   solange i kleiner ist als die Länge unseres Arrays soll der Wert des Arrays ausgegeben werden
        // i++                  -->   i++ zählt NACH dem Schleifendurchlauf die Laufvariable um eins hoch
        for(int i = 0; i < myInt3.length; i++){
            // Hier kommt was in jedem Schleifendurchgang passieren soll
            System.out.println(myInt3[i]); // Der Wert des Arrays an der Stelle i soll hier ausgegeben werden
        }

        // Für jeden Wert in myInt3 soll i mit dem Wert von myInt3 (also myInt3[i]) multipliziert werden und in myIntNew an der Stelle i gespeichert werden
        int[] myIntNew = new int[myInt3.length];
        for(int i = 0; i < myInt3.length; i++){
            myIntNew[i] = i * myInt3[i];
            // Erklärung was das Array macht, gibt die Konsole aus
            System.out.println("\nSchleifendurchlauf Nummer: " + (i+1) + " -> das heißt i=" + i + "\nDas neue Array hat an der Stelle " + i + " den Wert " + myIntNew[i] + " weil i ist " + i + " und der Wert von myInt3 ist " + myInt3[i] + " und i mal dem Wert von myInt3 also " + i + "*" + myInt3[i] + "=" + myIntNew[i] + " ist gleich " + myIntNew[i]);
        }
    }

}

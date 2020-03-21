package com.company;

public class Varargs {

    public static void main(String... args) {
        int a = 3;
        int b = 5;
        int c = 7;

        fooVarArgs(a,b,c); // INTEGER-Variante -> hier muss etwas drinnen stehen damit es funktioniert
        fooArrayArgs(new int[]{a,b,c}); // ARRAY-Variante -> hier muss etwas drinnen stehen damit es funktioniert
        fooVarArgs(1.0,2.0,3.0); // DOUBLE-Variante -> hier muss etwas drinnen stehen damit es funktioniert
    }



    public static void fooVarArgs(int... x) {
        System.out.println("fooVarArgs: Anzahl der Argumente: " + x.length);
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            // int i = 0;              i < x.length;                                                                i++;
            // i ist die Laufvariable; solange i kleiner als die Länge von x ist summieren wir x auf die Summe auf; und zählen i eins hoch
            sum += x[i];
        }
        System.out.println("fooVarArgs: Summe der Argumente: " + sum);
    }



    public static void fooArrayArgs(int[] x) {
        System.out.println("fooArrayArgs: Anzahl der Argumente: " + x.length);
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            // int i = 0;              i < x.length;                                                                i++;
            // i ist die Laufvariable; solange i kleiner als die Länge von x ist summieren wir x auf die Summe auf; und zählen i eins hoch
            sum += x[i];
        }
        System.out.println("fooArrayArgs: Summe der Argumente: " + sum);
    }



    public static void fooVarArgs(double... x) {
        System.out.println("fooVarArgs: Anzahl der Argumente: " + x.length);
        int sum = 1;
        for (int i = 0; i < x.length; i++) {
            // int i = 0;              i < x.length;                                                                i++;
            // i ist die Laufvariable; solange i kleiner als die Länge von x ist summieren wir x auf die Summe auf; und zählen i eins hoch
            sum *= x[i];
        }
        System.out.println("fooVarArgs: Produkt der Argumente: " + sum);
    }

}

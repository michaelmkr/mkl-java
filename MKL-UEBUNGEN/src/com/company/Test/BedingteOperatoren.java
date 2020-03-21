package com.company.Test;

/**
 * @author MichaelMkr
 * created on 21.03.2020
 * package: com.company.OOP_Test
 */

public class BedingteOperatoren {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a <= b) {
            System.out.println("a ist kleiner gleich b");
        } else {
            System.out.println("b ist kleiner als a");
        }

        // inline if -> funktioniert 1:1 gleich wie das oben
        //             wenn a<=b    dann "a ist kleiner..."   sonst "b ist kleiner..."
        System.out.println((a <= b) ? "a ist kleiner gleich b" : "b ist kleiner als a");
        //                  WENN            DANN                       SONST

//-------------------------------------------------------------------------------------------------

        int c = 10;
        int d = 10;

        if (c < d) {
            System.out.println("c ist kleiner d");
        } else if (c == d) {
            System.out.println("c ist gleich d");
        } else {
            System.out.println("c ist größer d");
        }

        // inline if -> funktioniert 1:1 gleich wie das oben
        //             wenn a<=b    dann "a ist kleiner..."   sonst "b ist kleiner..."
        System.out.println((c < d) ? "c ist kleiner d" : (c == d) ? "c ist gleich d" : "c ist größer d");

//-------------------------------------------------------------------------------------------------

        byte e = 10;
        short s = 20;
        e = (byte)s;   // Typecast von short zu byte -> also der short s wird zu einem byte gecastet

        int t = 100;
        t = s; // t = (int)s; geht genauso
        // bei einem Upcast muss man den cast nicht dazuschreiben, Markus empfiehlt es aber, damit es klarer bleibt wo Datentypen geändert werden






    }
}

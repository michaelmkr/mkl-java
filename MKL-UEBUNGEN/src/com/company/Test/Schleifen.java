package com.company.Test;

/**
 * @author MichaelMkr
 * created on 21.03.2020
 * package: com.company.OOP_Test
 */

public class Schleifen {
    public static void main(String[] args) {

        // WHILE die zuerst hochzählt und dann ausführt
        System.out.println("\nWHILE die zuerst hochzählt und dann ausführt");
        {
            int i = 0;
            while (i < 2) {
                i++; // i = 1
                System.out.println("i ist: " + i); // -> i ist: 1
            }
        }


        // WHILE die zuerst ausführt und dann hochzält
        // funktioniert genau so wie eine FOR Schleife
        System.out.println("\nWHILE die zuerst ausführt und dann hochzält");
        {
            int i = 0;
            while (i < 2) {
                System.out.println("i ist: " + i); // -> i ist: 0
                i++; // i=1
            }
        }


        // FOR
        // funktioniert genau wie die WHILE Schleife oberhalb
        System.out.println("\nFOR");
        {
            for (int i = 0; i < 2; i++) {
                System.out.println("i ist: " + i);
            }
        }


        // DO WHILE
        System.out.println("\nDO WHILE");
        {
            int i = 0;
            // läuft auch wenn i=0 mindestens einmal durch, weil die Condition erst NACH dem Ausführen überprüft wird
            do {
                System.out.println("i ist: " + i);
            } while (i < 0);
        }


        // FOR mit mehreren Variablen
        System.out.println("\nFOR mit mehreren Variablen");
        {
            int i;
            int j;
            for (i = 3, j = 4; i < j; j -= 1) {
                System.out.println("i ist: " + i);
            }
        }

        // FOREACH = ENHANCED FOR
        System.out.println("\nFOREACH");
        {
            int[] a = {1, 2, 3, 4, 5};
            for (int value : a) {
                System.out.println(value);
            }
        }

        // FOR mit break
        {
            System.out.println("\nFOR mit continue");
            for (int i = 0; i < 3; i++) {
                if (i == 1)
                    continue;
                System.out.println("i ist: " + i);
            }

            System.out.println("\nFOR mit break");
            for (int i = 0; i < 3; i++) {
                if (i == 1)
                    break;
                System.out.println("i ist: " + i);
            }

        }

    }
}

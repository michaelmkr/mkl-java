package com.company;

public class Switch {

    public static void main(String[] args) {

        int a = 3;

        if (0 == a) { //Yoda Annotation -> O du bist -> schützt vor ungewollten Zuweisungen
            System.out.println("a == 0");
        } else if (1 == a) {
            System.out.println("a == 1");
        } else if (2 == a) {
            System.out.println("a == 2");
        } else if (3 == a) {
            System.out.println("a == 3");
        } else {
            System.out.println("a ist irgendwas");
        }


        // ist dasselbe wie if elseif elseif elseif else von oben
        // ohne das break wird alles unter der ersten zutreffenden Bedingung ausgeführt
        switch (a) {
            case 0:
                System.out.println("a == 0");
                break;
            case 1:
                System.out.println("a == 1");
                break;
            case 2:
                System.out.println("a == 2");
                break;
            case 3:
                System.out.println("a == 3");
                break;
            // default sollte immer als letztes stehen
            default:
                System.out.println("a ist irgendwas");
        }


    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Random;

/**
 * @author MichaelMkr
 */

public class Dice_Explained {
// ################################### VARIABLEN ANFANG ###################################

    private static int numberOfDices = 0; // Klassenvariable -> deshalb static -> ist für ALLE Würfel gleich
    private Random rand = new Random();   // Instanzierung einer neuen Zufallszahl (ist einfach so wegen java.util.Random)
    private int numberOfEyes = 0;         // Instanzvariable -> die Anzahl der Augen ist bei jedem Dice unterschiedlich

// ################################### VARIABLEN ENDE ###################################





// ################################### GETTER UND SETTER ANFANG ###################################

    // GETTER für numberOfEyes
    public int getNumberOfEyes() {
        System.out.println("DICE --> Returning number of dice eyes.");
        return this.numberOfEyes; // returniert die Augenanzahl des aktuellen Würfels
    }

    // SETTER für numberOfEyes -> damit wir numberOfEyes verändern ("setzen") können, benötigen wir diese Setter Methode
    public void setNumberOfEyes(int numberOfEyes) {
        // this.numberOfEyes weil es eine Instanzvariable ist (kein "static" bei der Deklaration -> gilt für jeden Würfel einzeln)
        this.numberOfEyes = numberOfEyes;
    }

    // GETTER für numberOfDices
    public static int getNumberOfDices() {
        System.out.println("DICE --> Returning number of dices.");
        return Dice_Explained.numberOfDices;
    }

    // SETTER für numberOfDices -> erhöht die Anzahl der Würfel
    // Verändert die Klassenvariable numberOfDices für die gesamte Klasse (also für ALLE Würfel)
    private static void increaseNumberOfDices() {
        System.out.println("DICE --> Increasing number of dices.");
        // Dice.numberOfEyes weil es sich um eine Klassenvariable handelt -> this ist nur für Instanzvariablen
        Dice_Explained.numberOfDices += 1;
    }

    // SETTER für numberOfDices -> verringert die Anzahl der Würfel
    // Verändert die Klassenvariable numberOfDices für die gesamte Klasse (also für ALLE Würfel)
    private static void decreaseNumberOfDices() {
        System.out.println("DICE --> Decreasing number of dices.");
        // Dice.numberOfEyes weil es sich um eine Klassenvariable handelt -> this ist nur für Instanzvariablen
        Dice_Explained.numberOfDices -= 1;
    }

    // !!!!!!!!!!!!! ERGÄNZUNG ANFANG !!!!!!!!!!!!!
    // NUR ZUR ERGÄNZUNG!
    // HABEN WIR WEGGELASSEN WEIL increaseNumberOfDices & decreaseNumberOfDices eigentlich eh die Setter für numberOfDices sind
    // IST NUR ZUR ERKLÄRUNG HERINNEN WIRD IN DIESEM FILE ABER NICHT VERWENDET

        // das wäre der eigentlich (also der generierte) SETTER für numberOfDices -> damit wir numberOfEyes verändern ("setzen") können, benötigen wir eine Setter Methode
        // die Setter Methode ist genauso wie die Klassenvariable static
        // Verändert die Klassenvariable numberOfDices für die gesamte Klasse (also für ALLE Würfel)
        public static void setNumberOfDices(int parameterNumberOfDices) {
            // Dice.numberOfEyes weil es sich um eine Klassenvariable handelt -> this ist nur für Instanzvariablen
            Dice_Explained.numberOfDices = parameterNumberOfDices;
        }
    // !!!!!!!!!!!!! ERGÄNZUNG ENDE !!!!!!!!!!!!!

// ################################### GETTER UND SETTER ENDE ###################################





// ################################### CONSTRUCTORS ANFANG ###################################

    // Konstruktor für Dice() ohne Parameter -> also was passieren soll wenn new Dice() aufgerufen wird
    public Dice_Explained() {
        //this weil numberofEyes eine Instanzvariable ist die für jeden Würfel verschieden sein kann
        this.numberOfEyes = 6; // Standardmäßig sagen wir einfach ein Würfel hat 6 Seiten = max 6 Augen
        increaseNumberOfDices(); // Hier rufen wir die Funktion auf die uns die Gesamtanzahl der Würfel in der Klasse erhöht, da wir ja einen Würfel hinzugefügt haben
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices
                + " created with " + numberOfEyes + " eyes.");
    }

    /**
     * Constructor of a dice
     *
     * @param numOfEyes the number of sides (max eyes) the dice have.
     */
    public Dice_Explained(int numOfEyes) {
        //this weil numberofEyes eine Instanzvariable ist die für jeden Würfel verschieden sein kann
        this.numberOfEyes = numOfEyes; // wir setzen die Augenzahl des Würfels auf die Zahl die im Parameter (numOfEyes) übergeben wurde
        increaseNumberOfDices(); // Hier rufen wir die Funktion auf die uns die Gesamtanzahl der Würfel in der Klasse erhöht, da wir ja einen Würfel hinzugefügt haben
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices
                + " created with " + numberOfEyes + " eyes.");
    }

// ################################### CONSTRUCTORS ENDE ###################################







// ################################### KLASSENMETHODEN ANFANG ###################################

    // throwDices ist eine Instanzmethode (weil static) und kann daher nur über Dice.throwDices und nicht über z.B. d1.throwDices aufgerufen werden

    // (Dice... givenDices) -> ich kann soviele Würfel (Typ Dice) übergeben wie ich möchte -> diese werden in das Array givenDices gespeichert = Variable Argument = vararg
    public static int throwDices(Dice_Explained... givenDices) {
        int sumOfEyes = 0; // Summe der Augenzahl gesamt
        // Dice = Typ | currentDice = neuer Variablenname | : = in folgendem Array | givenDices = Array das übergeben wird
        // daraus folgt -> für jeden Dice currentDice in givenDices mach das in den geschwungenen Klammern
        for (Dice_Explained currentDice : givenDices) {
            int currentNumber = currentDice.throwDice(); // für den aktuell verwendeten Würfel wird die gewürfelte Augenzahl in currentNumber gespeichert
            sumOfEyes = sumOfEyes + currentNumber; // Die Summe der Augenzahlen gesamt wird um die gerade gewürfelte Augenzahl erhöht
        }
        return sumOfEyes; // Wenn die Schleife abgearbeitet ist = jeder Würfel einmal gewürfelt wurde -> wird die Gesamtaugenzahl zurück gegeben
    }

// ################################### KLASSENMETHODEN ENDE ###################################





// ################################### INSTANZMETHODEN ANFANG ###################################

    // Diese Methoden können von jeder Instanz der Klasse Dice aufgerufen werden -> also von jedem Würfel (z.B. d1.throwDice())

    // Methode um zu würfeln
    // ruft die Funktion getRandomNumberInRange auf und übergibt 1 als Minimum und die Augenzahl des Würfels als Maximum
    public int throwDice() {
        System.out.println("DICE --> Throwing the dice.");
        return getRandomNumberInRange(1, getNumberOfEyes()); // returniert das Ergebnis von getRandomNumberInRange
    }


    // Methode um den Würfel n-Mal zu würfeln -> Parameter n ist ein Integer
    public int[] throwDiceNTimes(int n) {
        System.out.println("DICE --> Throwing the dice " + n + " times");

        int[] numberOfEyesPerThrow = new int[n]; // ein neues Integer-Array (mit der Größe n = Anzahl der Elemente im Array) in das wir die Ergebnisse des Würfelns speichern

        // FOR Schleife um n mal den Würfel zu werfen
        for (int i = 0; i < numberOfEyesPerThrow.length; i++) {
            numberOfEyesPerThrow[i] = throwDice(); // die gewürfelte Augenzahl die von throwDice() zurück kommt speichern wir in das Array an der Stelle i
        }

        return numberOfEyesPerThrow; // returniert das Array numberOfEyesPerThrow mit den Ergebnissen von jedem Mal Würfeln
    }

    // Methode generiert eine zufällig gewürfelte Augenzahl zwischen dem übergebenen Minimum und Maximum
    // Annahme:                            min=1    max=6
    private int getRandomNumberInRange(int min, int max) {
        System.out.println("DICE --> Generating new random number.");
        // wir rechnen hier max - min da nextInt die Zahlen zwischen 0 bis zu dem übergebenen Bound generiert
        // das heißt übergeben wir das Maximum bekommen wir eine mögliche Zahl zuviel -> Beispiel mit min=1 und max=6
        // 0 1 2 3 4 5 6 -> sind 7 Ziffern -> daher wie in der nächsten Zeile
        //                           6 - 1 = 5       ->daraus folgen die Ziffern 0 bis 5 => also 6 mögliche Zahlen
        return rand.nextInt(max - min) + min; // das Ergebnis wieder +min weil wir von 0 bis 5 wieder auf 1 bis 6 kommen wollen
    }

// ################################### INSTANZMETHODEN ENDE ###################################






// Override Funktion von Markus
    @Override // DO NOT TOUCH THIS :-)
    protected void finalize() {
        System.out.println("DICE --> Destructor: Dice nr: " + numberOfDices
                + " destroyed.");
        decreaseNumberOfDices();
    }
}
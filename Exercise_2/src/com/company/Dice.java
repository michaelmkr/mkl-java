/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Random;

/**
 * @author lbwagnerm
 */

public class Dice {

    private static int numberOfDices = 0;
    Random rand;
    private int numberOfEyes = 0;


    public Dice() {
        // TODO write some code
    }


    /**
     * Constructor of a dice
     *
     * @param numOfEyes the number of sides (max eyes) the dice have.
     */
    public Dice(int numOfEyes) {
        // TODO write some code
        this.rand = new Random();
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices
                + " created with " + numberOfEyes + " eyes.");
    }


    /**
     * Function to increase the number of actual available dices.
     */
    private static void increaseNumberOfDices() {
        System.out.println("DICE --> Increasing number of dices.");
        // TODO write some code
    }


    /**
     * Function to increase the number of actual available dices.
     */
    private static void decreaseNumberOfDices() {
        System.out.println("DICE --> Decreasing number of dices.");
        // TODO write some code
    }


    /**
     * Function returning the actual number of created dices.
     *
     * @return The actual number of dices <code>int</code>.
     */
    public static int getNumberOfDices() {
        System.out.println("DICE --> Returning number of dices.");
        return 0; // TODO write some code --> you need to find the correct return value
    }


    public static int throwDices(Dice... dices) {
        // TODO write some code
        return 0; // TODO write some code --> you need to find the correct return value
    }


    @Override // DO NOT TOUCH THIS :-)
    protected void finalize() {
        System.out.println("DICE --> Destructor: Dice nr: " + numberOfDices
                + " destroyed.");
        decreaseNumberOfDices();
    }


    public int getNumberOfEyes() {
        System.out.println("DICE --> Returning number of dice eyes.");
        return 0; // TODO write some code --> you need to find the correct return value
    }


    public int throwDice() {
        System.out.println("DICE --> Throwing the dice.");
        return 0; // TODO write some code --> you need to find the correct return value
    }


    public int[] throwDiceNTimes(int n) {
        System.out.println("DICE --> Throwing the dice " + n + " times");
        // TODO write some code
        return new int[1]; // TODO write some code --> you need to find the correct return value
    }


    private int getRandomNumberInRange(int min, int max) {
        // TODO write some code
        System.out.println("DICE --> Generating new random number.");
        return rand.nextInt(0); // TODO write some code --> you need to find the correct return value
    }
}

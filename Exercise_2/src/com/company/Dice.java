package com.company;

import java.util.Random;

/**
 * @author MichaelMkr
 */

public class Dice {
    private static int numberOfDices = 0;
    private Random rand = new Random();
    private int numberOfEyes = 0;


    public Dice() {
        this.numberOfEyes = 6;
        increaseNumberOfDices();
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices
                + " created with " + numberOfEyes + " eyes.");
    }

    public Dice(int numOfEyes) {
        this.numberOfEyes = numOfEyes;
        increaseNumberOfDices();
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices
                + " created with " + numberOfEyes + " eyes.");
    }

    public static int getNumberOfDices() {
        System.out.println("DICE --> Returning number of dices.");
        return Dice.numberOfDices;
    }

    private static void increaseNumberOfDices() {
        System.out.println("DICE --> Increasing number of dices.");
        Dice.numberOfDices += 1;
    }

    private static void decreaseNumberOfDices() {
        System.out.println("DICE --> Decreasing number of dices.");
        Dice.numberOfDices -= 1;
    }

    public static int throwDices(Dice... givenDices) {
        int sumOfEyes = 0;
        for (Dice currentDice : givenDices) {
            int currentNumber = currentDice.throwDice();
            sumOfEyes = sumOfEyes + currentNumber;
        }
        return sumOfEyes;
    }

    public int getNumberOfEyes() {
        System.out.println("DICE --> Returning number of dice eyes.");
        return this.numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int throwDice() {
        System.out.println("DICE --> Throwing the dice.");
        return getRandomNumberInRange(1, getNumberOfEyes());
    }


    public int[] throwDiceNTimes(int n) {
        System.out.println("DICE --> Throwing the dice " + n + " times");

        int[] numberOfEyesPerThrow = new int[n];

        for (int i = 0; i < numberOfEyesPerThrow.length; i++) {
            numberOfEyesPerThrow[i] = throwDice();
        }

        return numberOfEyesPerThrow;
    }

    private int getRandomNumberInRange(int min, int max) {
        System.out.println("DICE --> Generating new random number.");
        return rand.nextInt(max - min) + min;
    }


    @Override
    protected void finalize() {
        System.out.println("DICE --> Destructor: Dice nr: " + numberOfDices
                + " destroyed.");
        decreaseNumberOfDices();
    }
}
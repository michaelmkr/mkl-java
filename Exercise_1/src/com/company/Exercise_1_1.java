package com.company;

import java.util.Scanner;

public class Exercise_1_1 {

    public static void main(String[] args) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        // initialize new Scanner
        Scanner input = new Scanner(System.in);

        //read input
        String s = input.nextLine();

        //split input by space
        String[] strArr = s.split("\\s+");

        /*//assign start and end numbers
        int start = Integer.parseInt(strArr[0]);
        int end = Integer.parseInt(strArr[1]);*/

        int start = 0;
        int end = 0;

        try {
            start = Integer.parseInt(strArr[0]);
            end = Integer.parseInt(strArr[1]);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Please enter 2 numbers seperated with a space!");
        }
        catch (ArrayIndexOutOfBoundsException oob) {
            System.out.println("Please enter a second number!");
        }

        StringBuilder primeNumbers = new StringBuilder();

        for (int i = start; i <= end; i++) {
            int counter = 0;

            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }

            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers.append(i).append(", ");
            }
        }
        System.out.println("The prime numbers between " + start + " and " + end + " are: " + primeNumbers);


    }

}

package com.company;

import java.util.Scanner;

public class Exercise_1_1 {

    public static void main(String[] args) {
        // initialize new Scanner
        Scanner input = new Scanner(System.in);

        //read input
        String s = input.nextLine();

        //split input by space
        String[] strArr = s.split("\\s+");

        //assign start and end numbers
        int start = Integer.parseInt(strArr[0]);
        int end = Integer.parseInt(strArr[1]);

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

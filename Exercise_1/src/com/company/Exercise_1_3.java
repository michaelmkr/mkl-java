package com.company;

import java.util.Scanner;

public class Exercise_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int in1 = input.nextInt();
        int in2 = input.nextInt();
        int sum = in1 + in2;

        System.out.println("First Number --> " + in1);
        System.out.println("Second Number --> " + in2);
        System.out.println(in1 + " + "  + in2  + " + "  + sum);

    }
}

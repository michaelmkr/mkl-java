package com.company;

import java.util.Scanner;

public class Exercise_1_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] strArr = s.split("\\s+");


        Double first = Double.parseDouble(strArr[0]);
        Double second = Double.parseDouble(strArr[2]);
        String operation = strArr[1];
        Double result = 0.0;

        switch (strArr[1]){
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
        }

        System.out.println(first + " " + operation + " "   + second + " = "  + result);


    }
}

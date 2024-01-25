package com.dsa.control.statements;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        //Write a program to calculate and print the power of a number i.e a2=a*a
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println("Enter the power");
        int power = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        System.out.println("The result with for loop  is " + result);
        // by formula
        result = (int) Math.pow(number, power);
        System.out.println("The result with formula is " + result);

    }
}

package com.dsa.control.statements;

import java.util.Scanner;

public class PositiveNegativeZeroChecker {
    //Write a program to display whether a number is negative, positive or zero.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check and display whether the number is negative, positive, or zero
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println(number + " is zero.");
        }

        scanner.close();
    }
}

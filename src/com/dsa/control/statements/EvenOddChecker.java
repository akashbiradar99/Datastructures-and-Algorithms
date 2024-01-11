package com.dsa.control.statements;

import java.util.Scanner;

public class EvenOddChecker {
    // Write a program to display whether a number is even or odd.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check and display whether the number is even or odd
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }

    private static boolean isEven(int num) {
        // Check if the number is even using the modulo operator
        // If the remainder when divided by 2 is 0, the number is even
        return num % 2 == 0;
    }
}

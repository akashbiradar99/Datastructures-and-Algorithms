package com.dsa.control.statements;

import java.util.Scanner;

public class MaxMinBetweenTwoNumbers {
    //Write a program to display maximum number and minimum number between two numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Using if-else statements to find maximum and minimum
        int maxUsingIfElse = findMaxUsingIfElse(num1, num2);
        int minUsingIfElse = findMinUsingIfElse(num1, num2);

        // Using Math class methods to find maximum and minimum
        int maxUsingMath = Math.max(num1, num2);
        int minUsingMath = Math.min(num1, num2);

        // Displaying results
        System.out.println("Using if-else:");
        System.out.println("Maximum number: " + maxUsingIfElse);
        System.out.println("Minimum number: " + minUsingIfElse);

        System.out.println("\nUsing Math class methods:");
        System.out.println("Maximum number: " + maxUsingMath);
        System.out.println("Minimum number: " + minUsingMath);

        scanner.close();
    }

    private static int findMaxUsingIfElse(int a, int b) {
        // Using if-else statements to find the maximum
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private static int findMinUsingIfElse(int a, int b) {
        // Using if-else statements to find the minimum
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
















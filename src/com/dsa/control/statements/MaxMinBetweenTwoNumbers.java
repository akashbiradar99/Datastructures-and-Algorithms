package com.dsa.control.statements;

import java.util.Scanner;

public class MaxMinBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find and display the maximum and minimum between the two numbers
        int maxNumber = findMax(num1, num2);
        int minNumber = findMin(num1, num2);

        System.out.println("Maximum number between " + num1 + " and " + num2 + " is: " + maxNumber);
        System.out.println("Minimum number between " + num1 + " and " + num2 + " is: " + minNumber);

        scanner.close();
    }

    private static int findMax(int a, int b) {
        // Using the Math.max method to find the maximum between two numbers
        return Math.max(a, b);
    }

    private static int findMin(int a, int b) {
        // Using the Math.min method to find the minimum between two numbers
        return Math.min(a, b);
    }
}

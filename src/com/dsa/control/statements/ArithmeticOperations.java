package com.dsa.control.statements;

import java.util.Scanner;

public class ArithmeticOperations {

    //Write a program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Add two numbers
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is: " + sum);

        // Subtract two numbers
        int difference = num1 - num2;
        System.out.println("Difference of two numbers is: " + difference);

        // Multiply two numbers
        int product = num1 * num2;
        System.out.println("Product of two numbers is: " + product);

        // Divide two numbers
        int quotient = num1 / num2;
        System.out.println("Quotient of two numbers is: " + quotient);

        // Remainder of two numbers
        int remainder = num1 % num2;
        System.out.println("Remainder of two numbers is: " + remainder);

    }
}

package com.dsa.control.statements;

import java.util.Scanner;

public class DivisionOfNumbers {

    //Write a program for division of 2 numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            return;
        }
        int result = num1 / num2;
        System.out.println("Division of two numbers is: " + num1 + " / " + num2 + " = Result: " + result);
    }
}

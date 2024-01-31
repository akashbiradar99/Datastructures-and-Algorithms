package com.dsa.control.statements;

import java.util.Scanner;

public class FacorialOfNumber {
    public static void main(String[] args) {
        //Write a program to find factorial of a number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("The result is " + result);
    }
}

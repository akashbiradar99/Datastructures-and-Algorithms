package com.dsa.control.statements;

import java.util.Scanner;

public class UppercaseLowercaseChecker {
    //HW 06)Write a program to display whether a character is an uppercase or lowercasealphabet.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character from the user
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check and display whether the character is uppercase or lowercase
        if (isUppercase(ch)) {
            System.out.println(ch + " is an uppercase alphabet.");
        } else if (isLowercase(ch)) {
            System.out.println(ch + " is a lowercase alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

        scanner.close();
    }

    private static boolean isUppercase(char c) {
        // Check if the character is an uppercase alphabet
        return (c >= 'A' && c <= 'Z');
    }

    private static boolean isLowercase(char c) {
        // Check if the character is a lowercase alphabet
        return (c >= 'a' && c <= 'z');
    }
}


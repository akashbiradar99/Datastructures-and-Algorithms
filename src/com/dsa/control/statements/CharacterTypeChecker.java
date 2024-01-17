package com.dsa.control.statements;
import java.util.Scanner;

public class CharacterTypeChecker {
    //10) Write a program to display if a character is an alphabet, number or special character.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character from the user
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Using if-else statements
        ifElseApproach(ch);

        // Using Character class methods
        characterClassApproach(ch);

        scanner.close();
    }

    private static void ifElseApproach(char c) {
        // Using if-else statements to check character type
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            System.out.println("Using if-else: " + c + " is an alphabet.");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Using if-else: " + c + " is a number.");
        } else {
            System.out.println("Using if-else: " + c + " is a special character.");
        }
    }

    private static void characterClassApproach(char c) {
        // Using Character class methods to check character type
        if (Character.isLetter(c)) {
            System.out.println("Using Character class: " + c + " is an alphabet.");
        } else if (Character.isDigit(c)) {
            System.out.println("Using Character class: " + c + " is a number.");
        } else {
            System.out.println("Using Character class: " + c + " is a special character.");
        }
    }
}


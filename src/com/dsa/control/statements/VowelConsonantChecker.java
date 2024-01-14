package com.dsa.control.statements;
import java.util.Scanner;

public class VowelConsonantChecker {
    //Write a program to input an alphabet and display whether it is a vowel or a consonant.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an alphabet from the user
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        // Check and display whether the alphabet is a vowel or a consonant
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        scanner.close();
    }

    private static boolean isVowel(char c) {
        // Check if the character is a vowel
        // Using switch for simplicity; you can also use if-else statements
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}


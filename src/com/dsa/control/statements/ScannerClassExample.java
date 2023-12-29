package com.dsa.control.statements;

import java.util.Scanner;

public class ScannerClassExample {

    //How to accept different types of data using Scanner class.?

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered an integer: " + intValue);

        // Reading double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered a double: " + doubleValue);

        // Reading boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean boolValue = scanner.nextBoolean();
        System.out.println("You entered a boolean: " + boolValue);

        // Reading string
        System.out.print("Enter a string: ");
        String stringValue = scanner.next();
        System.out.println("You entered a string: " + stringValue);

        // Reading a line of text
        System.out.print("Enter a line of text: ");
        String lineValue = scanner.nextLine();
        System.out.println("You entered a line of text: " + lineValue);

        // Reading a char (as a String)
        System.out.print("Enter a character: ");
        String charInput = scanner.next();
        char charValue = charInput.charAt(0);
        System.out.println("You entered a character: " + charValue);

        // Close the scanner
        scanner.close();
    }
}

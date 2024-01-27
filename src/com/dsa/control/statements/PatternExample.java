package com.dsa.control.statements;
import java.util.Scanner;

public class PatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print the pattern
        printPattern(rows);

        scanner.close();
    }

    private static void printPattern(int rows) {
        // Print the top half of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Print the bottom half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


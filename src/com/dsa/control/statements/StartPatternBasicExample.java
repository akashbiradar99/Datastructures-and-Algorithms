package com.dsa.control.statements;

public class StartPatternBasicExample {

    public static void main(String[] args) {
        // Print the pattern
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            // Print '*' for each column in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

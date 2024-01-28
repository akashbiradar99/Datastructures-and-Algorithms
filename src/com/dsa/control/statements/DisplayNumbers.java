package com.dsa.control.statements;
public class DisplayNumbers {
    public static void main(String[] args) {
        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Add a new line for better formatting
        System.out.println();

        // Using while loop
        System.out.println("Using while loop:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }

        // Add a new line for better formatting
        System.out.println();

        // Using do-while loop
        System.out.println("Using do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);

        // Add a new line for better formatting
        System.out.println();
    }
}


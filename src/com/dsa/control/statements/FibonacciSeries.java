package com.dsa.control.statements;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms for the Fibonacci series
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        // Display the Fibonacci series
        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    private static int fibonacci(int n) {
        // Recursive method to calculate the nth Fibonacci number
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


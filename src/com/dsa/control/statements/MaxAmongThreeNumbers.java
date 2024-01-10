package com.dsa.control.statements;

import java.util.Scanner;

public class MaxAmongThreeNumbers {

//    Write a program to display maximum among three numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find and display the maximum among the three numbers using the max method
        int maxNumber = findMax(num1, num2, num3);
        int maxNumberByIf = findMaxUsingIf(num1, num2, num3);
        System.out.println("The maximum among the three numbers By If Condition is: " + maxNumberByIf);
        System.out.println("The maximum among the three numbers  by using max method is: " + maxNumber);

        scanner.close();
    }

    private static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    private static int findMaxUsingIf(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        return max;
    }
}


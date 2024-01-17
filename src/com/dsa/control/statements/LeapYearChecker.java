package com.dsa.control.statements;

import java.util.Scanner;

public class LeapYearChecker {
    //11)Write a program to display if the entered year is a leap year ornot
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check and display if the year is a leap year or not
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    private static boolean isLeapYear(int year) {
        // Check if the year is a leap year
        // Leap years are divisible by 4, but not divisible by 100 unless also divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}


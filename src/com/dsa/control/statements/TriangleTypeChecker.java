package com.dsa.control.statements;

import java.util.Scanner;

public class TriangleTypeChecker {
    //07)Write a program to display whether the triangle is equilateral, isosceles or scalene triangle.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input lengths of the sides of the triangle from the user
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        // Check and display whether the triangle is equilateral, isosceles, or scalene
        if (isEquilateral(side1, side2, side3)) {
            System.out.println("The triangle is an equilateral triangle.");
        } else if (isIsosceles(side1, side2, side3)) {
            System.out.println("The triangle is an isosceles triangle.");
        } else {
            System.out.println("The triangle is a scalene triangle.");
        }

        scanner.close();
    }

    private static boolean isEquilateral(double side1, double side2, double side3) {
        // Check if all sides are equal
        return (side1 == side2 && side2 == side3);
    }

    private static boolean isIsosceles(double side1, double side2, double side3) {
        // Check if at least two sides are equal
        return (side1 == side2 || side1 == side3 || side2 == side3);
    }
}

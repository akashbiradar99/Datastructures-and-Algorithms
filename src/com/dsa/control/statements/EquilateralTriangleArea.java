package com.dsa.control.statements;

import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the side length of the equilateral triangle from the user
        System.out.print("Enter the side length of the equilateral triangle: ");
        double sideLength = scanner.nextDouble();

        // Calculate the area
        double area = calculateEquilateralTriangleArea(sideLength);

        // Display the result
        System.out.println("Area of the equilateral triangle: " + area);

        scanner.close();
    }

    private static double calculateEquilateralTriangleArea(double sideLength) {
        // Calculate the area of the equilateral triangle
        return (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
    }
}


package com.dsa.control.statements;

import java.util.Scanner;

public class RectangleProperties {

    //Write a program for rectangle properties
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        Double length = scanner.nextDouble();
        System.out.println("Enter the width of rectangle");
        Double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}

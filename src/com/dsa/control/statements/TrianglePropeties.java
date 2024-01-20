package com.dsa.control.statements;

public class TrianglePropeties {

    //Write a program for triangle properties
    public static void main(String[] args) {

        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is: " + area);
    }
}

package com.dsa.control.statements;

import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) {
        // display table of given number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

    }
}

package com.dsa.control.statements;

import java.util.Scanner;

public class CountDigitsONumber {
    public static void main(String[] args) {
        //Write a program to count number of digits of a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int count = 0;
        //by while loop
        while(number > 0) {
            number = number / 10;
            count++;
        }
        // by for loop
        for(int i=number; i>0; i=i/10) {
            count++;
        }
        System.out.println("The number of digits is " + count);
    }
}

package com.dsa.control.statements;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        //Write a program to count number of digits of a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        while(number>0){
            sum= sum+number%10;
            number = number/10;
        }
        System.out.println("The sum of digits is "+sum);

    }
}

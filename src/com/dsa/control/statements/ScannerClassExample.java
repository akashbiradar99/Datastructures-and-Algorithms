package com.dsa.control.statements;

import java.util.Scanner;

public class ScannerClassExample {

    //How to accept different types of data using Scanner class.?

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        System.out.println("You have entered : "+num);

        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("You have entered : "+name);


    }




}

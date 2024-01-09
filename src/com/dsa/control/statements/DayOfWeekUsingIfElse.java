package com.dsa.control.statements;

import java.util.Scanner;

public class DayOfWeekUsingIfElse {

    // Write a program to input a number from the user and display the corresponding day ofthe week.
    // (using if else if and switch) (Variations)
    public static void main(String[] args) {
  char ch;
     do {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a number (1-7): ");
         int dayNumber = scanner.nextInt();

         if (dayNumber >= 1 && dayNumber <= 7) {
             if (dayNumber == 1) {
                 System.out.println("Day of the week: Sunday");
             } else if (dayNumber == 2) {
                 System.out.println("Day of the week: Monday");
             } else if (dayNumber == 3) {
                 System.out.println("Day of the week: Tuesday");
             } else if (dayNumber == 4) {
                 System.out.println("Day of the week: Wednesday");
             } else if (dayNumber == 5) {
                 System.out.println("Day of the week: Thursday");
             } else if (dayNumber == 6) {
                 System.out.println("Day of the week: Friday");
             } else {
                 System.out.println("Day of the week: Saturday");
             }
         } else {
             System.out.println("Invalid input! Please enter a number between 1 and 7.");
         }
         ch= scanner.next().charAt(0);
         System.out.println("do you want to continue? if yes press y");

    }while (ch=='y');
    }
}




package com.dsa.control.statements;
public class PinkYellowCounter {
    public static void main(String[] args) {
        int pinkCount = 0;
        int yellowCount = 0;
        int pinkYellowCount = 0;

        for (int num = 33; num <= 999; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("PINK&YELLOW");
                pinkYellowCount++;
            } else if (num % 3 == 0) {
                System.out.println("PINK");
                pinkCount++;
            } else if (num % 5 == 0) {
                System.out.println("YELLOW");
                yellowCount++;
            } else {
                System.out.println(num);
            }
        }

        System.out.println("\nCount of 'PINK': " + pinkCount);
        System.out.println("Count of 'YELLOW': " + yellowCount);
        System.out.println("Count of 'PINK&YELLOW': " + pinkYellowCount);
    }
}


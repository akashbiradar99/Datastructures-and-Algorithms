package com.dsa.control.statements;

import java.util.Scanner;

public class ProfitLossCalculator {
    //08)Write a program to display and calculate profit or loss by a suitableexample
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the cost price from the user
        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        // Input the selling price from the user
        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        // Calculate profit or loss
        double profitOrLoss = calculateProfitLoss(costPrice, sellingPrice);

        // Display and calculate profit or loss
        if (profitOrLoss > 0) {
            System.out.println("Profit amount: Rs. " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss amount: Rs. " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No profit, no loss.");
        }

        scanner.close();
    }

    private static double calculateProfitLoss(double costPrice, double sellingPrice) {
        // Calculate profit or loss
        return sellingPrice - costPrice;
    }
}

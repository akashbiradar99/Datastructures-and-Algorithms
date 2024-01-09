package com.dsa.control.statements;

import java.util.Scanner;

public class ElectricityBillCalculator {

    //. Consider a situation below of the electricity unit charges. Now input electric units by the user and calculate total
    //electricitybill according to the given condition. (Variations)
    //For first 50 units Rs. 0.50/unit For next 100 units Rs.0.75/unit For next 100 units Rs. 1.20/unit For unit above 250
    //Rs.1.50/unit
    //An additional surcharge of 20% is added to the bill
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input electric units from the user
        System.out.print("Enter the number of electric units consumed: ");
        int units = scanner.nextInt();

        // Calculate electricity bill
        double bill = calculateElectricityBill(units);

        // Apply surcharge
        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;

        // Display the total electricity bill
        System.out.println("Total Electricity Bill: Rs. " + totalBill);

        scanner.close();
    }

    private static double calculateElectricityBill(int units) {
        double bill;

        if (units <= 50) {
            // For first 50 units Rs. 0.50/unit
            bill = units * 0.50;
        } else if (units <= 150) {
            // For next 100 units Rs. 0.75/unit
            bill = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units <= 250) {
            // For next 100 units Rs. 1.20/unit
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else {
            // For units above 250 Rs. 1.50/unit
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }

        return bill;
    }
}

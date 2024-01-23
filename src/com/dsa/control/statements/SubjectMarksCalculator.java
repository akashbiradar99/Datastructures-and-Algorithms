package com.dsa.control.statements;

import java.util.Scanner;

public class SubjectMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks of six subjects from the user
        System.out.println("Enter marks of six subjects:");

        double[] subjectMarks = new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
        }

        // Calculate total marks and average
        double totalMarks = calculateTotalMarks(subjectMarks);
        double averageMarks = calculateAverageMarks(subjectMarks);

        // Display the results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        scanner.close();
    }

    private static double calculateTotalMarks(double[] marks) {
        // Calculate the total marks
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    private static double calculateAverageMarks(double[] marks) {
        // Calculate the average marks
        double total = calculateTotalMarks(marks);
        return total / marks.length;
    }
}


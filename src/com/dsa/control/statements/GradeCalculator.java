package com.dsa.control.statements;

import java.util.Scanner;

public class GradeCalculator {
    //Write a program to input marks of five subjects by the user. Now calculatesum and percentage of the marks.
    //Find the grade according to following: (Variations)
    //a. Percentage >= 90% : GradeA
    //b. Percentage >= 80% : GradeB
    //c. Percentage >= 70% : GradeC
    //d. Percentage >= 60% : GradeD
    //e. Percentage >= 40% : GradeE
    //f. Percentage < 40% : Grade F
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks of five subjects from the user
        System.out.println("Enter marks of five subjects:");

        System.out.print("Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Subject 3: ");
        double subject3 = scanner.nextDouble();

        System.out.print("Subject 4: ");
        double subject4 = scanner.nextDouble();

        System.out.print("Subject 5: ");
        double subject5 = scanner.nextDouble();

        // Calculate sum and percentage
        double sum = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (sum / 500) * 100;

        // Determine grade based on percentage
        String grade = determineGrade(percentage);

        // Display results
        System.out.println("\nTotal Marks: " + sum);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static String determineGrade(double percentage) {
        // Determine the grade based on the given criteria
        if (percentage >= 90) {
            return "Grade A";
        } else if (percentage >= 80) {
            return "Grade B";
        } else if (percentage >= 70) {
            return "Grade C";
        } else if (percentage >= 60) {
            return "Grade D";
        } else if (percentage >= 40) {
            return "Grade E";
        } else {
            return "Grade F";
        }
    }
}


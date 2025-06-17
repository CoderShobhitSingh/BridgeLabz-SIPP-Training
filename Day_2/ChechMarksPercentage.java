package Day_2;

import java.util.Scanner;

public class ChechMarksPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Physics (out of 100): ");
        double physicsMarks = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry (out of 100): ");
        double chemistryMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths (out of 100): ");
        double mathsMarks = scanner.nextDouble();

        // Validate marks are within 0-100 range
        if (physicsMarks < 0 || physicsMarks > 100 ||
            chemistryMarks < 0 || chemistryMarks > 100 ||
            mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
            scanner.close();
            return;
        }

        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300.0) * 100;

        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent performance!";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very good performance.";
        } else if (percentage >= 70) {
            grade = "B+";
            remarks = "Good performance.";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Satisfactory performance.";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Average performance.";
        } else if (percentage >= 40) {
            grade = "D";
            remarks = "Needs improvement.";
        } else {
            grade = "F";
            remarks = "Fail. Please study harder.";
        }

        System.out.println("\n--- Result ---");
        System.out.printf("Total Marks: %.2f / 300%n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}

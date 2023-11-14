package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // Method for multiplication
    public static double mult(double num1, double num2) {
        return num1 * num2;
    }

    // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    // Method for division
    public static double div(double num1, double num2) {
        if (num2 == 0) {
            System.err.println("Division by zero is not allowed.");
            return Double.NaN; // Not-a-Number to represent an error
        }
        return num1 / num2;
    }
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first operand: ");

        double operand1 = scanner.nextDouble();

        System.out.print("Enter the second operand: ");

        double operand2 = scanner.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("1. Multiplication");
        System.out.println("2. Addition");
        System.out.println("3. Subtraction");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = mult(operand1, operand2);
                System.out.println("Multiplication: " + result);
                break;
            case 2:
                result = add(operand1, operand2);
                System.out.println("Addition: " + result);
                break;
            case 3:
                result = sub(operand1, operand2);
                System.out.println("Subtraction: " + result);
                break;
            case 4:
                result = div(operand1, operand2);
                System.out.println("Division: " + result);
                break;
            default:
                System.err.println("Invalid choice.");
        }

        scanner.close();
    }
}
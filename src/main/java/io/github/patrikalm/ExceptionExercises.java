package io.github.patrikalm;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises {

    public static void main(String[] args) {


        ex2();


    }


    public static void ex1() {

        int firstNumber;
        int secondNumber;
        int divisionResult;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a number: ");
        firstNumber = scanner.nextInt();

        System.out.println();
        System.out.print("Enter a second number: ");
        secondNumber = scanner.nextInt();

        try {
            divisionResult = firstNumber / secondNumber;
            System.out.println();
            System.out.print("The result is ");
            System.out.println(divisionResult);
        }
        catch(ArithmeticException e) {

            System.out.println("You can not enter that number as it throws exception " + e);
        }
    }

    public static void ex2() {

        int number =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a number between 1-100: ");

        try {
            number = scanner.nextInt();

            if (number < 1 || number > 100) {

                System.out.println("That number is out of range");
                System.out.println("Please try again!");
            }
            System.out.println("This is the number you entered: " + number);
        }
        catch(InputMismatchException e) {
            System.out.println("You have to enter a number between 1-100");
            System.out.println("Please try again!");

        }
    }

    public static void ex3() {





    }
}
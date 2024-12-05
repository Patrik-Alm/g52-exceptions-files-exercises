package io.github.patrikalm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises {

    public static void main(String[] args) {


        ex3();


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

    BankAccount account1 = new BankAccount(500);

    try {
        account1.withdraw(600);
        System.out.println("Your withdrawal was successful");
    }
    catch(InsufficientBalanceException e) {
        System.out.println("You can not withdraw that amount. You are missing £ " + e.getAmount());
    }


    }

    public static void ex4() {

        Path relativePath = Paths.get("g52-exceptions-files-exercises/folder/TextFile.txt");

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(relativePath);
        } catch (NumberFormatException e1) {
            System.out.println("Numbers has wrong format, " + e1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
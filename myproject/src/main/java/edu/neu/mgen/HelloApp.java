package edu.neu.mgen;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class HelloApp 
{
    public static void main( String[] args )
    {
        System.out.println( "It is my first Java program" );

   Scanner scanner = new Scanner(System.in);

        // Declare and initialize variables of different types
        int intVar1 = 10, intVar2 = 20;
        long longVar1 = 30000L, longVar2 = 40000L;
        double doubleVar1 = 5.5, doubleVar2 = 10.5;
        boolean boolVar1 = true, boolVar2 = false;
        char charVar1 = 'A', charVar2 = 'B';

        // Convert int to long
        longVar1 = intVar1;
        longVar2 = intVar2;
        // Convert long to int
        // Note: This might cause data loss if the long value is beyond int range
        intVar1 = (int) longVar1;
        intVar2 = (int) longVar2;

        // Enter values for variables from the terminal
        System.out.println("Enter a new value for intVar1: ");
        intVar1 = scanner.nextInt();
        System.out.println("Enter a new value for intVar2: ");
        intVar2 = scanner.nextInt();

        // Arithmetic and logical operations
        int sum = intVar1 + intVar2;
        double division = doubleVar1 / doubleVar2;
        boolean logicalResult = boolVar1 && boolVar2;
        int charDifference = charVar1 - charVar2;

        // Printing results
        System.out.println("Sum of int variables: " + sum);
        System.out.println("Division of double variables: " + division);
        System.out.println("Logical AND of boolean variables: " + logicalResult);
        System.out.println("Difference between char variables: " + charDifference);
    }
}
 // This is a single-line comment

 /*
 This is a multi-line comment.
This is a multi-line comment.
 */
package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HW_Ch5_DataStructures 
{
    public static void main( String[] args )
    {
        String str = "Oakland";

        // Find the length of the string
        System.out.println("Length of the string: " + str.length());

        // Find the character at index 2
        System.out.println("Character at index 2: " + str.charAt(2));

        // Extract the substring "land"
        System.out.println("Extracted substring: " + str.substring(str.indexOf("land")));

        // Convert the string to uppercase
        System.out.println("String in uppercase: " + str.toUpperCase());

        ////task 2

        int[] abc = {1, 3, 5, 2, 5};

        // Find the length of the array
        System.out.println("Length of the array: " + abc.length);

        // Find the last member of the array
        System.out.println("Last member of the array: " + abc[abc.length - 1]);

        ////task 3

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Austin", "Houston", "Oakland", "Paris", "San Francisco", "Seattle"));

        // Remove "Paris" from the ArrayList
        cities.remove("Paris");
        System.out.println("ArrayList after removing 'Paris': " + cities);
    }
}
 // This is a single-line comment

 /*
 This is a multi-line comment.
This is a multi-line comment.
 */
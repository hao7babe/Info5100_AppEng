package edu.neu.mgen;

import java.util.Scanner;

public class HW_CH6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any word: ");

        long startTime = System.currentTimeMillis();
        String word = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        if (word.isEmpty()) {
            System.out.println("You did not enter any word");
        } else {
            int wordLength = word.length();
            long reactionTime = (endTime - startTime) / 1000;

            System.out.println("Your word is " + word);
            System.out.println("The length of the word is " + wordLength);

            if (wordLength <= 5) {
                System.out.println("It is a short word");
            } else if (wordLength <= 10) {
                System.out.println("It is a medium word");
            } else {
                System.out.println("It is a long word");
            }

            System.out.println("Your reaction time is " + reactionTime + " seconds");
        }
        scanner.close();
    }
}

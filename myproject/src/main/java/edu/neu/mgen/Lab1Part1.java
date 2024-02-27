package edu.neu.mgen;

public class Lab1Part1 {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50}; // Example values for array x
        int[] y = {15, 25, 35, 45, 55}; // Example values for array y
        int[] z = new int[5]; // Array z of length 5

        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("Array x = {" + arrayToString(x) + "}");
        System.out.println("Array y = {" + arrayToString(y) + "}");
        System.out.println("Array z = x + y = {" + arrayToString(z) + "}");
    }

    private static String arrayToString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += array[i];
        }
        return result;
    }
}


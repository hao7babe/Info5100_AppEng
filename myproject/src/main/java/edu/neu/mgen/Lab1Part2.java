package edu.neu.mgen;

import java.util.ArrayList;

public class Lab1Part2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.add("David");
        names.add("Eve");

        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(switchLetters(name));
        }

        System.out.println("Names = {" + String.join(", ", names) + "}");
        System.out.println("Names (switched) = {" + String.join(", ", switchedNames) + "}");
    }

    private static String switchLetters(String name) {
        if (name.length() <= 1) {
            return name;
        }

        char firstLetter = Character.toLowerCase(name.charAt(name.length() - 1));
        char lastLetter = Character.toUpperCase(name.charAt(0));
        return lastLetter + name.substring(1, name.length() - 1) + firstLetter;
    }
}

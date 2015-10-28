package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Jokes {

    public static final List<String> list = Arrays.asList(
            "To understand what recursion is, you must first understand recursion.",
            "Database Admins walked into a NoSQL bar. A little while later they walked out because " +
                    "they couldn’t find a table.",
            "Q: how many programmers does it take to change a light bulb?\n" +
                    "A: none, that’s a hardware problem",
            "Q. How did the programmer die in the shower?\n" +
                    "A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.",
            "Q: Do you know why Facebook went public?\n" +
                    "A: They couldn’t figure out the privacy settings!",
            "Q: How do you explain the movie Inception to a programmer?\n" +
                    "A: Basically, when you run a VM inside another VM, inside another VM, " +
                    "inside another VM…, everything runs real slow!",
            "A programmer’s wife sends him to the grocery store with the instructions, \"get a loaf of bread, and if they have eggs, get a dozen.\" " +
                    "He comes home with a dozen loaf of bread and tells her, \"they had eggs.\"");

    public static String getJoke() {
        return randomJoke();
    }

    private static String randomJoke() {
        Random r = new Random();
        int randomValue = r.nextInt(list.size());
        return list.get(randomValue);
    }
}

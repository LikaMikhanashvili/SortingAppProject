package com.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Check if there are any command-line arguments
        if (args.length == 0) {
            System.out.println("No input provided.");
            return;
        }

        // Parse command-line arguments as integers
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i]);
                return;
            }
        }

        // Sort the numbers in ascending order
        Arrays.sort(numbers);

        // Print the sorted numbers
        System.out.println("Sorted numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

package com.sparta.francisco.display;

import java.util.Arrays;

public class DisplayManager {
    public static void printMenu() {
        System.out.println("Enter the Numbers below to select sort algorithm: ");
        System.out.println("1: Bubblesort; ");
        System.out.println("2: Mergesort; ");
        System.out.println("3: Binarysort; ");
        System.out.println("4: Insertionsort; ");
        System.out.println("5: Quicksort ");
    }

    public static void incorrectFormat() {
        System.out.println("Invalid input, Try Again...");
    }

    public static void correctFormat(String inputString) {
        System.out.println("Successfully input: " + inputString);
    }

    public static void printArraySizePrompt() {
        System.out.println("Enter size of array from 1 to 1000: ");
    }

    public static void printSorted() {
        System.out.println("Already Sorted");
    }

    public static void printSortedArray(int[] sortedArray) {
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    public static void printUnsortedArray(int[] unSortedArray) {
        System.out.println("Unsorted Array: " + Arrays.toString(unSortedArray));
    }
}

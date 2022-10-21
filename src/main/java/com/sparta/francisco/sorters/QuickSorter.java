package com.sparta.francisco.sorters;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuickSorter implements Sorter {

    private static final Logger logger = Logger.getLogger("list-logger");

    @Override
    public int[] sort(int[] arrayOfNums) {
        logger.log(Level.INFO, "Quicksort has started");
        logger.log(Level.INFO, "Using the following list: " + Arrays.toString(arrayOfNums));
        quickSort(arrayOfNums, 0, arrayOfNums.length - 1);
        return arrayOfNums;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {

        // pivot
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }


    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
}
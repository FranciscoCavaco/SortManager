package com.sparta.francisco.sorters;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertionSorter implements Sorter{

    private static final Logger logger = Logger.getLogger("list-logger");

    @Override
    public int[] sort(int[] arrayOfNums) {
        logger.log(Level.INFO, "Insertion sort has started");
        logger.log(Level.INFO, "Using the following list: " + Arrays.toString(arrayOfNums));
        int n = arrayOfNums.length;
        for (int i = 1; i < n; ++i) {
            int key = arrayOfNums[i];
            int j = i - 1;

            while (j >= 0 && arrayOfNums[j] > key) {
                arrayOfNums[j + 1] = arrayOfNums[j];
                j = j - 1;
            }
            arrayOfNums[j + 1] = key;
        }
        return arrayOfNums;
    }

}

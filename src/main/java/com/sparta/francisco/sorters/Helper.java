package com.sparta.francisco.sorters;

public class Helper {
    public static boolean isSorted(int[] arrayOfNums, boolean sorted) {
        for (int i = 0; i < arrayOfNums.length - 1; i++) {
            if (arrayOfNums[i] > arrayOfNums[i + 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
}

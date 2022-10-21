package com.sparta.francisco.sorters;

public class MergeSorter implements Sorter{
    @Override
    public int[] sort(int[] arrayOfNums) {
        int arrayLength = arrayOfNums.length;
        boolean sorted = true;

        if (arrayLength == 1){
            return arrayOfNums;
        }

        sorted = Helper.isSorted(arrayOfNums, sorted);

        if (sorted) {
            System.out.println("Already Sorted");
        } else {
            divide(arrayOfNums, arrayLength);

        }
        return arrayOfNums;
    }

    private static void divide(int[] arrayOfNums, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int mid = arrayLength/2;
        int[] left = new int[mid];
        int[] right = new int[arrayLength-mid];

        for (int i = 0; i<mid; i++) {
            left[i] = arrayOfNums[i];
        }

        for (int i = mid; i<arrayLength; i++) {
            right[i-mid] = arrayOfNums[i];
        }

        divide(left, mid);
        divide(right, arrayLength - mid);
        merge(arrayOfNums, left, right, mid, arrayLength-mid);
    }

    private static void merge(int[] arrayOfNums, int[] left, int[] right, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;

        while (i<leftLength && j<rightLength) {
            if (left[i] <= right[j]) {
                arrayOfNums[k++] = left[i++];
            } else {
                arrayOfNums[k++] = right[j++];
            }
            while (i < leftLength) {
                arrayOfNums[k++] = left[i++];
            }
            while (j < rightLength) {
                arrayOfNums[k++] = right[j++];
            }
        }
    }
}

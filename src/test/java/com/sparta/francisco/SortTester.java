package com.sparta.francisco;

import com.sparta.francisco.exceptions.SorterLoaderException;
import com.sparta.francisco.sorters.Sorter;
import com.sparta.francisco.start.SortFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class SortTester {
    private static Sorter sorter;

    private int[] unsortedArray;

    @BeforeAll
    public static void setClass() throws SorterLoaderException {
        sorter = SortFactory.getSorter(1);
        System.out.println("testing bubble");
    }

    @BeforeEach
    public void setup() {
        Random random = new Random();
        unsortedArray = new int[10];
        for (int i = 0; i<10; i++){
            unsortedArray[i] = random.nextInt(100)+1;
        }
    }

    @Test
    public void testIsSorted() {
        int[] sortedArray = sorter.sort(unsortedArray);
        for (int i = 0; i < sortedArray.length-1; i++) {
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testOddSizedArray() {
        int[] unsortedArray = {7,2,4,6,1,3,8,5,9};
        int[] sortedArray = sorter.sort(unsortedArray);
        Assertions.assertEquals(sortedArray.length, unsortedArray.length);
        Assertions.assertEquals(1, sortedArray.length%2);
        for (int i = 0; i < sortedArray.length-1; i++) {
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testAlreadySortedArray() {
        int[] unsortedArray = {1,2,3,4};
        int[] sortedArray = sorter.sort(unsortedArray);
        Assertions.assertEquals(sortedArray.length, unsortedArray.length);
        for (int i = 0; i < sortedArray.length-1; i++) {
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }

    @Test
    public void testLargeArray() {
        int[] sortedArray = sorter.sort(unsortedArray);
        Assertions.assertEquals(sortedArray.length, unsortedArray.length);
        for (int i = 0; i < sortedArray.length-1; i++) {
            Assertions.assertTrue(sortedArray[i+1] >= sortedArray[i]);
        }
    }


}

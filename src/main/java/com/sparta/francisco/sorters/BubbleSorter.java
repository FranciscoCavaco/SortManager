package com.sparta.francisco.sorters;

import com.sparta.francisco.display.DisplayManager;
import com.sparta.francisco.logging.CustomLoggerConfiguration;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSorter implements Sorter{

    private static final Logger logger = Logger.getLogger("list-logger");
    @Override
    public int[] sort(int[] arrayOfNums) {
        CustomLoggerConfiguration.configureLogger(logger, Level.INFO);
        logger.log(Level.INFO, "Bubble sort Method had started");
        logger.log(Level.INFO, "Using the following list: " + Arrays.toString(arrayOfNums));


        int arrayLength = arrayOfNums.length;
        boolean sorted = true;
        int[] resultingArray = arrayOfNums;


        if (arrayLength == 0){
            resultingArray = null;
        }

        if (arrayLength == 1){
            return resultingArray;
        }

        sorted = Helper.isSorted(arrayOfNums, sorted);

        if (sorted) {
            DisplayManager.printSorted();
        } else {
            for (int i = 0; i < arrayLength - 1; i++) {
                logger.log(Level.FINE, "Outer loop iteration" + i);
                for (int j = 0; j < arrayLength - i - 1; j++) {
                    logger.log(Level.FINER, "Inner loop iteration: "+ j);
                    swapped(arrayOfNums, j, resultingArray);
                }
            }
            //System.out.println(Arrays.toString(arrayOfNums));
        }
        logger.log(Level.INFO, "Array sorted: "+Arrays.toString(resultingArray));
        return resultingArray;
    }

    private static void swapped(int[] arrayOfNums, int j, int[] resultingArray) {
        if (arrayOfNums[j +1] < arrayOfNums[j]) {
            int temp = arrayOfNums[j];
            resultingArray[j] = arrayOfNums[j +1];
            resultingArray[j +1] = temp;
        }
    }
}

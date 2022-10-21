package com.sparta.francisco.start;

import com.sparta.francisco.exceptions.SorterLoaderException;
import com.sparta.francisco.sorters.*;

public class SortFactory {

    public static Sorter getSorter(int choice) throws SorterLoaderException {
        return switch (choice) {
            case 1 -> new BubbleSorter();
            case 2 -> new BinarySorter();
            case 3 -> new InsertionSorter();
            case 4 -> new MergeSorter();
            case 5 -> new QuickSorter();
            default -> throw new SorterLoaderException("Invalid Sorter choice: " + choice);
        };

    }
}

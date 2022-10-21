package com.sparta.francisco.start;

import com.sparta.francisco.exceptions.SorterLoaderException;
import com.sparta.francisco.sorters.BinarySorter;
import com.sparta.francisco.sorters.QuickSorter;

import static com.sparta.francisco.start.SortLoader.arrayInitializer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SorterLoaderException {
        SortLoader.menu();
        //int[] unsortedArray = arrayInitializer(10);
        //new BinarySorter().sort(unsortedArray);

    }
}

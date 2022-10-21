package com.sparta.francisco.sorters;

import com.sparta.francisco.sorters.binaryTree.BinaryTree;

public class BinarySorter implements Sorter{

    @Override
    public int[] sort(int[] arrayToSort) {
        BinaryTree binaryTree = new BinaryTree(arrayToSort[0]);

        binaryTree.addElements(arrayToSort);
        return new int[]{0};
    }
}

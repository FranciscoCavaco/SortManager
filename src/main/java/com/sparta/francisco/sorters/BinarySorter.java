package com.sparta.francisco.sorters;

import com.sparta.francisco.sorters.binaryTree.BinaryTree;

public class BinarySorter implements Sorter{

    @Override
    public int[] sort(int[] arrayToSort) {
        BinaryTree binaryTree = new BinaryTree();

        for (int i = 0; i < arrayToSort.length; i++) {
            binaryTree.insert(arrayToSort[i]);
        }

        return binaryTree.inorder();
    }
}

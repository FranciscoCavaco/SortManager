package com.sparta.francisco.sorters.binaryTree;

import com.sparta.francisco.exceptions.ChildNotFoundException;

public interface IBinaryTree {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
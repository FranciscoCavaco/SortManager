package com.sparta.francisco.sorters.binaryTree;

import com.sparta.francisco.exceptions.ChildNotFoundException;

public class BinaryTree implements IBinaryTree {
    private final Node rootNode;

    public BinaryTree(int element){
        this.rootNode = new Node(element);
    }

    public void addElementToTree(int element){
        addNodeToTree(rootNode, element);
    }


    private void addNodeToTree(Node node, int element) {
        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else {
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    @Override
    public int getRootElement() {
        return 0;
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {

    }

    @Override
    public void addElements(int[] elements) {

    }

    public boolean findElement(int element) {
        Node node = findNode(element);
        return node != null;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }

    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null){
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else if (element > node.getValue()) {
                node = node.getRightChild();
            }
        }
        return null;
    }

    public static class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public boolean isLeftChildEmpty() {
            return leftChild == null;
        }

        public boolean isRightChildEmpty() {
            return rightChild == null;
        }
    }
}

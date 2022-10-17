package com.sparta.francisco.sorters.binaryTree;

public class BinaryTree {
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

    public boolean findElement(int element) {
        Node node = findNode(element);
        return node != null;
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
}

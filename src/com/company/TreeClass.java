package com.company;

public class TreeClass implements Tree {
    Node head;


    public Node addNode(Node current, Integer value) {
        if (current == null) {
            current = new Node(value);
        } else if (current.getValue() > value) {
            current.left = addNode(current.left, value);

        } else if (current.getValue() < value) {
            current.right = addNode(current.right, value);
        }
        return current;
    }

    @Override
    public void addNode(Integer value) {
        head = addNode(head, value);
    }

    @Override
    public Node search(Integer value) {
        return search(head, value);
    }

    @Override
    public void remove(Integer value) {

    }

//    private void remove(Node node, Integer value){
//        if (node.getValue() == value){
//            node = null;
//        }
//    }


    private Node search(Node node, Integer value) {
        if (node == null) {
            return null;
        } else if (node.getValue() == value) {
            return node;
        } else if (node.right.getValue() == value) {
            node.right = search(node.right, value);
        } else if (node.left.getValue() == value) {
            node.left = search(node.left, value);
        }

        return node;
    }



}


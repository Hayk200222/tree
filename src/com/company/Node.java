package com.company;

public class Node {
    Node right;
    Node left;

    public Node(Integer value) {
        this.value = value;
        right = null;
        left = null;
    }

    private final Integer value;

    public Integer getValue() {
        return value;
    }
}

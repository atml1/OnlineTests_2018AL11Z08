package com.acquisio.basic.java.question02;

/**
 * A node in a tree structure.
 * @author Alfred
 */
class Node {
    /**
     * The value of the node.
     */
    String name;
    /**
     * The children nodes of the node.
     * This is a non-null value.  
     */
    Node children[];

    /**
     * Constructor.
     * 
     * @param name The value of the node.
     * @param children The children of the node.
     */
    public Node(String name, Node... children) {
        this.name = name;
        if (children != null) {
            this.children = new Node[children.length];
            System.arraycopy(
                    children, 0, this.children, 0, children.length);
        }
    }
}



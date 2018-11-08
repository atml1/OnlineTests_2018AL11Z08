package com.acquisio.basic.java.question04;

/**
 * Represents a generic item.
 * 
 * @author Alfred
 */
abstract class Item {

    /**
     * Name of the item.
     */
    String name;
    
    /**
     * Number of the item.
     */
    int quantity;
    
    /**
     * Price of the item.
     */
    double price;

    /**
     * Constructor.
     * 
     * @param name Name of the item.
     * @param quantity Number of the item.
     * @param price Price of the item.
     */
    Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Retrieves the name of the item.
     * 
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the number of the item.
     * 
     * @return The number of the item.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Retrieves the price of the item.
     * 
     * @return The price of the item.
     */
    public double getPrice() {
        return price;
    }
}

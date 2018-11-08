package com.acquisio.basic.java.question04;

/**
 * Represents a fruit.
 * 
 * @author Alfred
 */
class Fruit extends Item {
    /**
     * Color of the fruit.
     */
    private String color;

    /**
     * Constructor.
     * 
     * @param name The name of the fruit.
     * @param color The color of the fruit.
     * @param quantity The number of the fruit.
     * @param price The price of the fruit.
     */
    Fruit(String name, String color, int quantity, double price) {
        super(name, quantity, price);
        this.color = color;
    }

    /**
     * Retrieves the color of the item.
     * 
     * @return The color of the item.
     */
    public String getColor() {
        return color;
    }
}

package com.acquisio.basic.java.question04;

/**
 * Represents a vegetable.
 * 
 * @author Alfred
 */
class Vegetable extends Item {

    /**
     * Type of the vegetable.
     */
    private String type;
    
    /**
     * Origin of the vegetable.
     */
    private String origin;

    /**
     * Constructor. 
     * 
     * @param name Name of the vegetable.
     * @param type Type of the vegetable.
     * @param origin Origin of the vegetable.
     * @param quantity Number of the vegetable.
     * @param price Price of the vegetable.
     */
    Vegetable(String name, String type, String origin, int quantity, double price) {
        super(name, quantity, price);
        this.type = type;
        this.origin = origin;
    }

    /**
     * Retrieves the type of the vegetable.
     * 
     * @return The type of the vegetable.
     */
    public String getType() {
        return type;
    }

    /**
     * Retrieves the origin of the vegetable.
     * 
     * @return The origin of the vegetable.
     */
    public String getOrigin() {
        return origin;
    }
}

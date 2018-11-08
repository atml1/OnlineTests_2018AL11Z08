package com.acquisio.basic.java.question04;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemCollectionTest {
    @Test
    public void addRemove() throws Exception {
        Fruit apple = new Fruit("Apple", "red", 50, 0.99d);
        ItemCollection<Fruit> collection = new ItemCollection<Fruit>();
        
        assertFalse(collection.remove(apple));
        collection.add(apple);
        assertTrue(collection.remove(apple));
        assertFalse(collection.remove(apple));
    }
    
    @Test
    public void first() throws Exception {
        Fruit apple = new Fruit("Apple", "red", 50, 0.99d);
        Fruit banana = new Fruit("Banana", "yellow", 150, 0.49d);
        ItemCollection<Fruit> collection = new ItemCollection<Fruit>();
        
        assertNull(collection.getFirst());
        collection.add(apple);
        collection.add(banana);
        assertEquals(apple, collection.getFirst());
        collection.remove(apple);
        assertEquals(banana, collection.getFirst());
    }
    
    @Test
    public void last() throws Exception {
        Fruit apple = new Fruit("Apple", "red", 50, 0.99d);
        Fruit banana = new Fruit("Banana", "yellow", 150, 0.49d);
        ItemCollection<Fruit> collection = new ItemCollection<Fruit>();
        
        assertNull(collection.getLast());
        collection.add(apple);
        collection.add(banana);
        assertEquals(banana, collection.getLast());
        collection.remove(banana);
        assertEquals(apple, collection.getLast());
    }
    
    @Test
    public void findFirst() throws Exception {
        Fruit apple1 = new Fruit("Apple", "red", 50, 0.99d);
        Fruit apple2 = new Fruit("Apple", "green", 45, 1.29d);
        ItemCollection<Fruit> collection = new ItemCollection<Fruit>();
        
        assertNull(collection.findFirst("Apple"));
        collection.add(apple1);
        collection.add(apple2);
        
        assertEquals(apple1, collection.findFirst("Apple"));
        collection.remove(apple1);
        assertEquals(apple2, collection.findFirst("Apple"));
    }
}
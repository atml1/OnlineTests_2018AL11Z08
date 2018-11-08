package com.acquisio.basic.java.question01;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooBarTest {

    @Test
    public void testFooBar1() {
        assertEquals("1", new FooBar().fooBar(1));
    }
    
    @Test
    public void testFooBar3() {
        assertEquals("Foo", new FooBar().fooBar(3));
    }
    
    @Test
    public void testFooBar5() {
        assertEquals("Bar", new FooBar().fooBar(5));
    }
    
    @Test
    public void testFooBar15() {
        assertEquals("FooBar", new FooBar().fooBar(15));
    }

}
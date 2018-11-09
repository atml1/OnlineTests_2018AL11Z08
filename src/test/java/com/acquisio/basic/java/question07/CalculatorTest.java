package com.acquisio.basic.java.question07;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() throws Exception {
        assertEquals(new Integer(5), Calculator.applyOperation(1, 4, '+'));
    }
    
    @Test
    public void subtract() throws Exception {
        assertEquals(new Integer(-3), Calculator.applyOperation(1, 4, '-'));
    }
    
    @Test
    public void multiply() throws Exception {
        assertEquals(new Integer(4), Calculator.applyOperation(1, 4, '*'));
    }
    
    @Test
    public void divide() throws Exception {
        assertEquals(new Integer(0), Calculator.applyOperation(1, 4, '/'));
        assertEquals(new Integer(1), Calculator.applyOperation(4, 3, '/'));
        assertEquals(new Integer(2), Calculator.applyOperation(4, 2, '/'));
        assertNull(Calculator.applyOperation(4, 0, '/'));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void unknownOperation() throws Exception {
        Calculator.applyOperation(1, 4, 'a');
    }
}

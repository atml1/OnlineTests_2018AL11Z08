package com.acquisio.basic.java.question03;

import org.junit.Test;

import static org.junit.Assert.*;

public class IssueResolvingTest {
    @Test
    public void factorial() throws Exception {
        assertEquals(5040, new IssueResolving().factorial(7));
    }
    
    @Test
    public void factorial1() throws Exception {
        assertEquals(1, new IssueResolving().factorial(1));
    }
    
    @Test
    public void factorial2() throws Exception {
        assertEquals(2, new IssueResolving().factorial(2));
    }

}
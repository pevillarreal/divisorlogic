/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DividerOutputObjectTest {

    public DividerOutputObjectTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getOutput method, of class DividerOutputObject.
     */
    @Test
    public void testGetOutput() {
        System.out.println("getOutput");
        DividerOutputObject instance = new DividerOutputObject(1, "one");
        String expResult = "one";
        String result = instance.getOutput();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class DividerOutputObject.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        DividerOutputObject o = new DividerOutputObject(1, "one");
        DividerOutputObject instance = new DividerOutputObject(5, "five");
        int expResult = 1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class DividerOutputObject.
     */
    @Test
    public void testIsDivisor() {
        System.out.println("isDivisor");
        DividerOutputObject o = new DividerOutputObject(2, "two");        
        boolean isDivisor = o.isDivisor(2);
        assertTrue(isDivisor);
    }
}

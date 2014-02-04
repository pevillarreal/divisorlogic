/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DividerCheckRunnerTest {
    
    public DividerCheckRunnerTest() {
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
     * Test of runDivisionCheck method, of class DividerCheckRunner.
     */
    @Test
    public void testRunDivisionCheck_int_int() {
        System.out.println("runDivisionCheck 2 arguments");
        int startNumber = 1;
        int endNumber = 5;
        String expResult = "1\n2\nfizz \n4\nbuzz \n";
        String result = DividerCheckRunner.runDivisionCheck(startNumber, endNumber);
        assertEquals(expResult, result);
    }

    /**
     * Test of runDivisionCheck method, of class DividerCheckRunner.
     */
    @Test
    public void testRunDivisionCheck_4args() {
        System.out.println("runDivisionCheck 4 arguments");
        int startNumber = 1;
        int endNumber = 5;
        String divisibleByThreeOutput = "fizz";
        String divisibleByFiveOutput = "buzz";
        String expResult = "1\n2\nfizz \n4\nbuzz \n";
        String result = DividerCheckRunner.runDivisionCheck(startNumber, endNumber, divisibleByThreeOutput, divisibleByFiveOutput);
        assertEquals(expResult, result);
    }

    /**
     * Test of runDivisionCheck method, of class DividerCheckRunner.
     */
    @Test
    public void testRunDivisionCheck_3args() {
        System.out.println("runDivisionCheck 3 arguments");
        int startNumber = 1;
        int endNumber = 10;
        List<DividerOutputObject> divisionData = new ArrayList<DividerOutputObject>();
        divisionData.add(new DividerOutputObject(3, "fizz"));
        divisionData.add(new DividerOutputObject(5, "buzz"));
        divisionData.add(new DividerOutputObject(10, "bag"));
        String expResult = "1\n2\nfizz \n4\nbuzz \nfizz \n7\n8\nfizz \nbuzz bag \n";
        String result = DividerCheckRunner.runDivisionCheck(startNumber, endNumber, divisionData);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testArgumentsCheck() {
        System.out.println("runDivisionCheck argument validation");
        int startNumber = 1;
        int endNumber = 0;
        List<DividerOutputObject> divisionData = null;
        boolean expResult = false;
        boolean result = true;
        try {
        DividerCheckRunner.runDivisionCheck(startNumber, endNumber, divisionData);
        } catch (IllegalArgumentException ex) {
            expResult = true;
        }
        assertEquals(expResult, result);
    }
    
    @Test
    public void testArgumentsCheckNegativeNumbers() {
        System.out.println("runDivisionCheck argument validation negative numbers");
        int startNumber = -5;
        int endNumber = -1;
        List<DividerOutputObject> divisionData = null;
        boolean expResult = false;
        boolean result = true;
        try {
        DividerCheckRunner.runDivisionCheck(startNumber, endNumber, divisionData);
        } catch (IllegalArgumentException ex) {
            expResult = true;
        }
        assertEquals(expResult, result);
    }
}

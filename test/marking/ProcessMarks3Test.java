/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marking;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author comqaam
 */
public class ProcessMarks3Test {
    ProcessingMarks myUnit;

    public ProcessMarks3Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        myUnit = new ProcessingMarks();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void markprocess3fail() {
        int mark = 35;
        String result = "Fail";
        String actual = myUnit.processMark3(mark);
        assertEquals(actual, result);
    }

    @Test
    public void markprocess3fail2() {
        int mark = 35;
        String result = "fail";
        String actual = myUnit.processMark3(mark);
        assertEquals(actual, result);
    }

    @Test
    public void markprocess3fail3() {
        int mark = 35;
        String result = " Fail";
        String actual = myUnit.processMark3(mark);
        assertEquals(actual, result);
    }

    @Test
    public void markprocess3failString() {
        int mark = 35;
        String result = " fail";
        String actual = myUnit.processMark3(mark);
        boolean answer = actual.equalsIgnoreCase(result.trim());
        assertTrue(answer);
    }

//    @Test
//    public void markprocess3pass() {
//        int mark = 55;
//        String result = "Pass";
//        String actual = myUnit.processMark3(mark);
//        boolean comparison = actual.equals("Pass");
//        assertTrue(comparison);
//    }
//
//    @Test
//    public void markprocess3border() {
//        int mark = 40;
//
//        boolean actual = myUnit.processMark2(mark);
//        assertTrue(actual);
//    }
}

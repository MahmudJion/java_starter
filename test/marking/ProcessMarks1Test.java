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
public class ProcessMarks1Test {
    ProcessingMarks myUnit;
    
    public ProcessMarks1Test() {
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
    public void markprocess1fail() {
        int mark = 35;
        int expected = 0;
        int actual = myUnit.processMark1(mark);
        assertEquals(expected,actual);    
    }
    
    @Test
    public void markprocess1pass() {
        int mark = 55;
        int expected = 1;
        int actual = myUnit.processMark1(mark);
        assertEquals(expected,actual);    
    }
    
    @Test
    public void markprocess1border() {
        int mark = 40;
        int expected = 1;
        int actual = myUnit.processMark1(mark);
        assertEquals(expected,actual);    
    }
}

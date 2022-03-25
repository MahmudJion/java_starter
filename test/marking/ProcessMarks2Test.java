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
public class ProcessMarks2Test {
    
    ProcessingMarks myUnit;
    public ProcessMarks2Test() {
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
    public void markprocess2fail() {
        int mark = 35;
        boolean actual = myUnit.processMark2(mark);
        assertFalse(actual);    
    }
    
    @Test
    public void markprocess2pass() {
        int mark = 55;
        
        boolean actual = myUnit.processMark2(mark);
        assertTrue(actual);    
    }
    
    @Test
    public void markprocess2border() {
        int mark = 40;
        
        boolean actual = myUnit.processMark2(mark);
        assertTrue(actual);    
    }
}

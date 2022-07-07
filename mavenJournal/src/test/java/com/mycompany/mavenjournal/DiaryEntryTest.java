package com.mycompany.mavenjournal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stiv
 */
public class DiaryEntryTest {

    public DiaryEntryTest() {
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
     * Test of getTitle method, of class DiaryEntry.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        DiaryEntry instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    @Test
    public void testGetBodyText() {
        System.out.println("getBodyText");
        DiaryEntry instance = null;
        String expResult = "";
        String result = instance.getBodyText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGoPrevFromDifferentPositions()
    {
    }



}

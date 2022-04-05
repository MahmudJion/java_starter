/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DiaryEntryCollectionTest {
    
    public DiaryEntryCollectionTest() {
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
     * Test of getCurrentEntryIndex method, of class DiaryEntryCollection.
     */


    /**
     * Test of getCurrentDiaryEntry method, of class DiaryEntryCollection.
     */
    @Test
    public void testGetCurrentDiaryEntry() {
        System.out.println("getCurrentDiaryEntry");
        DiaryEntryCollection instance = new DiaryEntryCollection();
        DiaryEntry expResult = null;
        DiaryEntry result = instance.getCurrentDiaryEntry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of setCurrentEntryIndex method, of class DiaryEntryCollection.
     */
    @Test
    public void testSetCurrentEntryIndex() {
        System.out.println("setCurrentEntryIndex");
        int currentEntryIndex = 0;
        DiaryEntryCollection instance = new DiaryEntryCollection();
        instance.setCurrentEntryIndex(currentEntryIndex);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addEntry method, of class DiaryEntryCollection.
     */
    @Test
    public void testAddEntry() {
        System.out.println("addEntry");
        String title = "";
        String bodyText = "";
        DiaryEntryCollection instance = new DiaryEntryCollection();
        boolean expResult = false;
        boolean result = instance.addEntry(title, bodyText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class DiaryEntryCollection.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        DiaryEntryCollection instance = new DiaryEntryCollection();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDeletion()
    {
        System.out.println("Delete");
        String title = "";
        String bodyText = "";
        DiaryEntryCollection instance = new DiaryEntryCollection();
        boolean expResult = false;
        boolean result = instance.deleteEntry(title, bodyText);
        assertEquals(expResult, result);
    }
    
}

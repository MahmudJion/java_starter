/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

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
public class TemperatureReadingsTest {
    
    public TemperatureReadingsTest() {
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
     * Test of addReading method, of class TemperatureReadings.
     */
    @Test
    public void testAddReading() {
        System.out.println("addReading");
        temperatureData td = new temperatureData();
        td.setTempAndUnits("37", true);
        TemperatureReadings instance = new TemperatureReadings();
        instance.addReading(td);
        //assertNotEquals("", instance.toString());
        assertEquals(1, instance.size());  
    }

    /**
     * Test of toString method, of class TemperatureReadings.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TemperatureReadings instance = new TemperatureReadings();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testNullReadingAdded() {
        //checking that a temperature reading is not added to the list if it is a null object
    }
    
    
    @Test
    public void testSecondReadingAddedDifferentToFirst() {
        //checking if two different readings are added, that the second is different to the first
    }
    
    
}

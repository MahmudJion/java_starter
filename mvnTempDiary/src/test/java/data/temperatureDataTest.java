/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class temperatureDataTest {
    
        public temperatureDataTest() {
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
     * Test of getTemperature method, of class temperatureData.
     */
    @Test
    public void testGetTemperature() {
        
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testGetTemperatureThirtySix() {
  
        // TODO review the generated test code and remove the default call to fail.
    }

    
    

    /**
     * Test of setIsCelsius method, of class temperatureData.
     */
    @Test
    public void testSetIsCelsius() {
        // set the isCelsius variable and check its the same when you get it
        System.out.println("setIsCelsius");
        
   
    }

    /**
     * Test of setTempAndUnits method, of class temperatureData.
     */
    @Test
    public void testSetTempAndUnits() {
        //when setting the temperature and units by string
        //check the system is set correctly
        System.out.println("setTempAndUnits");
        
    }
    
    @Test
    public void testSetTempAndUnitsNegative() {
        //check the system ignores negative entries
        System.out.println("setTempAndUnits");
        

    }
    
    
    
    
    @Test
    public void testSetTempAndUnitsIllegal() {
        //check the system ignores non-numeric values if input
        System.out.println("setTempAndUnits");
        
    }

}

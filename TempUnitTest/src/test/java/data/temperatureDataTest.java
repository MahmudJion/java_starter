/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author victorsteven
 */
public class temperatureDataTest {
    
    public temperatureDataTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    /**
     *
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTemperature method, of class temperatureData.
     */
    @org.junit.jupiter.api.Test
    public void testGetTemperature() {
        System.out.println("getTemperature");
        temperatureData instance = new temperatureData();
        float expResult = 0.0F;
        float result = instance.getTemperature();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTemperature method, of class temperatureData.
     */
    @org.junit.jupiter.api.Test
    public void testSetTemperature() {
        System.out.println("setTemperature");
        float temperature = 0.0F;
        temperatureData instance = new temperatureData();
        instance.setTemperature(temperature);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsCelsius method, of class temperatureData.
     */
    @org.junit.jupiter.api.Test
    public void testIsIsCelsius() {
        System.out.println("isIsCelsius");
        temperatureData instance = new temperatureData();
        boolean expResult = false;
        boolean result = instance.isIsCelsius();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsCelsius method, of class temperatureData.
     */
    @org.junit.jupiter.api.Test
    public void testSetIsCelsius() {
        System.out.println("setIsCelsius");
        boolean isCelsius = false;
        temperatureData instance = new temperatureData();
        instance.setIsCelsius(isCelsius);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempAndUnits method, of class temperatureData.
     */
    @org.junit.jupiter.api.Test
    public void testSetTempAndUnits() {
        System.out.println("setTempAndUnits");
        String temperatureStr = "";
        boolean isCelsius = false;
        temperatureData instance = new temperatureData();
        instance.setTempAndUnits(temperatureStr, isCelsius);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdvice method, of class temperatureData.
     */
    @org.junit.jupiter.api.Test
    public void testSetAdvice() {
        System.out.println("setAdvice");
        float temperature = 0.0F;
        temperatureData instance = new temperatureData();
        instance.setAdvice(temperature);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

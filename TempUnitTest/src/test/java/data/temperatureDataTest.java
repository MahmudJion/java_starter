/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 *
 * @author mh21act
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
        System.out.println("getTemperature");
        temperatureData instance = new temperatureData();
        float expResult = 0.0F;
        float result = instance.getTemperature();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemperature method, of class temperatureData.
     */
    @Test
    public void testSetTemperature() {
        System.out.println("setTemperature");
        float temperature = 0.0F;
        temperatureData instance = new temperatureData();
        instance.setTemperature(temperature);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsCelsius method, of class temperatureData.
     */
    @Test
    public void testIsIsCelsius() {
        System.out.println("isIsCelsius");
        temperatureData instance = new temperatureData();
        boolean expResult = false;
        boolean result = instance.isIsCelsius();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsCelsius method, of class temperatureData.
     */
    @Test
    public void testSetIsCelsius() {
        System.out.println("setIsCelsius");
        boolean isCelsius = false;
        temperatureData instance = new temperatureData();
        instance.setIsCelsius(isCelsius);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempAndUnits method, of class temperatureData.
     */
    @Test
    public void testSetTempAndUnits() {
        System.out.println("setTempAndUnits");
        String temperatureStr = "";
        boolean isCelsius = false;
        temperatureData instance = new temperatureData();
        instance.setTempAndUnits(temperatureStr, isCelsius);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdvice method, of class temperatureData.
     */
    @Test
    public void testSetAdvice() {
        System.out.println("setAdvice");
        float temperature = 0.0F;
        temperatureData instance = new temperatureData();
        instance.setAdvice(temperature);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetCelsiusByFahrenheit() {
        System.out.println("setTemperature");
        float temperature = 37.0F;
        float expResult = 37.0F;
        temperatureData instance = new temperatureData();
        instance.setTemperature(temperature);
        float result = instance.getTemperature();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    private void assertEquals(boolean expResult, boolean result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(float expResult, float result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

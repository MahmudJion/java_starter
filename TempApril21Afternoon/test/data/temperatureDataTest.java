package data;

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
        System.out.println("getTemperature");
        temperatureData instance = new temperatureData();
        float expResult = 0.0F;
        float result = instance.getTemperature();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetTemperatureThirtySix() {
        System.out.println("getTemperature");
        temperatureData instance = new temperatureData();
        float expResult = 36.0F;
        instance.setTemperature(36.0F);
        float result = instance.getTemperature();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
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

    }

    /**
     * Test of setIsCelsius method, of class temperatureData.
     */
    @Test
    public void testSetIsCelsius() {
        System.out.println("setIsCelsius");
        boolean isCelsius = true;
        temperatureData instance = new temperatureData();
        instance.setIsCelsius(isCelsius);
        assertEquals(isCelsius,instance.isIsCelsius());
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setTempAndUnits method, of class temperatureData.
     */
    @Test
    public void testSetTempAndUnits() {
        System.out.println("setTempAndUnits");
        String temperatureStr = "38";
        boolean isCelsius = true;
        temperatureData instance = new temperatureData();
        instance.setTempAndUnits(temperatureStr, isCelsius);
        assertEquals(38.0F,instance.getTemperature(),0.0);
    }

    @Test
    public void testSetTempAndUnitsNegative() {
        float expResult, result;
        System.out.println("setTempAndUnits");
        String temperatureStr = "-1";
        boolean isCelsius = true;
        temperatureData instance = new temperatureData();
        expResult = instance.getTemperature();
        instance.setTempAndUnits(temperatureStr, isCelsius);
        result = instance.getTemperature();
        assertEquals(result,expResult,0.0);


    }


    @Test
    public void testSetTempAndUnitsIllegal() {
        System.out.println("setTempAndUnits");
        String temperatureStr = "36r";
        boolean isCelsius = true;

        temperatureData instance = new temperatureData();
        float expResult = instance.getTemperature();
        instance.setTempAndUnits(temperatureStr, isCelsius);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult,instance.getTemperature(),0.0);
    }

    /**
     * Test of setAdvice method, of class temperatureData.
     */


}

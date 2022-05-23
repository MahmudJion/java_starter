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
public class journeyCosterTest {

    public journeyCosterTest() {
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
     * Test of getTotalCost method, of class journeyCoster.
     */
    @Test
    public void testGetTotalCost() {
        System.out.println("getTotalCost");
        journeyCoster instance = new journeyCoster();
        float expResult = 0.0F;
        float result = instance.getTotalCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalCost method, of class journeyCoster.
     */
    @Test
    public void testSetTotalCost() {
        System.out.println("setTotalCost");
        float totalCost = 0.0F;
        journeyCoster instance = new journeyCoster();
        instance.setTotalCost(totalCost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJourneyValues method, of class journeyCoster.
     */
    @Test
    public void testSetJourneyValues() {
        System.out.println("setJourneyValues");
        String mpg = "";
        String pricePerLitre = "";
        String miles = "";
        journeyCoster instance = new journeyCoster();
        instance.setJourneyValues(mpg, pricePerLitre, miles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMpg method, of class journeyCoster.
     */
    @Test
    public void testGetMpg() {
        System.out.println("getMpg");
        journeyCoster instance = new journeyCoster();
        float expResult = 0.0F;
        float result = instance.getMpg();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMpg method, of class journeyCoster.
     */
    @Test
    public void testSetMpg() {
        System.out.println("setMpg");
        float mpg = 0.0F;
        journeyCoster instance = new journeyCoster();
        instance.setMpg(mpg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiles method, of class journeyCoster.
     */
    @Test
    public void testGetMiles() {
        System.out.println("getMiles");
        journeyCoster instance = new journeyCoster();
        float expResult = 0.0F;
        float result = instance.getMiles();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiles method, of class journeyCoster.
     */
    @Test
    public void testSetMiles() {
        System.out.println("setMiles");
        float miles = 0.0F;
        journeyCoster instance = new journeyCoster();
        instance.setMiles(miles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPricePerLitre method, of class journeyCoster.
     */
    @Test
    public void testGetPricePerLitre() {
        System.out.println("getPricePerLitre");
        journeyCoster instance = new journeyCoster();
        float expResult = 0.0F;
        float result = instance.getPricePerLitre();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPricePerLitre method, of class journeyCoster.
     */
    @Test
    public void testSetPricePerLitre() {
        System.out.println("setPricePerLitre");
        float pricePerLitre = 0.0F;
        journeyCoster instance = new journeyCoster();
        instance.setPricePerLitre(pricePerLitre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}

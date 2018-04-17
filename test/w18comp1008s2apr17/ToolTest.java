package w18comp1008s2apr17;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class ToolTest
{
    Tool validTool;
    
    public ToolTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        validTool = new Tool("hammer", "Stanket", 29.99);
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getName method, of class Tool.
     */
    @Test
    public void testGetName()
    {
        String expResult = "hammer";
        String result = validTool.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Tool.
     */
    @Test
    public void testSetName()
    {
        System.out.println("setName");
        String name = "";
        Tool validTool = null;
        validTool.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrand method, of class Tool.
     */
    @Test
    public void testGetBrand()
    {
        System.out.println("getBrand");
        Tool validTool = null;
        String expResult = "";
        String result = validTool.getBrand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBrand method, of class Tool.
     */
    @Test
    public void testSetBrand()
    {
        System.out.println("setBrand");
        String brand = "";
        Tool validTool = null;
        validTool.setBrand(brand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Tool.
     */
    @Test
    public void testGetPrice()
    {
        double expResult = 29.99;
        double result = validTool.getPrice();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of setPrice method, of class Tool.
     */
    @Test
    public void testSetPrice()
    {
        validTool.setPrice(10.00);
        assertEquals(10.00, validTool.getPrice(), 0.0);
    }
    
    /**
     * Test of setPrice method, of class Tool.
     */
    @Test
    public void testSetPriceInvalidLow()
    {
        try{
            validTool.setPrice(-1);
            fail("a price of $-1 should trigger an exception");
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("Invalid low price: %s%n", e.getMessage());
        }
    }
    
    /**
     * Test of setPrice method, of class Tool.
     */
    @Test
    public void testSetPriceInvalidHigh()
    {
        try{
            validTool.setPrice(201);
            fail("a price of $201 should trigger an exception");
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("Invalid low price: %s%n", e.getMessage());
        }
    }

    /**
     * Test of getDescription method, of class Tool.
     */
    @Test
    public void testGetDescription()
    {
        System.out.println("getDescription");
        Tool instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

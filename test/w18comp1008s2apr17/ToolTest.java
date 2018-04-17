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
        String expResult = "";
        String result = validTool.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("getPrice");
        Tool validTool = null;
        double expResult = 0.0;
        double result = validTool.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Tool.
     */
    @Test
    public void testSetPrice()
    {
        System.out.println("setPrice");
        double price = 0.0;
        Tool validTool = null;
        validTool.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

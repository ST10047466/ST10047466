package Testing;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
// @author ST10047466


import ProgPOE10047466.Task;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luke
 */
public class TaskTest {
    
    public TaskTest() {
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
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        Task instance = new Task();
        String expResult = "";
        String result = instance.createTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskCount method, of class Task.
     */
    @Test
    public void testGetTaskCount() {
        System.out.println("getTaskCount");
        int expResult = 0;
        int result = Task.getTaskCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskCount method, of class Task.
     */
    @Test
    public void testSetTaskCount() {
        System.out.println("setTaskCount");
        int aTaskCount = 0;
        Task.setTaskCount(aTaskCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalHours method, of class Task.
     */
    @Test
    public void testGetTotalHours() {
        System.out.println("getTotalHours");
        int expResult = 0;
        int result = Task.getTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalHours method, of class Task.
     */
    @Test
    public void testSetTotalHours() {
        System.out.println("setTotalHours");
        int aTotalHours = 0;
        Task.setTotalHours(aTotalHours);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettName method, of class Task.
     */
    @Test
    public void testGettName() {
        System.out.println("gettName");
        Task instance = new Task();
        String expResult = "";
        String result = instance.gettName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settName method, of class Task.
     */
    @Test
    public void testSettName() {
        System.out.println("settName");
        String tName = "";
        Task instance = new Task();
        instance.settName(tName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettNum method, of class Task.
     */
    @Test
    public void testGettNum() {
        System.out.println("gettNum");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.gettNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettDesc method, of class Task.
     */
    @Test
    public void testGettDesc() {
        System.out.println("gettDesc");
        Task instance = new Task();
        String expResult = "";
        String result = instance.gettDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settDesc method, of class Task.
     */
    @Test
    public void testSettDesc() {
        System.out.println("settDesc");
        String tDesc = "";
        Task instance = new Task();
        instance.settDesc(tDesc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettDev method, of class Task.
     */
    @Test
    public void testGettDev() {
        System.out.println("gettDev");
        Task instance = new Task();
        String expResult = "";
        String result = instance.gettDev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settDev method, of class Task.
     */
    @Test
    public void testSettDev() {
        System.out.println("settDev");
        String tDev = "";
        Task instance = new Task();
        instance.settDev(tDev);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettTime method, of class Task.
     */
    @Test
    public void testGettTime() {
        System.out.println("gettTime");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.gettTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettID method, of class Task.
     */
    @Test
    public void testGettID() {
        System.out.println("gettID");
        Task instance = new Task();
        String expResult = "";
        String result = instance.gettID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settID method, of class Task.
     */
    @Test
    public void testSettID() {
        System.out.println("settID");
        String tID = "";
        Task instance = new Task();
        instance.settID(tID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettStat method, of class Task.
     */
    @Test
    public void testGettStat() {
        System.out.println("gettStat");
        Task instance = new Task();
        String expResult = "";
        String result = instance.gettStat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

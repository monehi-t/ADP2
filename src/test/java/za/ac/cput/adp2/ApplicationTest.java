/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2;

import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;


/**
 *
 * @author CPUT
 */
public class ApplicationTest {

   private Application app1;
    private Application app2;
    private Application app3;
    private Application app4;

    
    public ApplicationTest() {  
    }
      
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        app1 = new Application();
        app2 = app4;
        app3 = new Application();
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test        
    void testEquality()
    {
        assertEquals(true,app1.Valid("Blackboard"));
    }
    @Test
    void testIdentity()
    {
       
        assertSame(app2,app4);
    }
    
    @Test
    void testFailing()
    {
       fail("Failing Test");
        assertSame(true,app3.Valid("HR"));
    
    }
    
   @Test
   void TimeoutExceed ()
   {
       assertTimeout(Duration.ofMillis(17), () -> Thread.sleep(10));
   
   }
 

    /**
     * Test of main method, of class Application.
     */
    @Test
    @Disabled
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Application.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

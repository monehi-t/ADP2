/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2;

220187568
import java.time.Duration;
=======
import java.util.concurrent.TimeUnit;
import jdk.nashorn.internal.ir.annotations.Ignore;
 master


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

220187568

=======
import org.junit.jupiter.api.Timeout;
master

/**
 *
 * @author Cameron Van Wyk 219076936
 */
public class ApplicationTest {

   private Application app1;
    private Application app2;
    private Application app3;
    private Application app4;

    
220187568
    public ApplicationTest() {  
    }
      
    @BeforeAll
    public static void setUpClass() {
    }
=======
    private Application app1;
    private Application app2;
    private Application app3;
    
master

   //Cameron's Code 
    public ApplicationTest() {
    }
    
    @BeforeEach
    public void setUp() {
        app1 = new Application();
        
        //Mike's Code
220187568
        app2 = app4;
        app3 = new Application();
=======
        app2 = new Application();
        app1 = app3;  
master
    }
    
    //Cameron's Code
    //Object Identity
    @Test
    void testIdentity() {
        assertSame(app1,app3);
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
 

    //Object Equality
    @Test
    void testEquality() {
        assertEquals(app1,app3);
    }
    
    //Failing Test
    @Test
    void testAppTest() {
        assertEquals(app1,app2);
        fail();
    }
    
    //Disabling Test
    @Test
    @Disabled
    void testName() {
        assertSame(app3,app2);
    }
    
    //Timeouts
    // timed out after 500 miliseconds
    @Test
    
    //Mike's Code
220187568
    @Disabled
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Application.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
=======
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void test_this() {
 master
    }
    
}

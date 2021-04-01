/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2;

import java.util.concurrent.TimeUnit;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Cameron Van Wyk 219076936
 */
public class ApplicationTest {
    
    private Application app1;
    private Application app2;
    private Application app3;
    
    
    public ApplicationTest() {
    }
    
    @BeforeEach
    public void setUp() {
        app1 = new Application();
        app2 = new Application();
        app1 = app3;  
    }
    //Object Identity
    @Test
    void testIdentity() {
        assertSame(app1,app3);
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
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void test_this() {
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 312A-04
 */
public class PitagorasTest {
    
    public PitagorasTest() {
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
     * Test of Calcular_hipotenusa method, of class Pitagoras.
     */
    @Test
    public void testCalcular_hipotenusa() {
        System.out.println("Calcular_hipotenusa");
        double ladoa = 4;
        double ladob = 3;
        double expResult = 5;
        double result = Pitagoras.Calcular_hipotenusa(ladoa, ladob);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

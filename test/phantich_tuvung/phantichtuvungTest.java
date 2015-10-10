/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phantich_tuvung;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PhamNgocHieu
 */
public class phantichtuvungTest {
    
    public phantichtuvungTest() {
    }

    @Test
    public void testProcess() {
        System.out.println("process");
        String[] x = null;
        String expResult = "";
        String result = phantichtuvung.process(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testTestTuVung() {
        System.out.println("testTuVung");
        String x = "";
        String expResult = "";
        String result = phantichtuvung.testTuVung(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

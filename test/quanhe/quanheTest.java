/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanhe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PhamNgocHieu
 */
public class quanheTest {
    
    public quanheTest() {
    }

    @Test
    public void testBehon() {
        System.out.println("behon");
        String x = "<";
        boolean expResult = true;
        boolean result = quanhe.behon(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBehonhoacbang() {
        System.out.println("behonhoacbang");
        String x = "< =";
        boolean expResult = true;
        boolean result = quanhe.behonhoacbang(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testKhac() {
        System.out.println("khac");
        String x = "<>";
        boolean expResult = true;
        boolean result = quanhe.khac(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testLonhon() {
        System.out.println("lonhon");
        String x = ">";
        boolean expResult = true;
        boolean result = quanhe.lonhon(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testLonhonhoacbang() {
        System.out.println("lonhonhoacbang");
        String x = ">=";
        boolean expResult = true;
        boolean result = quanhe.lonhonhoacbang(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testBang() {
        System.out.println("bang");
        String x = "=";
        boolean expResult = true;
        boolean result = quanhe.bang(x);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}

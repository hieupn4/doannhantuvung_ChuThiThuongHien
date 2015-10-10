/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sothuc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PhamNgocHieu
 */
public class sothucTest {
    
    public sothucTest() {
    }

    @Test
    public void testCheck() {
        System.out.println("check");
        String x = ".8999563666111";
        boolean expResult = false;
        boolean result = sothuc.check(x);
        System.out.print(result);
    }
    
}

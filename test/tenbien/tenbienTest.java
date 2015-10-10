/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenbien;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PhamNgocHieu
 */
public class tenbienTest {
    
    public tenbienTest() {
    }

    @Test
    public void testCheck() {
        System.out.println("check");
        String x = "2fg_gg3";
        boolean expResult = false;
        boolean result = tenbien.check(x);
        System.out.println(result);
        
        
    }
    
}

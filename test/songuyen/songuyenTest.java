/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyen;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PhamNgocHieu
 */
public class songuyenTest {
    
    public songuyenTest() {
    }

    @Test
    public void testCheck() {
        System.out.println("check");
        String x = "4588";
        boolean expResult = false;
        boolean result = songuyen.check(x);
        System.out.println(result);
        
    }
    
}

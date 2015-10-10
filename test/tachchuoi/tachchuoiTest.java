/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tachchuoi;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PhamNgocHieu
 */
public class tachchuoiTest {
    
    public tachchuoiTest() {
    }

    @Test
    public void testTach() {
        System.out.println("tach");
        String x = "   pham   ngoc      hieu     phamdfgd dfgdg 22222      33fgdg";
        String[] expResult = null;
        String[] result = tachchuoi.tach(x);
        System.out.println(result.length);
        for(int i=0;i<result.length;i++)
            System.out.println(result[i]);
    }
    
}

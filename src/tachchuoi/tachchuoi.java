/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tachchuoi;

/**
 *
 * @author PhamNgocHieu
 */
public class tachchuoi {
    public static String[] tach(String x)
    {
        x= x.trim();
        x = x.replaceAll("\\s+"," ");
        String tg[]=x.split(" ");
        return tg;
    }
}

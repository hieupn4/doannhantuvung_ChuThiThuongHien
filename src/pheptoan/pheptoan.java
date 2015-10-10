/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pheptoan;

/**
 *
 * @author PhamNgocHieu
 */
public class pheptoan {
    public static boolean cong(String x)
    {
        if((x.charAt(0)=='+')&&(x.length()==1))
        return true;
        else
        return false;
    }
    public static boolean tru(String x)
    {
        if((x.charAt(0)=='-')&&(x.length()==1))
        return true;
        else
        return false;
    }
    public static boolean nhan(String x)
    {
        if((x.charAt(0)=='*')&&(x.length()==1))
        return true;
        else
        return false;
    }
    public static boolean chia(String x)
    {
        if((x.charAt(0)==':')&&(x.length()==1))
        return true;
        else
        return false;
    }
    
}

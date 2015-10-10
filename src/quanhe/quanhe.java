/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanhe;

/**
 *
 * @author PhamNgocHieu
 */
public class quanhe {
    public static boolean behon(String x)
    {
        if((x.charAt(0)=='<')&&(x.length()==1))
        return true;
        else
        return false;
    }
    public static boolean behonhoacbang(String x)
    {
        if((x.charAt(0)=='<')&&(x.length()==2)&&(x.charAt(1)=='='))
        return true;
        else
        return false;
    }
    public static boolean khac(String x)
    {
        if((x.charAt(0)=='<')&&(x.length()==2)&&(x.charAt(1)=='>'))
        return true;
        else
        return false;
    }
    public static boolean lonhon(String x)
    {
        if((x.charAt(0)=='>')&&(x.length()==1))
        return true;
        else
        return false;
    }
    public static boolean lonhonhoacbang(String x)
    {
        if((x.charAt(0)=='>')&&(x.length()==2)&&(x.charAt(1)=='='))
        return true;
        else
        return false;
    }
    public static boolean bang(String x)
    {
        if((x.charAt(0)=='=')&&(x.length()==1))
        return true;
        else
        return false;
    }
}

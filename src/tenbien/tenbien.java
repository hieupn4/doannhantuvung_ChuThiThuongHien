/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenbien;

/**
 *
 * @author PhamNgocHieu
 */
public class tenbien {
    public static boolean check(String x)
    {
        boolean kq = false;
        int state =0;
        int i=0;
        char y = x.charAt(i);
        switch (state)
        {
                case 0 : if (Character.isLetter(y))
                {
                    i++;
                    if(i>=x.length())
                    {
                       kq = true;
                       break;
                    }
                          
                    y = x.charAt(i);
                } else
                {
                   break; 
                }
                case 1 : while(Character.isDigit(y)||Character.isLetter(y))
                {
                    i++;
                    if(i>=x.length())
                    {
                       kq = true;
                       break;
                    }
                    y = x.charAt(i);
                }
                
        }
        return kq;
    }
}

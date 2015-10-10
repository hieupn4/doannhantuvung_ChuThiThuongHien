/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sothuc;

/**
 *
 * @author PhamNgocHieu
 */
public class sothuc {
   public static boolean check(String x)
    {
        boolean loop = true;
        boolean kq = false;
        int state =0;
        int i=0;
        char y = x.charAt(i);
        while(loop)
        {
        switch (state)
        {
                case 0 : if (Character.isDigit(y))
                {
                    i++;
                    if(i>=x.length())
                    {
                       kq = true;
                       loop = false;
                       break;
                    }                         
                    y = x.charAt(i);
                    if(y=='.')
                    {
                       i++;
                       if(i>=x.length())
                       {
                         kq= false;
                         loop = false;
                         break;  
                       }
                       state =1;
                       y = x.charAt(i++);
                       continue;
                    }
                    state =0;
                    break;
                } else
                {
                   loop = false;
                   break; 
                }
                case 1 :if(Character.isDigit(y))
                {
                    i++;
                    if(i>=x.length())
                    {
                       kq = true;
                       loop = false;
                       break;                       
                    }
                    y = x.charAt(i);
                } 
                else
                {
                    loop = false;
                    continue;
                }
                
        }
        }
       return kq;
    }
}

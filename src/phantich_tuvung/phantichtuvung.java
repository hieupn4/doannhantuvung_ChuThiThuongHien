/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phantich_tuvung;

import pheptoan.pheptoan;
import songuyen.songuyen;
import sothuc.sothuc;
import tenbien.tenbien;
import quanhe.*;
import tachchuoi.tachchuoi;

/**
 *
 * @author PhamNgocHieu
 */
public class phantichtuvung {
    public static String process(String[] x)
    {
      String tg =""; 
      for(int i=0;i<x.length;i++)
          tg = tg + " "+testTuVung(x[i]);
      return tg;
    }
    public static String testTuVung(String x)
    {
        if(songuyen.check(x))
            return "Số Nguyên";
        if(sothuc.check(x))
            return " Số Thực";
        if(tenbien.check(x))
            return "Biến";
        if(quanhe.bang(x))
            return "Bằng";
        if(quanhe.behon(x))
                return "Bé Hơn";
        if(quanhe.behonhoacbang(x))
            return "Bé Hơn Hoặc Bằng";
        if(quanhe.khac(x))
            return "Khác";
        if(quanhe.lonhon(x))
            return "Lớn Hơn";
        if(quanhe.lonhonhoacbang(x))
            return " Lớn Hơn Hoặc Bằng";
        if(pheptoan.cong(x))
            return "Cộng";
        if(pheptoan.tru(x))
            return "Trừ";
        if(pheptoan.nhan(x))
            return "Nhân";
        if(pheptoan.chia(x))
            return "Chia";
        return "ERROR";
    }
    public static String process(String x)
    {
        String[] y = tachchuoi.tach(x);
        return process(y);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metnum;

/**
 *
 * @author Lyxiie
 */
import java.text.DecimalFormat;

class hitung{
    
    double a, b, c, fa, fb, fc, error, tempC, tolE;
    int i=1;
    double fungsi(double x){
        return(x*x*x)+(5*x*x)-(10*x)-4;
    }
    void hitung(double isiA, double isiB, double tolE){
        DecimalFormat df = new DecimalFormat("0");
        String tbl = ("%-5s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n");
        System.out.format(tbl, "i", "a", "b", "c", "fa", "fb", "fc", "error");
        System.out.println("===============================================================================");
        a = isiA;
        b = isiB;
        error = tolE+1;
        if(fungsi(a)*fungsi(b)<0){
            while(Double.parseDouble(df.format(error))>tolE){
                fa = fungsi (a);
                fb = fungsi (b);
                tempC = c;
                c = b - ((fb*(b-a))/(fb-fa));
                fc = fungsi (c);
                error = Math.abs((c-tempC)/c);
                System.out.format(tbl, i, df.format(a), df.format(b), df.format(c), df.format(fa), df.format(fb), df.format(fc), df.format(error));
                if (fa*fc>0)
                    a=c;
                else if(fa*fc<0)
                    b=c;
                else
                    break;
                i++;
            }
            System.out.println("Akar persamaan = "+df.format(c));
        }else{
            System.out.println("Tidak ada akar persamaan dalam interval tersebut");
        }        
    }
}
public class TestFahmi {
       public static void main(String[] args) {
        hitung rfl = new hitung();
        rfl.hitung(1.3, 2, 0.00001);
    }
}
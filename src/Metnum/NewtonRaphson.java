package Metnum;
public class NewtonRaphson {
public static void main(String[] args) {
        // TODO code application logic here
        double x =1.3;
        double x_sebelum =0;
        double selisih = Math.abs(x_sebelum-x);
        double error = 0.0001;
        int i=0;
        System.out.println("METODE NEWTON-RAPHOSN");
        System.out.println("-----------------------------------------------");
        String style  = ("%12s |%12s |%12s |%12s |%12s|\n");
        System.out.format(style,"Iterasi(n)", "Xn", "f(Xn)", "f'(Xn)", "|Xn - Xn-1|");
        System.out.format(style,i, String.format("%.5f",x), String.format("%.5f",fungsi(x)), String.format("%.5f",turunanFungsi(x)), 0);
    
        while(Math.abs(selisih)>error){
            
            i++;
            x_sebelum = x;
            x = x_sebelum - (fungsi(x)/turunanFungsi(x));
            selisih = Math.abs(x_sebelum-x);
        System.out.format(style,i, String.format("%.5f",x), String.format("%.15f",fungsi(x)), String.format("%.5f",turunanFungsi(x)), String.format("%.15f",selisih));
            
        }
            System.out.println("Pada iterasi ke "+i+" memenuhi kondisi |Xn - Xn-1| maka iterasi berhenti, dan diperoleh akar hampiran x= "+String.format("%.5f",x));     
    }
    
     public static double fungsi(double x){
        double y =(x*x*x)+(5*x*x)-(10*x)-4;
        return y;
    }
      public static double turunanFungsi(double x){
        double y = (x*x*x)-(8.29*(x*x))+(21.6528*x)-17.67402;
        return y;
    }  
}

package Metnum;
/*Merupakan kelas utama yang digunakan untuk melakukan proses perhitungan menggunakan metode Secant dengan input data nilai awal(X0), X1, dan galat
sehingga mengeluarkan output berupa Iterasi, nilai Xn, nilai f(Xn), dan nilai|Xn - Xn-1|.*/
public class Secant {
    public static void main(String[] args) {
        //isi variabel
        double x0 =1.3;
        double x1 =2;
        double x = 0;
        double selisih = Math.abs(x1-x0);
        double galat = 0.0001;
        int i =1;
        System.out.println("                       METODE SECANT                       ");
        System.out.println("-----------------------------------------------------------");
        String style  = ("%12s |%12s |%12s |%12s|\n");
        System.out.format(style, "Iterasi(n)", "Xn", "f(Xn)", "|Xn - Xn-1|");
        System.out.format(style, "0", String.format("%.5f",x0), String.format("%.5f",fungsi(x0)), 0);
        System.out.format(style, "1", String.format("%.5f",x1), String.format("%.5f",fungsi(x1)), String.format("%.6f",selisih));
        //Pencarian kondisi berhenti dengan melakukan perulangan
            while(Math.abs(selisih)>galat){           
            i++;            
            x = x1 - ((fungsi(x1)*(x1-x0)) / (fungsi(x1)-fungsi(x0)));            
            selisih = Math.abs(x-x1);
        System.out.format(style, i, String.format("%.5f",x1), String.format("%.5f",fungsi(x1)), String.format("%.6f",selisih));
            x0 = x1;
            x1 = x;            
        }
        System.out.println("Pada iterasi ke "+i+" kondisi |Xn - Xn-1|<E maka iterasi berhenti, dan diperoleh akar hampiran x = "+String.format("%.6f",x)); 
    }
    //Merupakan sebuah Method bernama fungsi yang memiliki parameter x dengan tipe data double yang digunakan untuk pembuatan persamaan f(x) berdasarkan soal.
    public static double fungsi(double x){
        double y = (x*x*x)+(5*(x*x))-(10*x)-4;
        return y;
    }
}

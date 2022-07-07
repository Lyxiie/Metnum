package metnum;
/*Merupakan kelas utama yang digunakan untuk melakukan proses perhitungan menggunakan metode bagi dua dengan input data berupa nilai selang [a,b] dan galat, 
sehingga mengeluarkan output berupa iterasi, nilai a, nilai b, nilai c, nilai f(a), nilai f(c), selang baru, selang baru (a-b), dan nilai |a-b|<E)*/
public class BagiDua {
    public static void main(String[] args) {
        //inisialisasi variabel
        double a = -5;
        double b = 5;
        double c = (a+b)/2;
        double d = Math.abs(a-b);             
        double fa, fc = 0;       
        double galat = 0.00000001;
        boolean bawahgalat = false;
        String selangbaru;
        //format judul
        System.out.println("                                METODE BAGI DUA                               ");
        System.out.println("------------------------------------------------------------------------------");
        String style =("%10s |%10s |%10s |%10s |%10s |%10s |%12s |%20s |%10s |%n");
        System.out.format(style, "iterasi", "a", "b", "c", "f(a)", "f(c)", "selang baru", "selang baru (a-b)", "|a-b|<E");
        int i =0;
        
        while(Math.abs(d)>galat){
            i++;
            c = (a+b)/2; 
            fa = fungsi(a);
            fc = fungsi(c);
            
            
        if((fa*fc)<0)
        {
            selangbaru="[a,c]";
            d = Math.abs(a-c);
        }
        else
        {
            selangbaru="[c,b]";
            d = Math.abs(c-b);
        }
        //Pengecekan kondisi berhenti
        if(d<galat)
        {
            bawahgalat = true;
        }
        System.out.format(style,i, String.format("%.5f",a), String.format("%.5f",b), String.format("%.5f",c), String.format("%.5f",fa), String.format("%.5f",fc), selangbaru, String.format("%.5f",d), bawahgalat);        
        //Proses penentuan selang baru
        if((fa*fc)<0)
        {
            b = c;
        }
        else
        {
            a = c;
        }
    }
    System.out.println();
    System.out.println("Pada iterasi ke "+i+" memenuhi kondisi |a-b|<E, maka iterasi berhenti, dan diperoleh akar hampiran "+String.format("%.5f",c)+" dengan f(x)= "+String.format("%.5f",fc));
    }
    public static double fungsi(double x){
        double y = (x*x*x)-(8.29*(x*x))+(21.6528*x)-17.67402;
        return y;
    }
}
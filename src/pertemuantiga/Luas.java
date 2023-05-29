package pertemuantiga;

public class Luas {
    int panjang;
    int lebar;
    double tinggi;
    double alas;
    int sisi;

    int persegi(){
        int a = sisi * sisi;
        return a;
   }
    int persegipanjang(){
        int hasil = panjang * lebar;
        return hasil;
    }
    double segitiga(){
        double luas = (alas * tinggi)/2;
        return luas;
    }
}

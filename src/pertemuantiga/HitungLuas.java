package pertemuantiga;

public class HitungLuas {
    public static void main(String[] args){
    Luas ls = new Luas();
    ls.alas = 5.0;
    ls.tinggi = 5.0;
    ls.lebar = 10;
    ls.panjang = 3;
    ls.sisi = 8;
    
    int hasilPersegi = ls.persegi();
    System.out.println("Luas Persegi         : " + hasilPersegi);
    
    int hasilPersegiPanjang = ls.persegipanjang();
    System.out.println("Luas Persegi Panjang : " + hasilPersegiPanjang);
    
    double hasilSegitiga = ls.segitiga();
    System.out.println("Luas Segitiga        : " + hasilSegitiga);
    
   }
}

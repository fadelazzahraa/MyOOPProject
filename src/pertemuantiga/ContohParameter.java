package pertemuantiga;

public class ContohParameter {
    public static void main(String args[]){
        
        MatematikaDua mtk = new MatematikaDua();
              
        int hasil = mtk.tambah(100, 50);
        System.out.println("Hasil tambah() = " + hasil);
        
        hasil = mtk.kurang(255, 75);
        System.out.println("Hasil kurang() = " + hasil);
        
        hasil = mtk.kali(10, 10);
        System.out.println("Hasil kali() = " + hasil);
        
        hasil = mtk.bagi(20, 5);
        System.out.println("Hasil bagi() = " + hasil);
    }
}

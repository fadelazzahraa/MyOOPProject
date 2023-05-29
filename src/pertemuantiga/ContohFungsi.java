package pertemuantiga;

public class ContohFungsi {
    public static void main(String args[]){
        
        Matematika mtk = new Matematika();
        mtk.nilai1 = 100;
        mtk.nilai2 = 10;
        
        int hasil = mtk.tambah();
        System.out.println("Hasil tambah() = " + hasil);
        
        hasil = mtk.kurang();
        System.out.println("Hasil kurang() = " + hasil);
        
        hasil = mtk.kali();
        System.out.println("Hasil kali() = " + hasil);
        
        hasil = mtk.bagi();
        System.out.println("Hasil bagi() = " + hasil);
    }
}

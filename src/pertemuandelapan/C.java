package pertemuandelapan;

public class C extends B {
    public void panggil(){
        System.out.println("Nilai : "+nilai);
        System.out.println("Huruf : "+huruf);
        nilai = 14;
        huruf = 'B';
        System.out.println("Nilai : "+nilai);
        System.out.println("Huruf : "+huruf);

        System.out.println("\nMemanggil method cetakA");
        cetakA("KelasC");
        System.out.println("\nMemanggil method cetakB");
        cetakB("Kelas C");
    }
    public void cetakKelas(){
        System.out.println("Kelas C");
    }
    
    public static void main(String args[]){
            A anak1 = new A();
            B anak2 = new B();
            C anak3 = new C();
//            anak1.cetakAP();
//            anak2.cetakBP();
            anak3.panggil();
            System.out.println("Pemanggilan cetakKelas");
            anak1.cetakKelas();
            anak2.cetakKelas();
            anak3.cetakKelas();
        }
}

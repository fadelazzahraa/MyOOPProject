package pertemuanduabelas;

public class VirtualMethodInvocation {
    public static void main(String[] args){
        BangunDatar lingk = new LuasLingkaran();
        System.out.println("Luas lingkaran: ");
        lingk.hitung();
        
        lingk = new LuasSegitiga();
        System.out.println("Luas segitiga: ");
        lingk.hitung();
    }
}

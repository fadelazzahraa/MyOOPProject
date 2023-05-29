package pertemuansebelas;

public class MainProgram {
    public static void main(String[] args){
        Kubus kubus = new Kubus(10);
        kubus.hitung();
        System.out.println("Volume kubus: " + kubus.getVol());
        
        Balok balok = new Balok(2, 3, 5);
        balok.hitung();
        System.out.println("Volume balok: " + balok.getVol());
        
        Tabung tabung = new Tabung(7, 10);
        tabung.hitung();
        System.out.println("Volume tabung: " + tabung.getVol());
    }
}

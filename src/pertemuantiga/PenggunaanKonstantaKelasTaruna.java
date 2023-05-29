package pertemuantiga;

public class PenggunaanKonstantaKelasTaruna {
    public static void main(String args[]){
        // deklarasi object
        Taruna fadel = new Taruna();
        
        // penggunaan variabel dalam object
        fadel.nama = "Fadel";
        fadel.npm = 12345;
        
        System.out.println("Nama    : " + fadel.nama);
        System.out.println("NPM     : " + fadel.npm);
    }
}

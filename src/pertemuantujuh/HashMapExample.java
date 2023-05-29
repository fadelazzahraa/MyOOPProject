package pertemuantujuh;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args){
        HashMap<Integer, String> hari = new HashMap<Integer, String>();
        
        // tambah value ke HashMap
        hari.put(1, "Minggu");
        hari.put(2, "Senin");
        hari.put(3, "Selasa");
        hari.put(4, "Rabu");
        hari.put(5, "Kamis");
        hari.put(6, "Jumat");
        hari.put(7, "Sabtu");
        System.out.println(hari);
        
        // hapus value dari HashMap
        hari.remove(5);
        System.out.println(hari);
        
        // put dan replace
        hari.put(1, "Ahad");
        hari.put(8, "Libur");
        hari.replace(6, "Jumat Berkah");
        hari.replace(5, "Ini hari Kamis");
        System.out.println(hari);
        
    }
}

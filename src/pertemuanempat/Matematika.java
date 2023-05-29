package pertemuanempat;

public class Matematika {
    int tambah(int nilai1, int nilai2){
        System.out.println("tambah() 1");
        int hasil = nilai1 + nilai2;
        return hasil;
    }
    
    int tambah(int nilai1, int nilai2, int nilai3){
        System.out.println("tambah() 2");
        int hasil = nilai1 + nilai2 + nilai3;
        return hasil;
    }
    
    double tambah(double nilai1, double nilai2){
        System.out.println("tambah() 3");
        double hasil = nilai1 + nilai2;
        return hasil;
    }
}

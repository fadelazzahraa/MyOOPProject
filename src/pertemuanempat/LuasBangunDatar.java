package pertemuanempat;

import java.util.Scanner;

public class LuasBangunDatar {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int jenisBangunDatar;
        BangunDatar bgndtr = new BangunDatar();
              
        System.out.println("Hitung luas bangun datar");
        System.out.println("1. Persegi panjang");
        System.out.println("2. Persegi");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan jenis bangun datar: ");
        jenisBangunDatar = input.nextInt();
        
        switch (jenisBangunDatar){
            case 1:
                int panjang;
                int lebar;
                
                System.out.print("Masukkan panjang: ");
                panjang = input.nextInt();
                System.out.print("Masukkan lebar: ");
                lebar = input.nextInt();
                
                System.out.println("Luas persegi panjang: " + bgndtr.hitungLuas(panjang, lebar));
                break;
            case 2:
                int sisi;
                
                System.out.print("Masukkan sisi: ");
                sisi = input.nextInt();
                
                System.out.println("Luas persegi: " + bgndtr.hitungLuas(sisi));
                break;
            case 3:
                double alas;
                double tinggi;
                
                System.out.print("Masukkan alas: ");
                alas = input.nextInt();
                System.out.print("Masukkan tinggi: ");
                tinggi = input.nextInt();
                
                System.out.println("Luas segitiga: " + bgndtr.hitungLuas(alas, tinggi));
                break;
            default:
                System.out.println("Anda tidak memasukkan input dengan benar!");
        }
        
    }
}

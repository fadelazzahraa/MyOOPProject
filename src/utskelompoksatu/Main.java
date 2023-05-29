package utskelompoksatu;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        String pilihan;
        String jumlah;
        String uang;
        int totalharga = 0;
        
        Scanner input=new Scanner(System.in);
        
        TiketFilm[] tiketFilm = new TiketFilm[4];

        tiketFilm[0] = new TiketFilm("Horor", 10000, 5);
        tiketFilm[1] = new TiketFilm("Komedi", 20000, 5);
        tiketFilm[2] = new TiketFilm("Action", 30000, 5);
        tiketFilm[3] = new TiketFilm("Khungfu", 40000, 5); 
        
        
        while (true){
            
            for(int i = 0; i < tiketFilm.length; i++) {
                System.out.println((i+1) + " " + tiketFilm[i].getGenre());
            }
            
            System.out.print("pilih film yang dipesan = ");
            pilihan = input.nextLine();
            while (!(pilihan.matches("[1-4]"))){
                System.out.print("masukkan input dengan benar! = ");
                pilihan = input.nextLine();
            }

            System.out.println("anda memilih film " + tiketFilm[Integer.parseInt(pilihan)-1].getGenre());

            System.out.print("Jumlah yang dibeli ");
            jumlah = input.nextLine();

            while (!(jumlah.matches("^[1-9][0-9]*"))){
                System.out.print("masukkan input dengan benar! = ");
                jumlah = input.nextLine();
            }
            
            if (tiketFilm[Integer.parseInt(pilihan)-1].beliTiket(Integer.parseInt(jumlah))){
                System.out.print("Lanjut ???? (y/t) ");
                pilihan = input.nextLine();
                while (!(pilihan.equals("y")) && !(pilihan.equals("Y")) && !(pilihan.equals("t")) && !(pilihan.equals("T"))){
                    System.out.print("masukkan input dengan benar! = ");
                    pilihan = input.nextLine();
                }
                if (pilihan.equals("t") || pilihan.equals("T"))
                    break;
            } else {
            System.out.println("STOK KURANG silahkan ulangi pemesanan");
            }
            
        }
        for(int i = 0; i < tiketFilm.length; i++) {
            if (tiketFilm[i].getJumlahDibeli() > 0){
                System.out.println("film " + tiketFilm[i].getGenre() + " dibeli " + tiketFilm[i].getJumlahDibeli());
                totalharga += tiketFilm[i].getHargaTotal();
            }
        }
        
        System.out.println("harga total = " + totalharga);
        
        do {
            System.out.print("Masukkan uang anda = ");
            uang = input.nextLine();
                
            while (!(uang.matches("[0-9]+"))){
                System.out.print("masukkan input dengan benar! = ");
                uang = input.nextLine();
            }
           
            if (totalharga <= Integer.parseInt(uang))
                break;

            System.out.println("uang anda kurang");
                
        } while (true);
        
        System.out.println("Kembalian anda " + (Integer.parseInt(uang) - totalharga) );
        
    }
}

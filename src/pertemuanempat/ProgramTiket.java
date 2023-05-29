package pertemuanempat;

import java.util.Scanner;

public class ProgramTiket {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        String namaPelanggan;
        int pilihan;
        
        Tiket[] arrTiket = new Tiket[5];
        
        arrTiket[0] = new Tiket("Menado", 1000000);
        arrTiket[1] = new Tiket("Makasar", 2000000);
        arrTiket[2] = new Tiket("Semarang", 3000000);
        arrTiket[3] = new Tiket("Jambi", 400000);
        arrTiket[4] = new Tiket("Bali", 500000);
        
        System.out.println("Penjualan Tiket Pesawat");
        System.out.println("BANDARA PESAWAT");
        System.out.println("=======================");
        System.out.print("Masukan Nama Anda : ");
        namaPelanggan = input.nextLine();
        System.out.println("");
        System.out.println("Daftar Tiket - Harga");
        
        for(int i = 0; i < arrTiket.length; i++) {
            System.out.print((i+1) + "." + arrTiket[i].getTujuan());
            if ((arrTiket[i].getTujuan().length() + 2) < 8){
                System.out.print("\t\t");
            } else {
                System.out.print("\t");
            }
            System.out.println("Rp." + arrTiket[i].getHarga());
        }
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1:
                System.out.println(namaPelanggan + " memilih tiket 1 dengan tujuan " + arrTiket[0].getTujuan());
                break;
            case 2:
                System.out.println(namaPelanggan + " memilih tiket 2 dengan tujuan " + arrTiket[1].getTujuan());
                break;
            case 3:
                System.out.println(namaPelanggan + " memilih tiket 3 dengan tujuan " + arrTiket[2].getTujuan());
                break;
            case 4:
                System.out.println(namaPelanggan + " memilih tiket 4 dengan tujuan " + arrTiket[3].getTujuan());
                break;
            case 5:
                System.out.println(namaPelanggan + " memilih tiket 5 dengan tujuan " + arrTiket[4].getTujuan());
                break;
            default:
                System.out.println(namaPelanggan + " tidak memilih tiket dengan benar");
        }
    }
}

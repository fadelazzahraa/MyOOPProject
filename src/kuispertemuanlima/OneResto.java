package kuispertemuanlima;

import java.util.Scanner;

public class OneResto {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int pilihan;
        int jumlah;
        int total = 0;
        boolean flag=true;
        String lagi;
        
        Menu[] arrMenu = new Menu[5];

        arrMenu[0] = new Menu("Batagor", 3000);
        arrMenu[1] = new Menu("Kupat Tahu", 5000);
        arrMenu[2] = new Menu("Lontong", 4000);
        arrMenu[3] = new Menu("Ayam Goreng", 8000);
        arrMenu[4] = new Menu("Lele Goreng", 7000);

       
        System.out.println("MENU MAKANAN :");
        System.out.println("________________________________");
        System.out.println("No Nama            Harga");

        for(int i = 0; i < arrMenu.length; i++) {
            System.out.print((i+1) + ". " + arrMenu[i].getNama());
            if ((arrMenu[i].getNama().length()) < 5){
                System.out.print("\t\t   ");
            } else {
                System.out.print("\t   ");
            }
            System.out.println("Rp " + arrMenu[i].getHarga() + ",00");
        }

        System.out.println("");
        while (flag==true){
            
            System.out.println("________________________________");
            System.out.print("Masukkan Nomor Pesanan : ");
            pilihan = Integer.parseInt(input.nextLine());
            System.out.print("Masukkan jumlah Pesanan : ");
            jumlah = Integer.parseInt(input.nextLine());
            System.out.println("_________________________________________________________");
            
            switch (pilihan){
                case 1:
                    System.out.println("Pilihan anda nomor " + pilihan + " " + arrMenu[0].getNama() + " Jumlah yang dibeli " + jumlah);
                    total += arrMenu[0].getHarga() * jumlah;
                    break;
                case 2:
                    System.out.println("Pilihan anda nomor " + pilihan + " " + arrMenu[1].getNama() + " Jumlah yang dibeli " + jumlah);
                    total += arrMenu[1].getHarga() * jumlah;
                    break;
                case 3:
                    System.out.println("Pilihan anda nomor " + pilihan + " " + arrMenu[2].getNama() + " Jumlah yang dibeli " + jumlah);
                    total += arrMenu[2].getHarga() * jumlah;
                    break;
                case 4:
                    System.out.println("Pilihan anda nomor " + pilihan + " " + arrMenu[3].getNama() + " Jumlah yang dibeli " + jumlah);
                    total += arrMenu[3].getHarga() * jumlah;
                    break;
                case 5:
                    System.out.println("Pilihan anda nomor " + pilihan + " " + arrMenu[4].getNama() + " Jumlah yang dibeli " + jumlah);
                    total += arrMenu[4].getHarga() * jumlah;
                    break;           
                default:
                    System.out.println("Pilihan anda tidak tepat!");
            }

        System.out.print("Apakah anda mau melanjutkan? Y/T ");
        lagi=input.nextLine();
        
        while (!(lagi.equals("y") || lagi.equals("Y") || lagi.equals("t") || lagi.equals("T"))){
            System.out.print("Pastikan input Anda benar! ");
            lagi=input.nextLine();
        }
        
        if (lagi.equals("t") || lagi.equals("T")){
            System.out.println("_________________________________________________________");
            System.out.println("Total pembayaran sebesar " + total + ".");
            System.out.println("Terimakasih atas kunjungannya.");
            break;
            }
        }
    }
}
                   
            
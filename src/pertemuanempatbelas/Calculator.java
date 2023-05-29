package pertemuanempatbelas;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int opsi = 1;
        double bil1 = 0;
        double bil2 = 0;

        try {
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Masukkan input operasi: ");
            opsi = Integer.parseInt(input.nextLine());
            assert (opsi == 1 || opsi == 2 || opsi == 3 || opsi == 4); 
                 
            
            
            System.out.print("Masukkan integer 1: ");
            bil1 = Integer.parseInt(input.nextLine());
            System.out.print("Masukkan integer 2: ");
            bil2 = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException exc) {
            System.out.println("Salah input!");
            System.exit(0);
        } finally {
            System.out.println("Selesai input!\n");
        }

        try {
            double hasil = 0;
            switch (opsi) {
                case 1:
                    hasil = bil1 + bil2;
                    break;
                case 2:
                    hasil = bil1 - bil2;
                    break;
                case 3:
                    hasil = bil1 * bil2;
                    break;
                case 4:
                    assert bil2 != 0 : "integer 2 tidak boleh nol"; hasil = bil1 / bil2;
                    break;
            }
            System.out.println("Hasil hitung: " + hasil);
            
        } catch (ArithmeticException exc) {
            System.out.println("Pembagi sama dengan nol!");
        }
        System.out.println("Selesai program!");
    }
}

package uas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProsesPenyewaan operasi = new ProsesPenyewaan();
        int idOperasi;
        int idBuku;
        int idPelanggan;
        int harga;
        int uang;
        boolean statusBuku;

        Buku[] buku = new Buku[6];
        buku[0] = new Novel(1, "Hujan    ");
        buku[1] = new Novel(2, "Pulang   ");
        buku[2] = new Novel(3, "Pergi    ");
        buku[3] = new Komik(4, "Jujutsu  ");
        buku[4] = new Komik(5, "Naruto   ");
        buku[5] = new Komik(6, "One Piece");

        Pelanggan[] pelanggan = new Pelanggan[3];
        pelanggan[0] = new Pelanggan(1, "Fania");
        pelanggan[1] = new Pelanggan(2, "Faza");
        pelanggan[2] = new Pelanggan(3, "Gani");

        try {
            while (true) {
                for (Buku listBuku : buku) {
                    System.out.print(listBuku.getId() + ". " + listBuku.getJenis() + ": " + listBuku.getJudul());
                    
                    if (listBuku.getStatus()) {
                        System.out.print(" : Tersedia\n");
                    } else {
                        System.out.print(" : Dipinjam\n");

                    }

                }
                System.out.print("1. Pinjam\n2. Kembalikan\n3. Keluar\nPilih id Operasi: ");
                idOperasi = Integer.parseInt(input.nextLine());
                assert (idOperasi == 1 || idOperasi == 2 || idOperasi == 3) : "Opsi operasi hanya 1, 2, dan 3";

                if (idOperasi == 1) {
                    System.out.print("Pilih id Pelanggan: ");
                    idPelanggan = Integer.parseInt(input.nextLine());
                    assert (idPelanggan == 1 || idPelanggan == 2 || idPelanggan == 3) : "Id pelanggan hanya 1, 2, dan 3";
                    System.out.print("Pilih id Buku: ");
                    idBuku = Integer.parseInt(input.nextLine());
                    assert (idBuku == 1 || idBuku == 2 || idBuku == 3 || idBuku == 4 || idBuku == 5 || idBuku == 6) : "Id buku hanya 1, 2, 3, 4, 5, 6";
                    System.out.println("Melakukan operasi peminjaman");
                    harga = operasi.sewaBuku(pelanggan[idPelanggan - 1], buku[idBuku - 1]);
                    if (harga == 0) {
                        System.out.println("Buku tidak bisa dipinjam. Anda sudah meminjam buku atau buku sudah dipinjam\n");
                    } else {
                        System.out.println("Harga sewa buku: Rp. " + harga + "\n");
                        while (true) {
                            System.out.print("Masukkan uang anda: ");
                            uang = Integer.parseInt(input.nextLine());
                            if (uang >= harga) {
                                System.out.println("Kembalian: " + (uang - harga));
                                System.out.println("Terima kasih!\n");
                                break;
                            } else {
                                System.out.println("Uang anda kurang. Peminjaman Anda dibatalkan\n");
                                operasi.kembalikanBuku(pelanggan[idPelanggan - 1], buku[idBuku - 1]);
                                break;
                            }
                        }

                    }

                } else if (idOperasi == 2) {
                    System.out.print("Pilih id Pelanggan: ");
                    idPelanggan = Integer.parseInt(input.nextLine());
                    assert (idPelanggan == 1 || idPelanggan == 2 || idPelanggan == 3) : "Id pelanggan hanya 1, 2, dan 3";
                    //  DISINI HANYA PERLU INPUT ID PELANGGAN KARENA BUKU YANG DIKEMBALIKAN SUDAH PASTI (KARENA BUKUNYA HANYA 1)
                    //  JIKA INGIN DIBUAT TETAP INPUT ID BUKU, HILANGKAN COMMENT DI BAWAH, LALU BUAT KOMENTAR DI BARIS 86 dan 88 

                    //  System.out.print("Pilih id Buku: ");
                    //  idBuku = Integer.parseInt(input.nextLine());
                    //  assert (idBuku == 1 || idBuku == 2 || idBuku == 3 || idBuku == 4 || idBuku == 5 || idBuku == 6) : "Id buku hanya 1, 2, 3, 4, 5, 6";
                    System.out.println("Melakukan operasi pengembalian");
                    //  statusBuku = operasi.kembalikanBuku(pelanggan[idPelanggan - 1], buku[idBuku - 1]);
                    statusBuku = operasi.kembalikanBuku(pelanggan[idPelanggan - 1], buku[(pelanggan[idPelanggan - 1].getIdBuku())-1]);
                    if (statusBuku) {
                        System.out.println("Buku sudah dikembalikan\n");
                    } else {
                        System.out.println("Tidak ada buku yang dikembalikan. Anda tidak meminjam buku\n");

                    }
                } else {
                    break;
                }
            }

            System.out.println("Program berakhir. Terima kasih");
        } catch (NumberFormatException e) {
            System.out.println("Input Anda salah! Program berakhir. Terima kasih");
        }
    }
}

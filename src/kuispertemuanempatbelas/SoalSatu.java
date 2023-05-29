package kuispertemuanempatbelas;

import java.util.Scanner;

public class SoalSatu {

    public static void main(String args[]) {
        SoalSatu program = new SoalSatu();
        program.login();
    }

    public void login() {
        Scanner input = new Scanner(System.in);
        String username;
        String password;
        User authorizeduser = null;

        User[] arrUser = new User[4];

        // password disimpan di database dalam bentuk hash
        arrUser[0] = new User("Admin", "admin");
        arrUser[1] = new User("Lita", "angelita");
        arrUser[2] = new User("Fania", "sibagariang");
        arrUser[3] = new User("Faza", "fadelfadel");

        System.out.println("Selamat datang di Restoran Merakyat!");
        System.out.println("________________________________");
        System.out.print("Masukkan Username: ");
        username = input.nextLine();
        System.out.print("Masukkan Password: ");
        password = input.nextLine();

        for (User checkuser : arrUser) {
            if (username.equals(checkuser.getNama())) {
                if (checkuser.checkPassword(password)) {
                    System.out.println("Anda berhasil login!");
                    authorizeduser = checkuser;
                    break;
                }
            }
        }

        if (authorizeduser == null) {
            System.out.println("Username atau password salah! Program berakhir!");
            System.exit(0);
        } else {
            pesan(authorizeduser);
        }

    }

    public void pesan(User authorizeduser) {
        Scanner input = new Scanner(System.in);

        int pilihan = 0;
        int jumlah = 0;
        int total = 0;
        int uang = 0;
        String pilihanlagi;
        String uanglagi;

        Menu[] arrMenu = new Menu[5];

        arrMenu[0] = new Menu("Batagor", 3000);
        arrMenu[1] = new Menu("Kupat Tahu", 5000);
        arrMenu[2] = new Menu("Lontong", 4000);
        arrMenu[3] = new Menu("Ayam Goreng", 8000);
        arrMenu[4] = new Menu("Lele Goreng", 7000);

        System.out.println("________________________________");
        System.out.println("LOGIN SEBAGAI " + authorizeduser.getNama().toUpperCase());
        System.out.println("________________________________");
        System.out.println("MENU MAKANAN :");
        System.out.println("________________________________");
        System.out.println("No Nama            Harga");

        for (int i = 0; i < arrMenu.length; i++) {
            System.out.print((i + 1) + ". " + arrMenu[i].getNama());
            if ((arrMenu[i].getNama().length()) < 5) {
                System.out.print("\t\t   ");
            } else {
                System.out.print("\t   ");
            }
            System.out.println("Rp " + arrMenu[i].getHarga() + ",00");
        }

        System.out.println("");
        while (true) {
            System.out.println("________________________________");

            try {
                System.out.print("Masukkan Nomor Pesanan : ");
                pilihan = Integer.parseInt(input.nextLine());
                assert (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4 || pilihan == 5) : "Nomor pesanan hanya 1, 2, 3, 4, dan 5";
                System.out.print("Masukkan jumlah Pesanan : ");
                jumlah = Integer.parseInt(input.nextLine());
                assert jumlah > 0 : "Minimal pesanan adalah 1";
            } catch (NumberFormatException exc) {
                System.out.println("Salah input! Program berakhir!");
                System.exit(0);
            }

            System.out.println("_________________________________________________________");

            switch (pilihan) {
                case 1:
                    System.out.println("Pilihan anda nomor " + pilihan + ". " + arrMenu[0].getNama() + " | Jumlah yang dibeli " + jumlah);
                    total += arrMenu[0].getHarga() * jumlah;
                    break;
                case 2:
                    System.out.println("Pilihan anda nomor " + pilihan + ". " + arrMenu[1].getNama() + " | Jumlah yang dibeli " + jumlah);
                    total += arrMenu[1].getHarga() * jumlah;
                    break;
                case 3:
                    System.out.println("Pilihan anda nomor " + pilihan + ". " + arrMenu[2].getNama() + " | Jumlah yang dibeli " + jumlah);
                    total += arrMenu[2].getHarga() * jumlah;
                    break;
                case 4:
                    System.out.println("Pilihan anda nomor " + pilihan + ". " + arrMenu[3].getNama() + " | Jumlah yang dibeli " + jumlah);
                    total += arrMenu[3].getHarga() * jumlah;
                    break;
                case 5:
                    System.out.println("Pilihan anda nomor " + pilihan + ". " + arrMenu[4].getNama() + " | Jumlah yang dibeli " + jumlah);
                    total += arrMenu[4].getHarga() * jumlah;
                    break;
                default:
                    System.out.println("Pilihan anda tidak tepat!");
            }

            System.out.print("Apakah anda mau melanjutkan? (Y/T) ");
            pilihanlagi = input.nextLine();

            while (!(pilihanlagi.equals("y") || pilihanlagi.equals("Y") || pilihanlagi.equals("t") || pilihanlagi.equals("T"))) {
                System.out.print("Pastikan input Anda benar! (Y/T) ");
                pilihanlagi = input.nextLine();
            }

            if (pilihanlagi.equals("t") || pilihanlagi.equals("T")) {
                System.out.println("_________________________________________________________");
                System.out.println("Total pembayaran sebesar " + total + ".");
                break;
            }
        }
        while (true) {
            System.out.print("Masukkan uang anda: ");
            uang = Integer.parseInt(input.nextLine());
            if (uang >= total) {
                System.out.println("Kembalian: " + (uang - total));
                System.out.println("Terima kasih! Selamat Menikmati!");
                break;
            } else {
                System.out.print("Uang anda kurang. Apakah anda ingin memasukkan uang lagi? (Y/T) ");
                uanglagi = input.nextLine();
                while (!(uanglagi.equals("y") || uanglagi.equals("Y") || uanglagi.equals("t") || uanglagi.equals("T"))) {
                    System.out.print("Pastikan input Anda benar! ");
                    uanglagi = input.nextLine();
                }
                if (uanglagi.equals("t") || uanglagi.equals("T")) {
                    System.out.println("Transaksi Anda dibatalkan. Program berakhir!");
                    System.exit(0);
                }
            }
        }
    }
}

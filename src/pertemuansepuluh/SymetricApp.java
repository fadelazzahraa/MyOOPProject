package pertemuansepuluh;

import java.util.Scanner;

public class SymetricApp {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Masukkan pesan yang akan dienkripsi: ");
        String message = input.nextLine();
        
        System.out.print("Tipe enkripsi (1 atau 2): ");
        String i = input.nextLine();
        
        if (i.equals("1")){
            DemoEncryptionPBO tes = new DemoEncryptionPBO();
            tes.demoEncryption(message);
        } else {
            SymetricCrypto crypto = new SymetricCrypto();
            crypto.generateKey("D:/Data/Documents/NetBeansProjects/MyOOPProject/build/classes/pertemuansepuluh/mykey.key");

            byte[] key = crypto.readKeyFile("D:/Data/Documents/NetBeansProjects/MyOOPProject/build/classes/pertemuansepuluh/mykey.key");
            byte[] encrypted = crypto.encrypt(message, key);
            byte[] plaintex = crypto.decrypt(encrypted, key);

            System.out.println("message   : " + message);
            System.out.println("encrypted : " + new String(encrypted));
            System.out.println("plaintext : " + new String(plaintex));
        }
    }
}

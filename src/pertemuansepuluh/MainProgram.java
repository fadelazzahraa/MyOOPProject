package pertemuansepuluh;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int pilihan;
        
        System.out.println("1. Asymetric");
        System.out.println("2. Symetric");
        System.out.print("Pilih metode enkripsi: ");
        
        pilihan = Integer.parseInt(input.nextLine());
        
        if (pilihan==1){
            RSA rsa = new RSA();
            System.out.println("generating public and private keys");
            rsa.generateKey(
                    "D:/Data/Documents/NetBeansProjects/MyOOPProject/build/classes/pertemuansepuluh/private.key", 
                    "D:/Data/Documents/NetBeansProjects/MyOOPProject/build/classes/pertemuansepuluh/public.key");

            System.out.println("enter messages");
            String message = input.nextLine();
            System.out.println("encrypting");
            PublicKey publicKey = rsa.getPublicKey(
                    "D:/Data/Documents/NetBeansProjects/MyOOPProject/build/classes/pertemuansepuluh/public.key");
            byte[] encrypted = rsa.encrypt(message, publicKey);

            System.out.println("decrypting");
            PrivateKey privateKey = rsa.getPrivateKey(
                    "D:/Data/Documents/NetBeansProjects/MyOOPProject/build/classes/pertemuansepuluh/private.key");
            String plainText = rsa.decrypt(encrypted, privateKey);

            System.out.println("Message  : " + message);
            System.out.println("Encrypted: " + new String(encrypted));
            System.out.println("Plaintext: " + plainText);
        }
        else if (pilihan==2){
            System.out.print("Masukkan pesan yang akan dienkripsi: ");
        String message = input.nextLine();
        
        System.out.println("1. Dasar Symetric Cryptography");
        System.out.println("2. Symetric Cryptography dengan penyimpanan key");
        System.out.print("Tipe enkripsi: ");
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
}

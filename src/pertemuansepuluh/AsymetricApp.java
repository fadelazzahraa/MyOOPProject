package pertemuansepuluh;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;


public class AsymetricApp {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        
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
}

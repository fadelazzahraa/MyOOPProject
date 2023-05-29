package pertemuansepuluh;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class DemoEncryptionPBO {
    public static void main(String[] args){
        
    }
    
    public void demoEncryption(String message){
        try{
            byte[] plainText = message.getBytes("UTF8");
            
            System.out.println("Generating DES key...");
            KeyGenerator keyGen = KeyGenerator.getInstance("DES");
            keyGen.init(56);
            Key key = keyGen.generateKey();
            System.out.println("Done");
            
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            
            System.out.println("Encryption...");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] cipherText = cipher.doFinal(plainText);
            System.out.println("Done");
            
            System.out.println("Decryption...");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] newPlainText = cipher.doFinal(cipherText);
            System.out.println("Done");
            
            System.out.println("Message   : "+message);
            System.out.println("Encrypted : "+new String (cipherText, "UTF8"));
            System.out.println("Plaintext : "+new String(newPlainText, "UTF8"));
            
        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}

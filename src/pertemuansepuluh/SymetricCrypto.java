package pertemuansepuluh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SymetricCrypto {
    public void generateKey(String keyFile){
        try {
            System.out.println("Generating key...");
                    
            KeyGenerator keyGen = KeyGenerator.getInstance("DES");
            keyGen.init(56);
            SecretKey key = keyGen.generateKey();
            
            FileOutputStream f = new FileOutputStream(keyFile);
            f.write(key.getEncoded());
            f.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public byte[] readKeyFile(String keyFile){
        byte[] fileContent = null;
        
        try {
            System.out.println("Reading KeyFile...");
            FileInputStream fin = new FileInputStream(keyFile);
            int len = fin.available();
            fileContent = new byte[len];
            fin.read(fileContent,0,len);
            fin.close();
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
        
        return fileContent;
    }
    
    public byte[] encrypt(String message, byte[] keyEncoded){
        byte[] encrypted = null;
        try {
            byte[] input = message.getBytes("UTF8");
            
            SecretKeySpec key = new SecretKeySpec(keyEncoded, "DES");
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            
            cipher.init(Cipher.ENCRYPT_MODE, key);
            encrypted = cipher.doFinal(input);
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return encrypted;
    }
    
    public byte[] decrypt(byte[] encrypted, byte[] keyEncoded){
        byte[] plainText = null;
        try {
            SecretKeySpec key = new SecretKeySpec(keyEncoded, "DES");
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            
            cipher.init(Cipher.DECRYPT_MODE, key);
            plainText = cipher.doFinal(encrypted);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return plainText;
    }
}

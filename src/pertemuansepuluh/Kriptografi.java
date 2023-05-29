package pertemuansepuluh;

import java.util.Scanner;

public class Kriptografi {
    String out;
    
    void enkrip(String key, String message){
        String out = "";
        String isi = (key.length())+key+message;
        for(int i=0;i<isi.length();i++){
            int index = isi.charAt(i);
            char s = (char) (index+1);
            out = out + String.valueOf(s);
        }
        this.out = out;
        System.out.println("Message   = "+message);
        System.out.println("Encrypted = "+out);
    }
    
    void dekrip(String out, String keyx){
        String isi = out;
        String key = "";
        char k = (char) (isi.charAt(0));
        out = "";
        int jumKey = Integer.parseInt(String.valueOf(k))-1;
        for(int i=1;i<=jumKey; i++){
            int index = isi.charAt(i);
            char s = (char)(index-1);
            key = key + String.valueOf(s);
        }
        if(key.equals(keyx)){
            for(int i=(jumKey+1);i<isi.length();i++){
                int index = isi.charAt(i);
                char s = (char)(index-1);
                out = out+String.valueOf(s);
            }
            System.out.println("Plaintext = "+ out);
        }
        else{
            System.out.println("key tidak cocok\nsilahkan coba lagi");
            
        }
    }
   
    public static void main(String[] args) {
            
        Kriptografi kripto = new Kriptografi();
        Scanner input=new Scanner(System.in);
        System.out.print("Kunci enc = ");
        String a = input.nextLine();
        System.out.print("Pesan     = ");
        String b = input.nextLine();
        
        System.out.print("\n");
        kripto.enkrip(a, b);
        System.out.print("\n");
        
        System.out.print("Kunci dec = ");
        String c = input.nextLine();
        kripto.dekrip(kripto.out, c);
    }
    
}

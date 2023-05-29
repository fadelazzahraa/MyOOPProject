package pertemuandua;

import java.util.Scanner;

public class MencariLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int panjang, lebar;
      
        System.out.print("Panjang : ");
        panjang=input.nextInt();
        System.out.print("Lebar   : ");
        lebar=input.nextInt();
       
        System.out.println("Luas  : "+panjang*lebar);
    }  
}
package pertemuanenam;

import java.util.Scanner;
import java.util.Arrays;

public class Array2 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
       
        int x;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        x = Integer.parseInt(input.nextLine());
            
        String[] namamahasiswa = new String[x];
        
        for(int i = 0; i < x; i++){
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            namamahasiswa[i] = input.nextLine();
        }
        
        Arrays.sort(namamahasiswa);
        
        System.out.println("DAFTAR MAHASISWA SETELAH DISORTIR");
        for(int i = 0; i < x; i++){
            System.out.println("Mahasiswa ke-" + (i+1) + " = " + namamahasiswa[i]);
        }
    }
}

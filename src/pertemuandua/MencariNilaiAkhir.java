package pertemuandua;

import java.util.Scanner;

public class MencariNilaiAkhir {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double tugas, kuis, uts, uas, nilaiAkhir;
        
        System.out.print("Tugas : ");
        tugas=input.nextInt();
        System.out.print("Kuis  : ");
        kuis=input.nextInt();
        System.out.print("UTS   : ");
        uts=input.nextInt();
        System.out.print("UAS   : ");
        uas=input.nextInt();
        
        nilaiAkhir = (tugas*15 + kuis*20 + uts*30 + uas*35)/100;
       
        System.out.println("Nilai Akhir : "+nilaiAkhir);
    }  
}
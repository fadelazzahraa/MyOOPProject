package pertemuanenam;

import java.util.Vector;

public class DemoVector {
    public static void main(String[] args){
        Vector<Integer> vec = new Vector<Integer>();
        vec.add(22);
        vec.add(10);
        vec.add(15);
        vec.add(3);
        vec.add(8);
        vec.add(2);
        
        System.out.println("Jumlah Elemen Vector : "+vec.size());
        System.out.print("Cetak Isi Vector =");
        for (int i = 0; i<vec.size(); i++)
            System.out.print(" " + vec.get(i));
    }
}

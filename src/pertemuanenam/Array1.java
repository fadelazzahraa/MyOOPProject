package pertemuanenam;

public class Array1 {
    public char[] createArray(){
        char s[] = new char[26];
        for(int i=0;i<26;i++)
            s[i] = (char) ('A'+i);
        return s;
    }
    
    public static void main(String args[]){
        char hasil[];
        Array1 Arr = new Array1();
        hasil = Arr.createArray();
        
        for(int i=0;i<hasil.length; i++)
            System.out.print(hasil[i]+" ");
    }
}

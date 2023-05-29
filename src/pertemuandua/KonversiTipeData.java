package pertemuandua;

public class KonversiTipeData {
    public static void main(String[] args) {
        String nilai = "100";
        
        int nilaiIntValueOf = Integer.valueOf(nilai) + 100;
        System.out.println(nilaiIntValueOf);
        
        int nilaiIntParseInt = Integer.parseInt(nilai) + 50;
        System.out.println(nilaiIntParseInt);
    }
}

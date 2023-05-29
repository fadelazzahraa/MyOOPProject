package pertemuantujuh;

public class Casting {
    public static void main(String[] args){
        // casting implisit
        int numInt1 = 10;
        int numInt2 = 2;
        double numDouble = numInt1/numInt2;
        System.out.println(numDouble);
        
        // casting explisit
        double vardouble = 10.2;
        int varint = (int) vardouble;
        System.out.println(varint);
        
        // konversi tipe primitive ke object: Integer ke int
        Integer dataCount = new Integer(7801);
        int newCount = dataCount.intValue();
        System.out.println(newCount);
        
        // konversi tipe object ke primitive
        String penny = "12345";
        int pennys = Integer.parseInt(penny);
        System.out.println(penny);
    };
}

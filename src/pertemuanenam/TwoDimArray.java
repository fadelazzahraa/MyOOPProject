package pertemuanenam;

public class TwoDimArray {
    public static void main(String args[]){
        int twoDim[][] = new int[2][];
        twoDim[0] = new int[3];
        twoDim[1] = new int[5];
        
        System.out.println("Length pada Indeks ke-0 =" + twoDim[0].length);
        System.out.println("Length pada Indeks ke-1 =" + twoDim[1].length);
        
        int [][][] century = new int[2][3][4];
        System.out.println("Elemen pd Dimensi ke-1 = " + century.length);
        System.out.println("Elemen pd Dimensi ke-2 = " + century[0].length);
        System.out.println("Elemen pd Dimensi ke-3 = " + century[0][0].length);
    }
}

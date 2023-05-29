package pertemuanenam;

public class Array4 {
    public static void main(String args[]){
        int myArray[] = new int[6];
        int i;
        
        for (i=0; i<myArray.length; i++){
            myArray[i] = i;
            System.out.print(myArray[i] + " ");
        }
        
        System.out.println("\nSetelah di Array Diperbesar");
        myArray = new int[10];
        for (i=0; i<myArray.length; i++){
            myArray[i] = i;
            System.out.print(myArray[i] + " ");
        }
    }
}

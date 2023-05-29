package pertemuantujuh;

public class TestPassByReference {
    public static void main(String[] args){
        //create an array of integers
        int [] ages = {10, 11, 12};
        
        //print array values
        for (int i=0; i<ages.length; i++){
            System.out.println(ages[i]);
        }
        
        //call test and pass reference to array
        test(ages);
        
        //print array values again
        for (int i=0; i<ages.length; i++){
            System.out.println(ages[i]);
        }
    }
    
    public static void test(int[] arr){
        //change values of array
        for (int i=0; i<arr.length; i++){
            arr[i] = i + 50;
        }
    }    
}

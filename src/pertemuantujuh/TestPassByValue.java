package pertemuantujuh;

public class TestPassByValue {
    public static void main(String[] args){
        int i = 10;
        //print the value of i
        System.out.println(i);
        
        //call method test
        //and pass i to method test
        test(i);
        
        //print the value of i, not changed
        System.out.println(i);
    }
    
    public static void test(int j){
        //change value of parameter j
        j = 33;
    }
}

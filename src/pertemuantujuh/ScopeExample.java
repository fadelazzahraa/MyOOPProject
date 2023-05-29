package pertemuantujuh;

public class ScopeExample {
    public static void main (String[] args){
        int i = 0;
        int j = 0;
        
        //... some code here
        
        {
            int k = 0;
            int m = 0;
            int n = 0;
        }
        System.out.print(i);
        System.out.print(n);
    }
}


package pertemuanenam;

public class ArrayDim2 {
    public static void main(String[] args) {
        int[][] arr=new int [4][];
        
        arr[0]=new int[2];
        arr[1]=new int[4];
        arr[2]=new int[6];
        arr[3]=new int[8];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(i+2)*(j+1);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

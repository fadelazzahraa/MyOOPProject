package pertemuanenam;

import java.util.Arrays;

public class ArrayAnimals {
    public static void main(String args[]){
        String animals[] = new String[4];
        animals[0] = "snake";
        animals[1] = "kangaroo";
        animals[2] = "wombat";
        animals[3] = "bird";
        
        for (int i=0; i<animals.length; i++)
            System.out.println("animal " + i + " : " + animals[i]);
    
        System.out.println("\nSetelah di sorting");
        Arrays.sort(animals);
        for (int i=0; i<animals.length; i++)
            System.out.println("animal " + i + " : " + animals[i]);
    
    }
}

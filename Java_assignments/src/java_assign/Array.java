package java_assign;
import java.util.*;
public class Array {
    public static void main(String[] args) {
//        Declaration 1D array
        int[] mathMarks=new int[5];
        int[] ioeMarks={17,18,19,20,16};

        System.out.println("\nExample of 1D array.");
        for(int i:ioeMarks){
            System.out.println(i);
        }

//        declaration multiD array
        System.out.println("\nExample of multiD array.");
        int [][] phyChemMarks={{20,18},{13,17}};
        for(int i=0; i<=1;i++){
            System.out.println("Roll number "+(i+1)+" has received"+ phyChemMarks[i][0] +" marks in physics and "+ phyChemMarks[i][1]+ " marks in Chem.");
        }

//        declaration of jagged array
        System.out.println("\nThis is an example of a jagged array.");
        int[][] jaggedArray = { {1, 2}, {3, 4, 5}, {6, 7, 8, 9} };
        for (int[] i:jaggedArray){
            for (int j:i){
                System.out.println(j);
            }
        }

//         array fill method
        System.out.println("\nMath array filled with all values as 20.");
        Arrays.fill(mathMarks,20);
        for (int i:mathMarks){
            System.out.println("Marks in maths: " +i);
        }

//        Array equals method
        System.out.println("\nChecking if 2 arrays are equal.");
        System.out.println(mathMarks.equals(ioeMarks));

//        sorting array
        System.out.println("\nSorted array for IOE marks:");
        Arrays.sort(ioeMarks);
        for(int i:ioeMarks){
            System.out.println(i);
        }


//        object of arrays
//        using the class 'constructors' to demonstrate the same
        System.out.println("\nArray of objects:");
        Constructors objectArrays[]=new Constructors[4];
        objectArrays[0]=new Constructors("IT",4);
        objectArrays[1]=new Constructors("Comps",2);
        objectArrays[2]=new Constructors();
        objectArrays[3]=new Constructors("Extc");
        objectArrays[0].displayInfo();
        objectArrays[1].displayInfo();
        objectArrays[2].displayInfo();
        objectArrays[3].displayInfo();


    }
}

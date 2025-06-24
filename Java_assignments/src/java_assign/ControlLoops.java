package java_assign;


public class ControlLoops {
    public static void main(String[] args) {
        int marks[]= {20,19,15,20,6,9,13};

        System.out.println("This is a for loop");
        System.out.println("Roll no : Marks");
        for(int i=0;i<marks.length-1;i++){
            System.out.println(i+1 + " : " +marks[i]);
        }

        System.out.println("\nThis is a while loop");
        System.out.println("Passed students: ");
        int i=0;
        while(i<marks.length){
            if(marks[i]>7){
                System.out.println("Roll number "+i+1+ "passed.");
            }
            i++;
        }

        System.out.println("\nThis is a do while loop");
        i=0;
        do{
            if(marks[i]<=7){
                System.out.println("Roll number " +i+ " failed.");
            }
            i++;
        }while(i<=5);

        System.out.println("\nThis is a for each loop");

        int count=0;
        for(int j:marks){
           if(j==20){
               count++;
           }
        }
        System.out.println("Number of students with full marks:" +count);
    }
}

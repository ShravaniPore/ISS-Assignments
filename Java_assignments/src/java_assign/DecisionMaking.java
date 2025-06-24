package java_assign;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
    String grade="F";
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks=sc.nextInt();
        if(marks>=50){
            System.out.println("Pass");
            if(marks>=80){
                grade="O";
            }else if(marks>=70 && marks<80){
                grade="A";
            }else if(marks>=60 && marks<70){
                grade="B";
            }else if(marks>=50 && marks<60){
                grade="C";
            }
        }else{
            System.out.println("Fail");
            grade="F";
            if(marks>=40){
                System.out.println("Student can apply for rechecking.");
            }else{
                System.out.println("Student can not apply for rechecking.");
            }
        }

        switch(grade) {
            case "O":
                System.out.println("Outstanding");
                break;
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very good");
                break;
            case "C":
                System.out.println("Keep it up");
                break;
            case "F":
                System.out.println("Better luck next time");
                break;
            default:
                System.out.println("No such grade");

        }

    }
}

package java_assign;

import java.util.Scanner;

public class Modifiers {
//    public: anywhere
    public String name;
//  default: within same package
    int employeeId;
//    private: within class
    private String password;
//    protected: within same package and subclasses
    protected double salary;

    public Modifiers(String name,int employeeId,String password,double salary){
        this.name=name;
        this.employeeId=employeeId;
        this.password=password;
        this.salary=salary;
    }

    public void displayInfo(){
        System.out.println("Name of the employee is"+ name);
        System.out.println("Employee Id:" +employeeId);
    }

    private boolean checkPassword(String password){
        return password.equals(this.password);
    }

    protected void showSalary(){
        System.out.println("Salary:" +salary);
    }

    public static void main(String[] args) {
        Modifiers emp1=new Modifiers("empName1", 1,"pass", 100000);
        emp1.displayInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password=sc.nextLine();
        if(emp1.checkPassword(password)){
            System.out.println("correct password");
        }else{
            System.out.println("Incorrect password");
        }

        emp1.showSalary();

    }
}


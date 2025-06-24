package java_assign;

public class Variables {
    //instance variable-each instance will have instance variable of its own
    String employeeName;

    //static variable-will be same for all instances.
    static String companyName="ISS";

    public Variables(String Name){
        this.employeeName=Name;
    }

    public void setRole(String role) {
        //local variable-cannot be accessed outside the local scope
        String Role =role;
        System.out.println("Employee " + employeeName + " is assigned to" + Role);
    }

    public static void main(String[] args) {
        Variables Employee1 =new Variables("Eg_employee");
        System.out.println(Employee1.employeeName+ " is an example of instance variable");
        System.out.println(Employee1.companyName+ " is an example of static variable");
//      System.out.println(Employee1.Department); gives error because cannot be accessed outside setDepartment method
        Employee1.setRole("Software Development");

    }
}




package java_assign;

public class Constructors  {
    String department;
    int id;
//   non parameterized constructor
    public Constructors(){
        this.department="IT";
        this.id=1;
        System.out.println("This is non parameterized constructor.");
    }
//  parameterized constructor
    public Constructors(String department){
        this.department=department;
        this.id=2;
        System.out.println("This is parameterized constructor.");
    }
//  constructor overloading
    public Constructors(String department,int id){
        this.department=department;
        this.id=id;
        System.out.println("This is also parameterized constructor.");
    }

    public void displayInfo(){
        System.out.println("Department: "+ department);
        System.out.println("Id: "+ id);
    }

    public static void main(String[] args) {
        Constructors NonParameter = new Constructors();
        NonParameter.displayInfo();
        Constructors ParameterEg = new Constructors("Comps");
        ParameterEg.displayInfo();
        Constructors OverloadingEg = new Constructors("Extc", 3);
        OverloadingEg.displayInfo();

    }
}

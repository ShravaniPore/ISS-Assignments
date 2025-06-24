package java_assign;

//final variable, method, class

public class FinalKeyword {
    final double FEES = 20000;

    final void changeFees() {
        System.out.println("This is a change fees method.");
//        This gives error as FEES variable is final variable and cannot be changed
//        FEES= 10000;
        System.out.println("Couldn't change fees as FEES is a final variable.");
    }

    public static void main(String[] args) {
        FinalKeyword example1=new FinalKeyword();
        example1.changeFees();
        FinalClassExample.main(args);
    }
}

final class FinalClassExample extends FinalKeyword{
//  gives error because final method can be inherited but cannot be overridden

//    public void changeFees(){
//
//    }
public static void main(String[] args) {
    FinalClassExample example2= new FinalClassExample();
    example2.changeFees();
}
}


//gives error as final class cannot be inherited

//class FinalClassInheritanceExample extends FinalClassExample{
//    public static void main(String[] args) {
//
//    }
//}
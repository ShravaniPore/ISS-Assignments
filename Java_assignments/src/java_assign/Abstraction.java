package java_assign;


//Abstraction using abstract class and interface
public class Abstraction {
    public static void main(String[] args) {
//        Abstraction using abstract classes
    System.out.println("Abstraction using Abstract classes.");
    OnlinePayment gpay=new GPay();
    gpay.acknowledgement();
    gpay.message();

    OnlinePayment paytm=new Paytm();
    paytm.acknowledgement();
    paytm.message();

//    Abstraction using interfaces
        System.out.println("\nAbstraction using Interfaces.");
    Bluetooth mobile1=new Bluetooth();
    mobile1.share();
    }
}

//abstraction using abstract class
abstract class OnlinePayment{
    void message(){
        System.out.println("Payment successful.");
    }
//    abstract method-no body
    abstract void acknowledgement();
}

class GPay extends OnlinePayment{
    void acknowledgement(){
        System.out.println("Payment made via GPay.");
    }
}

class Paytm extends OnlinePayment{
    void acknowledgement(){
        System.out.println("Payment made via Paytm.");
    }
}

//Abstraction using Interface
interface sharable{
//    methods can not have a method body.
//    variables are constants.
    String MESSAGE="Shared successfully";
    void share();
}

class Bluetooth implements sharable{
    public void share(){
        System.out.println(MESSAGE+ " using bluetooth.");
    }
}

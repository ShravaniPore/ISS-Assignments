package java_assign;

//Overloading or compile time polymorphism
public class Polymorphism {
    public static void main(String[] args) {
    Billing bill =new Billing();
        double bill1=bill.calculateBill(400);
        System.out.println("Customer 1 bill is Rs."+bill1);

        bill1=bill.calculateBill(400,4);
        System.out.println("Customer 2 bill is Rs."+bill1);

        bill1=bill.calculateBill(400,3,100);
        System.out.println("Customer 3 bill is Rs."+bill1);

        bill1=bill.calculateBill(600,50.5f);
        System.out.println("Customer 4 bill is Rs."+bill1);


    }
}
 class Billing{
    public double calculateBill(double price){
        return price;
    }

    public double calculateBill(double price,int quantity){
         return (price*quantity);
     }

     public double calculateBill(double price,float discount){
         return (price-discount);
     }

     public double calculateBill(double price,int quantity, double discount){
         return ((price*quantity)-discount);
     }


 }
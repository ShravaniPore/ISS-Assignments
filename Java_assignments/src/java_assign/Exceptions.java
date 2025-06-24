package java_assign;

public class Exceptions {
    public static void main(String[] args) {
        int[] marks={12,15,19};
//        try catch block,finally keyword
        try{
            System.out.println(marks[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally{
            System.out.println("This block always executes.");
        }

//        custom exception example
        BankAccount account1=new BankAccount(1,4000);
        try{
            account1.deposit(-200);}
        catch(InvalidDepositException e){
            System.out.println(e.getMessage());
        }
    }
}

class BankAccount{
    int id;
    double amount;
    BankAccount(int id, double amount){
        this.id=id;
        this.amount=amount;
    }

    public void displayAmount(){
        System.out.println(amount+" is the current balance of the account.");
    }

//    throws keyword used
    public void deposit(double depositAmount) throws InvalidDepositException{
        if(depositAmount>0) {
            amount = amount + depositAmount;
            System.out.println(depositAmount + "Rs deposited to the account. Current balance is " + amount);
        }else{
//            throw keyword used
            throw new InvalidDepositException();
        }
    }

    public void withdraw (double withdrawAmount) {
        amount=amount-withdrawAmount;
        System.out.println("Amount withdrawn. Current balance is rs."+amount);
    }
}

 class InvalidDepositException extends Exception{
    public InvalidDepositException(){
        super("Negative amounts can not be deposited.");
    }
}

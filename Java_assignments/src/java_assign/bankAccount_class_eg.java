package java_assign;

class bankAccount_class_eg {
    //instance variables
    private String acctHolder;
    private String acctNumber;
    private double balance = 0.0;

    //parameterized constructor
    public bankAccount_class_eg(String acctHolder, String acctNumber) {
        this.acctHolder = acctHolder;
        this.acctNumber = acctNumber;
    }

    //instance methods
    public void displayBalance() {
        System.out.println("Account holder name:" + acctHolder);
        System.out.println("Current balance: Rs" + balance);
    }

    public void withdraw(double amount) {
        if (balance > 0 && amount < balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully");
            displayBalance();
        } else {
            System.out.println("Insufficient amount");
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully");
        displayBalance();
    }


    public static void main(String[] args) {
        //instance /object
        bankAccount_class_eg account1 = new bankAccount_class_eg("Shravani", "abc123");
        account1.deposit(5000);
        account1.withdraw(2000);
        account1.withdraw(3001);
        account1.displayBalance();
    }
}




class BankAccount{
    public int ac_Number;
    public String cust_name;
    public double balance;

    static int accountCount = 0;
    
    final double INTEREST_LIMIT = 10.0;


    BankAccount(int ac_Number, String cust_name, double balance){

        this.ac_Number = ac_Number;
        this.cust_name = cust_name;
        this.balance = balance;

        accountCount++;
    }

    void displayDetails(){
        System.out.println("Account Number: "+ac_Number);
        System.out.println("Customer Name"+cust_name);
        System.out.println("Balance"+balance);
    }

    double calaculateInterest(){
        return 0;

    }
    // method overloading
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited : "+deposit);
    }

    //method overloading -depositewith amount and bonus
    void deposite(double amount, double bouns){
        balance = balance + amount +bouns;
        System.out.prinln("Deposited : "+amount);
        System.out.prinln("Bouns"+bouns); 
    }

    //withdraw method
    void withdraw(double amount) throws InsufficientBalanceExpception{

        if(amount > balance ){
            throws new InsufficientBalanceExpception(
                "Insufficient balance ! Available balance: "+ bakace
            );
        }

        balance = balance -amount;
        System.out.println("Withdrawn :"+ amount); 
    }
    // Save details to file
    void SaveToFile(){
        try{
            FileWriter writer = new FileWriter("customer.txt",true);

            writer.write("Account Number : "+ac_Number+"\n");
            writer.write("Customer Name: "+cust_name +"\n");
            witer.write("Balance : "+balance+"\n");

            writer.close();
            System.out.println("Customer details saved .");
        }
        catch(IQException e){
            System.out.println("File error : "+e.getmessage());
        }

    }

    //read details from file 
    static void readFromFile(){

        try{
            FileReader reader = new FileReader("customer.txt");
            BufferReader br = new BufferReader(reader);

            String line;
            System.out.println("\n Customer Details From file: ");

            while((line = br.readLine()) != null){
                System.out.println(line);
            
            }  
            br.close();

            catch(IQException e){
                System.out.println("File error : "+e.getmessage());

            }
        }
    }


}

//create the exception class 
class InsufficientBalanceExpception extends Exception{
    InsufficientBalanceExpception(String message){
        super(message);
    }
}
throw new InsufficientBalanceException(
    "Insufficient balance!"
);

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String customerName, double balance) {

        super(accountNumber, customerName, balance);
    }

    @Override
    double calculateInterest() {

        double rate = 5.0;

        if (rate > INTEREST_LIMIT) {
            rate = INTEREST_LIMIT;
        }

        return balance * rate / 100;
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(int accountNumber, String customerName, double balance) {

        super(accountNumber, customerName, balance);
    }

    @Override
    double calculateInterest() {

        double rate = 3.0;

        if (rate > INTEREST_LIMIT) {
            rate = INTEREST_LIMIT;
        }

        return balance * rate / 100;
    }
}

public class BankManagement {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount(101, "Vishnu", 10000);

        CurrentAccount current =
                new CurrentAccount(102, "Priya", 20000);

        // Display details
        System.out.println("Savings Account");
        savings.displayDetails();

        System.out.println("\nCurrent Account");
        current.displayDetails();

        // Method overloading
        System.out.println("\nDeposit Operations");

        savings.deposit(2000);

        savings.deposit(3000, 500);

        // Interest
        System.out.println(
                "\nSavings Interest: " +
                savings.calculateInterest()
        );

        System.out.println(
                "Current Interest: " +
                current.calculateInterest()
        );

        // Withdrawal
        try {

            savings.withdraw(5000);

            System.out.println(
                    "Balance after withdrawal: " +
                    savings.balance
            );

            // Uncomment to test exception
            // savings.withdraw(50000);

        }
        catch (InsufficientBalanceException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }

        // Save details
        savings.saveToFile();
        current.saveToFile();

        // Read file
        BankAccount.readFromFile();

        // Static account count
        System.out.println(
                "\nTotal Accounts: " +
                BankAccount.accountCount
        );
    }
}
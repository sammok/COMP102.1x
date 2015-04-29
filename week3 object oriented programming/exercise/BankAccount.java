import comp102x.IO;

/**
 * A bank account has a balance and an owner who can make
 * deposits to and withdrawals from the account
 */
public class BankAccount
{
    // instance variables 
    private double balance = 0.0;
    private String owner = "NoneName";

    /**
     * Default constructure for a bank account with zero balance
     */
    public BankAccount() {}

    /**
     * Construct a balance with a given initial balance and owner's name
     * @param   initiaBalance       the initial balance
     * @param   name                name of owner
     */
    public BankAccount(double initiaBalance, String name)
    {
        balance = initiaBalance;
        owner = name;
    }
    
    /**
     *  Method for deposition money to the bank account
     *  @para   dAmount     the amount to be deposited
     */
    public void deposition(double dAmount)
    {
        balance = balance + dAmount;
    }
    
    /**
     *  Method for withdrawing money from the bank account
     *  @para   wAmount     the amount to be withdrawn
     */
    public void withdraw(double wAmount)
    {
         balance = balance - wAmount;
    }
    
    /**
     *  Method for getting the current balance of the bank account
     *  @return     the current balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     *  Main method for testing the bank account
     */
    public static void main(String[] args) 
    {
        BankAccount testAccount = new BankAccount();
        testAccount.deposition(100);
        testAccount.withdraw(40);
        IO.outputln(testAccount.owner + "'s account has a balance of $"
                    + testAccount.getBalance());
                    
        BankAccount myAccount = new BankAccount();
        myAccount.deposition(1000);
        myAccount.withdraw(399);
        IO.outputln(myAccount.owner + "'s account has a balance of $"
                    + myAccount.getBalance());
    }
}

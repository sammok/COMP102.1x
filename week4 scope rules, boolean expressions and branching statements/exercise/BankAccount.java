public class BankAccount
{
    public double balance = 0.0;
    public int x;
    public double a;
    public float f;
    public String s;
    
    public BankAccount(){}
    
    public void deposit(double dAmount)
    {
        balance += dAmount;
    }
    
    public void substract(double balance)
    {
        this.balance -= balance;
    }
    
    public double getBalance()
    {
        System.out.println(x + "" + a + "" + f + "" + s);
        return balance;
    }
    
    public static void main(String[] args)
    {
        BankAccount myAccount = new BankAccount();
    }
}
package Lab1;


//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  private static int numAccounts;
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
      this.balance = initBal;
      this.name = owner;
      this.acctNum = number;
      numAccounts += 1;
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
      if(amount < this.balance){
          this.balance -= amount;
      }
      else{
          System.out.println("Insufficient balance");
      }
  }
  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
      this.balance += amount;
  }
  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
      return this.balance;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
      return "Name: " + this.name + "; Number: " + this.acctNum + "; Balance: " + this.balance + ";";
  }
  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public double chargeFee()
  {
      this.balance -= 10.00;
      return this.balance;
  }
  //----------------------------------------------
  // Changes the name on the account
  //----------------------------------------------
  public void changeName(String newName)
                         
  {
      this.name = newName;
  }
  
  public static int getNumAccounts()
  {
      return numAccounts;
  }
  
  public void close()
  {
      this.name += " CLOSED";
      this.balance = 0;
      numAccounts -= 0;
  }
  
  public static Account consolidate(Account acct1, Account acct2)
  {
    
    if((acct1.name.equals(acct2.name) && (acct1.acctNum != acct2.acctNum))){
      Account acct3 = new Account((acct1.balance  + acct2.balance),acct1.name,acct1.acctNum);
      acct3.balance = (acct1.balance  + acct2.balance);
      acct3.name = acct1.name;
      acct3.acctNum = acct1.acctNum;
      
      acct1.close();
      acct2.close();
      
      return acct3; 
    }
    
    System.out.println("Unable to consolidate- accounts are either in different names or have the same number");
    return null;
  }
}
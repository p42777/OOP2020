
public class BankAccount {
	
	private int accountID;
	private double balance;
	private double interestRate;
	
	
	public BankAccount(int accountID) {
		this.accountID=accountID;
		balance=0;
		interestRate=0.001;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	 public void deposit(double amount) {
		  balance=balance+amount;
		 }
	
	public String withdraw(double amount) {
		  
		String s ="";
		if(getBalance()>=amount) {
		   balance=balance-amount;
		   s=String.valueOf(getBalance());
		   		  
		}
		else {
		   s="Transaction failed.";
		   	  
		}
		return s;
	 }
	 
	 public void updateInterestRate(double interestRate) {
		  this.interestRate=interestRate;
	 }

	 public void interestPay() {
		 deposit(getBalance()*interestRate); 
	 }
			
	 public void yearEnd() {
		 interestPay();	 
	 }
			 
	 public String getInfo() {
			  
		 String a="";
	     String accountInfo=String.format("AccountID:%d",getAccountID());
	     String balanceInfo=String.format("\nBalance:%.2f\n",getBalance());
	     a=accountInfo + balanceInfo;
	     return a;
			
	 }
			
}



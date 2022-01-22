
public class BankAccount {
	private int ID;
	protected double balance;
	
	
	public BankAccount(int ID,double balance) {
		this.ID=ID;
		this.balance=balance;
	}
	
	public int getID() {
		return ID;
	}
	
    public void setID(int ID) {
	}
	
    public void setBalance(double balance) {
	}
    
    public void deposit(double amount) {
    	balance+=amount;
    }
    
    public void withdraw(double amount) {
		
		if(balance>amount) {
			balance-=amount;
		}
		else {
			System.out.print("Your account does not have enough money.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
}

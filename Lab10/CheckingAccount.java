
public class CheckingAccount extends BankAccount{
	private int transCount;
	public CheckingAccount(int amount, int ID) {
		super(ID, amount);
		// TODO Auto-generated constructor stub
	}
    public void deposit(double amount) {
    	transCount=transCount+1;
    	balance+=amount;
    }
    public void withdraw(double amount) {
		
	   transCount=transCount+1;
 	   balance-=amount;
	}
 
    public void monthEnd() {
    	double commission_rate = 0.01;
    	if(transCount>3) {
    		balance = balance*(1-commission_rate);
    	}
    	transCount=0;
    	
    	
    }
 
}


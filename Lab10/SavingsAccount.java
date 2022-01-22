
public class SavingsAccount extends BankAccount {
   private double interestRate ;
   
   public SavingsAccount(int amount, int ID, double interestRate) {
	   super(ID, amount);
	   
	   this.interestRate=interestRate;
   }
	
	public void setInterestRate(double interestRate) {
		
	}
	
	public void monthEnd() {
		balance= balance*(1+interestRate*0.01);
		
	}
}

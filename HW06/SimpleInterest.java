
public class SimpleInterest extends DepositInsurance{
 
	private double interestRate;

	public SimpleInterest(BankAccount account, double annuity, double interestRate, int experiment){
 
		super(account,annuity,experiment);
        this.interestRate=interestRate;
 
	}
 
	public void interestPay() {
  
		super.updateTotalValue(getAnnuity()*interestRate);

	}
 
	public void addPremium(double amount) {
  
		super.updateAnnuity(amount);
 
	}
 
	public void yearEnd() {
          
		super.yearEnd();
        if(super.getCurrentYear()>getExperiment()) {
   
        	super.redemption();
  
        }
        
        else {
  
        	updateCurrentYear();
        	interestPay();
 
        }
 
	}
}
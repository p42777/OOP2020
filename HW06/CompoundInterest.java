import java.util.ArrayList;

public class CompoundInterest extends DepositInsurance{
 
	private ArrayList <Double> interestRate;
 
	public CompoundInterest(BankAccount account, double annuity, int experiment) {
  
		super(account,annuity,experiment);
        interestRate=new ArrayList <Double>();
 
	}
 
	public void setInterestRate (double rate) {
        interestRate.add(rate);
 
	}
 
	public void interestPay() {
		updateTotalValue(getAnnuity()*interestRate.get(getCurrentYear()-1));
 
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

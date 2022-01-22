
public class DepositInsurance {

	private BankAccount account;
	private double totalValue, annuity;
	private int experiment, currentYear;
	
	
	public DepositInsurance(BankAccount account, double annuity, int experiment) {
		this.account = account;
		this.annuity = annuity;
		this.experiment = experiment;
		currentYear=0;
		totalValue=0;
		
	}
	
	public int getExperiment() {
		return experiment;
	}
	
	public int getCurrentYear() {
		return currentYear;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
	public double getTotalValue() {
	    return totalValue;
	}
	
	public double getAnnuity() {
		return annuity;
	}
	
	 public int updateCurrentYear() {
		  currentYear++;
		  return currentYear;
		
	 }
		
	 public void updateAnnuity(double amount) {
		  annuity=annuity+amount;
		 
	 }
		 
	 public void updateTotalValue(double amount) {
		  totalValue=totalValue+amount;
		 
	 }
		
	 public void redemption() {
		  account.deposit(getTotalValue());
		 
	 }
		 
	 public void redemption(double redemptionRate) {
		  totalValue=totalValue*(1-redemptionRate);
		  account.deposit(getTotalValue());
		 
	 }
		 
	 public void yearEnd() {
		  updateTotalValue(getAnnuity());
		 
	 }
		
	 public String getInfo() {
		  String a="";
		  String accountInfo =String.format("Designated Bank Accounts:%d",account.getAccountID());
		  String totalValueInfo=String.format("\nCurrent total value:%.2f",getTotalValue());
		  String currentYearInfo=String.format("\nElapsed Years:%d",getCurrentYear());
		  a=accountInfo+totalValueInfo+currentYearInfo;
		  return a;
		 
	 }
		 
		
}
	
	
	
	
	
	
	
	
	
	
	
	


import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		BankAccount account1 = new BankAccount(109306500);
        account1.deposit(1000000);
        System.out.print(account1.getInfo());
 
        double annuity = 10000;
        int experiment = 3;
 
        SimpleInterest insurance1 = new SimpleInterest(account1, annuity, 0.03, experiment);
        CompoundInterest insurance2 = new CompoundInterest(account1, annuity,experiment);
 
        insurance2.setInterestRate(0.02);
        insurance2.setInterestRate(0.03);
        insurance2.setInterestRate(0.04);

        ArrayList<DepositInsurance> insurances = new ArrayList<DepositInsurance>();
 
        insurances.add(insurance1);
        insurances.add(insurance2);
 
        for(DepositInsurance i:insurances){
   
        	if(i instanceof SimpleInterest){
	  
        		System.out.println("\n<<Simple Interest Insurance>>");
	            System.out.println("----------------------------------");
	  
        	}
        	else if(i instanceof CompoundInterest){
	            
        		System.out.println("\n<<Compound Interest Insurance>>");
	            System.out.println("----------------------------------");
	   
        	}
	  
        	while(i.getCurrentYear()<3){
	            
        		i.yearEnd();
	            System.out.println(i.getInfo());
	            System.out.println("----------------------------------");
	   
        	}
        }
	 
	}
	
}
  
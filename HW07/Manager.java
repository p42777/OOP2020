
public class Manager extends Employee{

	
	private double bonusRate;
	
    public Manager (String name, String title, double dailyWage, double bonusRate) {
    	super(name,title,dailyWage);
    	this.bonusRate = bonusRate;
    }
    
    
    public double payment() {
    	  double wage;
    	  wage = super.payment() * bonusRate;
    	  return wage;
    	
    }
    
    
}

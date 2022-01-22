
public class Vehicle implements FixedAsset {

	private int id, depreciationYear;
	private double cost, durableYear, residualValue, depreciationRate, depreciationExp, bookValue ;
	
	
	public Vehicle(int id, double cost, double durableYear, double residualValue) {
		this.id = id;
		this.cost = cost;
		this.durableYear = durableYear;
		this.residualValue = residualValue;
		this.bookValue = cost;
		this.depreciationYear = 0;
		calcDepreciationRate();
		
	}
	
	
	public void calcDepreciationRate() {
		depreciationRate = (1 / durableYear) * 2 ;
	}
	
	
	public void calcDepreciationExp() {
		
		if(durableYear > depreciationYear) {
			depreciationExp = bookValue * depreciationRate ;
			
		}
		
		else if(durableYear == depreciationYear + 1) {
			depreciationExp = bookValue - residualValue ;
			
		}
		
		else {
			depreciationExp = 0;
		}
		

	}
	
	public void calcBookValue() {
		bookValue = bookValue - depreciationExp ;
	}
	
	public double getDepreciationExp() {
		calcDepreciationExp();
		return depreciationExp;
		}
	
	
	public double getBookValue() {
		calcBookValue();
		return bookValue;
	}
	
}

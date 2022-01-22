
public class Machine implements FixedAsset {

	
	private int id, depreciationYear;
	private double cost, durableYear, residualValue, depreciationRate, depreciationExp, bookValue ;
	
	public Machine(int id, double cost, double durableYear, double residualValue) {
		this.id = id;
		this.cost = cost;
		this.durableYear = durableYear;
		this.residualValue = residualValue;
		this.depreciationYear = 0;
	}
	
	
	public void calcDepreciationExp() {
		if(durableYear > depreciationYear) {
			depreciationExp = (cost - residualValue) / durableYear;
		}
		else {
			depreciationExp = 0;
		}
	}
	
	
	public void calcBookValue() {
		bookValue = bookValue - depreciationExp;
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

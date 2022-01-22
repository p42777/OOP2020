import lab.practice.Stock;

public class StockAnalyzer implements Analyzer {

	
	public double measurer(Object object) {
		Stock a = (Stock) object;
		double value = (a.getClosingPrice()-a.getOpeningPrice()) * a.getVolume() * 1000;
		return value;
	}
	
	
	
	public String getName(Object object) {
		Stock a = (Stock) object;
		return a.getSymbol();
	}
	
	
}

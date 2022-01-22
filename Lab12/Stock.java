package lab.practice;
public class Stock {

	
	private String symbol;
	private double openingPrice;
	private double closingPrice;
	private double volume;
	
	public Stock(String symbol, double openingPrice, double closingPrice, double volume) {
		
		this.closingPrice = closingPrice;
		this.openingPrice = openingPrice;
		this.symbol = symbol;
		this.volume = volume;
		
	}
	
	
	public String getSymbol() {
		return symbol;
	}
	
	
	public double getOpeningPrice() {
		return openingPrice;
	}
	
	
	public double getClosingPrice() {
		return closingPrice;
	}
	
	
	public double getVolume() {
		return volume;
	}
	
	
}

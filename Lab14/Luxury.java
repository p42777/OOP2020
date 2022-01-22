import java.util.ArrayList;

public class Luxury implements Item {

	private int ID;
	private double price,shippingFee;
	private ArrayList<Double> discountRateList;
	
	
	public Luxury (int ID,double price, double shippingFee, ArrayList<Double> discountRateList) {
		this.ID = ID;
		this.price = price;
		this.shippingFee = shippingFee;
		this.discountRateList = discountRateList;
	}
	
	public double calcDiscount(int num) {
		if (num > discountRateList.size() && discountRateList != null) {
			return discountRateList.get(discountRateList.size()-1) * num * price;
		}
		
		else if (num < discountRateList.size() && discountRateList != null) {
			return discountRateList.get(num-1) * num * price;
		}
		
		else {
			return 0;
		}
	}
	
	
	public int getID() {
		return this.ID;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double calcShippingFee(int num) {
	
		
	    return shippingFee * num;
	}
	
	
	
	
}

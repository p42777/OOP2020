import java.util.ArrayList;

public class Furniture implements Item {

	
	private int ID;
	private ArrayList<Double>discountList;
	private double price,weight,weightShippingFee;
	
	public Furniture(int ID, double price, double weight, double weightShippingFee,ArrayList<Double>discountList) {
		this.ID = ID;
		this.price = price;
		this.weight = weight;
		this.weightShippingFee = weightShippingFee;
		this.discountList = discountList;
	}
	
	
	public double calcDiscount(int num) {
		if (num > discountList.size() && discountList != null) {
			return discountList.get(discountList.size()-1);
		}
		
		else if (num < discountList.size() && discountList != null) {
			return discountList.get(num-1);
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
	
		double shippingFee = weightShippingFee * weight * num;
	    return shippingFee;
	}
	
	
	
	
	
}

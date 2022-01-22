import java.util.ArrayList;

public class Order {
 
	private int ID;
    private ArrayList<Item> itemList;
    private ArrayList<Integer> quantities;
    private double subTotal,totalBenefit,shippingFee,orderTotal;
    private boolean isPaid;

    public Order(int ID) {
  
    	this.ID = ID;
        itemList = new ArrayList<Item>();
        quantities = new ArrayList<Integer>();
  
        subTotal = 0;
        totalBenefit = 0;
        shippingFee = 0;
        orderTotal = 0;
  
        isPaid = false;

    }

    public double getOrderTotal() {
    	return orderTotal;
    }
 
    public int getID() {
    	return ID;
    }
    
    public void addItem ( Item item, int num ) {
    	itemList.add(item);
        quantities.add(num);
    }
 
    public String placeOrder(boolean isVIP) {
  
    	String s = "";
    	if(isPaid == true) {
    		s = s + "Payment completed! Thanks.";   
    	}
    	else{
    		for( int i = 0 ; i < itemList.size() ; i++ ) {
    			
    			totalBenefit = totalBenefit + itemList.get(i).calcDiscount(quantities.get(i));
    			subTotal = subTotal + (quantities.get(i) * itemList.get(i).getPrice() );
    			shippingFee = shippingFee + itemList.get(i).calcShippingFee(quantities.get(i));
    		}
  
    		if(isVIP == true) {
               totalBenefit = totalBenefit * 1.2;
    		}
   
    		orderTotal = subTotal - totalBenefit + shippingFee;
    		s = s + String.format("Sub total: %.2f\n",subTotal);
            s = s + "------------------------------\n";
            s = s + String.format("Discount: %.2f\n",totalBenefit);
            s = s + "------------------------------\n";
            s = s + String.format("Shipping fee: %.2f\n",shippingFee);
            s = s + "------------------------------\n";
            s = s + String.format("Order total: %.2f",orderTotal);
  
    	}
    	
            isPaid = true;
    	    return s;
 
    }

    public String getInfo() {
  
    	String s = "";
  
    	if(isPaid == false) {
           
    		s = s + "Order Summary\n";
            s = s + String.format("%-11s%9s%10s\n","Item","Price","Quantity");
            s = s + "------------------------------\n";
   
            for( int i = 0 ; i < itemList.size() ; i++) {
                  
            	s = s + String.format("%-11d%9.2f%10d\n",itemList.get(i).getID(),itemList.get(i).getPrice(),quantities.get(i));
   
            }
  
            s = s + "------------------------------";
  
    	}
    	
 
    	return s; 
 
    }
}
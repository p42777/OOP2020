import java.util.ArrayList;

public class Membership {
 
	private int ID;
    private ArrayList<Order> orderList;
    private double totalSpending;
    private boolean isVIP;
 
    public Membership(int ID) {
       
    	this.ID = ID;
        orderList = new ArrayList<Order>();
        totalSpending = 0;
        isVIP = false;
 
    }
 
    public boolean getIsVIP() {
    	return isVIP;
    }
 
    public void buy(int orderID, Item item, int num) {
  
    	for(Order i : orderList) {
    		if(orderID == i.getID()) {
    			i.addItem(item, num); 
    		}
    	}
    }

    public int buy(Item item, int num) {
 
    	Order i = new Order(orderList.size());
        orderList.add(i);
        i.addItem(item, num);
        return i.getID();

    }
 
    public String checkOut(int orderID) {
        String a = "";
  
        for(Order i : orderList) {
            
        	if(orderID == i.getID()) {
             a = a + i.getInfo() + "\n";
             a = a + i.placeOrder(isVIP);
        	}
        	else{
        		a = "Error 1\n";
        	}
        }
        return a;
 
    }
 
    public void yearEnd() {
  
    	if(totalSpending>5000) {
   
    		isVIP = true;
    	} 
    	totalSpending = 0;
    	orderList = new ArrayList<Order>();
 
    }
}

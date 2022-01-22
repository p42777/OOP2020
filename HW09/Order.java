import java.util.ArrayList;

public class Order {
 
	private int ID;
    private double totalAmount;
    private ArrayList<Item> items;
    private ArrayList<Integer> quantities;
 
    public Order() {
  
    	items = new ArrayList<Item>();
        quantities = new ArrayList<Integer>();
        totalAmount = 0;
 
    }
 
    public void addItem(Item item, int quantity) {
  
    	items.add(item);
    	quantities.add(quantity);
 
    }
 
    public String getInfo() {

    	String s = "";
    	s = s + String.format("%-8s%15s%15s\n","Item","Price","Quantity");
 
    	for(int i = 0 ; i<items.size() ; i++) {
   
    		s = s + String.format("%-8s%12.0f%18d\n",items.get(i).getName(),items.get(i).getPrice(),quantities.get(i));
  
    	}
  
    	s = s + "-------------------------\n";
  
    	return s;
 
    }

    public String checkout() {
  
    	String s = "";
    	for(int i = 0 ; i<items.size() ; i++) {
   
    		totalAmount = totalAmount + items.get(i).getPrice()*quantities.get(i);
  
    	}
    	s = s + String.format("The total amount:%.2f\n",totalAmount);
  
    	return s;
 }
}
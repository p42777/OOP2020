import java.util.ArrayList;

public class ItemManager {
 
	private ArrayList<Item> items;
 
	public ItemManager() {
          items = new ArrayList<Item>();
 
	}

	public void addItem(int ID, String name, double price) {
		items.add(new Item(ID,name,price));
 
	}
	
    public ArrayList<Item> getItems(){
        return items;
 
    }
 
    public Item findItem(String itemName) {
    	Item i = null;
 
    	for(Item item:items) {
    		if(item.getName()==itemName) {
    			i = item;
    		}
    		else {
   
    		}
  
    	}
  
    	return i;
 
    }
}
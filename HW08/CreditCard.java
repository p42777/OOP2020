import java.util.ArrayList;

public class CreditCard implements Payment {

	
	public double totalPrice(ArrayList<Food> foods) {
		// TODO Auto-generated method stub
		double total=0;
		for(Food i:foods){
			total += i.getPrice();
		}	
		total = total*1.02;
		return total;
	}
	
	public double promote(ArrayList<Food> foods){
		int amount = 0;
		for (int i = 0 ; i<foods.size() ; i++){
			
			if (foods.get(i).getID()==777){
				
				foods.remove(i);
				amount++;
				if(amount==3){
					break;
				}
			}
			else {
				return 0;
			}
		}
		return 50;
	}
	

}

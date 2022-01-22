import java.util.ArrayList;

public class Customer {
	private String name;
	protected double money;
	private double calLeft;
	private double subtotal;
	private ArrayList<Food> foods;
	private Payment payment;
	
	public Customer(String name,double money,double calLeft,Payment payment){
		this.name=name;
		this.money=money;
		this.calLeft=calLeft;
		this.payment=payment;
		subtotal=0;
		foods=new ArrayList<Food>();
	}
	
	public double getMoney(){
		return money;
	}
	
	public void order(Food food){
		if(money>subtotal){
			if(food.getCar()<calLeft){
				foods.add(food);
				calLeft -= food.calories();
				subtotal += food.getPrice();
			}
			else{
				System.out.print("Too fat for " + name + "\n");
			}
		}
		else{
			System.out.print(name + " doesn't have enough money!\n");
		}
	}
	
	public String orderList(){
		String orderList = "";
		for(Food i:foods){
			orderList += String.format("%-10s%10.2f\n",i.getName(),i.getPrice());
		}
		orderList += String.format("%-10s%10.2f\n","Total:",subtotal);
		return orderList;
		
	}
	
	public double pay(){
		double pay = 0;
		pay = payment.totalPrice(foods)-payment.promote(foods);
		if(money>pay){
			money -= pay;
			return pay;
		}
		else{
			System.out.print(name+" doesn't have enough money!\n");
			return 0;
		}
	}

}

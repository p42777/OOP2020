
public class Food {

	private String name;
	private int id;
	private double pro, price, car, fat;
	
	public  Food (int id,String name,double price,double pro,double car,double fat) {
		this.car = car;
		this.fat = fat;
		this.id = id;
		this.name = name;
		this.price = price;
		this.pro = pro;
		
	}
	
	public double calories() {
		double calories;
		calories = 4 * ( pro + car ) + 9 * fat;
		return calories;
		
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getID()
	{
		return id;
	}
	
	public String name()
	{
		return name;
	}
	
	public double getCar()
	{
		return car;
	}
	public String getName()
	{
		return name;
	}
}

	


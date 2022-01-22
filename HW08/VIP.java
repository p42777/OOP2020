
public class VIP extends Customer{
	
	private int level;

	public VIP(String name, double money, double calLeft, Payment payment,int level) {
		super(name, money, calLeft, payment);
		this.level=level;
		// TODO Auto-generated constructor stub
	}
	
	public double pay(){
		double pay = 0;
		pay = super.pay()-level*10;
		money += level * 10;
		return pay;
		
	}
	
	

}

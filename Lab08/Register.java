import java.util.ArrayList;
public class Register {
	private int totalRevenue;
	private ArrayList<Integer> bills;
	
	public Register() {
		this.totalRevenue=0;
		bills= new ArrayList<Integer>() ;
	}
	
	public int gettotalRevenue() {
		return totalRevenue;
	}
	
	public int getBill(int id) {
		int bill=bills.get(id);
		return bill;
	}
	
	public void calctotalCost(int id, int num, int price) {
		try {
			bills.get(id);
			bills.set(id,bills.get(id)+price*num);
		}
		catch(IndexOutOfBoundsException e) {
			bills.add(price*num);
		}
		this.calctotalRevenue(price*num);
	}
	
	public void calctotalRevenue(int cost) {
		totalRevenue+=cost;
	}
	
	public String getInfo() {
		String a="";
    	a = a+ String.format("My register info:\n");
    	a = a+ String.format("Bill\n");
    	for(int bill:bills) {
    		a = a+String.format("%d\n", bill);
    	}
    	a = a+String.format("Total Revenue:%d",gettotalRevenue());
    	return a;
	}
	
}

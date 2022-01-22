import java.util.ArrayList;
public class DMan {
	
	private String name;
	private int dCount,carryLimit;
	private ArrayList<Customer> custs;
	
	public DMan(String name,int carryLimit){
		this.name=name;
		this.carryLimit=carryLimit;
		dCount=0;
		custs=new ArrayList<Customer>();
	}
	
	public double salary(){
		double salary = 0;
		salary = custs.size()*10;
		return salary;
	}
	
	public void addCusts(Customer cust){
		custs.add(cust);
		if(custs.size()>carryLimit){
			System.out.print("Too many to carry!");
			custs.remove(custs.size()-1);
		}
	}
	

}

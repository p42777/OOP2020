import java.util.ArrayList;
public class Supervisor extends Employee {
	private ArrayList <Employee> subordinates;
	
	public Supervisor(int ID, String name, BankAccount account, String department, int baseSalary, ArrayList<Employee> subordinates, int sales) {
		super(ID, name, account, department, baseSalary, sales);
		this.subordinates=subordinates;
		// TODO Auto-generated constructor stub
		
		for(Employee a : subordinates) {
			sales=a.getSales()+sales;
			setSales(sales);
		}
	}
}

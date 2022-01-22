
public class Employee {
	private int ID, baseSalary, totalSalary, sales;
	private String name, department;
	private BankAccount account;
	public Employee(int ID, String name, BankAccount account, String department, int baseSalary, int sales) {
		this.ID=ID;
		this.baseSalary=baseSalary;
		this.department=department;
		this.name=name;
		this.sales=sales;
		this.account=account;
		totalSalary=0;
	}
	
	public String getDepartment() {
		return department;
	}
	public int getSales() {
		return sales;
	}
	
	public int getTotalSalary() {
		return totalSalary;
	}
	
	public void setSales(int sales) {
	}
	
	public void monthEnd() {
		double taxRate=0.03;
		double salesBonus=500;
		
		double monthlySalary = ( baseSalary + (sales * salesBonus))*(1 - taxRate) ;
		
		totalSalary=(int) monthlySalary;
	}
	
	public String getInfo() {
		String a="";
		String infoID= String.format("%s%d", "ID: ",ID); 
		String infoName= String.format("\n%s%s", "Name: ",name); 
		String infoDep= String.format("\n%s%s", "Department: ",department);
		String infoSales= String.format("\n%s%d", "Total sales: ",sales);
		String infoTS= String.format("\n%s%d\n", "Total salary: ",totalSalary);
		a = infoID+infoName+infoDep+infoSales+infoTS;
		return a;
	}
	
	
	
	
	
}

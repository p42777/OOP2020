import java.util.ArrayList; 
public class Tester {
public static void main(String[] args) { 
	// TODO Auto-generated method stub
BankAccount account1 = new BankAccount(102603901, 1000); 
BankAccount account2 = new BankAccount(102603902, 1500); 
BankAccount account3 = new BankAccount(102603903, 1400); 
BankAccount account4 = new BankAccount(102603904, 1800);

Employee Alex = new Employee(109306201, "Alex", account1, "Sales Dept.", 35000, 50);
Employee Lily = new Employee(109306203, "Lily", account3, "Sales Dept.", 27500, 8);
Employee Tony = new Employee(109306204, "Tony", account4, "Marketing Dept.", 40000, 30);

ArrayList <Employee> salesSubOrdinates = new ArrayList <Employee>();
ArrayList<Employee>employees=new ArrayList<Employee>();
employees.add(Alex);
employees.add(Lily);
employees.add(Tony);

for(Employee a : employees) {
	 if(a.getDepartment()=="Sales Dept.") {
		 salesSubOrdinates.add(a);
	 }
 }


for(int i=0; i<employees.size();i++)
{
	employees.get(i).monthEnd();
	System.out.println(employees.get(i).getInfo());
	
}
Supervisor Bob = new Supervisor(110306202,"Bob",account2,"Sales Dept.",50000,salesSubOrdinates, 79);
Bob.monthEnd();


System.out.println(Bob.getInfo());
} 

}

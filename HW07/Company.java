import java.util.ArrayList;

public class Company {
	
	private String name;
	private ArrayList <Employee> employees;
	
	public Company(String name) {
		this.name = name;
		employees = new ArrayList <Employee>();
	}
	
	public void addEmployee(Employee employee) {
		 employees.add(employee);
	}

	public Employee findEmployee(String name) {
	  for(Employee i:employees) {
	   if(i.getName()==name){
	    return i;
	   }
	  }
	  return null;
	}

	 public void addWorkDays(String name,double day) {
	  if(findEmployee(name)!=null){
	   findEmployee(name).addWorkDays(day);
	  }
	  else{
	   System.out.print("The employee is not found.");
	  }
	 }
	
 
	 public void overtimeWork(String name,double hour) {
	   if(findEmployee(name)!=null) {
	    findEmployee(name).overtimeWork(hour);
	   }
	   else{
	    System.out.print("The employee is not found.");
	   }
	 }
		
	 
	public String callAnalyzer(Analyzer analyzer) {
		analyzer.addEmployee(employees);
		return analyzer.summary();
	}
	
	public String summary() {
		 String s="";
		  
		  s = s + String.format("%10s%10s", "Company:", name) + "\n";
		  s = s + String.format("%10s%10s%15s%21s%10s%12s","Name","Work Day","Overtime Count","Overtime Hour(Total)","Wage","Title") + "\n";
		   
		  for(Employee i:employees) {
			  s = s + String.format("%10s%10.2f%15d%21.2f%10.2f%12s\n", i.getName(),i.getWorkDay(),i.getOvertimeCount(),i.getOvertime(),i.payment(),i.getTitle());
		   
		  }
		  return s;
		  	
	}
}
















	
	

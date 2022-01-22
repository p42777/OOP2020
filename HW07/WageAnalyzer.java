import java.util.ArrayList;

public class WageAnalyzer implements Analyzer {
 
 
	private ArrayList<Employee> employees;
 
 
	public WageAnalyzer(){
		employees=new ArrayList<Employee>();
	}

 
	public void addEmployee(ArrayList<Employee> employees) {

		for(Employee i:employees){
			this.employees.add(i);
  
		}
	}

	public int count() {
		int count = employees.size();
  
		return count;
		}

 
	public double sum() {
  
		double sum = 0;
  
		for(Employee i:employees){
			sum += i.payment();
			}
		return sum;
 
	}
	

	public double avg() {
		double avg;
		double sum = 0;
		int count = employees.size();
  
		for(Employee i:employees){
   
			sum += i.payment();
		}
		avg = sum/count;
		return avg;
 
	}
	
	public double max() {
		double max = 0;
		for(Employee i:employees) {
   
			if(i.payment()>max) {
				max = i.payment();
			}
		}
  
		return max;
 
	}
	

 
	public double min() {
		double min = 100000;
  
		for(Employee i:employees) {
			if(i.payment()<min) {
				min = i.payment();
			}
		}
		return min;
	}
	
	public String summary() {
		String s = "";
		s = s + String.format("%21s", "Total employees:") + String.format("%9d", count());
		s = s + String.format("\n%21s", "Total wage:")+ String.format("%9.2f", sum());
		s = s + String.format("\n%21s", "Average wage:")+ String.format("%9.2f", avg());
		s = s + String.format("\n%21s", "Max wage:")+ String.format("%9.2f", max());
		s = s + String.format("\n%21s", "Min wage:")+ String.format("%9.2f", min());
		return s;
	}

}

import java.util.ArrayList;

public class OvertimeAnalyzer implements Analyzer {
 
	private ArrayList<Employee> employees;
 
 
	public OvertimeAnalyzer(){
		employees=new ArrayList<Employee>();
 
	}

 
	public void addEmployee(ArrayList<Employee> employees) {
		for(Employee i:employees){

			if(i.getOvertimeCount()>0){
				this.employees.add(i);
   
			}
		}
	}

 
	public int count() {
		int count = 0;
		for(Employee i:employees){
			if(i.getOvertimeCount()>0){
				count++;
			}
		} 
  
		return count;
	}
	
 
	@Override
	public double sum() {
        // TODO Auto-generated method stub
		double sum=0;
		for(Employee i:employees){
			sum += i.getOvertime();
		}
		return sum;
	}

 
	public double avg() {
        double sum = 0,avg = 0;
  
        for(Employee i:employees){
        	sum += i.getOvertime();
        }
        avg = sum/employees.size();
        return avg;
 
	}


	public double max() {
		double max = 0;
		for(Employee i:employees){
   
			if(i.getOvertime()>max) {
				max = i.getOvertime();
				}
			}
 
		return max;
	}
	 
	public double min() {
        double min = employees.get(0).getOvertime();
        for(Employee i:employees) {
   
        	if(i.getOvertime()<min){
        		min = i.getOvertime();
        	}
        }
        return min;
	}
	
	 
	public String summary() {
	     
		String s ="";
	    s = s + String.format("%21s", "Total employees:") + String.format("%9d", count());
	    s = s + String.format("\n%21s", "Total hours:")+ String.format("%9.2f", sum());
		s = s + String.format("\n%21s", "Average hours:")+ String.format("%9.2f", avg());
		s = s + String.format("\n%21s", "Max hours:")+ String.format("%9.2f", max());
		s = s + String.format("\n%21s", "Min hours:")+ String.format("%9.2f", min());
	    return s;
		
	}

}


public class Employee {

	private String name;
	private String title;
	protected double dailyWage;
	protected double workDay;
	private int overtimeCount;
	protected double overtime;
	
	public Employee (String name, String title, double dailyWage) {
	
		this.dailyWage = dailyWage;
		this.name = name;
		this.title = title;
		
	}
	
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public double getWorkDay() {
		return workDay;
	}
	public double getOvertime() {
		return overtime;
	}
	public int getOvertimeCount() {
		return overtimeCount;
	}
	
	public double payment() {
		  double wage = dailyWage*workDay+overtime*150;
		  return wage;
		 }
	
	public void addWorkDays(double day) {
		workDay += day;
	}
	
	public void overtimeWork(double hour) {
		overtime += hour;
		overtimeCount = overtimeCount + 1;
	}
	
}

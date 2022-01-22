//done
import java.util.ArrayList; 

public class Tester {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		Company companyA = new Company("TSMC");

		companyA.addEmployee(new Employee("Bob", "staff", 1200)); 
		companyA.addEmployee(new Employee("Lily", "staff", 1350)); 
		companyA.addEmployee(new Manager("Andy", "supervisor", 1200, 1.5));

		companyA.addWorkDays("Bob", 6); 
		companyA.overtimeWork("Bob", 5); 
		companyA.overtimeWork("Bob", 3);
		
		companyA.addWorkDays("Lily", 7); 
		
		companyA.addWorkDays("Andy", 6);
		companyA.overtimeWork("Andy", 5);

		Analyzer wageAnalyzer = new WageAnalyzer();

		Analyzer overtimeAnalyzer = new OvertimeAnalyzer(); 
		
		System.out.println("<<summarizeWage>>");

		System.out.println(companyA.summary()); 
		System.out.println();

		System.out.println("<<Wage analyzer>>"); 
		System.out.println(companyA.callAnalyzer(wageAnalyzer));
        System.out.println();

        System.out.println("<<Overtime analyzer>>");
        System.out.println(companyA.callAnalyzer(overtimeAnalyzer)); 
        }
	
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student(109356001, "Peter", "MIS");
		Grading grading1 = new Grading(60);
		stu1.addGrade(100);
		stu1.addGrade(70);
		stu1.addGrade(50);
		stu1.addGrade(67);
		stu1.addGrade(98);
		stu1.addGrade(90);
		
		System.out.println("------info()");
		System.out.println(stu1.info());
		System.out.println("summarizeGrade(...)");
		System.out.println(grading1.summarizeGrade(stu1.getGrades()));
	}

}






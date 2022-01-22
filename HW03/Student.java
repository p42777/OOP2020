public class Student {

	private int studentID;
	private String name;
	private String department;
	private int[] grades;
	private int gradeIndex;

	public Student(int studentID, String name, String department) {
		this.setStudentID(studentID);
		this.setName(name);
		this.setDepartment(department);
		this.gradeIndex = 0;
		this.grades = new int[5];
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int[] getGrades() {
		return grades;
	}

	public int getGradeIndex() {
		return gradeIndex;
	}


	public int getGrade(int idx) {
		return grades[idx];
	}

	public void addGrade(int grade) {
		if (gradeIndex > 4) {
			System.out.println("Array index out of bounds.");
		} 
		else {
			grades[gradeIndex] = grade;
			gradeIndex++;
		}
	}

	public void updateGrade(int idx, int grade) {
		grades[idx] = grade;
	}

	public String info() {
		String s = "Student ID:" + getStudentID() + "\n    Name:" + getName() + "\nDepartment:" + getDepartment()
				+ "\n  Grades: ";
		String gradeInfo = "";
		for (int i = 0; i < grades.length; i++) {
			gradeInfo = gradeInfo + getGrade(i) + " ";
		}
		return s + gradeInfo;
	}

	
}

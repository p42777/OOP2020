
public class Student extends Person{
 
	private String major;
	private String tutorName;
    private int enrolledYear;
    private double grade;
 
    public Student (int ID, String name, String major, int enrolledYear, String tutorName, double grade) {
      super(ID,name);
      this.major=major;
      this.tutorName=tutorName;
      this.enrolledYear=enrolledYear;
      this.grade=grade;
    }

    public String getMajor() {
      return major;
    }
    
    public String getTutorName() {
      return tutorName;
    }
    
    public int getEnrolledYear() {
      return enrolledYear;
    }
    
    public double getGrade() {
      return grade; 
    }
    
    public String getInfo() {
      String a="";
      a = a + String.format("Student[ID=%d,name=%s,major=%s,enrolledYear=%d,grade=%.2f]",getID(),getName(),getMajor(),getEnrolledYear(),getGrade());
      return a;
    }
    
    
}

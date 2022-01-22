
public class DoubleMajor extends Student{
	private String major2;

	public DoubleMajor(int ID, String name, String major, int enrolledYear, String tutorName, double grade, String major2Name) {
		super(ID,name,major,enrolledYear,tutorName,grade);
		this.major2=major2Name;
    } 
	
    public String getMajor2() {
        return major2;
    }
 
    public String getInfo() {
    	String a="";
    	a = a + String.format("DoubleMajor[ID=%d,name=%s,major=%s,major2=%s,enrolledYear=%d,grade=%.2f]",getID(),getName(),getMajor(),getMajor2(),getEnrolledYear(),getGrade());
    	return a;
 
    }


}
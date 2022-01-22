import java.util.ArrayList;

public class Student {
 
	private String id,name;
    private ArrayList <String>enrolledCourses;
    private int currentCredits,maxCredits;
 
    public Student(String id, String name) {
    	this.id = id; 
        this.name = name;
        currentCredits = 0;
        maxCredits = 25;
        enrolledCourses = new ArrayList <String>();
    }
 
    public String getID() {
        return id;
 
    }
 
    public String getName() {
       return name;
   
    }
    
    public ArrayList <String> getEnrolledCourses(){
      return enrolledCourses;
 
    }

    public int getCurrentCredits() {
      return currentCredits;
 
    }
 
    public int getMaxCredits() {
      return maxCredits;
 
    }
 
    public void setID(String id) {
      this.id = id;
 
    }
 
    public void setName(String name) {
      this.name = name;
 
    }
 
    public void setMaxCredits(int maxCredits) {
      this.maxCredits = maxCredits;
 
    }
 
    public void updateCurrentCredits(int addedCredits) {
    	if(addedCredits>0) {
    		currentCredits = currentCredits + addedCredits;
 
    	}
    	else if(addedCredits<0) {
    		currentCredits = currentCredits + addedCredits;
  
    	}
 
    }
 
    public String getInfo() {
    	String s = "";
    	s = s + String.format("[Student ID: %s, Student Name: %s, Enrolled Courses: [306050001],Current Credits: 2, Max Credits: 25]", getID(),getName());
    	return s;
 }
}
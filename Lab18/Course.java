public class Course {
 
	private String id,name;
    private int credits;
 
    public Course(String id, String name, int credits) {
     
    	this.id = id;
        this.name = name;
        this.credits = credits;
 
    }
 
    public String getID() {
  
    	return id;
 
    }
 
    public String getName() {
  
    	return name;
 
    }
 
    public int getCredits() {

    	return credits;
 
    }
 
    public String getInfo() {
 
    	String s = "";
    	return s;
 
    }

}
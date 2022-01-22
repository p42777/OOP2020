import java.util.ArrayList;
public class Register {
 
	private ArrayList<Student> studentList;
    private ArrayList<Course> courseList;
    public Register() {
    	studentList = new ArrayList<Student>();
        courseList = new ArrayList<Course>();
    }
    public void addStudent(String id, String name) {
        studentList.add(new Student(id,name));
    }
    public void addCourse(String id, String name, int credits) {
        courseList.add(new Course(id,name,credits));
    }
    public ArrayList<Student> getStudentList(){
        return studentList;
    }
 
  
    public Student findStudent(String studentID) {
    	Student stu1 = null;
  
    	for(Student stu2 : studentList) {
   
    		if(stu2.getID().equals(studentID)) {
               stu1 = stu2;
            }
    		else {
            }
  
    	}
        return stu1;
 
    }
 
    public Course findCourse(String courseID) {
        Course cour1=null;
        for(Course cour2:courseList) {
   
        	if(cour2.getID().equals(courseID)) {
        		cour1 = cour2;
        	}
        	else {
        	}
        }
        return cour1;
 
    }
 
    public boolean enrollCourse(String studentID, String courseID) {
        boolean statement = false;
  
        if(findCourse(courseID)!=null&&findStudent(studentID)!=null) {
        if(findStudent(studentID).getCurrentCredits()+findCourse(courseID).getCredits()<=findStudent(studentID).getMaxCredits()) {
    
        	findStudent(studentID).updateCurrentCredits(findCourse(courseID).getCredits());
            findStudent(studentID).getEnrolledCourses().add(courseID);
            statement = true;
        }
        }
        else {
  
        }
        return statement;
 
    }
 
    public boolean dropCourse(String studentID, String courseID) {
        boolean statement = false;
  
        if(findCourse(courseID)!=null&&findStudent(studentID)!=null) {
            findStudent(studentID).updateCurrentCredits(-findCourse(courseID).getCredits());
            findStudent(studentID).getEnrolledCourses().remove(courseID);
            statement = true;
  
        }
        else {
  
        }
 
        return statement;
 }

}
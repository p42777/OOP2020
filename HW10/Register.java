import java.sql.SQLException;

public class Register {
 
	private ExecSQL exec;
    public Register() throws SQLException{
  
    	this.exec=new ExecSQL();

    }
    public boolean addStudent(String id, String name) throws SQLException {
 
    	exec.addStudent(new Student(id,name));
        return true;
 
    }
 
    public boolean addCourse(String id, String name, int credits) throws SQLException {
        exec.addCourse(new Course(id,name,credits));
        return true;
 
    }
    
    public Student findStudent(String studentID) throws SQLException {
    	Student student = exec.findStudent(studentID);
    	return student;
    }
    
    public Course findCourse(String courseID) throws SQLException {
    	Course course = exec.findCourse(courseID);
    	return course;
    }
    
    public boolean enrollCourse(String studentID, String courseID) throws SQLException {
    	boolean b = false;
    	Student student = exec.findStudent(studentID);
    	Course course = exec.findCourse(courseID);
    	if(student!=null&&course!=null&&student.getCurrentCredits()+course.getCredits()<student.getMaxCredits()) {
    		if(exec.findTable("StudentCourse")!=true) {
    			exec.createStudentCourse();
    			exec.addStudentCourse(studentID, courseID);
    			exec.updateUser(student);
    			exec.enrollCourse(studentID, courseID);
    		}
    		else {
    			exec.addStudentCourse(studentID, courseID);
    			exec.updateUser(student);
    			exec.enrollCourse(studentID, courseID);
    		}
    		b = true;
    	}
    	else {
    	}
    	return b;
    }
    
    public boolean dropCourse(String studentID, String courseID) throws SQLException {
    	boolean b = false;
    	Student student = exec.findStudent(studentID);
    	Course course = exec.findCourse(courseID);
    	if(student!=null&&course!=null&&exec.enrollCourse(studentID, courseID)==true) {
    		exec.updateUser(student);
			exec.dropCourse(studentID, courseID);
			b = true;
    	}
    	else {
    	}
    	return b;
    }
    
    
    
    
    
}
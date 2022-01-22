import java.sql.SQLException;

public class Register {
 
	private ExecSQL exec;
    public Register() throws SQLException{
  
    	exec=new ExecSQL();

    }
    public boolean addStudent(String id, String name) throws SQLException {
 
    	exec.addStudent(new Student(id,name));
        return true;
 
    }
 
    public boolean addCourse(String id, String name, int credits) throws SQLException {
        exec.addCourse(new Course(id,name,credits));
        return true;
 
    }
}
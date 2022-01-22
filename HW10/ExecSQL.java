import java.sql.*;

public class ExecSQL {
	
	private static String server,database,url,username,password,config;
    private static Connection conn;
 
    public ExecSQL() throws SQLException {
    	username="HWTG22";
        password="DlOWqE";
        config="?useUnicode=true&characterEncoding=utf8";
    	server="jdbc:mysql://140.119 .19.73:9306/";
    	database="HWTG22";
    	url=server+database;
        initializing();
    }
 
    private void initializing() throws SQLException {
        conn = DriverManager.getConnection(url, username, password);
        createStudentTable();  
        createCourseTable();
    }
 
    public boolean findTable(String tableName) throws SQLException {
    	boolean b=false;
        String findTable="SHOW TABLES LIKE ?";
        PreparedStatement findTableStat=conn.prepareStatement(findTable);
        findTableStat.setString(1, tableName);
        if(findTableStat.executeUpdate(findTable)==0) {
        	b=true;
        }
        else{
        }
        return b;
    }
 
    public boolean createStudentTable() throws SQLException {
    	boolean b=false;
    	String createTable="CREATE TABLE IF NOT EXISTS Student"+
        "(ID VARCHAR(12) NOT NULL,"+
        " Name VARCHAR(10) NOT NULL,"+
        " CurrentCredits INT(3) NOT NULL,"+
        " MaxCredits INT(3) NOT NULL,"+
        " PRIMARY KEY (ID))";
        PreparedStatement createTableStat=conn.prepareStatement(createTable);
        if(createTableStat.executeUpdate()==0) {
        	b=true;
        }
        else {
        }
        return b;
    }

    public boolean createCourseTable() throws SQLException {
    	boolean b=false;
        String createTable="CREATE TABLE IF NOT EXISTS Course"+
        " (StudentID VARCHAR(12) NOT NULL,"+
        " CourseID VARCHAR(12) NOT NULL,"+
        " Credits INT(3) NOT NULL,"+
        " PRIMARY KEY (StudentID, CourseID))";
        PreparedStatement createTableStat=conn.prepareStatement(createTable);
        if(createTableStat.executeUpdate()==0) {
        	b=true;
        }
        else {
        }
        return b;
    }
    
    public boolean createStudentCourse() throws SQLException {
    	boolean b = false;
        String createTable="CREATE TABLE IF NOT EXISTS StudentCourse"+
        " (StudentID VARCHAR(12) NOT NULL,"+
        " CourseID VARCHAR(12) NOT NULL,"+
        " PRIMARY KEY (StudentID, CourseID))";
        PreparedStatement createTableStat=conn.prepareStatement(createTable);
        if(createTableStat.executeUpdate()==0) {
        	b = true;
        }
        else {
        }
        return b;
    }
    
    public boolean addStudent(Student student) throws SQLException {
    	boolean b=false;
        String addStudent="INSERT INTO Student VALUES(?,?,?,?)";
        PreparedStatement addStudentStat=conn.prepareStatement(addStudent);
        addStudentStat.setString(1,student.getID());
        addStudentStat.setString(2,student.getName());
        addStudentStat.setInt(3,student.getCurrentCredits());
        addStudentStat.setInt(4,student.getMaxCredits());
        if(addStudentStat.executeUpdate()==1) {
        	b = true;
        }
        else {
        }
        return b;
    }

    public boolean addCourse(Course course) throws SQLException {
    	boolean b = false;
        String addCourse="INSERT INTO Course VALUES(?,?,?)";
        PreparedStatement addCourseStat=conn.prepareStatement(addCourse);
        addCourseStat.setString(1,course.getID());
        addCourseStat.setString(2,course.getName());
        addCourseStat.setInt(3,course.getCredits());
        if(addCourseStat.executeUpdate()==1) {
        	b=true;
        }
        else {
        }
        return b;
    }

    
    public boolean addStudentCourse(String studentID, String courseID) throws SQLException {
    	boolean b = false;
        String addStudentCourse="INSERT INTO StudentCourse VALUES(?,?)";
        PreparedStatement addStuCouStat=conn.prepareStatement(addStudentCourse);
        addStuCouStat.setString(1,studentID);
        addStuCouStat.setString(2,courseID);
        if(addStuCouStat.executeUpdate()==1) {
        	b = true;
        }
        else {
        }
        return b;
    }
    
    public Student findStudent(String ID) throws SQLException{
    	 Student student = null;
    	 String s = "SELECT * from Student WHERE ID=?";
    	 PreparedStatement findStuStat = conn.prepareStatement(s);
    	 findStuStat.setString(1,ID);
    	 findStuStat.executeQuery();
    	 String stuID = findStuStat.getResultSet().getString("ID");
    	 String stuName = findStuStat.getResultSet().getString("Name");
    	 int currentCredits = findStuStat.getResultSet().getInt("Current Credits");
    	 int maxCredits = findStuStat.getResultSet().getInt("Max Credits");
    	 Student findedStudents = new Student(stuID, stuName);
    	 while(findStuStat.executeQuery().next()) {
    		 student = findedStudents;
    	 }
    	 if (currentCredits>0) {
	    	 String s2 ="SELECT * FROM StudentCourse WHERE StudentID=?";
	         PreparedStatement findEnrolledCourse = conn.prepareStatement(s2);
	         findEnrolledCourse.setString(1,ID);
	         findEnrolledCourse.executeQuery();
	         while(findEnrolledCourse.executeQuery().next()) {
	        	 String course = findEnrolledCourse.getResultSet().getString("CourseID");
	        	 student.getEnrolledCourses().add(course);
	         }
    	 } 
    	 return student;
    }
    
    public Course findCourse(String ID) throws SQLException {
    	
    	Course course=null;
    	String findCourse="SELECT * FROM Course WHERE ID=?";
    	PreparedStatement findCourStat=conn.prepareStatement(findCourse);
    	findCourStat.setString(1,ID);
    	findCourStat.executeQuery();
    	String courseID = findCourStat.getResultSet().getString("ID");
    	String courseName = findCourStat.getResultSet().getString("Name");
    	int courseCredits = findCourStat.getResultSet().getInt("Credits");
    	Course findedCourse = new Course(courseID, courseName,courseCredits);
    	while(findCourStat.executeQuery().next()) {
    	   course = findedCourse;
    		}
    	return course;
    }
    
    public boolean updateUser(Student student) throws SQLException {
    	boolean b = false;
        String s = "UPDATE Student" + 
        		"SET CurrentCredits=?"+ 
        		"WHERE ID=?";
        PreparedStatement enrollStat=conn.prepareStatement(s);
        enrollStat.setInt(1,student.getCurrentCredits());
        enrollStat.setString(2,student.getID());
        if(enrollStat.executeUpdate()==0) {
        	b = true;
        }
        else{
        }
        return b;
    }
    
    public boolean enrollCourse(String studentID, String courseID) throws SQLException {
    	boolean b = false;
    	String s = "INSERT INTO StudentCourse VALUES(?,?)";
    	PreparedStatement addDataStat=conn.prepareStatement(s);
    	addDataStat.setString(1, studentID);
    	addDataStat.setString(2, courseID);
    	if(addDataStat.executeUpdate()==1) {
    	   b = true;
    	}
    	else{
    	}
    	return b;
    }
    	 
    public boolean dropCourse(String studentID, String courseID) throws SQLException {
    	boolean b = false;
    	String s = "DELETE FROM StudentCourse"+
    	"WHERE studentID=? AND courseID=?";
    	PreparedStatement dropDataStat=conn.prepareStatement(s);
    	dropDataStat.setString(1, studentID);
    	dropDataStat.setString(2, courseID);
    	if(dropDataStat.executeUpdate()==1) {
    	   b=true;
    	}
    	else{
    	}
    	return b;
     }
    	
}
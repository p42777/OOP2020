import java.sql.*;

public class ExecSQL {
 
	private static String server,database,url,username,password,config;
    private static Connection conn;
 
    public ExecSQL() throws SQLException {
 
    	username="HWTG22";
        password="DlOWqE";
        config="?useUnicode=true&characterEncoding=utf8";
    	server="jdbc:mysql://140.119.19.73:9306/";
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
 
    public boolean addStudent(Student student) throws SQLException {
  
    	boolean b=false;
        String addStudent="INSERT INTO Student VALUES(?,?,?,?)";
        PreparedStatement addStudentStat=conn.prepareStatement(addStudent);
        addStudentStat.setString(1,student.getID());
        addStudentStat.setString(2,student.getName());
        addStudentStat.setInt(3,student.getCurrentCredits());
        addStudentStat.setInt(4,student.getMaxCredits());
        if(addStudentStat.executeUpdate()==1) {
   
        	b=true;
 
        }
        else {
  
        }
        return b;
 
    }

    public boolean addCourse(Course course) throws SQLException {
  
    	boolean b=false;
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

}
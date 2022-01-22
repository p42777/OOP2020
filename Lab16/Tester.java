import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Tester {
 
	public static void main(String[] args) throws SQLException {
  
		// TODO Auto-generated method stub
  
		String server = "jdbc:mysql://140.119.19.73:9306/";
        String database = "HWTG22";
        String url = server + database;
        String username = "HWTG22" ;
        String password = "DlOWqE";
  
        Connection conn = null;
  
        try {
   
        	conn = DriverManager.getConnection(url, username, password);
            Statement stat = conn.createStatement();
            String query = "SELECT * FROM sales WHERE Platform='Wii'";
            String query1 = "SELECT * FROM sales WHERE Global_Sales > 80";
            boolean hasResultSet = stat.execute(query);
            ResultSet result = stat.getResultSet();
            ResultSetMetaData metaData = result.getMetaData();
  
            while (hasResultSet) {
            	int columnCount = metaData.getColumnCount();
            	for (int i = 1; i <= columnCount; i++) {
            		if (i >= 1) 
            		{
            			System.out.print(metaData.getColumnLabel(i));
                        System.out.print(", ");
     
            		}
    
            	}
    
             	System.out.println();
             	while (result.next()) {
             		for (int i = 1; i <= columnCount; i++) {
             			if (i >= 1) {
             				System.out.print(result.getString(i));
                            System.out.print(", ");
       
             			}
     
             		}
             		System.out.println();
             		hasResultSet = false;
   
             	}
             	result.close();
            }
  
        } 
        catch (SQLException e) {
  
        	System.out.println();
  
        } 
     
   
        	conn.close();
  
        
 
	}
}
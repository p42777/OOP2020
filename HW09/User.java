public class User {
 
	private int userID;
    private String password,identity;
 
    public User(int userID, String password, String identity) {
  
    	this.userID=userID;
        this.password=password;
        this.identity=identity;
 
    }
 
    public int getID() {
  
    	return userID;
 
    }
 

    public String getIdentity() {
  
    	return identity;
 
    }

    public String getPassword() {
  
    	return password;
 
    }

}
import java.util.ArrayList;

public class UserManagement {

	private ArrayList<User> users;
   
	public UserManagement() {
		users = new ArrayList<User>();
 
	}
 
	public void addNewUser(int userID, String password, String identity) {
		users.add(new User(userID,password,identity));
 
	}
 
	public ArrayList<User> getUsers(){
		return users;
 
	}
 
	public User findUser(int userID) {
		User u = null;
		for(User user:users) {
			if(user.getID()==userID) {
				u = user;
			}
			else {
				u = null;
			}
		}
		return u;
 }
}
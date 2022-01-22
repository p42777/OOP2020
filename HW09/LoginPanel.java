import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPanel extends JPanel{
	 
	private static final int FIELD_WIDTH=10;
    private JPanel loginPanel,userIDPanel,passwordPanel;
	private JLabel imgLabel,userIDLabel,passwordLabel;
	private JTextField userIDField;
	private JPasswordField passwordField;
	private JButton loginButton;
	
	public LoginPanel() {
	  
		setLayout(new BorderLayout());
	    createComp();
	 
	}
	
	public void createComp() {
	  
		ImageIcon img;
		img = new ImageIcon(new ImageIcon("store.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	  
		imgLabel = new JLabel(img);
	    userIDLabel = new JLabel("User ID");
	    passwordLabel = new JLabel("Password");
	    userIDField = new JTextField(FIELD_WIDTH);
	    passwordField = new JPasswordField(FIELD_WIDTH);
	    userIDPanel = new JPanel();
	    passwordPanel = new JPanel();
	    loginPanel = new JPanel();
	    loginButton=  new JButton("Log in");
	  
	    userIDPanel.add(userIDLabel);
	    userIDPanel.add(userIDField);
	 
	    passwordPanel.add(passwordLabel);
	    passwordPanel.add(passwordField);
	  
	    loginPanel.add(imgLabel,BorderLayout.NORTH);
	    loginPanel.add(userIDPanel,BorderLayout.CENTER);
	    loginPanel.add(passwordPanel,BorderLayout.CENTER);
	    loginPanel.add(getLoginButton(),BorderLayout.SOUTH);
	  
	    add(loginPanel);
	 
	}
	 
	public JButton getLoginButton() {
	 
		return loginButton;
	
	}
	
	public void addButtonListener(JPanel panel1, CartPanel cartPanel, UserManagement userManagement, JMenuBar mb) {
	  
		class ClickListener implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	    
	    	JTextField msg = new JTextField();
	    
	    	try {
	     
	    		for(User user : userManagement.getUsers()) {
	      
	    			if(userManagement.findUser(Integer.parseInt(userIDField.getText()))!=null && passwordField.equals(user.getPassword())) {
	       
	    				if(userManagement.findUser(Integer.parseInt(userIDField.getText())).getIdentity().equals("User")) {
	        
	    					cartPanel.uploadItemComp();
	    					((CardLayout) panel1.getLayout()).show(panel1,"2");
	    				}
	    				else if(userManagement.findUser(Integer.parseInt(userIDField.getText())).getIdentity().equals("Admin")) {
	    					((CardLayout) panel1.getLayout()).show(panel1,"3");
	    				}
	    			}
	    			else if(Integer.parseInt(userIDField.getText())==user.getID()||passwordField.equals(user.getPassword())){
	       
	    				JOptionPane.showMessageDialog(msg,"The username or password is wrong.");
	      
	    			}
	    		}
	    	}
	    	catch(NumberFormatException exception){
	     
	    		JOptionPane.showMessageDialog(msg,"Plesae enter the relevant information correctly.");
	    
	    	}
	    }
		}
	 
		ActionListener login = new ClickListener();
	    loginButton.addActionListener(login);
	
}
	

}
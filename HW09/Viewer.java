import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Viewer {
 
	private static final int FRAME_WIDTH=650;
    private static final int FRAME_HEIGHT=300;
 
    public static void main(String[] args) {
  
    	UserManagement user = new UserManagement();
    	user.addNewUser(110306500,"Aa123456","Admin");
    	user.addNewUser(110306501,"Aa123456","User");
  
    	ItemManager item = new ItemManager();
        LoginPanel loginPanel = new LoginPanel();
        CartPanel cartPanel = new CartPanel(item);
        JPanel cardPanel = new JPanel();
        ManagementPanel managementPanel = new ManagementPanel(item);
        JFrame f = new JFrame("E-Commerce");
        f.setSize(FRAME_WIDTH,FRAME_HEIGHT);
 
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("");
        JMenuItem logOutMenuItem = new JMenuItem("Log out");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        CardLayout card = new CardLayout();
  
        cardPanel.setLayout(card);
        cardPanel.add(loginPanel,"1");
        cardPanel.add(cartPanel,"2");
        cardPanel.add(managementPanel,"3");
        f.add(cardPanel);
 
        class LogOutListener implements ActionListener{
        	public void actionPerformed(ActionEvent event) {
        		((CardLayout) cardPanel.getLayout()).show(cardPanel,"1");
        	}
  }
  
        class ExitListener implements ActionListener{
   
        	public void actionPerformed(ActionEvent event) {
        		System.exit(0);
        	}
  }
  
        ActionListener LogOut = new LogOutListener();
        logOutMenuItem.addActionListener(LogOut);
        ActionListener Exit = new ExitListener();
        exitMenuItem.addActionListener(Exit);
  
        menu.add(logOutMenuItem);
        menu.add(exitMenuItem);
        menuBar.add(menu);
        loginPanel.addButtonListener(cardPanel, cartPanel, user, menuBar);
  
        f.setJMenuBar(menuBar);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 }
}
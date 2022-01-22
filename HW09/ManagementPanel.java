import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ManagementPanel extends JPanel {
	 
	private static final int FIELD_WIDTH = 10;
	private JLabel titleLabel,IDLabel,nameLabel,priceLabel;
	private JTextField IDField,nameField,priceField;
	private JButton sentButton;
	private ItemManager itemManager;
	
	public ManagementPanel(ItemManager itemManager) {
	  
		this.itemManager=itemManager;
	    createComp();
	 
	}
	 
	public void createComp() {
	  
		titleLabel = new JLabel("E-Commerce management platform");
	    titleLabel.setFont(new Font(Font.DIALOG,Font.BOLD, 25));
	    IDLabel = new JLabel("Item ID");
	    nameLabel = new JLabel("Item name");
	    priceLabel = new JLabel("Item price");
	    priceField = new JTextField(FIELD_WIDTH);
	    IDField = new JTextField(FIELD_WIDTH);
	    nameField = new JTextField(FIELD_WIDTH);
	    sentButton = new JButton("Send");
	  
	    setLayout(new GridBagLayout());
	  
	    GridBagConstraints con=new GridBagConstraints();
	  
	    con.gridx = 0;
	    con.gridy = 0;
	  
	    con.gridwidth = 2;
	    con.gridheight = 1;
	    con.insets.bottom = 20;
	    con.fill = GridBagConstraints.BOTH;
	  
	    add(titleLabel,con);
	  
	    GridBagConstraints con1 = new GridBagConstraints();
	  
	    con1.gridx = 0;
	    con1.gridy = 1;
	  
	    con1.gridwidth = 1;
	    con1.gridheight = 1;
	    con1.insets.bottom = 5;
	    con1.fill = GridBagConstraints.HORIZONTAL;
	  
	    add(IDLabel,con1);
	  
	    GridBagConstraints con2 = new GridBagConstraints();
	  
	    con2.gridx = 0;
	    con2.gridy = 2;
	  
	    con2.gridwidth = 1;
	    con2.gridheight = 1;
	    con2.insets.bottom = 5;
	    con2.fill = GridBagConstraints.HORIZONTAL;
	  
	    add(nameLabel,con2);
	  
	    GridBagConstraints con3 = new GridBagConstraints();
	  
	    con3.gridx = 0;
	    con3.gridy = 3;
	  
	    con3.gridwidth = 1;
	    con3.gridheight = 1;
	    con3.insets.bottom = 5;
	    con3.fill = GridBagConstraints.HORIZONTAL;
	  
	    add(priceLabel,con3);
	  
	    GridBagConstraints con4 = new GridBagConstraints();
	  
	    con4.gridx = 1;
	    con4.gridy = 1;
	    
	    con4.gridwidth = 1;
	    con4.gridheight = 1;
	    con4.insets.bottom = 5;
	    con4.fill = GridBagConstraints.HORIZONTAL;
	  
	    add(IDField,con4);
	  
	    GridBagConstraints con5 = new GridBagConstraints();
	 
	    con5.gridx = 1;
	    con5.gridy = 2;
	  
	    con5.gridwidth = 1;
	    con5.gridheight = 1;
	    con5.insets.bottom = 5;
	    con5.fill = GridBagConstraints.HORIZONTAL;
	  
	    add(nameField,con5);
	  
	    GridBagConstraints con6 = new GridBagConstraints();
	    
	    con6.gridx = 1;
	    con6.gridy = 3;
	  
	    con6.gridwidth = 1;
	    con6.gridheight = 1;
	    con6.insets.bottom = 5 ;
	    con6.fill = GridBagConstraints.HORIZONTAL;
	  
	    add(priceField,con6);
	  
	    class ClickListener implements ActionListener {
	  
	    	public void actionPerformed(ActionEvent event) {
	    		JTextField msg1 = new JTextField();
	    
	    		try {
	     
	    			itemManager.addItem(Integer.parseInt(IDField.getText()),nameField.getText(),Double.parseDouble(priceField.getText()));
	                IDField.setText("");
	                nameField.setText("");
	                priceField.setText("");
	    
	    		}
	    
	    		catch(NumberFormatException exception1){
	    			JOptionPane.showMessageDialog(msg1,"Plesae enter the relevant information correctly.");
	    
	    		}
	    	}
	    }
	  
	    ActionListener sendit = new ClickListener();
	    sentButton.addActionListener(sendit);
	  
	    GridBagConstraints con7 = new GridBagConstraints();
	  
	    con7.gridx = 1;
	    con7.gridy = 4;
	  
	    con7.gridwidth = 1;
	    con7.gridheight = 1;
	    con7.insets.top = 10;
	    con7.fill = GridBagConstraints.HORIZONTAL;
	  
	    add(sentButton,con7);
	
	}


}
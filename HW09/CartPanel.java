import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartPanel extends JPanel{
 
	private static final int FIELD_WIDTH=10;
    private ItemManager itemManager;
    private Order order;
    private JPanel itemPanel,quantityPanel,operatePanel;
    private JLabel itemLabel,quantityLabel;
    private JComboBox itemCombo;
    private JTextField quantityField;
    private JButton buyButton,placeButton;
    private JTextArea infoArea;

    public CartPanel(ItemManager itemManager){
  
    	setLayout(new BorderLayout());
        order = new Order();
        this.itemManager = itemManager;
        createPanel();
    }
 
    public void buyItem() {
  
    	for(short i = 0 ; i<itemManager.getItems().size() ; i++) {
    		if(itemCombo.getSelectedItem().toString()==itemManager.getItems().get(i).getName()) {
    			order.addItem(itemManager.getItems().get(i),Integer.parseInt(quantityField.getText()));
    		}
  
    	}
 }
 
    public void createItemComp() {
  
    	itemLabel = new JLabel("Item");
    	quantityLabel  =new JLabel("Quantity");
    	quantityField = new JTextField(FIELD_WIDTH);
    	// default = 0
        itemCombo = new JComboBox();
        uploadItemComp();

 
    }
 
    public void uploadItemComp() {
 
    	itemCombo.removeAllItems();
    	for(short i = 0 ; i<itemManager.getItems().size() ; i++) {
    		itemCombo.addItem(itemManager.getItems().get(i).getName());
    	}

    }
 
    public void createInfoArea() {
  
    	infoArea = new JTextArea(20,30);
    	//infoArea.setText("");
 
    }
 
    public void createBuyButton() {
    	buyButton = new JButton("Buy more");
  
    	class ClickListener implements ActionListener {
    		public void actionPerformed(ActionEvent event) {
    
    			if(Integer.parseInt(quantityField.getText())!=0) {
    				buyItem();
    				infoArea.setText("Action completed!\n");
    
    			}
    			else {
    				JOptionPane.showMessageDialog(infoArea,"The number must above than 0");
   
    			}
    		}
    	}
 
    	ActionListener button = new ClickListener();
        buyButton.addActionListener(button);
 }
 
    public void createPlaceButton() {
    	placeButton = new JButton("Check out");
  
    	class ClickListener implements ActionListener {
   
    		public void actionPerformed(ActionEvent event) {
            infoArea.setText(order.getInfo());
            infoArea.setText(order.checkout());
    		}
    	}
  
    	ActionListener checkout = new ClickListener();
    	placeButton.addActionListener(checkout);
 }
 
    public void createPanel() {
    	itemPanel = new JPanel();
        operatePanel = new JPanel(new GridLayout(2,2));
        quantityPanel = new JPanel();
        
        createItemComp();
        createInfoArea();
        createBuyButton();
        createPlaceButton();   
        uploadItemComp();
  
        itemPanel.add(itemLabel);
        itemPanel.add(itemCombo);
  
        quantityPanel.add(quantityLabel);
        quantityPanel.add(quantityField);
 
        operatePanel.add(itemPanel);
        operatePanel.add(quantityPanel);
        operatePanel.add(buyButton);
        operatePanel.add(placeButton);
 
        add(operatePanel,BorderLayout.NORTH);
        add(infoArea,BorderLayout.CENTER);
 }
}
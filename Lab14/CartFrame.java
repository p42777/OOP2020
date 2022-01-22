import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartFrame extends JFrame{
 private static final int FRAME_WIDTH=400;
 private static final int FRAME_HEIGHT=400;
 private static final int FIELD_WIDTH=10;
 private ItemManager itemManager;
 private Order order;
 JPanel itemPanel,quantityPanel,overallPanel,operatePanel;
 JLabel itemLabel,quantityLabel;
 JComboBox itemCombo;
 JTextField quantityField;
 JButton buyButton,placeButton;
 JTextArea infoArea;
 public CartFrame(){
  super("Shopping cart");
  setSize(FRAME_WIDTH,FRAME_HEIGHT);
  order=new Order();
  itemManager=new ItemManager();
  itemManager.addItem(1, "Lamp", 500);
  itemManager.addItem(2, "Desk", 1500);
  itemManager.addItem(3, "Chair", 1300);
  createItemComp();
  createInfoArea();
  createBuyButton();
  createPlaceButton();
  createPanel();
 }
 public void addItem() {
  for(int i=0;i<itemManager.getItems().size();i++) {
   if(itemCombo.getSelectedItem().toString()==itemManager.getItems().get(i).getName()) {
    order.addItem(itemManager.getItems().get(i),Integer.parseInt(quantityField.getText()));
   }
  }
 }
 public void createItemComp() {
  itemLabel=new JLabel("Item");
  quantityLabel=new JLabel("Quantity");
  itemCombo=new JComboBox();
  quantityField=new JTextField(FIELD_WIDTH);
  for(int i=0;i<itemManager.getItems().size();i++) {
   itemCombo.addItem(itemManager.getItems().get(i).getName());
  }
 }
 public void createInfoArea() {
  infoArea=new JTextArea(20,30);
  infoArea.setText("");
 }
 public void createBuyButton() {
  buyButton=new JButton("Buy more");
  class ClickListener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
    if(Integer.parseInt(quantityField.getText())!=0) {
     addItem();
     infoArea.append("Action completed!\n");
    }else {
     JOptionPane.showMessageDialog(infoArea,"The number must above than 0");
    }
   }
  }
  ActionListener buy=new ClickListener();
  buyButton.addActionListener(buy);
 }
 public void createPlaceButton() {
  placeButton=new JButton("Check out");
  class ClickListener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
     infoArea.append(order.getInfo());
     infoArea.append(order.checkout());
   }
  }
  ActionListener checkout=new ClickListener();
  placeButton.addActionListener(checkout);
 }
 public void createPanel() {
  itemPanel=new JPanel();
  operatePanel=new JPanel(new GridLayout(2,2));
  quantityPanel=new JPanel();
  overallPanel=new JPanel(new BorderLayout());
  itemPanel.add(itemLabel);
  itemPanel.add(itemCombo);
  quantityPanel.add(quantityLabel);
  quantityPanel.add(quantityField);
  operatePanel.add(itemPanel);
  operatePanel.add(quantityPanel);
  operatePanel.add(buyButton);
  operatePanel.add(placeButton);
  overallPanel.add(operatePanel,BorderLayout.NORTH);
  overallPanel.add(infoArea,BorderLayout.CENTER);
  add(overallPanel);
 }
}
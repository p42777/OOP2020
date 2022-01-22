import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Tester {
 
	private static final int FRAME_WIDTH=400;
    private static final int FRAME_HEIGHT=300;

    public static void main(String[] args) {
    
    	ArrayList<Double>discounts = new ArrayList<Double>();
        ArrayList<Double>discountsRate = new ArrayList<Double>();
    
        discounts.add(100.0);
        discounts.add(200.0);
        discounts.add(300.0);
        
        discountsRate.add(0.1);
        discountsRate.add(0.15);
        discountsRate.add(0.2);
  
        Furniture sofa = new Furniture(1, 10000, 30, 200, discounts);
        Luxury wallet = new Luxury (2, 160000, 1000, discountsRate);
        Membership Tom = new Membership(1);
  
        int ID = Tom.buy(sofa,2);
        Tom.buy(ID,wallet,2);
  
        JButton b = new JButton("Check Out");
        JFrame f = new JFrame("Depreciation Expense Calculator");
        JPanel p = new JPanel();
        JTextArea a=  new JTextArea();
  
        class ButtonListener implements ActionListener{
  
        	public void actionPerformed(ActionEvent e) {
   
        		a.setText("");
                a.append(Tom.checkOut(ID));
   
        	}
  
        }
  
        ActionListener button = new ButtonListener();
  
        b.addActionListener(button);
        f.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        p.setLayout(new BorderLayout());
        p.add(a,BorderLayout.CENTER);
        p.add(b,BorderLayout.SOUTH);
        f.add(p);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
}
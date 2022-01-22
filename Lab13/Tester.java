import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Tester {
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 200;
	public static void main(String[] args) { 
	
    Company companyA = new Company("NCCU");
	companyA.addFixedAsset(new Vehicle (1,500000,10,50000));
		 
	JFrame f = new JFrame ("Depreciation Expense Calculator");
	JButton b = new JButton ("Do Calculate");
	
	f.add(b);
	f.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	f.setVisible(true);
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	class ButtonListener implements ActionListener{
		private int currentYear = 0;
		public void actionPerformed(ActionEvent event) {
			currentYear++;
			String s ="";
			s = s + String.format("\nYear: " + currentYear);
			s = s + String.format("\nTotal depreciation expense: %.2f", companyA.getDepreciationExp());
			s = s + String.format("\nBook value of fixed assets :  %.2f", companyA.getTotalBookValue());
			System.out.println(s);
		}
	}
	ActionListener button = new ButtonListener();
	b.addActionListener(button);
	
	}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegisterFrame extends JFrame{

	private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 300;
    private static final int FIELD_WIDTH = 10;
    private static final int COLUMN  = 40;
    private final Register register;
    private JTextArea resultArea;
    private JButton studentInfoButton,courseInfoButton,enrollButton,dropButton;
    private JLabel studentIDLabel,courseIDLabel;
    private JPanel panel,stuPanel,courPanel,butPanel;
    private JTextField studentIDField,courseIDField;
   

    public RegisterFrame() {
  
    	super("Course Register");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        register = new Register();
        register.addCourse("306050001", "OOPI", 2);
        register.addCourse("306050021", "ICS", 2);
        register.addCourse("301303999", "Intern", 3);
        register.addStudent("109356001", "A");
        register.addStudent("109356010", "B");
        createPanel();
    }
 
    public void createStudentIDComp() {
    	studentIDLabel = new JLabel("Student ID:");
        studentIDField = new JTextField(FIELD_WIDTH);
        studentInfoButton = new JButton("Student INFO");
        stuPanel = new JPanel();
  
        class studentInfoButton implements ActionListener{
  
        	public void actionPerformed(ActionEvent e) {
   
        			   if(register.findStudent(studentIDField.getText())!=null) {
        				     resultArea.append(register.findStudent(studentIDField.getText()).getInfo());
        			   }
        			   else {
        				   resultArea.append("Cannot find the student.\n");  
        		}
        	}
        }
  
        ActionListener student = new studentInfoButton();
        studentInfoButton.addActionListener(student);
  
        stuPanel.add(studentIDLabel);
        stuPanel.add(studentIDField);
        stuPanel.add(studentInfoButton);
    }

    public void createCourseIDComp() {
    	courseIDLabel = new JLabel("Course ID:");
        courseIDField = new JTextField(FIELD_WIDTH);
        courseInfoButton = new JButton("Course INFO");
        courPanel = new JPanel();
        class courseInfoButton implements ActionListener{
        	public void actionPerformed(ActionEvent e) {
        			 if(register.findCourse(courseIDField.getText())!=null) {
        			     resultArea.append(register.findCourse(courseIDField.getText()).getInfo()+"\n");
        			 }
        			 else if(register.findCourse(courseIDField.getText())==null){
        			     resultArea.append("Cannot find the course.\n");
        			 }
        	}
        }
  
        ActionListener course = new courseInfoButton();
        courseInfoButton.addActionListener(course);
        courPanel.add(courseIDLabel);
        courPanel.add(courseIDField);
        courPanel.add(courseInfoButton);

    }
 
    public void createEnrollBtn() {
    	enrollButton = new JButton("Enroll");
    	class enrollButton implements ActionListener{
    		public void actionPerformed(ActionEvent e) {
    			studentIDField.getText();
    			courseIDField.getText();
    			register.enrollCourse(studentIDField.getText(), courseIDField.getText());
    			String s = "";
    		    if(register.enrollCourse(studentIDField.getText(),courseIDField.getText())==true) {
    		    	s = s + String.format("%s enrolled in %s\n",studentIDField.getText(),courseIDField.getText());
    		    }
    		    else if(register.enrollCourse(studentIDField.getText(),courseIDField.getText())==false) {
    		     s = s + "Error\n";
    		    }
    		    resultArea.append(s);
    			}	
    		}
    	
    	ActionListener enroll = new enrollButton();
        enrollButton.addActionListener(enroll);
        butPanel.add(enrollButton);
 
}
 
    public void createDropBtn() {
    	dropButton = new JButton("Drop");
    	class dropButton implements ActionListener{
    		public void actionPerformed(ActionEvent e) {
    			studentIDField.getText();
    			courseIDField.getText();
    			register.dropCourse(studentIDField.getText(), courseIDField.getText());
    			
    			String s = "";
    		    if(register.dropCourse(studentIDField.getText(),courseIDField.getText())==true) {
    		     s = s + String.format("%s dropped out of %s\n",studentIDField.getText(),courseIDField.getText());
    		    }
    		    else if(register.dropCourse(studentIDField.getText(),courseIDField.getText())==false) {
    		     s = s + "Error\n";
    		    }
    		    resultArea.append(s);
    		}
    	}
  
    	ActionListener drop = new dropButton();
        dropButton.addActionListener(drop);
        butPanel.add(dropButton);
 }
 
    
    public void createPanel() {
    	butPanel = new JPanel();
    	panel = new JPanel();
    	//resultArea = new JTextArea(5,5);
    	resultArea = new JTextArea(COLUMN,COLUMN);
    	resultArea.setLineWrap(true);
    	//setLineWrap​ (true);
    	JScrollPane scrollPane = new JScrollPane ();
    	scrollPane.add(resultArea);
    	createStudentIDComp();
    	createCourseIDComp();
    	createEnrollBtn();
    	createDropBtn();
    	butPanel.add(enrollButton);
    	butPanel.add(dropButton);
    	panel.add(stuPanel);
    	panel.add(courPanel);
    	panel.add(butPanel);
    	panel.add(resultArea);
        add(panel);
    	
 }
 
}
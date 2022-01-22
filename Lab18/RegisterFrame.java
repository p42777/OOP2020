import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

public class RegisterFrame extends JFrame{
 
	private static final int FRAME_HEIGHT=300;
	private static final int FIELD_WIDTH=10;
	private static final int FRAME_WIDTH=800;
    private static final int COLUMN=40;
 
    private final Register register;
    private JButton addedStudentButton,addCourseButton;
    private JTextArea resultArea;
    private JScrollPane scrollPane;
    private JPanel panel,addedStudentPanel,addedCoursePanel;
    private JLabel addedStudentIDLabel,addedCourseIDLabel,addedStudentNameLabel,addedCourseNameLabel,creditLabel;
    private JTextField addedStudentIDField,addedCourseIDField,addedStudentNameField,addedCourseNameField,creditField;
 
 
    public RegisterFrame() throws SQLException {
  
    	super("Course Register");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        register=new Register();
        createPanel();
 
    }

    public void createAddStudentComp() {
  
    	addedStudentIDLabel=new JLabel("Student ID");
        addedStudentNameLabel=new JLabel("Student name");
        addedStudentIDField=new JTextField(FIELD_WIDTH);
        addedStudentNameField=new JTextField(FIELD_WIDTH);
        addedStudentButton=new JButton("Add");
        addedStudentPanel=new JPanel();
  
        class addStuButton implements ActionListener{
        
        	public void actionPerformed(ActionEvent event) {
        		if(addedStudentNameField.getText()!=""&&addedStudentIDField.getText()!="") {
        			try {
        				register.addStudent(addedStudentIDField.getText(),addedStudentNameField.getText());
     
        			} 
        			catch (SQLException exc1) {
      
        				exc1.printStackTrace();
     
        			}
        			finally {
        				resultArea.append("Operation success\n");
                        addedStudentIDField.setText("");
                        addedStudentNameField.setText("");
    
        			}
    
        		}
        		else {
        			resultArea.setText("Operation failure\n");
    
        		}
        	}
        }
  
        ActionListener student=new addStuButton();
        addedStudentButton.addActionListener(student);
        addedStudentPanel.add(addedStudentIDLabel);
        addedStudentPanel.add(addedStudentIDField);
        addedStudentPanel.add(addedStudentNameLabel);
        addedStudentPanel.add(addedStudentNameField);
        addedStudentPanel.add(addedStudentButton);
        addedStudentPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Add Student"));
 
    }
 
    public void createAddCourseComp() {
        addedCourseIDLabel=new JLabel("Course ID");
        addedCourseNameLabel=new JLabel("Course name");
        creditLabel=new JLabel("Credit");
        addedCourseIDField=new JTextField(FIELD_WIDTH);
        addedCourseNameField=new JTextField(FIELD_WIDTH);
        creditField=new JTextField(FIELD_WIDTH);
        addCourseButton=new JButton("Add");
        addedCoursePanel=new JPanel();
 
        class addCourButton implements ActionListener {
    
        	public void actionPerformed(ActionEvent event) {
   
        		if(addedCourseNameField.getText()!=""&&addedCourseIDField.getText()!="") {
        			try {
        				register.addCourse(addedCourseIDField.getText(),addedCourseNameField.getText(),Integer.parseInt(creditField.getText()));
     
        			} 
        			catch (SQLException exc2) {
        				exc2.printStackTrace();
     
        			}
        			finally {
        				resultArea.append("Operation success\n");
                        addedCourseIDField.setText("");
                        addedCourseNameField.setText("");
                        creditField.setText("");
        			}
        		}
        		else {
        			resultArea.setText("Operation failure\n");
        		}
        	}
        }
  
        ActionListener course=new addCourButton();
        addCourseButton.addActionListener(course);
        addedCoursePanel.add(addedCourseIDLabel);
        addedCoursePanel.add(addedCourseIDField);
        addedCoursePanel.add(addedCourseNameLabel);
        addedCoursePanel.add(addedCourseNameField);
        addedCoursePanel.add(creditLabel);
        addedCoursePanel.add(creditField);
        addedCoursePanel.add(addCourseButton);
        addedCoursePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Add Course"));
 
    }
 
    public void createPanel() {
  
    	panel=new JPanel(new GridBagLayout());
        resultArea=new JTextArea(FRAME_HEIGHT,COLUMN);
        resultArea.setLineWrap(true);
        scrollPane = new JScrollPane(resultArea);
        resultArea.setText("");
  
        createAddStudentComp();
        createAddCourseComp();
  
        GridBagConstraints con0=new GridBagConstraints();
        con0.gridx=0;
        con0.gridy=0;
        con0.gridheight=1;
        con0.gridwidth=1;
        con0.ipadx=300;
        con0.fill=GridBagConstraints.BOTH;
  
        panel.add(addedStudentPanel,con0);
  
        GridBagConstraints con1=new GridBagConstraints();
        con1.gridx=0;
        con1.gridy=1;
        con1.gridheight=1;
        con1.ipadx=300;
        con1.gridwidth=1;
        con1.fill=GridBagConstraints.BOTH;
  
        panel.add(addedCoursePanel,con1);
  
        GridBagConstraints con2=new GridBagConstraints();
        con2.gridx=0;
        con2.gridy=2;
        con2.gridheight=1;
        con2.gridwidth=1;
        con2.ipady=100;
        con2.insets.top=5;
        con2.fill=GridBagConstraints.BOTH;
  
        panel.add(scrollPane,con2);
        add(panel);
 
    }
}
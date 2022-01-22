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
 
    private Register register;
    private JButton addedStudentButton,enrollButton,addCourseButton,courseInfoButton,studentInfoButton,dropButton;
    private JTextArea resultArea;
    private JScrollPane scrollPane;
    private JPanel panel,butPanel,courPanel,panel2,addedStudentPanel,addedCoursePanel,stuPanel;
    private JLabel addedStudentIDLabel,studentIDLabel,courseIDLabel,addedCourseIDLabel,addedStudentNameLabel,addedCourseNameLabel,creditLabel;
    private JTextField addedStudentIDField,courseIDField,studentIDField,addedCourseIDField,addedStudentNameField,addedCourseNameField,creditField;
 
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
        			catch (SQLException excon4) {
        				excon4.printStackTrace();
        			}
        			finally {
        				resultArea.append("Operation success\n");
                        addedStudentIDField.setText("");
                        addedStudentNameField.setText("");
        			}
        		}
        		else {
        			resultArea.append("Operation failure\n");
        		}
        	}
        }
        ActionListener student = new addStuButton();
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
        			catch (SQLException excon5) {
        				excon5.printStackTrace();
        			}
        			finally {
        				resultArea.append("Operation success\n");
                        addedCourseIDField.setText("");
                        addedCourseNameField.setText("");
                        creditField.setText("");
        			}
        		}
        		else {
        			resultArea.append("Operation failure\n");
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
    
    public void createStudentIDComp() {
    	studentIDLabel = new JLabel("Student ID:");
    	stuPanel = new JPanel();
    	studentIDField = new JTextField(FIELD_WIDTH);
    	studentInfoButton = new JButton("Student INFO");
        class studentInfoButton implements ActionListener {
        	public void actionPerformed(ActionEvent event) {
        		studentIDField.getText();
        		try {
        			if(register.findStudent(studentIDField.getText())!=null) {
        				resultArea.append(register.findStudent(studentIDField.getText()).getInfo());
        			}
        			else if(register.findStudent(studentIDField.getText())==null) {
        			    resultArea.append("Cannot find the student\n");
        			}
        			else {
        			}
        		} 
        		catch (SQLException excon6) {
        			resultArea.append("Error\n");
        		}  
        		finally {
        			studentIDField.setText("");
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
    	courseIDLabel=new JLabel("Course ID:");
    	courseIDField=new JTextField(FIELD_WIDTH);
    	courseInfoButton=new JButton("Course INFO");
    	courPanel=new JPanel();
    	class courseInfoButton implements ActionListener{
    		public void actionPerformed(ActionEvent event) {
    			courseIDField.getText();
    			try {
    				if(register.findCourse(courseIDField.getText())!=null) {
    					resultArea.append(register.findCourse(courseIDField.getText()).getInfo()+"\n");
    				}
    				else{
    					resultArea.append("Cannot find the course\n");
    				}
	    		} 	
	    		catch (SQLException exc4) {
	    			exc4.printStackTrace();
	    			} 
	    		finally {
	    			courseIDField.setText("");
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
    	enrollButton=new JButton("Enroll");
	    	class enrollButton implements ActionListener{
	    		public void actionPerformed(ActionEvent e) {
	    			studentIDField.getText();
	    			courseIDField.getText();
	    			String s="";
	    			try {
	    				if(register.enrollCourse(studentIDField.getText(),courseIDField.getText())==true) {
	    					s+=String.format("%s enrolled in %s\n",studentIDField.getText(),courseIDField.getText());
	    				}
	    				else if(register.enrollCourse(studentIDField.getText(),courseIDField.getText())==false) {
	    					s+="Operation Failure.\n";
	    				}
	    				else {
	    				}
	    			} 
	    			catch (SQLException exp5) {
	    				exp5.printStackTrace();
	    			}
	    			resultArea.append(s);
	    		}
	    	}
	    ActionListener enroll=new enrollButton();
	    enrollButton.addActionListener(enroll);
	    butPanel.add(enrollButton);
	    	 
    }
    	
    public void createDropBtn() {
    	dropButton=new JButton("Drop");
    	class dropButton implements ActionListener{
    		public void actionPerformed(ActionEvent e) {
    			studentIDField.getText();
    			courseIDField.getText();
    			String s="";
    			
    			try {
    				if(register.dropCourse(studentIDField.getText(),courseIDField.getText())==true) {
    					s+=String.format("%s dropped out of %s\n",studentIDField.getText(),courseIDField.getText());
    	    			}
    				else if(register.dropCourse(studentIDField.getText(),courseIDField.getText())==false) {
    					s+="Operation Failure.\n";
    	    			}
    				else {
    				}
    			} 	
    	        
    			catch (SQLException exp6) {
    				exp6.printStackTrace();
    			}
    	    resultArea.append(s);
    		}
    	}
    	ActionListener drop=new dropButton();
    	dropButton.addActionListener(drop);
    	butPanel.add(dropButton);
    }
    
    public void createPanel() {
    	butPanel=new JPanel();
    	panel=new JPanel(new GridBagLayout());
        panel2=new JPanel(new GridBagLayout());
    	resultArea=new JTextArea(FRAME_HEIGHT,COLUMN);
    	resultArea.setLineWrap(true);
    	scrollPane = new JScrollPane(resultArea);
    	resultArea.setText("");
    	panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Course operation"));
    	  
    	createAddStudentComp();
    	createAddCourseComp();
    	createStudentIDComp();
    	createCourseIDComp();
    	createEnrollBtn();
    	createDropBtn();
    	  
    	GridBagConstraints con0=new GridBagConstraints();
    	  con0.gridx=0;
    	  con0.gridy=0;
    	  con0.gridheight=1;
    	  con0.gridwidth=1;
    	  con0.fill=GridBagConstraints.BOTH;
    	  panel.add(stuPanel,con0);
    	  GridBagConstraints con1=new GridBagConstraints();
    	  con1.gridx=1;
    	  con1.gridy=0;
    	  con1.gridheight=1;
    	  con1.gridwidth=1;
    	  con1.fill=GridBagConstraints.BOTH;
    	  panel.add(courPanel,con1);
    	  GridBagConstraints con2=new GridBagConstraints();
    	  con2.gridx=0;
    	  con2.gridy=1;
    	  con2.gridheight=1;
    	  con2.gridwidth=2;
    	  con2.fill=GridBagConstraints.BOTH;
    	  panel.add(butPanel,con2);
    	  GridBagConstraints con3=new GridBagConstraints();
    	  con3.gridx=0;
    	  con3.gridy=0;
    	  con3.gridheight=1;
    	  con3.gridwidth=2;
    	  con3.ipadx=300;
    	  con3.fill=GridBagConstraints.BOTH;
    	  panel2.add(addedStudentPanel,con3);
    	  GridBagConstraints con4=new GridBagConstraints();
    	  con4.gridx=0;
    	  con4.gridy=1;
    	  con4.gridheight=1;
    	  con4.gridwidth=2;
    	  con4.ipadx=300;
    	  con4.fill=GridBagConstraints.BOTH;
    	  panel2.add(addedCoursePanel,con4);
    	  GridBagConstraints con5=new GridBagConstraints();
    	  con5.gridx=0;
    	  con5.gridy=2;
    	  con5.gridheight=1;
    	  con5.gridwidth=1;
    	  con5.ipadx=300;
    	  con5.fill=GridBagConstraints.BOTH;
    	  panel2.add(panel,con5);
    	  GridBagConstraints con6=new GridBagConstraints();
    	  con6.gridx=0;
    	  con6.gridy=3;
    	  con6.gridheight=1;
    	  con6.gridwidth=1;
    	  con6.ipady=80;
    	  con6.fill=GridBagConstraints.BOTH;
    	  panel2.add(scrollPane,con6);
    	  add(panel);
    	  add(panel2);
    	 }
  
 
}

import java.util.ArrayList;

 public class Instructor extends Person{
	 private String department;
     private ArrayList<String> lectureList;
     private ArrayList<Student> studentList;
     private double score;
 
     public Instructor(int ID, String name, String department) {
        super(ID,name);
        this.department=department;
        lectureList = new ArrayList<String>();
        studentList = new ArrayList<Student>();
        score=0;
     }
 
     public String getDepartment() {
        return department;
     }
 
     public ArrayList<String> getLectureList(){
        return lectureList;
     }
 
     public ArrayList<Student> getStudentList(){
    	 return studentList;
     }
 
     public void addLecture(String lectureName) { 
    	 lectureList.add(lectureName);
     }
 
     public boolean addStudent(Student student) {
         if(student.getTutorName()==getName()) {
        	 studentList.add(student);
        	 return true;
         }
  
         else{
        	 return false;
         }

     }


     public String getStudentName() {
    	 String studentName="";
    	 for(int i=0;i<studentList.size();i++) {
    		 studentName = studentName + studentList.get(i).getName() + ",";
    	 }
 
    	 return studentName;

     }

     public double getStudentAverage() {
    	 int j=0;
    	 for(j=0;j<studentList.size();j++) {
    		 score = score + studentList.get(j).getGrade();
    	 }
    	 
    	 double average=score/j;
    	 return average;
     }

     public String getInfo() {
    	 String lecture="";
    	 for(int i=0;i<lectureList.size();i++) {
    		 lecture = lecture + String.format("%s,", lectureList.get(i));
    	 }
 
    	 String a="";
         a = a + String.format("Instructor[ID=%d,name=%s,department=%s,lectureList=%sstudentList=%s]",getID(),getName(),getDepartment(),lecture,getStudentName());
         return a;

     }
     
}
 
 

public class Grading {

	private int passMark;
	
	public Grading(int passMark) {
		
		this.setPassMark(passMark);
	}


	public int getPassMark( ) {
		return passMark;
	}
	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}
	
	public String toLetterGrade(int score) {
		String l = null;
		if(score==0) {
			l ="X";
		}
		else if (score>=1&&score<=49) {
			l ="E";
		}
		else if (score>=50&&score<=59) {
			l ="D";
		}
		else if (score>=60&&score<=69) {
			l ="C";
		}
		else if (score>=70&&score<=79) {
			l ="B";
		}
		else if (score>=80&&score<=100) {
			l ="A";
		}
		return l;
	}

	public double calculateAvg(int[] grades) {
		int total = 0 , count = 0;;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] != 0) {
				total = total + grades[i];
				count++;
			}
		}
		double avg = total/count;
		return avg;
	}
	
	public String summarizeGrade(int[] grades) {
		String a = "Avg. Score:" + calculateAvg(grades) +"\n";
		int pass = 0 , fail = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= passMark) {
				pass++;
			}
			else if (passMark > grades[i]) {
				fail++;
			}
		}
		a = a + "Pass:"+pass+",failed:"+fail;
		return a;
	}

}

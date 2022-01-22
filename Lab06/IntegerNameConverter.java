
public class IntegerNameConverter {
	private int num;
		public  IntegerNameConverter(int num) {
			this.num=num;
		}
		public String intName() {
			String name = "";
			int part = num;
			if(part>100) {
				name = digitName(part/100) + " hundred";
				part =  part%100;
			}
			if (part>=20) {
				name = name + " " + tensName(part/10);
				part = part%10;
			}
			if (part>=10) {
				name = name + " " + teenName(part);
			}
			else {
				name = name + " " + digitName(part);
			}
			return name;
		}
		
        public String digitName(int num) {
        	int part = num;
        	String name1;
        	if(part==1) {
        		name1 = "one";
        	}
        	else if(part==2) {
        		name1 = "two";
        	}
        	else if(part==3) {
        		name1 = "three";
        	}
        	else if(part==4) {
        		name1 = "four";
        	}
        	else if(part==5) {
        		name1 = "five";
        	}
        	else if(part==6) {
        		name1 = "six";
        	}
        	else if(part==7) {
        		name1 = "seven";
        	}
        	else if(part==8) {
        		name1 = "eight";
        	}
        	else if (part==9){
        		name1 = "nine";
        	}
        	else {
        		name1 = "zero";
        	}
        	return name1;
		}
        public String tensName(int num) {
        	int part = num;
        	String name2;
        	if(part==2) {
        		name2 = "twenty";
        	}
        	else if(part==3) {
        		name2 = "thirty";
        	}
        	else if(part==4) {
        		name2 = "fourty";
        	}
        	else if(part==5) {
        		name2 = "fifty";
        	}
        	else if(part==6) {
        		name2 = "sixty";
        	}
        	else if(part==7) {
        		name2 = "seventy";
        	}
        	else if(part==8) {
        		name2 = "eighty";
        	}
        	else if(part==9) {
        		name2 = "ninety";
        	}
        	else {
        		name2 = "zero";
        	}
        	return name2;
		}
        public String teenName(int num) {
        	int part = num;
        	String name3;
        	if(part==10) {
        		name3 = "ten";
        	}
        	else if(part==11) {
        		name3 = "eleven";
        	}
        	else if(part==12) {
        		name3 = "twelve";
        	}
        	else if(part==13) {
        		name3 = "thriteen";
        	}
        	else if(part==14) {
        		name3 = "fourteen";
        	}
        	else if(part==15) {
        		name3 = "fifteen";
        	}
        	else if(part==16) {
        		name3 = "sixteen";
        	}
        	else if(part==17) {
        		name3 = "seventeen";
        	}
        	else if(part==18){
        		name3 = "eighteen";
        	}
        	else {
        		name3 = "nineteen";
        	}
        	return name3;
		}
}
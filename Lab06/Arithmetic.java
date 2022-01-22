
public class Arithmetic {

	private int num1,num2,num3;
	
	 public Arithmetic(int num1, int num2) {
		 this.num1=num1;
		 this.num2=num2;
		 this.num3=0;
		 
	 }
	public Arithmetic(int num11, int num12, int num3) {
		this.num1=num11;
		this.num2=num12;
		this.num3=num3;
	}
	public void min() {
		int min;
		if(num1>=num2&&num2>=num3) {
			min = num3;
		}
		else if(num2>=num1&&num1>=num3) {
			min = num3;
		}
		else if(num1>=num3&&num3>=num2) {
			min = num2;
		}
		else if(num3>=num1&&num1>=num2) {
			min = num2;
		}
		else if(num2>=num3&&num3>=num1) {
			min = num1;
		}
		else {
			min = num1;
		}
	}
	
	public double topTwoAvg() {
		int sum = num1+num2+num3;
		int min;
		if(num1>=num2&&num2>=num3) {
			min = num3;
		}
		else if(num2>=num1&&num1>=num3) {
			min = num3;
		}
		else if(num1>=num3&&num3>=num2) {
			min = num2;
		}
		else if(num3>=num1&&num1>=num2) {
			min = num2;
		}
		else if(num2>=num3&&num3>=num1) {
			min = num1;
		}
		else {
			min = num1;
		}
		double avg = (double)(sum-min)/2;
		return avg;
	}
	
	public void topTwoValue() {
		int max1,max2;
		if(num1>=num2&&num2>=num3) {
			max1 = num1;
			max2 = num2;
		}
		else if(num2>=num1&&num1>=num3) {
			max1 = num2;
			max2 = num1;
		}
		else if(num1>=num3&&num3>=num2) {
			max1 = num1;
			max2 = num3;
		}
		else if(num3>=num1&&num1>=num2) {
			max1 = num3;
			max2 = num1;
		}
		else if(num2>=num3&&num3>=num1) {
			max1 = num2;
			max2 = num3;
		}
		else {
			max1 = num3;
			max2 = num2;
		}
	}
	
	public int topTwoLMC() {
		int max1,max2;
		if(num1>=num2&&num2>=num3) {
			max1 = num1;
			max2 = num2;
		}
		else if(num2>=num1&&num1>=num3) {
			max1 = num2;
			max2 = num1;
		}
		else if(num1>=num3&&num3>=num2) {
			max1 = num1;
			max2 = num3;
		}
		else if(num3>=num1&&num1>=num2) {
			max1 = num3;
			max2 = num1;
		}
		else if(num2>=num3&&num3>=num1) {
			max1 = num2;
			max2 = num3;
		}
		else {
			max1 = num3;
			max2 = num2;
		}
		int k = 1;
	        for (int i = 2; i <= max1; i++) {
	            if (max1 % i == 0 && max2 % i == 0) {
	                k = i;
	            }
	        }
	     int lmc = max1 * max2 / k;
	     return lmc;
	}
}


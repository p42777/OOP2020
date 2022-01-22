
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5;
	    int num2 = 8;
	    double num3 = 3.5;
	    double num4 = 6.8;
	    
	    
	    System.out.println("num1:" + num1);
	    System.out.println("num2:" + num2);
	    System.out.println("num3:" + num3);
	    System.out.println("num4:" + num4);
	    
	    int a;
	    a = num1+num2;
	    double b;
	    b = num3*num4;
	    
	    System.out.println("a:" + a);
	    System.out.println("b:" + b);
	    
		double c = (double)a;
		System.out.println("c:" + c); //The answer is still correct, because widening casting is done automatically.
	    
	   
	    int d = (int)b;
		System.out.println("d:" + d); //The answer is not correct, because narrowing casting must be done manually.
		
	    int days_of_month = 30;
	    byte days_of_month_2 = (byte)days_of_month;
	    System.out.println("days_of_month:" + days_of_month_2);
		
	}

}

import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		System.out.println("(Lab6)");
		Scanner inputScanner = new Scanner(System.in) ;
		System.out.print("Please enter a positive integer<1000:");
		int input = inputScanner.nextInt();
		IntegerNameConverter converter = new IntegerNameConverter(input);
		System.out.println(converter.intName());
		
		System.out.println("(Bonus2)");
		System.out.print("Please enter two numbers (seperated by space):");
		int num1 = inputScanner.nextInt();
		int num2 = inputScanner.nextInt();
		Arithmetic arith1 = new Arithmetic(num1, num2);
		if (num1>=num2) {
		    System.out.println("The top two largest numbers are::"+num1+" "+num2);
		}
		else {
			System.out.println("The top two largest numbers are::"+num2+" "+num1);
		}
		System.out.printf("The average of the two numbers:" + "%.2f\n",arith1.topTwoAvg() );
		System.out.println("The LMC of the two numbers:"+ arith1.topTwoLMC());
		
		System.out.print("\nPlease enter three numbers (seperated by space):");
		int num11 = inputScanner.nextInt();
		int num12 = inputScanner.nextInt();
		int num3 = inputScanner.nextInt();
		Arithmetic arith2 = new Arithmetic(num11, num12,num3);
		
		if (num11>=num12&&num12>=num3) {
		    System.out.println("The top two largest numbers are::"+num11+" "+num12);
		}
		else if(num11>=num3&&num3>=num12) {
			System.out.println("The top two largest numbers are::"+num11+" "+num3);
		}
		else if(num12>=num3&&num3>=num11) {
			System.out.println("The top two largest numbers are::"+num12+" "+num3);
		}
		else if(num12>=num11&&num11>=num3) {
			System.out.println("The top two largest numbers are::"+num12+" "+num11);
		}
		else if(num3>=num11&&num11>=num12) {
			System.out.println("The top two largest numbers are::"+num3+" "+num11);
		}
		else {
			System.out.println("The top two largest numbers are::"+num3+" "+num12);
		}
		System.out.printf("The average of the two numbers:" + "%.2f\n",arith2.topTwoAvg() );
		System.out.println("The LMC of the two numbers:" + arith2.topTwoLMC());
	}
}

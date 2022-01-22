import java.util.Scanner;

public class Dismantle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, hundred,ten,unit,sum,product,difference;
		Scanner numScanner = new Scanner(System.in);
			System.out.println("Please enter a three-digit number:");
			 num = numScanner.nextInt();
     hundred = num/100 ;
     ten =  num/10%10;
     unit = num%10;
     
     sum = hundred+ten+unit;
     product = hundred*ten*unit;
     difference = hundred-ten-unit;
     
     System.out.println("The sum is:" + sum);
     System.out.println("The product is:" + product);
     System.out.println("The difference is:" + difference);
     
     
	}

}

import java.util.Scanner;
public class Factorial_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Please input a factorial number: ");
	    Scanner numScanner = new Scanner(System.in);
	    int num = numScanner.nextInt(); 
	    int result = 1; 
	    for( int i = 1;i <= num;i++){
	        result *= i; }  
	    System.out.println("The result is:" + result);
}
}
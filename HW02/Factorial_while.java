import java.util.Scanner;
public class Factorial_while {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Please input a factorial number: ");
	    Scanner numScanner = new Scanner(System.in);
	    int num = numScanner.nextInt(); 
        int result = 1;
        int i = 1;
        while (i <= num) {
            result *= i; i++;}		
        System.out.println("The result is:" + result);
	}
}

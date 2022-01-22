import java.util.Scanner;
public class Currency {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String currency;
        double value, a1, a2;
		Scanner currencyScanner = new Scanner(System.in);
		System.out.print("Convert from TWD, USD, JPY: ");
		currency = currencyScanner.nextLine();
		System.out.print("Value: ");
		value = currencyScanner.nextDouble();
		if(currency.equals("TWD")) {			
			a1 = 0.034*value;
			a2 = 3.568*value;
			System.out.printf("The result:%.2f TWD = %.2f USD = %.2f JPY", value, a1, a2);
		    }		
		else if(currency.equals("USD")) {			
			a1 = value/0.034;
			a2 = 3.568*a1;
			System.out.printf("The result:%.2f USD = %.2f TWD = %.2f JPY", value, a1, a2);
			}			
		else {			
			a1 = value/3.568;
			a2 = 0.034*a1;
			System.out.printf("The result:%.2f JPY = %.2f TWD = %.2f USD", value, a1, a2);
		     }		
		}	
	}



import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double weight,height,bmi;
        System.out.print("Please input the weight(kg):");
		Scanner weightScanner = new Scanner(System.in);
		weight = weightScanner.nextDouble();
		System.out.print("Please input the height(cm):");
		Scanner heightScanner = new Scanner(System.in);
		height = heightScanner.nextDouble();
		
        
		double height2 = height/100;
		bmi = weight/Math.pow(height2, 2);
		System.out.printf("Your BMI is:" + "%.2f\n",bmi);
		if(bmi<18.5) {
			System.out.println("The result is: underweight");
		}
		else if(bmi>=24) {
			System.out.println("The result is: overweight");
		}
		else {
			System.out.println("The result is: normal");
		}
		}
	}



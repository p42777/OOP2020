import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {


		// TODO Auto-generated method stub
		double num1,num2,sum,multiplication,average,maximum;
		Scanner numScanner = new Scanner(System.in);
     System.out.println("Please input two number(use space to split)");
     num1 = numScanner.nextDouble();
     num2 = numScanner.nextDouble();
     sum = num1+num2;
     multiplication = num1*num2;
     average = (num1+num2)/2;
     System.out.println("sum:" + sum);
     System.out.println("multiplication:" + multiplication);
     System.out.println("average:" + average);
     if(num1>=num2) {
    	 System.out.println("maximum:" + num1);}
     else {
    	 System.out.println("maximum:" + num2);}

     
	String fullName = "Clyde Lu";
    
    System.out.printf("Clyde Lu" + "%d\n" , fullName.length());
    String kk = fullName.substring(6,8);
    System.out.println(kk);

    
    {
    	if(num1%2==0&&num2%2==0)
    		System.out.println("Both num1 and num2 are even.");
    	if(num1%2==1&&num2%2==0)
    		System.out.println("num1 is odd and num2 is even.");
    	if(num1%2==0&&num2%2==1)
    		System.out.println("num1 is even and num2 is odd.");
    	if(num1%2==1&&num2%2==1)
    		System.out.println("Both num1 and num2 are odd.");
    }

     
	}

}



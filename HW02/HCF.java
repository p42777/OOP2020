import java.util.Scanner;
public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1, num2, max;
      Scanner numScanner = new Scanner(System.in);
      System.out.print("Please input two integer numbers:");
      num1 = numScanner.nextInt();
      num2 = numScanner.nextInt();  
      while(num1 != num2)
      {
          if(num1 > num2)
              num1 -= num2;            
          else
              num2 -= num1;      
      }
      max = num1;
          System.out.println("Result: the least common multiple is " + max);
     }
	}
      

      
      
	



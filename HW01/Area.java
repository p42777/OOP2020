import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double pi = 3.14;
double r,Area;
Scanner rInput= new Scanner(System.in);
System.out.print("Please input the radius:");
r = rInput.nextDouble();
Area = r*r*pi;
System.out.printf("Area:" + "%.2f\n",Area);
 
 
	}

}


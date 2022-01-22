import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	 Triangle triangle = new Triangle();
	   Scanner sideScanner = new Scanner(System.in);
       System.out.print("Please enter the length of the two sides of the triangle:");
	   double sideA = sideScanner.nextDouble();
	   double sideB = sideScanner.nextDouble();
	   Scanner angleScanner = new Scanner(System.in);
	   System.out.print("Please enter the angle of the triangle: ");
	   double angleC = angleScanner.nextDouble();	
	   
	   double sideC = triangle.side(sideA, sideB, angleC);
	   System.out.println("The other side length is " + (int)sideC);
	   double perimeter = triangle.perimeter(sideA, sideB, sideC);
	   System.out.println("The perimeter of the triangle is " + (int)perimeter);
	   double area = triangle.area(sideA, sideB, sideC);
	   System.out.printf("The area of the triangle is " + "%.2f\n",area);
	   double angleA = triangle.angle(sideA, sideB, sideC);
	   System.out.println("The opposite angle of sideA(length(s):"+sideA+") in the triangle is " + (int)angleA + " degrees");
	   double angleB = triangle.angle2(sideA, sideB, sideC); 
	   System.out.println("The opposite angle of sideB(length(s):"+sideB+") in the triangle is " + (int)angleB + " degrees");
    }
	
	public double side(double sideA,double sideB,double angleC) {
	    double sideC = Math.round(Math.pow(Math.pow(sideA, 2)+Math.pow(sideB, 2)-2*sideA*sideB*Math.cos(Math.toRadians(angleC)), 0.5));
	    return sideC;
    }
	public double perimeter(double sideA,double sideB,double sideC) {
	    double perimeter = sideA + sideB +sideC;	
	    return perimeter;
	}
	public double area(double sideA,double sideB,double sideC) {
	    double s = (sideA+sideB+sideC)/2;
		double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		return area;
	}
	public double angle(double sideA, double sideB, double sideC) {
		double angleA = Math.round(Math.toDegrees(Math.acos((Math.pow(sideB, 2)+Math.pow(sideC, 2)-Math.pow(sideA, 2))/(2*sideB*sideC))));
		return angleA;
	}
	public double angle2(double sideA, double sideB, double sideC) {
	    double angleB = Math.round(Math.toDegrees(Math.acos((Math.pow(sideA, 2)+Math.pow(sideC, 2)-Math.pow(sideB, 2))/(2*sideA*sideC))));
        return angleB;
	}

}
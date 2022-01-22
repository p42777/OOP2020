
public class Triangle implements Shape{
private double sideA,sideB,sideC,area,perimeter;
	
    public Triangle(double sideA, double sideB, double sideC) {
         
    	this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        calcArea();
        calcPerimeter();
 
    }
 
    public double getArea() {
        return area;

    }
 
    public double getPerimeter() {
        return perimeter;

    }
 
    public void calcArea(){
    	double s = (sideA+sideB+sideC)/2;
		area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    	
    }
 
    public void calcPerimeter() {
       perimeter = sideA+sideB+sideC;
 
    }

}
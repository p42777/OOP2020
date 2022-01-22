
public class Circle implements Shape{
 
	private final double PI;
    private double radius,area,perimeter;

    public Circle(double radius) {
    	
        this.radius = radius;
        PI = 3.14;
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
    	area = radius*radius*PI;
 
    }
 
    public void calcPerimeter() {
    	perimeter = 2*PI*radius;
 
    }

}
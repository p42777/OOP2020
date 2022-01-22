
public class Square implements Shape{
	
private double perimeter,side,area;
	
	public Square(double side) {
  
		this.side = side;
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
  
		area = side*side;
	}
 
	public void calcPerimeter() {
  
		perimeter = 4*side;
	}

}

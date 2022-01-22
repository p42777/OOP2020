public class Tester {


	public static void main(String[] args) {
  
		// TODO Auto-generated method stub
  
		Land florida=new Land(1,30000);
        Land indiana=new Land(2,17000);
 
        florida.addArea(new Square(10));
        florida.addArea(new Circle(5));
        florida.addArea(new Triangle(3,4,5));
  
        System.out.println("<<Florida>>");
        System.out.println(florida.getInfo());
  
        indiana.addArea(new Square(5));
        indiana.addArea(new Circle(7));
        indiana.addArea(new Triangle(6,6,6));
  
        System.out.println("<<Indiana>>");
        System.out.println(indiana.getInfo());

	}

	

}
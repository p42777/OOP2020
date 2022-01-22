
public class Land {
   
	private int id;
    private double valuePerAcre,totalArea,netValue;
 
    public Land(int id, double unitLandValue) {
        
    	this.id = id;
        this.valuePerAcre = unitLandValue;
        totalArea = 0;
        calcTotalValue();
 
    }
 
    public void addArea(Shape shape) {
  
    	shape.calcArea();
        totalArea = totalArea + shape.getArea();
 
    }
 
    public void calcTotalValue() {
      
    	netValue = totalArea*valuePerAcre;
 
    }
 
    public String getInfo() {
  
    	calcTotalValue();
    	
        String a ="";
        a = a + String.format("The area ID:%d", id);
        a = a + String.format("\nValue per acre:$%.2f",valuePerAcre);
        a = a + String.format("\nTotal area:%.2f",totalArea);
        a = a + String.format("\nTotal value:$%.2f",netValue);
        return a;

    }


}
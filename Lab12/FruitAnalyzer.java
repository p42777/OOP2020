import lab.practice.Fruit;

public class FruitAnalyzer implements Analyzer {

	
	public double measurer(Object object) {
		Fruit a = (Fruit) object;
		double value = 0;
		
		for(int i=0 ; i<a.getSales().size() ; i++) {
				value += a.getSales().get(i);
				
		}
		value = value * a.getPrice();
		return value;
	}
	
	public String getName(Object object) {
		Fruit a = (Fruit) object;
		return a.getName();
	}
	
}

import java.util.ArrayList;

public class Company {

	private ArrayList<String> rankingNames;
	private ArrayList<Double> rankingValues;
	private Analyzer analyzer;
	private double netValue;
	
	
	public Company(Analyzer analyzer) {
		this.analyzer = analyzer;
		rankingNames = new ArrayList<String>();
		rankingValues = new ArrayList<Double>();
		
	}
	
	
	public void add(Object object) {
		rankingNames.add(analyzer.getName(object));
		rankingValues.add(analyzer.measurer(object));
	}
	
	
	public void calcNetValue() {
		for(int i = 0 ; i<rankingValues.size() ; i++) {
			netValue += rankingValues.get(i);
		}
	}
	
	public String getInfo() {
		calcNetValue();
		String s ="";
		s = s + String.format("Net Value: %.2f", netValue);
		s = s + String.format("\n%-12s%-10s", "Name","Value");
		s = s + "\n------------------------------------";
		for(int i = 0 ; i<rankingNames.size() ; i++) {
			s = s + String.format("\n%-12s%-10.2f", rankingNames.get(i),rankingValues.get(i));
		}

		s = s +"\n";
		return s;
	}
	
	
	
}

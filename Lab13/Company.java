import java.util.ArrayList;

public class Company {

	private String name;
	private ArrayList<FixedAsset> fixedAssets;
	private double bookValue;
	private double totalDepreciationExp;
	
	public Company(String name) {
		this.name = name;
		fixedAssets = new ArrayList<FixedAsset>();
		this.bookValue = 0;
		this.totalDepreciationExp = 0;
	}

	public void addFixedAsset(FixedAsset asset) {
		//Add all the assets into the fixed assets ArrayList and add the book value of the asset to the current book value.
		
		fixedAssets.add(asset);
	
	}
	
	public double getTotalBookValue() {
		
		updateBookValue();
		return bookValue;
		
	}
	
	public double getDepreciationExp() {
	
		updateDepreciationExp();
		return this.totalDepreciationExp;
		
	}

	public void updateBookValue(){
		for(int i = 0 ; i<fixedAssets.size() ; i++) {
		
			bookValue = fixedAssets.get(i).getBookValue();
			
		}
	}
	
	public void updateDepreciationExp() {
		for(int i = 0 ; i<fixedAssets.size() ; i++) {
			
			totalDepreciationExp = fixedAssets.get(i).getDepreciationExp();
			
			}
	}
	
}
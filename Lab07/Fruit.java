import java.util.Arrays;

public class Fruit {
	private String name; 
	private int price, totalSales, i; 
	private int[]sale;
	public  Fruit(String name, int price) {
		this.name=name;   
		this.price=price;
		this.sale=new int [3];
        this.totalSales=0;   
        this.i=0;
	}
	public String getName() {
	   return name;
	}
	public int getPrice() {
		return price;
	}
	public int getTotalSales() {
		return totalSales;
	}
	
	public void setName(String name) {
		
	}
	
	public void setPrice(int price) {
		
	}
	public void updateTotalSales(int amount) { 
		
		for(int i=0;i<3;i++) {
			if(sale[i]==0) {
				sale[i]=amount;
			}
			break;
		}
		totalSales+=amount;
	}
	
    public String getInfo() {
    	String a="";
    	a = a+ String.format("Fruit name: %-6s\n",getName());
    	a = a+String.format("Fruit price:%-5d\n",getPrice());
    	a = a+"Indiv sales:";
    	Arrays.sort(sale);
    	for(int sale:sale) {
    		if (sale!=0) {
    			a = a+String.format("%d",sale);
    		}
    	}
    	a = a+String.format("\nTotal sales:%-5d\n", getTotalSales());
    	return a;
    }
	
	
	
}

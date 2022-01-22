import java.util.ArrayList; 
import lab.practice.Fruit; 
import lab.practice.Stock;

public class Tester {


	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		System.out.println("<<Fruit store>>");

		// Create the sales for every fruit 
		ArrayList<Double> sales = new ArrayList<Double>(); 
		sales.add(1.0);
		sales.add(2.0);
        sales.add(3.0);
       
        // For fruit store

        Company fruitStore = new Company(new FruitAnalyzer());
        fruitStore.add(new Fruit("Strawberry", 20, sales));
        fruitStore.add(new Fruit("Apple", 10, sales)); 
        fruitStore.add(new Fruit("Banana", 8, sales)); 
        

        System.out.println(fruitStore.getInfo());

        System.out.println("<<Investment company>>");

        // For investment company

        Company investmentCompany = new Company(new StockAnalyzer());
        investmentCompany.add(new Stock("2330", 615, 620, 30)); 
        investmentCompany.add(new Stock("2317", 117, 119, 20)); 
        investmentCompany.add(new Stock("2603", 17, 16, 50));

        System.out.println(investmentCompany.getInfo()); }

}
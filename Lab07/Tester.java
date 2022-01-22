

	public class Tester {
		public static void main(String[] args) {
		// TODO Auto-generated method stub 
			Fruit apple = new Fruit("Apple",10); 
			Fruit banana = new Fruit("Banana",12); 
			Fruit orange = new Fruit("Orange",15);
			
			System.out.println("Shopping cart1 information:"); 
			Cart cart1 = new Cart();
			cart1.searchItem(apple); 
			System.out.println();
			cart1.addItem(apple, 20); 
			cart1.searchItem(apple);
			cart1.addItem(banana, 15); 
			cart1.addItem(orange, 5); 
			System.out.println(); 
			System.out.println(cart1.getInfo());
			System.out.println("Shopping cart2 information:");
			Cart cart2 = new Cart(); 
			cart2.addItem(apple, 5); 
			System.out.println(cart2.getInfo());
			
			
			
			
			System.out.println("Product Information:"); 
			
			
			
			System.out.println(apple.getInfo());
			
			
			
		}
	}
	
	
	


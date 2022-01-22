
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1 = new Cash();
		Payment p2 = new CreditCard();
		DMan d1 = new DMan("Toolman", 12);
		Food f1 = new Food(111, "Apple", 50, 5, 5, 5);
		Food f2 = new Food(555, "Steak", 500, 200, 200, 200);
		Food f3 = new Food(777, "lobster", 400, 100, 100,100);
		Customer c1 = new Customer("Peter", 100, 171, p2);
		VIP c2 = new VIP("Dick", 9000, 8670, p1, 5);
		c1.order(f1);
		c1.order(f1);
		c1.order(f1);//Peter don't have enough money!
		c2.order(f1);
		c2.order(f1);
		c2.order(f2);
		c2.order(f2);
		c2.order(f3);
		c2.order(f3);
		d1.addCusts(c2);
		d1.addCusts(c1);
		System.out.print(c1.orderList());
		System.out.println("---------------------------");
		System.out.print(c2.orderList());
		//c1 cannot afford the payment because of the extra fee
		System.out.println("C1 pays "+c1.pay()+" USD dollars");
		System.out.println("c1 left "+c1.getMoney()+" USD dollars");
		System.out.println("C2 pays "+c2.pay()+" USD dollars");
		System.out.println("c2 left "+c2.getMoney()+" USD dollars");
		System.out.println("d1 got salary "+d1.salary()+" USD dollar");

	}

}

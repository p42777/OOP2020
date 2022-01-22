import java.util.Scanner;
public class cashier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int qtyApple,qtyBanana,qtyOrange,qtyKiwi,total,payment,balance;
Scanner itemScanner = new Scanner(System.in);
System.out.print("Please enter the quantity of apple ($NT 10 per unit) you purchased:");
qtyApple = itemScanner.nextInt();
System.out.print("Please enter the quantity of banana ($NT 15 per unit) you purchased:");
qtyBanana = itemScanner.nextInt();
System.out.print("Please enter the quantity of orange ($NT 13 per unit) you purchased:");
qtyOrange = itemScanner.nextInt();
System.out.print("Please enter the quantity of kiwi ($NT 17 per unit) you purchased:");
qtyKiwi= itemScanner.nextInt();
total = qtyApple*10 + qtyBanana*15 + qtyOrange*13 + qtyKiwi*17;
System.out.println("The total cost:" + total );
System.out.print("Please enter payment amount(must above total cost):");
payment = itemScanner.nextInt();
balance = payment - total;
System.out.println("Amount to be change: " + balance);

System.out.println("The amount of each change is as follows:");


int $NT100 = Math.round((int)balance/100);
balance=balance%100;
int $NT50 = Math.round((int)balance/50);
balance=balance%50;
int $NT10 = Math.round((int)balance/10);
balance=balance%10;
int $NT5 = Math.round((int)balance/5);
balance=balance%5;
int $NT1 = Math.round((int)balance/1);

System.out.println("$NT 100: " + $NT100);
System.out.println("$NT 50: " + $NT50);
System.out.println("$NT 10: " + $NT10);
System.out.println("$NT 5: " + $NT5);
System.out.println("$NT 1: " + $NT1);

	}

}



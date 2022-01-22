public class Cart {
 private Fruit[] basket;
 private int[] subAmount;
 private int totalExpenses;
 public int i;
 public Cart() {
	  basket=new Fruit[3];
	  subAmount=new int[3];
	  totalExpenses = 0;
	  i=0;
	 }
 
 public void addItem(Fruit fruit,int amount) {
  if (i<3) {
   basket[i] = fruit;
   subAmount[i]=amount;
   i++;
   fruit.updateTotalSales(amount);
  }
  
 }

 public int getTotalExpenses() {
  return totalExpenses;
 }
  
 public void searchItem(Fruit fruit) {
  for (Fruit product:basket) {
   if(product==fruit) {
    System.out.print("Your basket has this product.");
  break;
   }
   else {
    System.out.print("Your basket does not have this product.");
  break;
   }
 }  
}
 public void totalExpenses() {
  for(i=0;i<basket.length;i++) {
   if (basket[i]!=null) {
    totalExpenses=totalExpenses+basket[i].getPrice()*subAmount[i];
   }
  }
 }
 public String getInfo() {
  String s;
  totalExpenses();
  s=String.format("The current enpense is :NT&%d\n", getTotalExpenses());
  s=s+String.format("%-7s%-12s%-4s\n", "Name" , "Price($NT)" , "Unit");
  for(i=0;i<basket.length;i++) {
   if (basket[i]!=null) {
    s=s+String.format("%-6s:%5d%6s%4d \n", basket[i].getName(),basket[i].getPrice(),"*",subAmount[i]);
   }
  }
  return s;
 }
 
 
 
}

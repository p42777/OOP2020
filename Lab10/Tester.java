import java.util.Scanner;
public class Tester {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  SavingsAccount accountA = new SavingsAccount(8000, 306049001, 1);
  SavingsAccount accountB = new SavingsAccount(1000, 306049011, 2);
  CheckingAccount accountC = new CheckingAccount(9000, 306016033);
  CheckingAccount accountD = new CheckingAccount(3000, 306016041);
  BankAccount[] accounts = new BankAccount[4];
  accounts[0]=accountA;
  accounts[1]=accountB;
  accounts[2]=accountC;
  accounts[3]=accountD;
  
  System.out.print("D)Deposit W)Withdraw M)Month Q)Quit:");
  Scanner scanner = new Scanner(System.in);
  String choice = scanner.nextLine();
  
  if(choice.equals("D")) {
	  
       System.out.print("Enter your account number:");
       int ID = scanner.nextInt();
       for(int i = 0;i<=3;i++) {
            if(ID==accounts[i].getID()) {
                       System.out.print("Enter transaction amount:");
                       double amount = scanner.nextDouble();
                       accounts[i].deposit(amount);
                       System.out.println("Balance:"+accounts[i].getBalance());
           }
            
       }
       
       if(ID!=accounts[0].getID()&&ID!=accounts[1].getID()&&ID!=accounts[2].getID()&&ID!=accounts[3].getID()){
     System.out.println("Corresponding account cannot be found.");
   }
   
   System.out.print("D)Deposit W)Withdraw M)Month Q)Quit:");
   scanner = new Scanner(System.in);
   choice = scanner.nextLine();
  }
  if(choice.equals("W")) {
	  
       System.out.print("Enter your account number:");
       int ID = scanner.nextInt();
       for(int i = 0;i<=3;i++) {
            if(ID==accounts[i].getID()) {
                     System.out.print("Enter transaction amount:");
                     double amount = scanner.nextDouble();
                     accounts[i].withdraw(amount);
                     System.out.println("Balance:"+accounts[i].getBalance());
        }
            
   }
       
       if(ID!=accounts[0].getID()&&ID!=accounts[1].getID()&&ID!=accounts[2].getID()&&ID!=accounts[3].getID()) {
     System.out.println("Corresponding account cannot be found.");
   }
   
   
   System.out.print("D)Deposit W)Withdraw M)Month Q)Quit:");
   scanner = new Scanner(System.in);
   choice = scanner.nextLine();

  }
  
  
  if(choice.equals("M")) {
	  accountA.monthEnd();
	  accountB.monthEnd();
	  accountC.monthEnd();
	  accountD.monthEnd();
	  for(int i=0;i<=3;i++) {
		    System.out.println(i+" "+ accounts[i].balance);
		    
		   } 	 

  }
   
   System.out.print("D)Deposit W)Withdraw M)Month Q)Quit:");
   scanner = new Scanner(System.in);
   choice = scanner.nextLine();
  
    if (choice.equals("Q")) {
   scanner.close();
   System.out.println("");
  }
   
 }
 }



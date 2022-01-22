import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class Tester {
public static void main(String[] args) {
	try {
		  Fruit[] fruits=new Fruit[3];
		  Fruit apple =  new Fruit("Apple",10);
		  Fruit banana = new Fruit("Banana",12);
		  Fruit orange = new Fruit("Orange",15);
		  fruits[0]=apple;
		  fruits[1]=banana;
		  fruits[2]=orange;
		  
		  Register register=new Register();
		  File myObj = new File("sales.txt");
		  Scanner reader =new Scanner(myObj);
		  FileWriter myWriter = new FileWriter("register_info.txt");
		 
		 try {
			 reader.nextLine();
			 int id=0;
			 while(reader.hasNextInt()) {
				 for(Fruit fruit:fruits) {
					 register.calctotalCost(id, reader.nextInt(), fruit.getPrice());
				 }
			 id++;
			 }
			 myWriter.write(register.getInfo());
		 }
	
	finally {
		myWriter.close();
		reader.close();
	}

}

catch(FileNotFoundException e){
	System.out.println("Error occurs!");
}
	
catch(NoSuchElementException e) {
	System.out.println("Error occurs!");
	
}
	
catch(IOException e) {
		System.out.println("Error occurs!");
		
}
	
}

}


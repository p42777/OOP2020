import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int layer = 1;
     int i,j;
     Scanner layerScanner = new Scanner(System.in);
     System.out.print("Please input the layer: ");
	 layer = layerScanner.nextInt();
	 for (i = 1;i<=layer;i++) {
	    
		 for(j=i;j<=layer;j++) {
	    	System.out.print(" ");
	    }
	     for(j=1;j<=i+(i-1);j++) {
	    	 
	 System.out.print("*");
	 
	 }
	     
	     
	     System.out.println(" ");
	 }
	 
	 
		 
	 }
	 

	 }
	
	




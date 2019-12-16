package Helloworld;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstJavaProgram {
	public static void main(String [] args) {
		try {
				 Scanner scan = new Scanner(System.in);
				 String tempI = scan.nextLine();
			     int i = Integer.parseInt(tempI);
			     
			     String tempD = scan.nextLine();
			     double d = Double.parseDouble(tempD);
			     
			     String s1 = scan.nextLine();
			     
			     
			      // Write your code here.
	
			      System.out.println("integer: " + i);
			      System.out.println("Double: "+ d);
			      System.out.println("String: " + s1);
			      
		      
		    } catch (InputMismatchException exception) {
	            // Output unexpected InputMismatchExceptions.
		    	System.out.println("The 'try catch' is finished." + exception);
	        }  finally {
		     // System.out.println("The 'try catch' is finished.");
		    }
	}
}
package Helloworld;
import java.util.*;

public class JavaString {
	final static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String [] args) {
		Scanner k = new Scanner(System.in);
		
		String A = k.next();
		String B = k.next();
		//int length = A.length();
		
		System.out.println(A.length()+B.length());
		
		//For the second line, write Yes if A is lexicographically greater than B  otherwise print No instead.
		
		if(A.charAt(0) > B.charAt(0)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
		
		
	}
}

package Helloworld;
import java.util.*;

public class JavaFormatPrintf {
	public static void main(String [] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("input string");
		String s1 = k.next();
		System.out.print("input number");
		int x = k.nextInt();
		
		System.out.printf("%-15s %03d", s1, x);
	}
}

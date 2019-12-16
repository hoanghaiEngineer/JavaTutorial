package Helloworld;
import java.util.*;

public class JavaSubString {
	public static void main(String [] args) {
		Scanner k = new Scanner(System.in);
		
		String S = k.next();
		int start = k.nextInt();
		int end = k.nextInt();
		
		System.out.println(S.substring(start, end));
	}
}

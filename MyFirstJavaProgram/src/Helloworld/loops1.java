package Helloworld;
import java.util.*;

public class loops1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i = 1; i<11; i++) {
			System.out.println(input + " x " + i + " = " + (input * i));
		}
	}
}
package Helloworld;
import java.util.*;

public class JavaPrintf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("================================");
        
        for(int i=0;i<3;i++) {
        	String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s", s1); //sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 15, đầu ra sẽ được thêm khoảng trắng ở bên phải.
            System.out.printf("%03d\n", x); //sẽ in số nguyên như tham số đầu vào. Nếu số chữ số nhỏ hơn 3, đầu ra sẽ được thêm ký tự số 0 ở bên trái.
        }
        
        System.out.println("================================");
	}
}
package Helloworld;
import java.util.*;

public class loop2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            System.out.println();
            
            int result0 = 0;
            
            for(int j = 0; j < n; j ++) {
            	int test0 = 0;
            	
            	for(int k = 0; k<=j; k ++) {
            		test0 = test0 + (int) (Math.pow(2, k)*b);	
            	}
            	
            	result0 = a+ test0;
            	
            	if(j<n-1) {
            		System.out.print(result0 + " ");	
            	}else {
            		System.out.print(result0);
            	}
    		}
        }
        
        sc.close();
        
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//int n = sc.nextInt();
		
		//int result = 0;
		
		//int result1 = 0;
		//for(int j = 0; j < n; j ++) {
			//if(j == 0) {
				//result1 = result1 + (int) (a + Math.pow(2, 0)*b);
			//}else {
				//result1 = result1 + (int) (a + Math.pow(2, j)*b);	
			//}
			//System.out.print(result1 + " ");
		//}
	}
}

package Helloworld;
import java.io.*;
import java.util.*;

public class JavaStringReverse {
	
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String ReverseA = "";
        
        for(int i = A.length()-1; i >=0; i --) {
        	ReverseA += A.substring(i, i+1);
        }
        
        if(A.compareTo(ReverseA) == 0) {
            System.out.println("Yes");        	
        }else {
        	System.out.println("No");
        }

    }
}

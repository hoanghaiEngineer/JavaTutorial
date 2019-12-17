package Helloworld;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	// Complete the function in the editor. If A and B  are case-insensitive anagrams, 
    	// print "Anagrams"; otherwise, print "Not Anagrams" instead.
    	Scanner k = new Scanner(System.in);
    	boolean isAnagram = true;
    			
    	//1 Get length of S1 and S2
    	int LS1 = a.length();
    	int LS2 = b.length();
    	
    	//2 Check LS1 and LS2
    	if(LS1 == LS2) {
    		//2.1 Put s1, s2 into arrays
    		String[] s1Temp = new String[a.length()];
    		String[] s2Temp = new String[b.length()];
    				
    		for(int i = 0; i<a.length(); i ++) {
    			s1Temp[i] = a.substring(i, i+1).toLowerCase();
    		}
    				
    		for(int i = 0; i<b.length(); i++) {
    			s2Temp[i] = b.substring(i, i+1).toLowerCase();
    		}
    				
    		//2.2 Sort alphabet s1Temp, s2Temp
    				
    		java.util.Arrays.sort(s1Temp);
    		java.util.Arrays.sort(s2Temp);
    		//2.3 compare 2 arrays s1Temp, s2Temp
    		for(int i = 0; i < LS1; i ++) {
    			if(s1Temp[i].trim().toLowerCase().compareTo(s2Temp[i].trim().toLowerCase()) != 0) {
    				isAnagram = false;
    				break;
    			}else {
    				isAnagram = true;
    			}
    		}
    	}
    	else {
    		isAnagram = false;
    	}
    			
    	return isAnagram;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Input S1");
    	String a = scan.nextLine();
    	System.out.println("Input S2");
    	String b = scan.nextLine();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
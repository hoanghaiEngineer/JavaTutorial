package Helloworld;

import java.util.Scanner;

public class JavaStringCompareTest {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String [] s2 = new String[s.length() - (k-1)];
        
        if(k > 1) {
            for(int i = 0; i <s.length()-1; i ++) {
                if(i < s.length() - (k - 1)) {
                    String s1 = s.substring(i, i + k);
                    s2[i] = s1;
                }
            }
            
            // Sort alphabet array s2
            java.util.Arrays.sort(s2);
            
            smallest = s2[0];
            largest = s2[s2.length-1];
        }
        if(k == 1) {
            for(int i = 0; i <s.length(); i ++) {
                String s1 = "";
                if(i==0) {
                    s1 = s.substring(0, i+1);
                    s2[i] = s1;
                }
                if(i == s.length() - 1) {
                    s1 = Character.toString(s.charAt(i));
                    s2[i] = s1;
                }
                else {
                    s1 = s.substring(i, i+1);
                    s2[i] = s1;
                }
            }
            
            // Sort alphabet array s2
            java.util.Arrays.sort(s2);
            
            smallest = s2[0];
            largest = s2[s2.length-1];    
        }
        if(k == 0) {
            s2 = new String[1];
            s2[0] = s;
            smallest = s2[0];
            largest = s2[0];
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
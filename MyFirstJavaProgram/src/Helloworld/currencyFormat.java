package Helloworld;
import java.text.NumberFormat;
import java.util.*;

public class currencyFormat {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = currencyUS.format(payment);

        NumberFormat currencyIndia = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = currencyIndia.format(payment);

        NumberFormat currencyChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = currencyChina.format(payment);

        NumberFormat currencyFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = currencyFrance.format(payment);


        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}
}
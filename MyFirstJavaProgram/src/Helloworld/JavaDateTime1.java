package Helloworld;
import java.text.*;
import java.util.*;

public class JavaDateTime1 {
	public static void main(String [] args) {
		String Date = "05/08/2015 00:00:00 UTC";
		try {
			Date dateProcess = new SimpleDateFormat("dd/MM/yyyy").parse(Date);
			String dateReturn = new SimpleDateFormat("E").format(dateProcess);
			System.out.println(dateReturn);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
}

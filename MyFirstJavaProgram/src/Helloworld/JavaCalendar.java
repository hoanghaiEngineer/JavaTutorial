package Helloworld;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class JavaCalendar {
	public static void main(String [] args) {
		int day = 05;
		int month = 01;
		int year= 2015;
		String Date = String.format("%s/%s/%s", day, month, year);
	    String dateReturn = "";
	    Date dateProcess = new Date();
	    try {
	        dateProcess = new SimpleDateFormat("dd/MM/yyyy").parse(Date);

	    } catch (ParseException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(dateProcess);
	    String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();

	    System.out.println(dayOfWeek);
	}
}

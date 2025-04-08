package JavaBasicCodes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateTimeFormat {



	public static String dateSelection (int noOfDay) {
		String dateMonthDay= null,newDate = null;
		String [] split = null;
		SimpleDateFormat simp = new SimpleDateFormat("dd MMM EEEE");
		Calendar cal = Calendar.getInstance();
		System.out.println("Current date: "+simp.format(cal.getTime()));

		//Number of Days to add
		cal.add(Calendar.DATE, noOfDay); 
		dateMonthDay = simp.format(cal.getTime());
		split = dateMonthDay.split("[ ]");
		newDate = split[0];
		if(split[2].equals("Sunday")) {
			cal.add(Calendar.DATE, 1);
			dateMonthDay = simp.format(cal.getTime());
			split = dateMonthDay.split("[ ]");
			newDate = split[0];
		}
		return newDate;

	}




	public static void main(String[] args) {


		//		dateSelection(1);
		// TODO Auto-generated method stub
		//		SimpleDateFormat simp = new SimpleDateFormat("'Date:'dd/MMM/YY' Time:'hh:mm:ss a z");
		//		Date d = new Date();
		//		System.out.println(simp.format(d));
		SimpleDateFormat simp = new SimpleDateFormat("MMMM dd YYYY");
		System.out.println(simp.format(new Date()));
//		Calendar cal = Calendar.getInstance();
//		System.out.println("Current date: "+simp.format(cal.getTime()));
//
////		//Displaying current date in the desired format
////		System.out.println("Current date: "+simp.format(cal.getTime()));
////
//		//Number of Days to add
//		cal.add(Calendar.DATE, 35 ); 
////
//		System.out.println("New date : "+simp.format(cal.getTime()));

	}

}

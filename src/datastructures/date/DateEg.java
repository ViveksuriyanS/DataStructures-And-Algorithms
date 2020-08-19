package datastructures.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateEg {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getYear());

		Date date1 = new Date(1993, 8, 12);
		Calendar c = Calendar.getInstance();
		
		c.setTime(date1);
		SimpleDateFormat format = new SimpleDateFormat("EEEE");
		System.out.println("---" + format.format(c.getTime()).toUpperCase());
		c.set(1993, 8-1, 12);
		format = new SimpleDateFormat("EEEE");
		System.out.println("---" + format.format(c.getTime()).toUpperCase());
		LocalDate newDate = LocalDate.now();
		System.out.println(newDate);

		System.out.println("dayOfYear: " + newDate.getDayOfYear());
		System.out.println("dayOfMonth: " + newDate.getDayOfMonth());
		System.out.println("dayOfWeek: " + newDate.getDayOfWeek());

		System.out.println("Era: " + newDate.getEra());

		System.out.println("getYear: " + newDate.getYear());
		System.out.println("getMonth: " + newDate.getMonth());
		System.out.println("getMonthValue: " + newDate.getMonthValue());

		System.out.println(newDate.getChronology());

		LocalDate customDate = LocalDate.of(2020, 4, 16);
		System.out.println(customDate.getDayOfWeek());

	}

}

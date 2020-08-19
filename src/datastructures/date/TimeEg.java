package datastructures.date;

import java.time.LocalTime;

public class TimeEg {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		System.out.println("hour - " + lt.getHour());
		System.out.println("mins - " + lt.getMinute());
		System.out.println("secs - " + lt.getSecond());
		System.out.println("nsec - " + lt.getNano());

		System.out.println();
	}

}

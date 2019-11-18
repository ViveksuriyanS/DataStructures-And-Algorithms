package datastructures.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateToString {

	public static void main(String[] args) {
		String date = "12/08/1993";
		try {
			Date d1 = new SimpleDateFormat("dd/mm/yyyy").parse(date);
			System.out.println(date + " " + d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

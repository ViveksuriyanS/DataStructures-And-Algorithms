package Collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListString {

	public static void main(String[] args) {
		// Creating an arrayList
		List<String> arrayList = new ArrayList<String>(); // empty
		arrayList.add("Livera");
		arrayList.add("Sanka");
		arrayList.add("Sharma");
		Collections.sort(arrayList,String.CASE_INSENSITIVE_ORDER);
		System.out.println(arrayList);
	}

}

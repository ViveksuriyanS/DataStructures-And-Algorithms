package datastructures.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("Banana");
		s1.add("Orange");
		s1.add("Kiwi");
		s1.add("Orange");
		System.out.println(s1.toString());

		// Maintains the insertion order
		Set<String> s2 = new LinkedHashSet<String>();
		s2.add("Banana");
		s2.add("Orange");
		s2.add("Kiwi");
		s2.add("Orange");
		System.out.println(s2.toString());

		// Sorts the elements in natural order
		Set<String> s3 = new TreeSet<String>();
		s3.add("Banana");
		s3.add("Orange");
		s3.add("Kiwi");
		s3.add("Orange");
		System.out.println(s3.toString());

		// Another natural sorting order
		Set<String> s4 = new TreeSet<String>((sti1, sti2) -> sti1.compareTo(sti2));
		s4.add("Banana");
		s4.add("Orange");
		s4.add("Kiwi");
		s4.add("Orange");
		System.out.println(s4.toString());

		// Reverse natural sorting order
		Set<String> s5 = new TreeSet<String>((sti1, sti2) -> sti2.compareTo(sti1));
		s5.add("Banana");
		s5.add("Orange");
		s5.add("Kiwi");
		s5.add("Orange");
		System.out.println(s5.toString());

		Set<String> s6 = new TreeSet<String>() {
			{
				add("banana");
			}
		};

		System.out.println(s6.toString());
	}

}

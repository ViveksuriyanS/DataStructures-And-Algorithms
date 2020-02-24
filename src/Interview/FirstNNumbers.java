package Interview;

import java.util.Comparator;
import java.util.stream.IntStream;

public class FirstNNumbers {

	public static void main(String[] args) {
		int[] inputArr = { 6, 4, 2, 8, 5, 9, 1, 3, 7 };
		IntStream.of(inputArr).boxed().sorted(Comparator.reverseOrder()).limit(5).forEach(System.out::println);
	}

}

package Interview;

import java.util.stream.IntStream;

public class CountDistinct {

	public static void main(String[] args) {
		int inp[] = { 1, 4, 6, 7, 9, 2, 4, 6, 7, 9, 4, 3, 6, 5 };
		System.out.println(IntStream.of(inp).count());
		System.out.println(IntStream.of(inp).distinct().count());
	}

}

package datastructures.string;

public class ReverseEachWord {

	public static void main(String[] args) {
		String input = "This is a string";
		String[] inputArray = input.split(" ");
		String output = "";
		for (String in : inputArray) {
			System.out.println(in);
			for (int i = in.length() - 1; i >= 0; i--) {
				output = output + in.charAt(i);
			}
			output = output + " ";
		}
		System.out.println(output);
	}

}

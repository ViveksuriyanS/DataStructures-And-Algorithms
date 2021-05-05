package datastructures.string;

public class CapitalizeWord {

	public static void main(String[] args) {
		String inputString = "my name is vivek suriyan";
		String[] words = inputString.split(" ");

		String output1 = "";
		String toggleOutput = "";
		for (String in : words) {

			String tmp = in.toUpperCase().charAt(0) + in.substring(1, in.length());

			String tmpToggle = in.charAt(0) + in.substring(1, in.length()).toUpperCase();
			toggleOutput += tmpToggle + " ";
			output1 += tmp + " ";

		}

		System.out.println(output1);
		System.out.println(toggleOutput);
	}

}

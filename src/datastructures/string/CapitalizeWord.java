package datastructures.string;

public class CapitalizeWord {

	public static void main(String[] args) {
		String inputString = "my name is vivek suriyan";
		String[] words = inputString.split(" ");
		String output = "";
		String output1 = "";
		String toggleOutput = "";
		for (String in : words) {
			String tmpTogglein = in;
			String tmp = in.toUpperCase().charAt(0) + in.substring(1, in.length());
			// The below is wrong as it changes vivek to ViVek
			in = in.replace(String.valueOf(in.charAt(0)), String.valueOf(in.charAt(0)).toUpperCase());

			String tmpToggle = tmpTogglein.charAt(0) + tmpTogglein.substring(1, tmpTogglein.length()).toUpperCase();
			toggleOutput = toggleOutput + tmpToggle + " ";
			output1 += tmp + " ";
			output += in + " ";
		}
		System.out.println(output);
		System.out.println(output1);
		System.out.println(toggleOutput);
	}

}

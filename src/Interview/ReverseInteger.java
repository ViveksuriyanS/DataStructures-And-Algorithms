package Interview;

public class ReverseInteger {

	public static void main(String[] args) {
		int input = 12345;
		long reverse = 0;
		
		while(input != 0) {
			reverse = reverse * 10 + input % 10;
			input /= 10;
			System.out.println(reverse);
			System.out.println(input);
			
			if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
				return;
		}

	}

}

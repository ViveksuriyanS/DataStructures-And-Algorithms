package Interview;

public class CharacterFrequency {

	public static void main(String[] args) {
		String st = "Picture Perfect";
		char[] stArray = st.toCharArray();

		for (int i = 0; i < st.length(); i++) {
			int frequency = 1;
			for (int j = i + 1; j < st.length(); j++) {
				if (stArray[i] == stArray[j]) {
					frequency++;
					stArray[j] = '0';
				}

			}
			if (stArray[i] != '0' && stArray[i] != ' ')
				System.out.println(stArray[i] + " " + frequency);
		}
	}

}

package com.arrays;

public class Try {
	public void myBuf(StringBuffer s, StringBuffer s1) {
		s.append("B");
		s = s1;
	}

	public static void main(String args[]) {
		Try t = new Try();
		StringBuffer s = new StringBuffer("A");
		StringBuffer sl = new StringBuffer("B");
		t.myBuf(s, sl);
		System.out.print(s);

		String x = "abdc";
		new B().func(1000);

	}
}

class B {
	public String func(int n) {
		 StringBuffer s = new StringBuffer("0");
		    int n_squared = n*n;
		    for (int i=0; i<n_squared; i++) {
		        s.append (", " + i);
		    }
		    System.out.println(s.toString());
		    return s.toString();
	}
}
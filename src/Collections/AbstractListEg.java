package Collections;

import java.util.AbstractList;
import java.util.LinkedList;

public class AbstractListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractList<Integer> list = new LinkedList<Integer>(){
			{
				add(6);
				add(16);
				add(26);
				add(36);
				
			}
		};
		System.out.println(list);
	}

}

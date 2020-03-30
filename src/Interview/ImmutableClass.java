package Interview;

public class ImmutableClass {

	private final int dataX;

	public ImmutableClass(int data) {
		this.dataX = data;
	}

	public static void main(String[] args) {
		ImmutableClass c1 = new ImmutableClass(5000);
		ImmutableClass c2 = c1.setData(2000);
		System.out.println(c1.getDataX() + " " + c1);
		System.out.println(c2.getDataX() + " " + c2);
	}

	public int getDataX() {
		return dataX;
	}

	public ImmutableClass setData(int data) {
		return new ImmutableClass(data);
	}
}

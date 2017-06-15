public class TwoConstructors {
	int i;
	String s;
	TwoConstructors() {
		this("yo");
		i = 1;
	}
	TwoConstructors(String s) {
		this.s = s;
	}
	public static void main(String... args) {
		TwoConstructors ob = new TwoConstructors();
		System.out.println("int is: " + ob.i + "\tString is: " + ob.s);
	}
}

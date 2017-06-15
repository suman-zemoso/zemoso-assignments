class FirstOutter {
	class FirstInner {
		FirstInner(String s) {System.out.println("string inside FirstInner class: " + s);}
	}
}
class SecondOutter {
	class SecondInner extends FirstOutter.FirstInner {
		SecondInner(String s) {
			new FirstOutter().super(s);
			System.out.println("string inside SecondInner class: " + s);
		}
	}
}
public class Five {
	public static void main(String... args) {
		new SecondOutter().new SecondInner("this is string");
	}
}

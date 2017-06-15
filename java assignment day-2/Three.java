public class Three {
	Three(String s) {
		System.out.println(s);
	}
	public static void main(String... args) {
		Three[] ob = new Three[4];//without assigning objects in this array the initialization message is not printed.
		for (int i = 0; i < 4; i++) {
			ob[i] = new Three("object" + i);
		}
	}
}
		

interface Interface1 {
	void method11();
	void method12();
}
interface Interface2 {
	void method21();
	void method22();
}
interface Interface3 {
	void method31();
	void method32();
}
interface Interface4 extends Interface1, Interface2, Interface3 {
	void method41();
}
class Class1 {}
class Class2 extends Class1 implements Interface4 {
	public void method11() {}
	public void method12() {}
	public void method21() {}
	public void method22() {}
	public void method31() {}
	public void method32() {}
	public void method41() {}
}
public class Three {
	static void method1(Interface1 i) {}
	static void method2(Interface2 i) {}
	static void method3(Interface3 i) {}
	static void method4(Interface4 i) {}
	public static void main(String... args) {
		Class2 ob = new Class2();
		method1(ob);
		method2(ob);
		method3(ob);
		method4(ob);
	}
}

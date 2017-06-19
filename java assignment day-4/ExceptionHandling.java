class Exception1 extends Exception {}
class Exception2 extends Exception {}
class Exception3 extends Exception {}

public class ExceptionHandling {
	static void method1(int i) throws Exception1, Exception2, Exception3 {
		switch(i) {
			case 1: throw new Exception1();
			case 2: throw new Exception2();
			case 3: throw new Exception3();
		}
	}
	public static void main(String... args) {
		try{
			method1(1);// change the argument inside methode1 to 2,3 for throwing different exceptions.
		}catch( Exception1| Exception2| Exception3 e){
			e.printStackTrace(System.out);
		}finally{
			System.out.println("in finally");
		}
	}
}
/*Output
Exception1
	at ExceptionHandling.method1(ExceptionHandling.java:8)
	at ExceptionHandling.main(ExceptionHandling.java:15)
in finally
*/	

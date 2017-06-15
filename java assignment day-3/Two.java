class Cycle {}
class Unicycle extends Cycle {void balance() {System.out.println("Hard");}}
class Bicycle extends Cycle {void balance() {System.out.println("Easy");}}
class Tricycle extends Cycle {}
public class Two {
	public static void main(String... args) {
		Cycle[] ob = {new Unicycle(), new Bicycle(), new Tricycle()};
		//doesn't work as Cycle is not having any method with name balance.
		//for (Cycle c: ob) {
		//	c.balance();
		//}
		Unicycle u = (Unicycle)ob[0];
		u.balance();
		Bicycle b = (Bicycle)ob[1];
		b.balance();
		//doesn't work as Triycle is not having any method with name balance.
		//Tricycle t = (Tricycle)ob[2];
		//t.balance();
	}
}

abstract class Rodent {
	Rodent() {System.out.println("this is rodent");}
	abstract void eats();
	abstract void bites();
	abstract void violent();

}

class Mouse extends Rodent {
	Mouse() {System.out.println("this is mouse");}
	void eats() {System.out.println("eats a lot");}
	void bites() {System.out.println("it bites");}
	void violent() {System.out.println("is very violent");}
}

class Gerbil extends Rodent {
	Gerbil() {System.out.println("this is gerbil");}
	void eats() {System.out.println("eats moderately");}
	void bites() {System.out.println("it bites");}
	void violent() {System.out.println("is a little violent");}
}

class Hamster extends Rodent {
	Hamster() {System.out.println("this is hamster");}
	void eats() {System.out.println("eats very less");}
	void bites() {System.out.println("it doesn't bite");}
	void violent() {System.out.println("is not violent");}
}

public class One {
	public static void main(String...args) {
		Rodent ob1 = new Mouse();
		Rodent ob2 = new Gerbil();
		Rodent ob3 = new Hamster();
		ob1.eats();
		ob1.bites();
		ob1.violent();
		ob2.eats();
		ob2.bites();
		ob2.violent();
		ob3.eats();
		ob3.bites();
		ob3.violent();
	}
}


interface Cycle {
	void balance();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	private Unicycle() {System.out.println("this is Unicycle");}
	public void balance() {System.out.println("balancing is hard");}	
	static CycleFactory cf = new CycleFactory() {
		public Cycle getCycle() { return new Unicycle();}
	};
}
class Bicycle implements Cycle {
	private Bicycle() {System.out.println("this is Bicycle");}
	public void balance() {System.out.println("balancing is ok");}	
	static CycleFactory cf = new CycleFactory() {
		public Cycle getCycle() { return new Bicycle();}
	};
}
class Tricycle implements Cycle {
	private Tricycle() {System.out.println("this is Tricycle");}
	public void balance() {System.out.println("balancing is easy");}	
	static CycleFactory cf = new CycleFactory() {
		public Cycle getCycle() { return new Tricycle();}
	};
}

public class Four {
	public static void produceCycle(CycleFactory f) {
		Cycle c = f.getCycle();
		c.balance();
	}
	public static void main(String... args) {
		produceCycle(Unicycle.cf);
		produceCycle(Bicycle.cf);
		produceCycle(Tricycle.cf);
	}
}
		








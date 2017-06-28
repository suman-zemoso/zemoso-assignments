import java.util.*;
import java.text.DecimalFormat;
interface Subject {
	
	void register(Observer o);
	void unregister(Observer o);
	void notifyObserver();
	
}
interface Observer {
	
	void update(double USD, double GBP, double Euro);
	
}
class Converter implements Subject {
	private double USD = 65;
	private double GBP = 80;
	private double Euro = 69;

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void register(Observer o) {
		observers.add(o);
	}
	public void unregister(Observer o) {
		int observerIndex = observers.indexOf(o);
		observers.remove(observerIndex);
	}
	public void notifyObserver() {
		for(Observer o : observers) {
			o.update(USD, GBP, Euro);
		}
	}
	
	public void setUSD(double USD) {
		this.USD = USD;
		notifyObserver();
	}
	public void setGBP(double GBP) {
		this.GBP = GBP;
		notifyObserver();
	}
	public void setEuro(double Euro) {
		this.Euro = Euro;
		notifyObserver();
	}
}
class Individual implements Observer {
	private double USD = 65;
	private double GBP = 80;
	private double Euro = 69;
	private double INR;
	
	private static int counter = 0;
	private final int id = ++counter;

	private Subject converter;

	public Individual(Subject converter, double INR) {
		this.INR = INR;
		this.converter = converter;
		System.out.println("New Observer " + this.id);
		converter.register(this);
	}
	
	public void update(double USD, double GBP, double Euro) {
		this.USD = USD;
		this.GBP = GBP;
		this.Euro = Euro;
		printValues();
	}
	private DecimalFormat df = new DecimalFormat("0.00");
	public void printValues() {
		System.out.println("Observer " + id + 
			"\n USD = " + df.format(INR/USD) + 
			"\n GBP = " + df.format(INR/GBP) + 
			"\n Euro = " + df.format(INR/Euro) + "\n");
	}
}
public class XEIndia {
	public static void main(String... args) {
		Converter converter = new Converter();
		Individual observer1 = new Individual(converter, 1000);
		observer1.printValues();
		Individual observer2 = new Individual(converter, 2000);
		observer2.printValues();
		converter.setUSD(67);
		converter.setGBP(93);
		converter.setEuro(63);
	}
}

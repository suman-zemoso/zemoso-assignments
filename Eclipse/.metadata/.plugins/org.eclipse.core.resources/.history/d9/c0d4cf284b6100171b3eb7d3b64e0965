package xeindia;

import java.util.ArrayList;
import java.util.List;

public class Converter implements Subject {
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

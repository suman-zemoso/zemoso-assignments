package xeindia;

import java.text.DecimalFormat;

public class Individual implements Observer {
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

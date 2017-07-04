package utooCabService;

public abstract class Cab {

	protected double rate;
	protected String name;
	
	public void printRateChart(){
		System.out.printf("%-6s %s %.2f Rs/Km \n", name, "rate", rate);
	}
}

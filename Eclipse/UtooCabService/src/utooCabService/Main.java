package utooCabService;

public class Main {

	public static void main(String[] args) {

		FactoryBuilder fb = new FactoryBuilder();
		BranchFactory bf1 = fb.makeFactory("Hyderabad");
		BranchFactory bf2 = fb.makeFactory("Bangalore");
		BranchFactory bf3 = fb.makeFactory("Chennai");
		Cab c1 = bf2.makeCab("Mini");
		Cab c2 = bf2.makeCab("Micro");
		Cab c3 = bf2.makeCab("SUV");
		Cab c4 = bf2.makeCab("Sedan");
		Cab c5 = bf1.makeCab("Mini");
		Cab c6 = bf1.makeCab("Micro");
		Cab c7 = bf1.makeCab("SUV");
		Cab c8 = bf3.makeCab("Mini");
		Cab c9 = bf3.makeCab("Micro");
		Cab c10 = bf3.makeCab("Sedan");
		System.out.println("\nRate Charts of Cabs in Bangalore: \n");
		c1.printRateChart();
		c2.printRateChart();
		c3.printRateChart();
		c4.printRateChart();
		System.out.println("\nRate Charts of Cabs in Hyderabad: \n");
		c5.printRateChart();
		c6.printRateChart();
		c7.printRateChart();
		System.out.println("\nRate Charts of Cabs in Chennai: \n");
		c8.printRateChart();
		c9.printRateChart();
		c10.printRateChart();
		

	}

}

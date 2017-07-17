package utooCab;

public class SedanCab extends Cab {

	public SedanCab(double cityCostFactor){//cityCostFactor will be provided by the Cab Factory depending on the city.
		rate = cityCostFactor*35;//as rate of the cab also depends on the city it's in
		model = "Sedan";
	}
}

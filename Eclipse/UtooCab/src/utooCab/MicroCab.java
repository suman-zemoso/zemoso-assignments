package utooCab;

public class MicroCab extends Cab {

	public MicroCab(double cityCostFactor){//cityCostFactor will be provided by the Cab Factory depending on the city.
		rate = cityCostFactor*27;//as rate of the cab also depends on the city it's in
	}
}

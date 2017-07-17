package utooCab;

public class MiniCab extends Cab {

	public MiniCab(double cityCostFactor){//cityCostFactor will be provided by the Cab Factory depending on the city.
		rate = cityCostFactor*24;//as rate of the cab also depends on the city it's in
		model = "Mini";
	}
}

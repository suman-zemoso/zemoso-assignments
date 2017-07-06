package utooCab;

public class SUVCab extends Cab {

	public SUVCab(double cityCostFactor){//cityCostFactor will be provided by the Cab Factory depending on the city.
		rate = cityCostFactor*40;//as rate of the cab also depends on the city it's in
	}
}

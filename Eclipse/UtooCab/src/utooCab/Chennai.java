package utooCab;

import java.util.ArrayList;
import java.util.Arrays;

public class Chennai extends City {

	public Chennai(){
		cityName = "Chennai";
		cityCostFactor = 1.3;
		localities = new ArrayList<Locality>(Arrays.asList(new Locality(50, 50 , "Airport"),
				new Locality(53, 54, "Gandhi Nagar"), new Locality(55, 52, "Anna nagar"),
				new Locality(50, 55, "Tambaram")));
	}

}

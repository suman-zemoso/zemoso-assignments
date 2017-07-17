package utooCab;

import java.util.ArrayList;
import java.util.Arrays;

public class Hyderabad extends City {

	public Hyderabad(){
		cityName = "Hyderabad";
		cityCostFactor = 1.4;
		localities = new ArrayList<Locality>(Arrays.asList(new Locality(0, 0 , "Gachibowli"),
				new Locality(3, 4, "Hitech-city"), new Locality(5, 2, "Jublee Hills"),
				new Locality(0, 5, "Madhapur")));
	}
}

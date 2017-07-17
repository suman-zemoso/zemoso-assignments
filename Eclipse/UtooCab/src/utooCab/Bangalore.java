package utooCab;

import java.util.ArrayList;
import java.util.Arrays;

public class Bangalore extends City {

	public Bangalore(){
		cityName = "Bangalore";
		cityCostFactor = 1.7;
		
		//adding localities to bangalore.
		localities = new ArrayList<Locality>(Arrays.asList(new Locality(10, 10 , "Wonderlaa"),
				new Locality(13, 14, "National Zoo"), new Locality(15, 12, "Airport"),
				new Locality(10, 15, "Gandhi Nagar")));
	}

}

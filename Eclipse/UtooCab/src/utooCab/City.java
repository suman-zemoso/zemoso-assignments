package utooCab;

import java.util.List;

public abstract class City {

	protected String cityName;
	protected double cityCostFactor;
	protected List<Locality> localities;
	
	//using the coordinates of locality1 and locality2 it calculates the
	//distance between locality1 and locality2.
	public double distance(Locality locality1, Locality locality2){
		double distance = Math.pow((Math.pow((locality1.getXCoordinate() 
				- locality2.getXCoordinate()), 2.0) 
				+ Math.pow((locality1.getYCoordinate() 
						- locality2.getYCoordinate()), 2.0)), 0.5);
		return distance;
	}
	
	public double getCityCostFactor(){return cityCostFactor;}
	
	public String getCityName(){return cityName;}
	
	public List<Locality> getLocalities(){return localities;}
}

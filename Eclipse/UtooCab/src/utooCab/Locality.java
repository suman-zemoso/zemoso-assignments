package utooCab;

public class Locality {
	private final double XCOORDINATE;// x-coordinate of the physical position of the locality, later used to calculate distance between two localities.
	private final double YCOORDINATE;// y-coordinate of the physical position of the locality, later used to calculate distance between two localities.
	private final String LOCALITYNAME;
	
	public Locality(double xCoordinate, double yCoordinate, String name){
		XCOORDINATE = xCoordinate;
		YCOORDINATE = yCoordinate;
		LOCALITYNAME = name;
	}

	public double getXCoordinate(){return XCOORDINATE;}
	
	public double getYCoordinate(){return YCOORDINATE;}
	
	public String getLocalityName(){return LOCALITYNAME;}
	
	
}

package utooCab;

public abstract class Cab {

	private static int idGenerator = 0;
	protected final int id = ++idGenerator; //gives a unique id to the objects of the subclasses of the class Cab that are created.
	protected double rate;
	protected String model;
	protected boolean isBooked = false;
	protected String cityName;
	
	public int getCabId(){return id;}
	
	public void setBookingStatus(boolean bookingStatus){isBooked = bookingStatus;}
	
	public boolean getBookingStatus(){return isBooked;}
	
	public void setCityName(String cityName){this.cityName = cityName;}
	
	public String getCityName(){return cityName;}
	
	public String getCabModel(){return model;}
	
	public double printBillAmount(double distance){//returns the total cost of your cab ride.
		return rate*distance;
	}
}

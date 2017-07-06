package utooCab;

public abstract class Cab {

	private static int idGenerator = 0;
	protected final int id = ++idGenerator; //gives a unique id to the objects of the subclasses of the class Cab that are created.
	protected double rate;
	protected boolean isBooked = false;
	
	public int getCabId(){return id;}
	
	public void setBookingStatus(boolean bookingStatus){isBooked = bookingStatus;}
	
	public boolean getBookingStatus(){return isBooked;}
	
	public void printBill(double distance){//prints the total bill of your cab ride.
		System.out.println("your total bill is: Rs." + (rate*distance));
	}
}

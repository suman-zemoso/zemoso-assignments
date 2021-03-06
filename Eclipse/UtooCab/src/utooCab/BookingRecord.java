package utooCab;

public class BookingRecord {

	private int cabId;//id of the cab
	private String customerName;
	private Locality source;//pick-up locality of cab ride
	private Locality destination;//drop locality of cab ride
	private City city;//name of the city in which cab is booked
	private String cabBillAmount;
	
	public BookingRecord(int cabId, String customerName, Locality source, Locality destination, City city, String cabBillAmount){
		this.cabId = cabId;
		this.customerName = customerName;
		this.source = source;
		this.destination = destination;
		this.city = city;
		this.cabBillAmount = cabBillAmount;
	}
	
	public int getCabId(){
		return cabId;
	}
	
	public String getCustomerName(){
		return customerName;
	}
	
	public void printCabInfo(){//printing cab booking info.
		System.out.printf("%-20s: %s\n", "Customer name", customerName);
		System.out.printf("%-20s: %d\n", "Cab Id", cabId);
		System.out.printf("%-20s: %s\n", "Pick-up location", source.getLocalityName());
		System.out.printf("%-20s: %s\n", "Drop location", destination.getLocalityName());
		System.out.printf("%-20s: %s\n", "City", city.getCityName());
		System.out.printf("%-20s: %s\n\n", "Ride Cost", "Rs." + cabBillAmount);
	}
}

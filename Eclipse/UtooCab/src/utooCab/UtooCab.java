package utooCab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtooCab {
	public static Scanner sc = new Scanner(System.in);//sc is name of the scanner.

	public static void main(String[] args) {
		
		List<Cab> cabs = new ArrayList<Cab>();//stores all the cabs that are available for Utoo Cab Services.

		FactoryBuilder factoryBuilder = new FactoryBuilder();
		
		CabFactory cabFactory = factoryBuilder.makeCabFactory("Hyderabad");
		
		//making cabs for Hyderabad
		//Hyderabad has no sedans.
		cabs.add(cabFactory.makeCab("Micro"));
		cabs.add(cabFactory.makeCab("Micro"));
		cabs.add(cabFactory.makeCab("Mini"));
		cabs.add(cabFactory.makeCab("Mini"));
		cabs.add(cabFactory.makeCab("SUV"));	
		
		cabFactory = factoryBuilder.makeCabFactory("Bangalore");
		
		//making cabs for Bangalore
		cabs.add(cabFactory.makeCab("Micro"));
		cabs.add(cabFactory.makeCab("Micro"));
		cabs.add(cabFactory.makeCab("Mini"));
		cabs.add(cabFactory.makeCab("Mini"));
		cabs.add(cabFactory.makeCab("Sedan"));
		cabs.add(cabFactory.makeCab("SUV"));

		cabFactory = factoryBuilder.makeCabFactory("Chennai");
		
		//making cabs for Chennai
		//Chennai has no SUVs.
		cabs.add(cabFactory.makeCab("Micro"));
		cabs.add(cabFactory.makeCab("Micro"));
		cabs.add(cabFactory.makeCab("Mini"));
		cabs.add(cabFactory.makeCab("Mini"));
		cabs.add(cabFactory.makeCab("Sedan"));
		
		BookingPortal bookingPortal = new BookingPortal(cabs);
		
		boolean stopWhileLoop = false;

		System.out.println("Welcome to Utoo Cabs");
		
		while(!stopWhileLoop){
			System.out.print("\nPlease enter 1 for booking cab, "
					+ "2 for printing booking records, 3 for cancelling a booking, 4 for exit: ");
			while(!sc.hasNextInt()){//to make sure input is taken number
				sc.nextLine();
				System.out.print("Please enter valid number (1 or 2 or 3 or 4): ");
			}
			int input = sc.nextInt();
			sc.nextLine();
			switch(input){
			case 1:
				bookingPortal.makeBooking();
				break;
			case 2:
				bookingPortal.printBookings();
				break;
			case 3:
				System.out.print("Enter the Cab Id to cancel the booking: ");
				while(!sc.hasNextInt()){//to make sure input is taken number
					sc.nextLine();
					System.out.print("Please enter valid number: ");
				}
				int cabId = sc.nextInt();
				bookingPortal.cancelBooking(cabId);
				break;
			case 4:
				stopWhileLoop = true;
			}
		}
		
		System.out.println("\n\nThank you for using Utoo Cab Services.");
	}

}

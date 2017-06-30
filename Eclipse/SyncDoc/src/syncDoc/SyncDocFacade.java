package syncDoc;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SyncDocFacade {
	Welcome welcome;
	LoginCredentials lc;
	Doctor doc;
	List<Doctor> doctors = new ArrayList<Doctor>();
	Class type;
	String[] specializations = {"kind1", "kind2", "kind3", "kind4", "kind5", "kind6", "kind7", "kind8", "kind9", "kind10"};
	SyncDocFacade() {
		welcome = new Welcome();
		lc = new LoginCredentials();
	}
	boolean login() {
		boolean boo = false;
		Scanner sc = new Scanner(System.in);
		while(!boo) {
			System.out.print("Enter Username: ");
			String uname = sc.nextLine();
			System.out.print("Enter Password: ");
			String pword = sc.nextLine();
			boo = lc.checkCredentials(uname, pword);
			if(!boo){System.out.println("Invalid Username/Password.");}
		}
		return boo;
	}
	void bookAppointment() {
		boolean boo = true;
		System.out.println("Catogories of specializations.");
		System.out.println("1.SpecializationKind1");
		System.out.println("2.SpecializationKind2");
		System.out.println("3.SpecializationKind3");
		System.out.println("4.SpecializationKind4");
		System.out.println("5.SpecializationKind5");
		System.out.println("6.SpecializationKind6");
		System.out.println("7.SpecializationKind7");
		System.out.println("8.SpecializationKind8");
		System.out.println("9.SpecializationKind9");
		System.out.println("10.SpecializationKind10");
		System.out.print("Enter the index of specialization you want to consult: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(Class doctor : Doctor.class.getDeclaredClasses()) {
			try{doc = (Doctor)doctor.newInstance();}catch(Exception e){e.printStackTrace();}
			if(doc.hasSpecialization(specializations[i - 1])){doctors.add(doc);}
		}
		System.out.println("Doctors available for the selected specialization are: ");
		i = 0;
		for(Doctor doctor : doctors) {System.out.println((++i) + ". Dr." +doctor.getName());}
		System.out.print("Enter the index of the Doctor to consult: ");
		i = sc.nextInt();
		doc = doctors.get(i - 1);
		String s = doc.bookSlot();
		System.out.println("You appointment with Dr." + doc.getName() + " is booked for the " + s + " slot.");
		
	}

}

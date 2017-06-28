import java.util.*;
interface Doctor{
	String getName();
	String specialization();
	public class Doctor1 implements Doctor{
		String name = "Tom";
		String kind = "kind1";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
	public class Doctor2 implements Doctor{
		String name = "George";
		String kind = "kind2";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
	public class Doctor3 implements Doctor{
		String name = "Kumar";
		String kind = "kind3";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
	public class Doctor4 implements Doctor{
		String name = "Chan";
		String kind = "kind4";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
	public class Doctor5 implements Doctor{
		String name = "Alice";
		String kind = "kind5";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
	public class Doctor6 implements Doctor{
		String name = "Singh";
		String kind = "kind6";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
	public class Doctor7 implements Doctor{
		String name = "Rao";
		String kind = "kind7";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
	public class Doctor8 implements Doctor{
		String name = "Suresh";
		String kind = "kind8";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
	public class Doctor9 implements Doctor{
		String name = "Mukesh";
		String kind = "kind9";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
	public class Doctor10 implements Doctor{
		String name = "Ram";
		String kind = "kind10";
		public String getName(){return name;}
		public String specialization(){return kind;}
	}
}
class Welcome {
	Welcome() {System.out.println("Welcome to Doctor Appointment booking app.");}
}
class LoginCredentials{
	final String username = "username";
	final String password = "password";
	boolean checkCredentials(String uname, String pword) {
		return username.equals(uname) && password.equals(pword);
	}
}
class SyncDocFacade {
	Welcome welcome;
	LoginCredentials lc;
	Doctor doc;
	Class type;
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
		while(boo) {
			switch(i){
				case 1: type = Doctor.Doctor1.class; boo = false; break;
				case 2: type = Doctor.Doctor2.class; boo = false; break;
				case 3: type = Doctor.Doctor3.class; boo = false; break;
				case 4: type = Doctor.Doctor4.class; boo = false; break;
				case 5: type = Doctor.Doctor5.class; boo = false; break;
				case 6: type = Doctor.Doctor6.class; boo = false; break;
				case 7: type = Doctor.Doctor7.class; boo = false; break;
				case 8: type = Doctor.Doctor8.class; boo = false; break;
				case 9: type = Doctor.Doctor9.class; boo = false; break;
				case 10: type = Doctor.Doctor10.class; boo = false; break;
				default : System.out.print("Please enter an integer from 1 to 10: "); i = sc.nextInt();
			}
		}
		try{doc = (Doctor)type.newInstance();}catch(Exception e){e.printStackTrace();}
		System.out.println("You have an appoint with Dr." + doc.getName() + " who has the specialization in " + doc.specialization());
	}
}
public class SyncDoc {
	public static void main(String... args) {
		SyncDocFacade sdf = new SyncDocFacade();
		if(sdf.login()) {sdf.bookAppointment();}
	}
}

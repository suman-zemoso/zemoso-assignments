package syncDoc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public interface Doctor {
	String getName();
	boolean hasSpecialization(String kind);
	String bookSlot();
	public class Doctor1 implements Doctor{
		String name = "Tom";
		Set<String> kinds = new HashSet<String>();
		String[] timeSlots = {"morning", "evening"};
		Doctor1() {
			kinds.add("kind1");
			kinds.add("kind4");
			kinds.add("kind5");
			kinds.add("kind6");
			kinds.add("kind9");
			kinds.add("kind10");
		}
		public String getName(){return name;}
		public boolean hasSpecialization(String kind){return kinds.contains(kind);}
		public String bookSlot() {
			int i = 0;
			System.out.println("Time slots available for Dr." + name + " are: ");
			for(String s: timeSlots){System.out.println((++i) + ". " + s);}
			System.out.print("enter the index of slot you want to book: ");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			sc.close();
			return timeSlots[i - 1];
		}
	}
	public class Doctor2 implements Doctor{
		String name = "Ram";
		Set<String> kinds = new HashSet<String>();
		String[] timeSlots = {"morning", "evening", "night"};
		Doctor2() {
			kinds.add("kind1");
			kinds.add("kind2");
			kinds.add("kind5");
			kinds.add("kind6");
			kinds.add("kind7");
			kinds.add("kind10");
		}
		public String getName(){return name;}
		public boolean hasSpecialization(String kind){return kinds.contains(kind);}
		public String bookSlot() {
			int i = 0;
			System.out.println("Time slots available for Dr." + name + " are: ");
			for(String s: timeSlots){System.out.println((++i) + ". " + s);}
			System.out.print("enter the index of slot you want to book: ");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			sc.close();
			return timeSlots[i - 1];
		}
	}
	public class Doctor3 implements Doctor{
		String name = "Kumar";
		Set<String> kinds = new HashSet<String>();
		String[] timeSlots = {"morning", "after noon", "evening"};
		Doctor3() {
			kinds.add("kind1");
			kinds.add("kind2");
			kinds.add("kind3");
			kinds.add("kind6");
			kinds.add("kind7");
			kinds.add("kind8");
		}
		public String getName(){return name;}
		public boolean hasSpecialization(String kind){return kinds.contains(kind);}
		public String bookSlot() {
			int i = 0;
			System.out.println("Time slots available for Dr." + name + " are: ");
			for(String s: timeSlots){System.out.println((++i) + ". " + s);}
			System.out.print("enter the index of slot you want to book: ");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			sc.close();
			return timeSlots[i - 1];
		}
	}
	public class Doctor4 implements Doctor{
		String name = "Sing";
		Set<String> kinds = new HashSet<String>();
		String[] timeSlots = {"after noon", "evening"};
		Doctor4() {
			kinds.add("kind1");
			kinds.add("kind2");
			kinds.add("kind3");
			kinds.add("kind4");
			kinds.add("kind7");
			kinds.add("kind8");
			kinds.add("kind9");
		}
		public String getName(){return name;}
		public boolean hasSpecialization(String kind){return kinds.contains(kind);}
		public String bookSlot() {
			int i = 0;
			System.out.println("Time slots available for Dr." + name + " are: ");
			for(String s: timeSlots){System.out.println((++i) + ". " + s);}
			System.out.print("enter the index of slot you want to book: ");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			sc.close();
			return timeSlots[i - 1];
		}
	}
	public class Doctor5 implements Doctor{
		String name = "George";
		Set<String> kinds = new HashSet<String>();
		String[] timeSlots = {"evening", "night"};
		Doctor5() {
			kinds.add("kind3");
			kinds.add("kind4");
			kinds.add("kind5");
			kinds.add("kind8");
			kinds.add("kind9");
			kinds.add("kind10");
		}
		public String getName(){return name;}
		public boolean hasSpecialization(String kind){return kinds.contains(kind);}
		public String bookSlot() {
			int i = 0;
			System.out.println("Time slots available for Dr." + name + " are: ");
			for(String s: timeSlots){System.out.println((++i) + ". " + s);}
			System.out.print("enter the index of slot you want to book: ");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			sc.close();
			return timeSlots[i - 1];
		}
	}

}

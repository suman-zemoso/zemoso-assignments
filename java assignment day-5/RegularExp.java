import java.util.regex.*;
import java.util.*;

public class RegularExp {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the line you want to compare.");
		String s = sc.nextLine();
		Pattern p = Pattern.compile("\\p{javaUpperCase}.+\\.");
		Matcher m = p.matcher(s);
		System.out.println(m.matches()?"it maches the regular expression":"it doesn't match the regular expression");
	}
}
// I didn't use any seperate class in this assignment as I used static methods from imported package and I didn't find it necessary to create new objects to complete the task. 

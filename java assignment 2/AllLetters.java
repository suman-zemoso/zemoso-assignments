import java.util.regex.*;
import java.util.*;

class AlphabetCheck {
	final Pattern p = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
	Matcher m;
	Set<String> set = new HashSet<String>();
	String removeAlphabet(String s) {
		m = p.matcher(s);
		while(m.find()) {
			set.add(m.group().toUpperCase());
			s = s.replaceAll(m.group(), "");
		}
		return s;
	}
}
public class AllLetters {
	public static void main(String... args) {
		AlphabetCheck ac = new AlphabetCheck();
		System.out.print("enter the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = ac.removeAlphabet(s);
		System.out.println(ac.set.size() == 26?"the string contains all the alphabets":"the string doesn't contain all the strings");
	}
}

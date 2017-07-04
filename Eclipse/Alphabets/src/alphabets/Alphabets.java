package alphabets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Alphabets {
	private boolean containsAllLetters(String input){
		Set<Character> alphabets = new HashSet<Character>();
		if(input.length() < 26)
			return false;
		
		for(char letter : input.toCharArray()){
			if((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
				alphabets.add(Character.toUpperCase(letter));
		}
		
		return alphabets.size() == 26;
	}

	public static void main(String[] args) {

		Alphabets alphabets = new Alphabets();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sequence.");
		boolean allAlphabetsCheck = alphabets.containsAllLetters(sc.nextLine());//allAlphabetsCheck is boolean that stores true if input contains all the alphabets otherwise false.
		System.out.println("your input " + (allAlphabetsCheck?"":"does not ") + "contains all the alphabets.");//here allAlphabetsCheck edits the line to be printed according to it's value.
		sc.close();
	}

}

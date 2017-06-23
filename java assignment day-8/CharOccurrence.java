import java.io.*;
import java.util.*;
class FileContentReader {
	private String filename;
	FileContentReader(String filename) {
		this.filename = filename;
	}
	Map<Character,Integer> mp = new HashMap<Character,Integer>();
	void printfile(){
		try{
			BufferedReader in = new BufferedReader( new FileReader(filename));
			int c;
			while((c = in.read()) != -1) {//storing characters from file in map.
				mp.put((char)c, mp.get((char)c) == null?1:mp.get((char)c) + 1);
			}
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("testoutput.txt")));
			for (Map.Entry<Character, Integer> entry : mp.entrySet()) {//printing the map inside the file "testoutput.txt".
				out.println(entry.getKey() + " : " + entry.getValue());
			}
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
public class CharOccurrence {
	public static void main(String... args) {
		FileContentReader fcr = new FileContentReader("CharOccurrence.java");
		fcr.printfile();
	}
}

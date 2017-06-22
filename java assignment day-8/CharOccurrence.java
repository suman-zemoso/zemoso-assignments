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
			String s;
			while((s = in.readLine()) != null) {//storing characters from file in map.
				for(char c : s.toCharArray()){
					mp.put(c, mp.get(c) == null?1:mp.get(c) + 1);
				}
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

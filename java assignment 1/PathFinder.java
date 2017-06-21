import java.io.*;
import java.util.*;
class FilePathFinder {
	void findFiles(String s, String d) {
		File home = new File(d);
		File[] fileslist = home.listFiles();
		if(fileslist != null){
			for(File f : fileslist){
				if(f.isFile() && f.getName().matches(s)){System.out.println(f);}
				else if(f.isDirectory()){findFiles(s, "" + f);}
			}
		}
	}
}
public class PathFinder {
	public static void main(String... args) {
		FilePathFinder fpf = new FilePathFinder();
		Scanner sc = new Scanner(System.in);
		String s;
		while(true){
			System.out.print("enter the java regular expression or \"Ctrl\" + \"C\" to exit: ");
			s = sc.next();
			fpf.findFiles(s, "/home/zemoso");
		}
	}
}

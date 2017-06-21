import java.io.*;
import java.util.*;

class PingProcess {
	Process p;
	String cmd;
	PingProcess(String s){
		cmd = "ping -c 10 " + s;
	}
	void startPing() {
		try{
			System.out.println("pinging 10 times...");
			p = Runtime.getRuntime().exec(cmd);
			BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String l;
			List<Float> lis = new ArrayList<Float>();
			int c = 0;
        		while((l = r.readLine()) != null) {
				String[] tmp = l.split(" ");
           			if(c > 0 && c < 11){lis.add(Float.valueOf(tmp[7].substring(5)));}
				c++;
        		}
			p.waitFor();
			p.destroy();
			System.out.println("the median time taken to ping is " + findMedianTime(lis));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	float findMedianTime(List<Float> ls) {
		Collections.sort(ls);
		return ls.get(ls.size()/2);
	}
}

public class PingTime {
	public static void main(String... args) {
		System.out.print("enter the web address: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		PingProcess pp = new PingProcess(s);
		pp.startPing();
	}
}

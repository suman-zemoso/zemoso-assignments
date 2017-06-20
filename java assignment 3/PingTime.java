import java.net.Socket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.*;

class MakeSocket {
	final InetSocketAddress socketAddress;
	MakeSocket(InetAddress inetAddress, int portNumber) {
		socketAddress = new InetSocketAddress(inetAddress, portNumber);
	}
	long calMedian(List<Long> l) {
		Collections.sort(l);
		return l.get(l.size()/2);
	}	
	void pingSocket(List<Long> l) {
		for(int i = 0; i < 10; i++) {
			try{
				Socket sc = new Socket();
				long time = System.currentTimeMillis();
				long start = time;
				sc.connect(socketAddress, 5000);
				long end = System.currentTimeMillis();
				time = end - time;
				System.out.println("ping successful with start time: " + start + " and end time: " + end); 
				sc.close();
				l.add(time);
			}catch(UnknownHostException e){
				System.out.println("error: " + e);
				//e.printStackTrace(System.out);
			}catch(IOException e){
				System.out.println("error: " + e);
				//e.printStackTrace(System.out);
			}	
		}
	}
}
public class PingTime {
	public static void main(String... args) {
		try{
			String ipAddress = "www.facebook.com";
			InetAddress inet = InetAddress.getByName(ipAddress);
			MakeSocket ms = new MakeSocket(inet, 80);
			List<Long> l = new ArrayList<Long>();
			ms.pingSocket(l);
			System.out.println("Ping to " + inet + " is successful with a median time of " + ms.calMedian(l) + " milliseconds.");
		}catch(Exception e) {
			System.out.println("error: " + e);
		}
		
	}
}
		

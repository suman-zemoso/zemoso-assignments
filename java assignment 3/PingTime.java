import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

public class PingTime {
	public static void main(String... args) throws UnknownHostException, IOException {
		String ipAddress = "172.217.26.164";
    		InetAddress inet = InetAddress.getByName(ipAddress);
		System.out.println(inet.isReachable(5000));
	}
}
		

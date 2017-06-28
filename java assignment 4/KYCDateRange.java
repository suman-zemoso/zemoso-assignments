import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
class FormDateRange {
	SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
	Date signupdate;
	Date currentdate;
	FormDateRange(String sudate, String cdate) {
		try{
			signupdate = sdf.parse(sudate);
			currentdate = sdf.parse(cdate);
		}catch(Exception e){e.printStackTrace();}
	}
	Date closestAnniversary() {
		long diff = currentdate.getTime() - signupdate.getTime();
		int years = (int)TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)/365;
		Calendar cal = Calendar.getInstance();
		cal.setTime(signupdate);
		cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + years); 
		Date anniversary = cal.getTime();
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DATE, -30);
		Date temp = cal.getTime();
		if(currentdate.getTime() >= temp.getTime()){
			cal.add(Calendar.DATE, 30);
			return cal.getTime();
		}else{return anniversary;}
	}
	boolean validCurrentDate() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(signupdate);
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.DATE, -30);
		Date start = cal.getTime();
		return currentdate.getTime() >= start.getTime();
	}
	void printRange() {
		Date anniversary = closestAnniversary();
		if(validCurrentDate()) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(anniversary);
			cal.add(Calendar.DATE, -30);
			Date start = cal.getTime();
			cal.add(Calendar.DATE, 60);
			Date end = cal.getTime();
			if(end.getTime() > currentdate.getTime()) {
				System.out.println("your formdate range is from " + sdf1.format(start) + " to " + sdf1.format(currentdate));
			}else{
				System.out.println("your formdate range is from " + sdf1.format(start) + " to " + sdf1.format(end));
			}
		}else{System.out.println("there is still time for your first anniversary.");}	
	}
}
public class KYCDateRange {
	public static void main(String... args) {
		System.out.print("enter your sign up date in the format \"dd mm yyyy\" : ");
		Scanner sc = new Scanner(System.in);
		String sdate = sc.nextLine();
		System.out.print("enter your current date in the format \"dd mm yyyy\" : ");
		String cudate = sc.nextLine();
		FormDateRange fdr = new FormDateRange(sdate, cudate);
		fdr.printRange();
	}
}

package paymentsIndia;

public class NetBanking implements PaymentMode {

	private int amount;
	
	public NetBanking(int amount) {
		this.amount = amount;
	}
	
	public void pay() {
		System.out.println("you have paid the amount of Rs." + amount + " using Netbanking.");
	}


}

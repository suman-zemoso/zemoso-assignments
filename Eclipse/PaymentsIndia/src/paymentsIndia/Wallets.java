package paymentsIndia;

public class Wallets implements PaymentMode {
	private int amount;
	
	Wallets(int amount) {
		this.amount = amount;
	}

	@Override
	public void pay() {
		System.out.println("you have paid the amount of Rs." + amount + " using Wallet.");
	}
	

}

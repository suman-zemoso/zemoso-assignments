package paymentsIndia;

public class DebitCard implements PaymentMode {

	private int amount;
	
	public DebitCard(int amount) {
		this.amount = amount;
	}
	
	public void pay() {
			System.out.println("you have paid the amount of Rs." + amount + " using Debit Card.");
	}


}

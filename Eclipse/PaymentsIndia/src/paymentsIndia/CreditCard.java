package paymentsIndia;

public class CreditCard implements PaymentMode {

	private int amount;
	
	public CreditCard(int amount) {
		this.amount = amount;
	}
	
	@Override
	public void pay() {
			System.out.println("you have paid the amount of Rs." + amount + " using Credit Card.");
	}

}

package paymentsIndia;

public class COD implements PaymentMode {

	private int amount;
	
	public COD(int amount) {
		this.amount = amount;
	}
	
	@Override
	public void pay() {
		System.out.println("you have paid the amount of Rs." + amount + " using COD.");
	}


}

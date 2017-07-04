package paymentsIndia;

public class PaymentFactory {
	private PaymentMode pm;
	
	public PaymentMode makePaymentMode(String s, int amount){
		if(s.equals("Debit Card"))
			pm =  new DebitCard(amount);
		else if(s.equals("Credit Card"))
			pm =  new CreditCard(amount);
		else if(s.equals("Net Banking"))
			pm = new NetBanking(amount);
		else if(s.equals("COD"))
			pm = new COD(amount);
		else if(s.equals("Wallet"))
			pm = new Wallets(amount);
		else
			return null;
		
		
		return pm;
	}

}

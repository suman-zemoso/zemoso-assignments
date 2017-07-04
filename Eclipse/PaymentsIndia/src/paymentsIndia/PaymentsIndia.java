package paymentsIndia;

import java.util.Scanner;

public class PaymentsIndia {

	public static void main(String[] args) {
		System.out.println("Welcome to payment portal");
		System.out.println("Payment options");
		System.out.println("Debit Card");
		System.out.println("Credit Card");
		System.out.println("Net Banking");
		System.out.println("COD");
		System.out.println("Wallet");
		System.out.print("Please enter the payment mode: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print("Please enter the amount to pay: ");
		int i = sc.nextInt();
		PaymentFactory pf = new PaymentFactory();
		PaymentMode pm = pf.makePaymentMode(s, i);
		pm.pay();
		sc.close();
		
	}
}

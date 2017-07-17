package subwayRecipes;

import java.util.List;

public class Sub implements SubPlan {

	private Bread bread;
	private Salad salad;
	private List<Sauce> sauces;
	private List<AddOn> addOns;
	
	@Override
	public void setBread(Bread bread) {
		this.bread = bread;
	}

	@Override
	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	@Override
	public void setSauce(List<Sauce> sauces) {
		this.sauces = sauces;
	}

	@Override
	public void setAddOn(List<AddOn> addOns) {
		this.addOns = addOns;
	}

	@Override
	public void printBill() {//prints the total cost of making of the sub.
		int totalCost = bread.getCost() + salad.getCost();
		
		for(Sauce sauce: sauces){
			totalCost += sauce.getCost();
		}
		
		for(AddOn addOn: addOns){
			totalCost += addOn.getCost();
		}
		
		System.out.println("Your total amount to be paid is: Rs." + totalCost);
	}
}

package subwayRecipes;

import java.util.List;

public interface SubPlan {

	void setBread(Bread bread);
	
	void setSalad(Salad salad);
	
	void setSauce(List<Sauce> sauces);
	
	void setAddOn(List<AddOn> addOns);
	
	void printBill();//prints the total cost of sub including it's ingredients costs.
}
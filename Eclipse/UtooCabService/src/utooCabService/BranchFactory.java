package utooCabService;

public abstract class BranchFactory {
	
	protected double cityCostFactor;
	
	public Cab makeCab(String type) {
		Cab c;
		if(type.equals("Mini")){ c = new MiniCab(cityCostFactor);}
		else if(type.equals("Micro")){ c = new MicroCab(cityCostFactor);}
		else{ c = null;}
		return c;
	}
}

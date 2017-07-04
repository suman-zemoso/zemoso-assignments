package utooCabService;

public class ChennaiBranchFactory extends BranchFactory {

	public ChennaiBranchFactory(){
		cityCostFactor = 1.3;
	}
	
	public Cab makeCab(String type) {
		Cab c = super.makeCab(type);
		if(c == null){
			if(type.equals("Sedan")){ c = new SedanCab(cityCostFactor);}
			else{ c = null;}
		}
		return c;
	}
}

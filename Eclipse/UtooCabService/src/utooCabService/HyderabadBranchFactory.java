package utooCabService;

public class HyderabadBranchFactory extends BranchFactory{

	public HyderabadBranchFactory(){
		cityCostFactor = 1.2;
	}
	
	public Cab makeCab(String type) {
		Cab c = super.makeCab(type);
		if(c == null){
			if(type.equals("SUV")){ c = new SUVCab(cityCostFactor);}
			else{ c = null;}
		}
		return c;
	}
}

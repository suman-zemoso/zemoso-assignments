package utooCabService;

public class BangaloreBranchFactory extends BranchFactory {

	public BangaloreBranchFactory(){
		cityCostFactor = 1.4;
	}
	
	public Cab makeCab(String type) {
		Cab c = super.makeCab(type);
		if(c == null){
			if(type.equals("SUV")){ c = new SUVCab(cityCostFactor);}
			else if(type.equals("Sedan")){ c = new SedanCab(cityCostFactor);}
			else{ c = null;}
		}
		return c;
	}
}

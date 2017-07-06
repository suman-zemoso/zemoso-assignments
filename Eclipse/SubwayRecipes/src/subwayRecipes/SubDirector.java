package subwayRecipes;

public class SubDirector {
	
	private SubBuilder subBuilder;
	
	public SubDirector(SubBuilder subBuilder){
		this.subBuilder = subBuilder;
	}
	
	public void makeSub(){
		subBuilder.addBread();
		subBuilder.addSalad();
		subBuilder.addSauce();
		subBuilder.addAddOns();
	}
	
	public Sub getSub(){
		return subBuilder.getSub();
	}
}
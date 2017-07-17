package subwayRecipes;

public class SubDirector {
	
	private SubBuilder subBuilder;
	
	public SubDirector(SubBuilder subBuilder){
		this.subBuilder = subBuilder;
	}
	
	public void makeSub(){//makes the sub by calling subBuilder's methods.
		subBuilder.addBread();
		subBuilder.addSalad();
		subBuilder.addSauce();
		subBuilder.addAddOns();
	}
	
	public Sub getSub(){//returns the sub that was made.
		return subBuilder.getSub();
	}
}

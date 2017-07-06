package subwayRecipes;

public class SweetOnionSauce implements Sauce {
	
	public SweetOnionSauce(){
		System.out.println("Sweet Onion Sauce is added.");
	}

	@Override
	public int getCost() {
		return 7;
	}

}

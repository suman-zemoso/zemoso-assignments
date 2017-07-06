package subwayRecipes;

public class ChilliSauce implements Sauce {
	
	public ChilliSauce(){
		System.out.println("Chilli Sauce is added.");
	}

	@Override
	public int getCost() {
		return 5;
	}

}

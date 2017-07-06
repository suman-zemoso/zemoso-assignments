package subwayRecipes;

public class TomatoSauce implements Sauce {
	
	public TomatoSauce(){
		System.out.println("Tomato Sauce is added.");
	}

	@Override
	public int getCost() {
		return 4;
	}

}

package subwayRecipes;

public class BrownBread implements Bread {
	
	public BrownBread(){
		System.out.println("Brown Bread is sliced.");
	}

	@Override
	public int getCost() {
		return 11;
	}
}

package subwayRecipes;

public class Mayonnaise implements Sauce {
	
	public Mayonnaise(){
		System.out.println("Mayonnaise is added.");
	}

	@Override
	public int getCost() {
		return 6;
	}

}

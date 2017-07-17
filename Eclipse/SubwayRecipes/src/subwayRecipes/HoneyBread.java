package subwayRecipes;

public class HoneyBread implements Bread{
	
	public HoneyBread(){
		System.out.println("Honey Bread is sliced.");
	}

	@Override
	public int getCost() {
		return 10;
	}
}

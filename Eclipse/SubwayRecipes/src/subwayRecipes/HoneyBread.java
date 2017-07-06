package subwayRecipes;

public class HoneyBread implements Bread{
	
	public HoneyBread(){
		System.out.println("Honey Bread is sliced.");
		System.out.println("BUG1");
	}

	@Override
	public int getCost() {
		return 10;
	}

}

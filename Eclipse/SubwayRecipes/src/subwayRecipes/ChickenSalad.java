package subwayRecipes;

public class ChickenSalad implements Salad {
	
	public ChickenSalad(){
		System.out.println("Chicken Salad is added.");
	}

	@Override
	public int getCost() {
		return 50;
	}

}

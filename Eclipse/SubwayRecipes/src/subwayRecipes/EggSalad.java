package subwayRecipes;

public class EggSalad implements Salad {
	
	public EggSalad(){
		System.out.println("Egg Salad is added.");
	}

	@Override
	public int getCost() {
		return 30;
	}
}

package subwayRecipes;

public class ChickenTandooriSalad implements Salad {
	
	public ChickenTandooriSalad(){
		System.out.println("Chicken Tandoori Salad is added.");
	}

	@Override
	public int getCost() {
		return 60;
	}
}

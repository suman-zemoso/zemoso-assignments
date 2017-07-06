package subwayRecipes;

public class Veggies implements AddOn {

	public Veggies(){
		System.out.println("Veggies-AddOn added.");
	}

	@Override
	public int getCost() {
		return 20;
	}

}

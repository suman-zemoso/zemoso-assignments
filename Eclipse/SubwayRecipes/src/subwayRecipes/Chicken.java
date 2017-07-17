package subwayRecipes;

public class Chicken implements AddOn {

	public Chicken(){
		System.out.println("Chicken-AddOn added.");
	}

	@Override
	public int getCost() {
		return 35;
	}
}

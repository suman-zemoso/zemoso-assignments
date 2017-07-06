package subwayRecipes;

public class Eggs implements AddOn {

	public Eggs(){
		System.out.println("Eggs-AddOn added.");
	}

	@Override
	public int getCost() {
		return 16;
	}

}

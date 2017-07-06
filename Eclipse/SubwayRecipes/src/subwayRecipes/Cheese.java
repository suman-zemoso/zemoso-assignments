package subwayRecipes;

public class Cheese implements AddOn {

	public Cheese(){
		System.out.println("Cheese-AddOn added.");
	}
	
	@Override
	public int getCost() {
		return 10;
	}

}

package subwayRecipes;

public class WhiteBread implements Bread {
	
	public WhiteBread(){
		System.out.println("White Bread is sliced.");
	}

	@Override
	public int getCost() {
		return 7;
	}

}

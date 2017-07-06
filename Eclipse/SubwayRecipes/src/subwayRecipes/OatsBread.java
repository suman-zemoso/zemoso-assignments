package subwayRecipes;

public class OatsBread implements Bread {
	
	public OatsBread(){
		System.out.println("Oats Bread is sliced.");
	}

	@Override
	public int getCost() {
		return 13;
	}

}

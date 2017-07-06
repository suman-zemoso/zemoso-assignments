package subwayRecipes;

public class SubwayRecipes {

	public static void main(String[] args) {
		SubBuilder chickenSubBuilder = new ChickenSubBuilder();
		
		SubDirector subDirector = new SubDirector(chickenSubBuilder);
		
		subDirector.makeSub();
		Sub chickenSub = subDirector.getSub();
		
		chickenSub.printBill();
	}

}

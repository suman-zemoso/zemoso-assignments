package subwayRecipes;

public class SubwayRecipes {

	public static void main(String[] args) {
		SubBuilder chickenSubBuilder = new ChickenSubBuilder();
		
		//creating a subDirector to make subs.
		//same subDirector will be used to make different subs.
		SubDirector subDirector = new SubDirector(chickenSubBuilder);
		
		//making chicken sub.
		subDirector.makeSub();
		Sub chickenSub = subDirector.getSub();
		
		chickenSub.printBill();
		
		SubBuilder chickenTandooriSubBuilder = new ChickenTandooriSubBuilder();
		
		//making chicken tandoori sub.
		subDirector = new SubDirector(chickenTandooriSubBuilder);
		
		subDirector.makeSub();
		Sub chickenTandooriSub = subDirector.getSub();
		
		chickenTandooriSub.printBill();
		
		//making egg sub.
		SubBuilder eggSubBuilder = new EggSubBuilder();
		
		subDirector = new SubDirector(eggSubBuilder);
		
		subDirector.makeSub();
		Sub eggSub = subDirector.getSub();
		
		eggSub.printBill();
		
		//making veg mexican patty sub.
		SubBuilder vegMexicanPattySubBuilder = new VegMexicanPattySubBuilder();
		
		subDirector = new SubDirector(vegMexicanPattySubBuilder);
		
		subDirector.makeSub();
		Sub vegMexicanPattySub = subDirector.getSub();
		
		vegMexicanPattySub.printBill();
		
		SubBuilder.sc.close();
	}

}

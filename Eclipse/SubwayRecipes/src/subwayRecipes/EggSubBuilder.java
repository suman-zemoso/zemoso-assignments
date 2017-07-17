package subwayRecipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EggSubBuilder extends SubBuilder {
	
	public EggSubBuilder(){
		System.out.println("Egg Sub is being prepared.");
		sub = new Sub();
	}

	@Override
	public void addBread() {//egg sub has brown bread
		sub.setBread(new BrownBread());
	}

	@Override
	public void addSalad() {//egg sub has egg salad
		sub.setSalad(new EggSalad());
	}

	@Override
	public void addSauce() {//egg sub has mayonnaise, tomato sauce
		List<Sauce> sauces = new ArrayList<Sauce>(
				Arrays.asList(new Mayonnaise(), new TomatoSauce()));
		sub.setSauce(sauces);
	}
}

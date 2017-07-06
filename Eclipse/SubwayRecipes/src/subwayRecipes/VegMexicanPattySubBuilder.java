package subwayRecipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VegMexicanPattySubBuilder extends SubBuilder {

	@Override
	public void addBread() {//veg mexican patty sub has White bread
		sub.setBread(new WhiteBread());
	}

	@Override
	public void addSalad() {//veg mexican patty sub has veg mexican patty salad
		sub.setSalad(new VegMexicanPattySalad());
	}

	@Override
	public void addSauce() {//veg mexican patty sub has mayonnaise, sweet onion sauce, chilli sauce
		List<Sauce> sauces = new ArrayList<Sauce>(
				Arrays.asList(new Mayonnaise(), new SweetOnionSauce(), new ChilliSauce()));
		sub.setSauce(sauces);
	}

}

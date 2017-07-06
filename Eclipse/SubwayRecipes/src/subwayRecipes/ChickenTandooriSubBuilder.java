package subwayRecipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChickenTandooriSubBuilder extends SubBuilder {

	@Override
	public void addBread() {//chicken tandoori sub has Oats bread
		sub.setBread(new OatsBread());
	}

	@Override
	public void addSalad() {//chicken tandoori sub has chicken tandoori salad
		sub.setSalad(new ChickenTandooriSalad());
	}

	@Override
	public void addSauce() {//chicken tandoori sub has mayonnaise, tomato sauce, sweet onion sauce
		List<Sauce> sauces = new ArrayList<Sauce>(
				Arrays.asList(new Mayonnaise(), new TomatoSauce(), new SweetOnionSauce()));
		sub.setSauce(sauces);
	}

}
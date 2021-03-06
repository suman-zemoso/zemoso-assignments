package subwayRecipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChickenSubBuilder extends SubBuilder {
	
	public ChickenSubBuilder(){
		System.out.println("Chicken Sub is being prepared.");
		sub = new Sub();
	}

	@Override
	public void addBread() {//chicken sub has honey bread
		Bread honeyBread= new HoneyBread();
		sub.setBread(honeyBread);
	}

	@Override
	public void addSalad() {//chicken sub has chicken salad

		sub.setSalad(new ChickenSalad());
	}

	@Override
	public void addSauce() {//chicken sub has mayonnaise, tomato sauce, chilli sauce
		List<Sauce> sauces = new ArrayList<Sauce>(
				Arrays.asList(new Mayonnaise(), new TomatoSauce(), new ChilliSauce()));
		sub.setSauce(sauces);
	}
	
}

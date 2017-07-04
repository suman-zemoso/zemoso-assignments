package utooCabService;

public class FactoryBuilder {
	public BranchFactory makeFactory(String city){
		BranchFactory bf;
		if(city.equals("Hyderabad")){bf = new HyderabadBranchFactory();}
		else if(city.equals("Bangalore")){bf = new BangaloreBranchFactory();}
		else if(city.equals("Chennai")){bf = new ChennaiBranchFactory();}
		else{bf = null;}
		return bf;
	}
}

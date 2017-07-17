package utooCab;

public class FactoryBuilder {

	private CabFactory cabFactory;
	
	public CabFactory makeCabFactory(String city){
		cabFactory = null;
		if(city.equals("Hyderabad")){
			cabFactory = new HyderabadCabFactory();
		}
		else if(city.equals("Bangalore")){
			cabFactory = new BangaloreCabFactory();
		}
		else if(city.equals("Chennai")){
			cabFactory = new ChennaiCabFactory();
		}
		return cabFactory;
	}
}

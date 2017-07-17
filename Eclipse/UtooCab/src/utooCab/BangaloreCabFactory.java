package utooCab;

public class BangaloreCabFactory implements CabFactory {

	private City city;
	
	public BangaloreCabFactory(){
		city = new Bangalore();
	}
	
	@Override
	public Cab makeCab(String model) {//returning cabs according to the argument string model.
		Cab cab = null;
		if(model.equals("Micro")){
			cab = new MicroCab(city.getCityCostFactor());
			cab.setCityName("Bangalore");
		}
		else if(model.equals("Mini")){
			cab = new MiniCab(city.getCityCostFactor());
			cab.setCityName("Bangalore");
		}
		else if(model.equals("Sedan")){
			cab = new SedanCab(city.getCityCostFactor());
			cab.setCityName("Bangalore");
		}
		else if(model.equals("SUV")){
			cab = new SUVCab(city.getCityCostFactor());
			cab.setCityName("Bangalore");
		}
		return cab;
	}

}

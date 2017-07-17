package utooCab;

public class ChennaiCabFactory implements CabFactory {

	private City city;
	
	public ChennaiCabFactory(){
		city = new Chennai();
	}
	
	@Override
	public Cab makeCab(String model) {
		Cab cab = null;
		if(model.equals("Micro")){
			cab = new MicroCab(city.getCityCostFactor());
			cab.setCityName("Chennai");
		}
		else if(model.equals("Mini")){
			cab = new MiniCab(city.getCityCostFactor());
			cab.setCityName("Chennai");
		}
		else if(model.equals("Sedan")){
			cab = new SedanCab(city.getCityCostFactor());
			cab.setCityName("Chennai");
		}
		return cab;
	}

}

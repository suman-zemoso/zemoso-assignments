package utooCab;

public class HyderabadCabFactory implements CabFactory {

	private City city;
	
	public HyderabadCabFactory(){
		city = new Hyderabad();
	}
	
	@Override
	public Cab makeCab(String model) {
		Cab cab = null;
		if(model.equals("Micro")){
			cab = new MicroCab(city.getCityCostFactor());
			cab.setCityName("Hyderabad");
		}
		else if(model.equals("Mini")){
			cab = new MiniCab(city.getCityCostFactor());
			cab.setCityName("Hyderabad");
		}
		else if(model.equals("SUV")){
			cab = new SUVCab(city.getCityCostFactor());
			cab.setCityName("Hyderabad");
		}
		return cab;
	}

}

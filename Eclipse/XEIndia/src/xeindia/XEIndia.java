package xeindia;

public class XEIndia {

	public static void main(String[] args) {
		Converter converter = new Converter();
		Individual observer1 = new Individual(converter, 1000);
		Individual observer2 = new Individual(converter, 2000);
		converter.setUSD(65);
		converter.setGBP(80);
		converter.setEuro(69);
		converter.setUSD(67);
		converter.setGBP(93);
		converter.setEuro(63);
	}

}

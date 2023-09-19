package automovel;

public class AutodromoPOO {

	public static void main(String[] args) {

		Carro jeep = new Carro();
		jeep.setChassi("09990");
		jeep.ligar();
	
		Moto z400 = new Moto();
		z400.setChassi("637373");
		z400.ligar();
	}
}

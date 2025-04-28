package entidades;

public class Moto extends Veiculos {

	private int cilindradas;
	
	public Moto(String modelo, int ano, String marca, double valorDiaria, int cilindradas) {
		super(modelo, ano, marca, valorDiaria);
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\n Cilindradas = " + cilindradas;
	}
	
	
	
	

	
	
}

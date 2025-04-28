package entidades;

import servico.Alugar;

public class Moto extends Veiculos implements Alugar {

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

	@Override
	public double calcAluguel(int dias) {
		
		double valorTotal = 0;
		
		if (cilindradas > 500) {
			valorTotal = getValorDiaria() * dias * 2;
		} else if(cilindradas <= 250) {
			valorTotal = getValorDiaria() * dias;
		} else if (cilindradas > 250 && cilindradas <= 500) {
			valorTotal = getValorDiaria() * dias * 1.5;
		}
		
		return valorTotal;
	}
	
	
	
	

	
	
}

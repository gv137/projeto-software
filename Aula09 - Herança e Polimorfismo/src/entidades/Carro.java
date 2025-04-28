package entidades;

import servico.Alugar;

public class Carro extends Veiculos implements Alugar{
	
	private boolean arCondicionado;
	

	public Carro(String modelo, int ano, String marca, double valorDiaria, boolean arCondicionado) {
		super(modelo, ano, marca, valorDiaria);
		this.arCondicionado = arCondicionado;
	}


	@Override
	public String toString() {
		return " Modelo = " + getModelo() + 
				"\n Ano = " + getAno() + 
				"\n Marca = " + getMarca() + 
				"\n Valor Diária = " + getValorDiaria() +
				"\n Ar Condicionado = " + arCondicionado;
	}


	@Override
	public double calcAluguel(int dias) {
		
		double valorTotal;
		
		if (arCondicionado) {
			valorTotal = getValorDiaria() * dias * 1.5;
		} else {
			valorTotal = dias * getValorDiaria();
		}
		
		return valorTotal;
	}

	
	
}

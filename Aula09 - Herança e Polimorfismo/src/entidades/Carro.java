package entidades;

public class Carro extends Veiculos{
	
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

	
	
}

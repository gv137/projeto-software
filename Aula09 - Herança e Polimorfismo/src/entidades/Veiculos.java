package entidades;

public class Veiculos {

	private String modelo;
	private int ano;
	private String marca;
	private double valorDiaria;

	
	//Construrores
	public Veiculos(String modelo, int ano, String marca, double valorDiaria) {
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
		this.valorDiaria = valorDiaria;
	}

	
	//Getters e Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}


	@Override
	public String toString() {
		return "Modelo = " + modelo + 
				"\n Ano = " + ano + 
				"\n Marca = " + marca + 
				"\n Valor Diária = " + valorDiaria
				;
	}
	
	
	
}

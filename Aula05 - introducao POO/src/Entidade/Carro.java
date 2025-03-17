package Entidade;

public class Carro {
	
	//atributos
	String fabricante;
	String modelo;
	int ano;
	String placa;
	String cor;
	
	//comportamentos
	int velocidade;
	
	public double acelera() {
		double velocidadeTotal = velocidade; 
		return velocidadeTotal;
	}
	
	public void exibirInfo() {
		System.out.println(
				"\nFabricante: " + fabricante +
				"\nModelo: " + modelo +
				"\nCor: " + cor +
				"\nAno: " + ano +
				"\nPlaca: " + placa 
				);
	}
}

package Entidade;

public class Principal {

	public static void main(String[] args) {
		Carro gol = new Carro();
		gol.fabricante = "VolksWagen";
		gol.modelo = "Gol";
		gol.placa = "AOV-7581";
		gol.ano = 2020;
		gol.cor = "Roxo";
		gol.acelera();
		gol.exibirInfo();
		
		Carro civic = new Carro();
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.placa = "EUB-6530";
		civic.ano = 2022;
		civic.cor = "Preta";
		civic.acelera();
		civic.exibirInfo();
		
		
		
		Carro etios = new Carro();
		etios.fabricante = "Toyota";
		etios.modelo = "Sedan";
		etios.placa = "PIF-7432";
		etios.ano = 2021;
		etios.cor = "Prata";
		etios.acelera();
		etios.exibirInfo();
		
		
	}

}

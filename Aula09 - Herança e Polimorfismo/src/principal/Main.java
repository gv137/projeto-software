package principal;

import entidades.Carro;
import entidades.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro civic = new Carro	("Civic", 2024, "Honda", 250, true);
		Moto hornet = new Moto ("Hornet", 2012, "Honda", 75, 150);
		
		System.out.println(civic.toString());	
		System.out.println("\nO valor do aluguel foi de R$ " + civic.calcAluguel(5) + "\n");
		
		
	}

}

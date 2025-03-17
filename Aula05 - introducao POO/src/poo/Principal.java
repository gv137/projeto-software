package poo;

public class Principal {

	public static void main(String[] args) {
		
		//gastos janeiro
		Conta janeiro = new Conta();
		janeiro.agua = 200;
		janeiro.alimentacao = 1000;
		janeiro.luz = 300;
		
		//gastos fevereiro
		Conta fevereiro = new Conta();
		fevereiro.agua = 250;
		fevereiro.alimentacao = 1000;
		fevereiro.luz = 250;
		

		//Somar todos os gastos
		
		double gastoJan = janeiro.somaConta();
		double gastoFev = fevereiro.somaConta();
		
		if(gastoJan > gastoFev) {
			System.out.println("Seu gasto de janeiro foi maior que fevereiro");
			
		} else if(gastoFev > gastoJan) {
			
			System.out.println("Seu gasto de fevereiro foi maior que janeiro");
		} else {
			
			System.out.println("Ambos os meses tiveram o mesmo gasto");
		}
	}

}

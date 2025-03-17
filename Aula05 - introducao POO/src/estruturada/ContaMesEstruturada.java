package estruturada;

import java.util.Scanner;

public class ContaMesEstruturada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double janAlim, janEnergia, janAgua, fevAlim, fevEnergia, fevAgua;
		
		//gastos janeiro
		janAlim = 1000;
		janEnergia = 300;
		janAgua = 300;
		
		//gastos fevereiro
		fevAlim = 1500;
		fevEnergia = 500;
		fevAgua = 500;
		
		//total gastos mensais
		double gastosJan = janAlim + janEnergia + janAgua;
		double gastosFev = fevAlim + fevEnergia + fevAgua;
		
		if (gastosJan > gastosFev) {
			System.out.println("O gasto de janeiro foi maior que o de fevereiro");
			
		} else if(gastosFev > gastosJan) {
			System.out.println("O gasto de fevereiro foi maior que o de janeiro");
			
		} else {
			System.out.println("Ambos os meses tiveram o mesmo gasto");
		}
		
		sc.close();

		
	}

}

package tratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
				
				
		
		
		while (continuar)  {
			try {
				System.out.println("Insira um número para ser dividido ");
				int n1 = sc.nextInt();
				System.out.println("Insira o divisor");
				int n2 = sc.nextInt();
				
				System.out.println(n1 + " / " + n2 + " = " + n1/n2);
				
				continuar = false;
			}catch(ArithmeticException  | InputMismatchException e) {
				System.out.println("Erro" +e.getMessage()+ " na entrada, insira os valores novamente - ");
			}	
		}
		
		sc.close();
	}

}

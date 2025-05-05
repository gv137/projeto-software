package tratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		try {
//			System.out.print("Digite um número: ");
//			int numero = sc.nextInt();
//			System.out.println("O número digitado foi: " + numero);
//			
//			System.out.println("Digite outro valor: ");
//			int numero2 = sc.nextInt();
//			System.out.println("O número digitado foi: " + numero2);
//			
//		} catch	(InputMismatchException e) {
//			System.out.println("Digite um valor do tipo numérico: ");
//		}
		
//		try {
//		
//		int[] vetor = new int[5];
//		System.out.println(vetor[9]);
//		
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("O erro foi " + e.getMessage());
//		}
		
		
		try {
			double divisao = 10 / 0;
			System.out.println(divisao);
		}catch(ArithmeticException e) {
			System.out.println();
		}
		
	
		
		
			
//		System.out.println("FIM !_!");
		
		
		
		
		sc.close();
	}

}

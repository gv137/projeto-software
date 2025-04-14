package vetores;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Criando vetores*/
		double[] notasAluno = new double[3];
		
		/*Atribuir valores, laço for*/
		
		for(int i = 0; i < notasAluno.length; i++) {
			
			System.out.println("Informe uma nota entre 0 a 10");
			double nota = sc.nextDouble();
			
			
			if(nota >= 0 && nota <= 10) {
				notasAluno[i] = nota;
			} else {
				System.out.println("Valor inválido, insira o valor novamente");
				i -= 1;
			}
		}

		 for (double nota : notasAluno) {
			 System.out.println(nota);
		 }
		
		sc.close();
	}

}

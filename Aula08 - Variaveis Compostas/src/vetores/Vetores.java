package vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Criando vetores*/
		 
		 double[] notasAluno = new double[3];
		  
		 /*Atribuir valores*/
		 
		 notasAluno [0] = 7;
		 notasAluno [1] = 9;
		 notasAluno [2] = 5;
		 	
		 /*Ler valores do vetor*/
		 
		 /*
		 System.out.println(notasAluno[0]);
		 System.out.println(notasAluno[1]);
		 System.out.println(notasAluno[2]);
		 */
		 
		 /*Ler valores do vetor - for*/
		 for (double nota : notasAluno) {
			 System.out.println(nota);
		 }
		
		sc.close();
		
	}

}

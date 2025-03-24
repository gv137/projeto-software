package principal;
import java.util.Scanner;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Livro harry = new Livro();*/
		
		System.out.println("Informe os dados do livro");
	/*	
		System.out.print("Livro: ");
		harry.livro = sc.nextLine();
		System.out.print("Autor: ");
		harry.autor = sc.nextLine();
		System.out.print("Quantidade: ");
		harry.quantidade = sc.nextInt();
		System.out.print("Valor: ");
		harry.valor = sc.nextDouble();
		
		System.out.println(harry.toString()); */
		
		Livro magico = new Livro();
		
		/*Atributos*/
		System.out.print("Livro: ");
		magico.livro = sc.nextLine();
		System.out.print("Autor: ");
		magico.autor = sc.nextLine();
		System.out.print("Quantidade: ");
		magico.quantidade = sc.nextInt();
		System.out.print("Valor: ");
		magico.valor = sc.nextDouble();
		
		System.out.println("Informe a quantidade de livros emprestados: ");
		int quantidade = sc.nextInt();
		magico.emprestaLivro(quantidade);
		
		System.out.println("O valor total de compra foi de" + magico.valorCompra(quantidade));
		
		System.out.println("Informe a quantidade de livros devolvidos: ");
		quantidade = sc.nextInt();
		magico.devolveLivro(quantidade);
		
		
		/*Métodos sendo executados*/
		
		System.out.println(magico);
		
		System.out.println("\nO valor total dos livros é de " + magico.valorTotalLivro() + " reais");
		
		System.out.println("\nResta um total de " + magico.quantidade +" livros no estoque");
		
		System.out.println("\nDados atualizados " + magico);
		
		
		
		sc.close();
		
	}

}

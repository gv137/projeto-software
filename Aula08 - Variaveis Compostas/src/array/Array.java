package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		
		List <String> listaNomes = new ArrayList<>();
		
		/*Adicionando itens*/
		listaNomes.add("Pedro");
		listaNomes.add("Gustavo");
		listaNomes.add("João");
		listaNomes.add("Vitor");
		listaNomes.add("Thamirys");
		
		/*Adicionando em uma posição desejada*/
		listaNomes.add(2, "William");
		
		/*Verifica o tamanho da lista*/
		System.out.println(listaNomes.size());
		
		/*Remover um item da lista pelo valor*/
		listaNomes.remove("Gustavo");
		
		
		/*Percorrer a Array e os Vetores*/
		for(String nome : listaNomes) {
			System.out.println(nome);
		}
		
	}

}

package principal;

import entidades.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria gustavo = new ContaBancaria("gustavo", 290134);
		ContaBancaria pedro = new ContaBancaria("Pedro", 1233456);
		
		gustavo.setTitular("Gustavo Viana");
		
		System.out.println("O saldo do "+ gustavo.getTitular() + " é de R$" + gustavo.getSaldo());
		
		/*
		System.out.println(gustavo);
		System.out.println(pedro);
		*/
	}

}

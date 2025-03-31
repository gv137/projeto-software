package principal;

import entidades.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria gustavo = new ContaBancaria("gustavo", 2000);
			
		gustavo.setTitular("Gustavo Viana");
		
		gustavo.depositar(500);
		gustavo.sacar(3000);
		
		System.out.println("O saldo do "+ gustavo.getTitular() + " é de R$" + gustavo.getSaldo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - sacar");
            System.out.println("2 - depositar");
            System.out.println("3 - sair");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Valor total do estoque: " + roupa.calcularValorTotal());
                    break;
                case 2:
                    System.out.print("Quantidade a adicionar: ");
                    int adicionar = sc.nextInt();
                    roupa.adicionarEstoque(adicionar);
                    break;
                case 3:
                    System.out.print("Quantidade a remover: ");
                    int remover = sc.nextInt();
                    roupa.removerEstoque(remover);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
		
		/*
		System.out.println(gustavo);
		System.out.println(pedro);
		*/
	}

}

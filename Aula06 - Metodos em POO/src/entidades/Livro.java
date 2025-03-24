package entidades;

public class Livro {
	
	public String livro;
	public String autor;
	public int quantidade;
	public double valor;
	
	/*
	 * public String exibeDados() {
	 * 
	 * return "Livro: " + livro + "\nAutor: " + autor + "\nQuantidade: " +
	 * quantidade + "\nValor Total: " + valor;
	 * 
	 * }
	 */

	@Override
	public String toString() {
		return "livro: " + livro +
			   "\nautor: " + autor + 
			   "\nquantidade: " + quantidade + 
			   "\nvalor: " + valor;
	}
	
	public double valorTotalLivro() {
		double valorTotal = quantidade * valor;
		return valorTotal;
	}
	
	public void emprestaLivro(int quantidade) {
	
	this.quantidade -= quantidade;
	
	}
	
	public void devolveLivro(int quantidade) {
		this.quantidade += quantidade;
	}

}

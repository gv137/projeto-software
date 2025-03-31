package entidades;

public class ContaBancaria {
	
	
	//Atributos
	private String titular;
	private double saldo;
	
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	//Métodos Setters e Getters
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	//Métodos altera saldo
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} 
		else {
			System.out.println("Valor inválido");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Valor inválido");
		}
	}
	
	
	
	
	@Override
	public String toString() {
		return "titular = " + titular + 
			   " \nsaldo = R$" + saldo;
	}




	
	

}

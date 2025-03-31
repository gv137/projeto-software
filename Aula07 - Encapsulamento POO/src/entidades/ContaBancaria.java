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
	
	@Override
	public String toString() {
		return "titular = " + titular + 
			   " \nsaldo = R$" + saldo;
	}



	
	
	

}

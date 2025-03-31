package entidades;

public class ContaBancaria {
	
	
	//Atributos
	private String titular;
	private double saldo;
	
	
	//Métodos
	public ContaBancaria (String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	//Métodos Setters

	public String setTitular(String titular) {
		return this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
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

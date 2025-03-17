package poo;

public class Conta {
	
	//Atributos
	
	double alimentacao;
	double agua;
	double luz;
	
	
	//Métodos
	
	public double somaConta() {
		
	double gastoMes = alimentacao + luz + agua;
	return gastoMes;
		
	}
	
}

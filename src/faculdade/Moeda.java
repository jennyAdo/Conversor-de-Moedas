package faculdade;

//criação de uma classe abstrata mãe moeda 
public abstract class Moeda {
	double valor;
	

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	//métodos da classe mãe 
	abstract public void info (); 		

	abstract public double converter();
	
	public double getValor() {
		return valor; }
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	abstract public void print();
	
	abstract public boolean Igual(Moeda M);
	
} 



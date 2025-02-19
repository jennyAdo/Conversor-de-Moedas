package faculdade;

public class Dollar extends Moeda {

	
	// Construtor que chama o construtor da classe mãe (Moeda)
	public Dollar(double valor) {
		super(valor);
	}
	
	//Métodos da classe mãe (Moeda)
	@Override
	public double converter() {
		double total = valor * 5.81;
		return total; 
	}

	@Override
	public void info() {
		double total = converter();
		System.out.println("Moeda: Dollar, Valor: " + valor);
		System.out.println("Conversão de Dollar para Reais: " + total); 

//Método que printa o tipo de moeda 
	}
	public void print () {
		System.out.println (valor + " Dollar");
	}
//Método ele compara o valor e a classe da moeda 
	public boolean Igual(Moeda M) {
		if(this.getClass() == M.getClass()) {
			return M.getValor() == valor;
		}
		return false;
	}

	
}


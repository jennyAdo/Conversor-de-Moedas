package faculdade;

public class Euro extends Moeda {

	
	// Construtor que chama o construtor da classe mãe (Moeda)
	public Euro(double valor) {
		super(valor);
	}

	//Métodos da classe mãe (Moeda)
	@Override
	public double converter() {
		double total = valor * 6.09;
		return total; 
	}

	@Override
	public void info() {
		double total = converter();
		System.out.println("Moeda: Euro, Valor: " + valor);
		System.out.println("Conversão de Euro para Reais: " + total); 
		
	}
	//Método que printa o tipo de moeda
	public void print () {
		System.out.println (valor + " Euro");
	}
	
	public boolean Igual(Moeda M) {
		if(this.getClass() == M.getClass()) {
			return M.getValor() == valor;
		}
		return false;
	}
}

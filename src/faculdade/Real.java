package faculdade;

public class Real extends Moeda {

	
	// Construtor que chama o construtor da classe mãe (Moeda)
	public Real(double valor) {
		super(valor);
	}

	//Métodos da classe mãe (Moeda)
	@Override
	public double converter() {
		return valor;
	}
	@Override
	public void info() {
		System.out.println("Moeda: Real, Valor: " + valor);
	}
	//Método que printa o tipo de moeda
	public void print () {
		System.out.println (valor + " Real");
	}
	public boolean Igual(Moeda M) {
		if(this.getClass() == M.getClass()) {
			return M.getValor() == valor;
		}
		return false;
	}


}

package faculdade;

import java.util.ArrayList;


//Criação de uma classe Cofrinho com um atributo ArrayList 
public class Cofrinho {
	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();

//Construtor da classe 
	public Cofrinho(ArrayList<Moeda> moedas) {
		super();
		this.moedas = moedas;
	}
	
//Método de adicionar moedas 
	public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }
//Método de remover moedas comparando o valor e a classe das moedas 
	public boolean removerMoeda(Moeda moeda) {
		int size = moedas.size();
		int i = 0;
		while (i < size) {
			if (moeda.Igual(moedas.get(i))) {
				moedas.remove(i);
				return true;
			}
			i++;
		}
		return false;
		
	}
	
//Método de listagem 
	public void listarMoedas() {
        for (Moeda moeda : moedas) { 
            moeda.print();
        }
    }
	
//Método do valor total convertido em reais 
	 public double calcularTotalEmReal() {
	        double total = 0;
	        for (int i = 0; i < moedas.size(); i++) {
	            total += moedas.get(i).converter(); 
	    }
			return total;
	 }
	 }



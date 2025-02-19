package faculdade;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		ArrayList<Moeda> moedas = new ArrayList <Moeda>();
		Cofrinho cofrinho = new Cofrinho(moedas); 
//Comando de repetição 
		while (true){
			System.out.println ("\n Menu:");
			System.out.println ("1. Adicionar Moeda");
			System.out.println ("2. Remover Moeda");
			System.out.println ("3. Listar Moedas");
			System.out.println ("4. Calcular Total Convertido: ");
			System.out.println ("5. Sair");
			int opcao = scanner.nextInt (); //Variável que armazena a escolha do usuário
			scanner.nextLine(); // Limpa o buffer do Scanner
			
		
//Comando de controle condicional 
		switch (opcao) {
		case 1:
			System.out.println ("Digite o valor que deseja adicionar:");
			double valor = scanner.nextDouble();
			scanner.nextLine();
			System.out.println ("Digite o tipo de moeda (Euro, Dollar ou Real): ");
			String tipo = scanner.nextLine();
			
			
//Criação de uma variável do tipo moeda (ponteiro nulo) 
			Moeda moeda = null; 
			if (tipo.equalsIgnoreCase ("Dollar")) { 
			moeda = new Dollar (valor); }  
			else if (tipo.equalsIgnoreCase ("Euro")) { 
			moeda = new Euro (valor);}
			else if (tipo.equalsIgnoreCase ("Real")) {
			moeda = new Real (valor);}
			else {
				System.out.println ("Tipo de Moeda Inválido");}
			if (moeda != null) {
				cofrinho.adicionarMoeda(moeda);
				System.out.println ("Moeda adicionada com sucesso!");
			}
			break; 
		case 2:
            System.out.print("Digite o valor da moeda para remover: ");
            valor = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Digite o tipo da moeda para remover (Dollar, Euro, Real): ");
            tipo = scanner.nextLine();
            
//Criação de uma variável do tipo moeda (ponteiro nulo)
            Moeda moedaRemover = null; 
            if (tipo.equalsIgnoreCase("Dollar")) {
                moedaRemover = new Dollar(valor); 
            } else if (tipo.equalsIgnoreCase("Euro")) {
                moedaRemover = new Euro(valor); 
            } else if (tipo.equalsIgnoreCase("Real")) {
                moedaRemover = new Real(valor); 
            } else {
                System.out.println("Tipo de Moeda Inválido!");
            }

            if (moedaRemover != null) {
                if(cofrinho.removerMoeda(moedaRemover)) {
                	System.out.println("Moeda Removida com Sucesso!");
                }
                else {
                	System.out.println("Não Foi Possível Remover Esta Moeda!");
                }
            }
            break;
            
 //Listagem das moedas 
		case 3: 
			cofrinho.listarMoedas();
            break;
            
//Conversão do valor total em reais 
		case 4: 
			double total = cofrinho.calcularTotalEmReal();
            System.out.println("Total convertido para Real: R$ " + total);
            break;
            
		 case 5:
             System.out.println("Saindo...");
             scanner.close();
             return;

         default:
             System.out.println("Opção inválida!");
		}
          	
		}
	}
}

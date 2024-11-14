package e_commerce;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		while (true) {
			
			Scanner leia = new Scanner(System.in);

	
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               Loja Calçado Novo                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar                            ");
			System.out.println("            2 - Adicionar Produto                    ");
			System.out.println("            3 - Remover Produto                      ");
			System.out.println("            4 - Calcular Produto                     ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			int opcao = leia.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("Criar conta");
				break;
			case 2:
				System.out.println("Adicionar produto");
				break;
			case 3:
				System.out.println("Remover produto");
				break;
			case 4:
				System.out.println("Calcular produto");
				break;
			case 5:
				System.out.println("Sair");
				break;
				
			}
			


		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Daniella Santana ");
		System.out.println("Generation Brasil - mariano.dani@hotmail.com");
		System.out.println("github.com/adanisantana");
		System.out.println("*********************************************************");
	}
}

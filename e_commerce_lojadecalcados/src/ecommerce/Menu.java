package ecommerce;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.controller.EcommerceController;
import ecommerce.model.Produto;

public class Menu {

	public static void main(String[] args) {
		
		while (true) {
			EcommerceController ecommerce = new EcommerceController();
			
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
			
			int opcao;
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			if (opcao == 5) {
				System.out.println("Loja Calçados Novos agradece a sua visita.");
				sobre();
                 		leia.close();
				System.exit(0);
			}
			switch(opcao) {
			case 1: 
				System.out.println("Criar conta");
				
				System.out.println("Digite seu nome:");
				String nomeCliente = leia.nextLine();
				
				System.out.println("Digite o cep");
				int cep = leia.nextInt();
				
				keyPress();
				break;
			case 2:
				System.out.println("Adicionar produto");
				System.out.println("Digite o produto");
				String compra = leia.nextLine();
				System.out.println("Digite quantidade");
			    int quantidade = leia.nextInt();
			    
			    
			    
				keyPress();
				break;
			case 3:
				System.out.println("Remover produto");
				keyPress();
				break;
			case 4:
				System.out.println("Calcular produto");
				ecommerce.calcularTotal();
				keyPress();
				break;
			case 5:
				System.out.println("Sair");
				keyPress();
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
	
	public static void keyPress() {

		try {

			System.out.println( "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
}
}
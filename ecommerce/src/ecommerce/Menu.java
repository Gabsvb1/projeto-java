package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import produto.model.produto;
import produto.model.UtensilhosCozinha;
import produto.model.CamaMesaBanho;

public class Menu {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		 int opcao;
		 
		 while (true) {

				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                LOJA COMPRE BEM                      ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Listar todos os produtos             ");
				System.out.println("            2 - Buscar produto por nome              ");
				System.out.println("            3 - Excluir produto                      ");
				System.out.println("            4 - Cadastrar produto                    ");                              
				System.out.println("            5 - Incluir produto no Estoque           ");
				System.out.println("            6 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     ");

				
				
				try {
					opcao = leia.nextInt();
				}catch(InputMismatchException e){
					System.out.println("\nDigite valores inteiros!");
					leia.nextLine();
					opcao=0;
				}

				if (opcao == 6) {
					System.out.println("\n Obrigado por comprar conosco!");
	                 leia.close();
					System.exit(0);
				}
				
				

				switch (opcao) {
					case 1:
						System.out.println("Listar todos os produtos\n\n");
						keyPress();

						break;
					case 2:
						System.out.println("Buscar produto por nome\n\n");
						keyPress();

						break;
					case 3:
						System.out.println("Excluir produto \n\n");
						keyPress();

						break;
					case 4:
						System.out.println("Cadastrar produto \n\n");
						keyPress();

						break;
					case 5:
						System.out.println("Incluir produto no Estoque \n\n");
						keyPress();
					case 6: 
						System.out.println("Sair \n\n");
						keyPress();
				
					default:
						System.out.println("\nOpção Inválida!\n");
						break;
				}
			}
		}

	private static void keyPress() {
		try {

			System.out.println( "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
		
	}
	    
		
		

		

	}



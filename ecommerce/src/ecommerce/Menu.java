package ecommerce;

import java.util.Scanner;

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
				System.out.println("            5 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     ");

				opcao = leia.nextInt();

				if (opcao == 5) {
					System.out.println("\n Obrigado por comprar conosco!");
	                 leia.close();
					System.exit(0);
				}

				switch (opcao) {
					case 1:
						System.out.println("Listar todos os produtos\n\n");

						break;
					case 2:
						System.out.println("Buscar produto por nome\n\n");

						break;
					case 3:
						System.out.println("Excluir produto \n\n");

						break;
					case 4:
						System.out.println("Cadastrar produto \n\n");

						break;
					case 5:
						System.out.println("Sair \n\n");
				
					default:
						System.out.println("\nOpção Inválida!\n");
						break;
				}
			}
		}
	    
		
		

		

	}



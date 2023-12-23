package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import produto.model.produto;
import produto.model.UtensilhosCozinha;
import produto.controller.produtoController;
import produto.model.CamaMesaBanho;

public class Menu {

	public static void main(String[] args) {
		produtoController produtos = new produtoController();
	
		Scanner leia = new Scanner(System.in);
		 int opcao;
		 float preco;
		 String titulo, cor;
		 int estoque,tipo,unidade;
		 
		 
		 
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
				System.out.println("            6 - Comprar                              ");
				System.out.println("            7 - Sair                                 ");
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

				if (opcao == 7) {
					System.out.println("\n Obrigado por comprar conosco!");
	                 leia.close();
					System.exit(0);
				}
				
				

				switch (opcao) {
					case 1:
						System.out.println("Listar todos os produtos\n\n");
						produtos.listarTodas();
						keyPress();

						break;
					case 2:
						System.out.println("Buscar produto por nome\n\n");
						
						System.out.println("Digite o nome do produto: ");
						titulo = leia.next();
						
						produtos.procurarPorNome(titulo);
						keyPress();
						break;
					case 3:
						System.out.println("Excluir produto \n\n");
						System.out.println("Digite o nome do produto: ");
						titulo = leia.next();
						produtos.excluir(titulo);
						keyPress();

						break;
					case 4:
						System.out.println("Cadastrar produto \n\n");
						System.out.println("Digite o nome do produto: ");
						titulo=leia.next();
						System.out.println("Digite o preço: ");
						preco=leia.nextFloat();
						System.out.println("Digite o estoque");
						estoque=leia.nextInt();
						do {
							System.out.println("Digite o tipo do produto (1-Cama e Mesa) (2 Cozinha) ");
							tipo=leia.nextInt();
						} while(tipo<1 && tipo>2);
							
							switch(tipo) {
								case 1 -> {
									System.out.println("Digite a cor ");
									cor=leia.next();
									produtos.cadastrar(new CamaMesaBanho(preco, titulo, estoque,cor));
									break;
									}
								case 2 -> {
									produtos.cadastrar(new UtensilhosCozinha(preco, titulo, estoque));
									break;
								}
							}
							
							
						
						keyPress();

						break;
					case 5:
						System.out.println("Incluir produto no Estoque \n\n");
						System.out.println("Digite o nome do produto: ");
						titulo = leia.next();
						System.out.println("Digite a quantidade a ser adicionada: ");
						unidade = leia.nextInt();
						
						produtos.incluir(unidade, titulo);
						keyPress();
					case 6:
						System.out.println("Comprar \n\n");
						System.out.println("digite o nome do produto: ");
						titulo = leia.next();
						System.out.println("digite a quantidade: ");
						unidade = leia.nextInt();
						produtos.comprar(unidade, titulo);
						keyPress();
						break;
					case 7: 
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



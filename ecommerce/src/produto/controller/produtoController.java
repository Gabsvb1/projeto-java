package produto.controller;

import java.util.ArrayList;

import produto.model.produto;
import produto.repository.produtoRepository;

public class produtoController implements produtoRepository {
	
	private ArrayList<produto> listaProdutos = new ArrayList<produto>();
	int numero = 0;

	@Override
	public void listarTodas() {
		for (var produto:listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void procurarPorNome(String titulo) {
		var produto = buscarNaCollection(titulo);
		
		if(produto != null)
			produto.visualizar();
		else
		
			System.out.println("\n Produto não encontrado!");
		
	}

	@Override
	public void excluir(String titulo) {
		var buscarProduto = buscarNaCollection(titulo);
		System.out.println(buscarProduto);
		
		if(buscarProduto != null) {
			if(listaProdutos.remove(buscarProduto) == true)
				System.out.println("\n O produto " + titulo + " foi excluido com sucesso!" );
			
		}else {
			System.out.println("\n O produto " + titulo + " não foi encontrado!");
		}
		
	}

	@Override
	public void cadastrar(produto produto) {
	        listaProdutos.add(produto);
	        System.out.println(" produto ok " + produto.getTitulo());
		
	}

	@Override
	public void incluir(int unidade , String titulo) {
		var buscarProduto = buscarNaCollection(titulo);
		System.out.println(buscarProduto);
		
		if(buscarProduto != null) {
			buscarProduto.setEstoque(buscarProduto.getEstoque() + unidade);
			
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), buscarProduto);
			
			System.out.println("Estoque atualizado!");
		}
		
	}

	@Override
	public void comprar(int unidade, String titulo) {
		var buscarProduto = buscarNaCollection(titulo);
		System.out.println(buscarProduto);
		
		if(buscarProduto != null) {
			if(buscarProduto.getEstoque() < unidade) {
				System.out.println("Produto sem estoque!");
			}else {
				buscarProduto.setEstoque(buscarProduto.getEstoque() - unidade);
				
				listaProdutos.set(listaProdutos.indexOf(buscarProduto), buscarProduto);
				
				System.out.println("Compra efetuada!");
			}
			
		}
		
	}
	
	public produto buscarNaCollection(String titulo) {
		
		for (var produto : listaProdutos) {
			System.out.println(produto.getTitulo());
			if (produto.getTitulo().equals(titulo) ) {
				return produto;
			}
		}
		
		return null;
	}
}

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(String titulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(produto produto) {
	        listaProdutos.add(produto);
	        System.out.println(" produto ok " + produto.getTitulo());
		
	}

	@Override
	public void incluir(int unidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprar(int unidade) {
		// TODO Auto-generated method stub
		
	}

}

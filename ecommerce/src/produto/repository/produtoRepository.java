package produto.repository;

import produto.model.produto;

public interface produtoRepository {
	
	public void listarTodas();
	public void procurarPorNome (String titulo);
	public void excluir (String titulo);
	public void cadastrar (produto produto);
	public void incluir (int unidade, String titulo);
	public void comprar (int unidade, String titulo);
}

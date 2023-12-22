package produto.model;

public abstract class produto {
	
	public produto(float preco, String titulo, int estoque) {
		this.preco = preco;
		this.titulo = titulo;
		this.estoque = estoque;
	}
	private float preco;
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	private String titulo;
	private int estoque;
	
	public boolean comprar (int unidade) { 
			
			if(this.getEstoque() < unidade) {
				System.out.println("\n Produto indisponivel!");
				return false;
			}
				
			this.setEstoque(this.getEstoque() - unidade);
			return true;
				
	}
	
	public boolean repor (int unidade) {
		if(unidade < 0) {
			System.out.println("\n Não é possivel adicionar");
			return false;
		}
			
		this.setEstoque(this.getEstoque() + unidade);
		return true;
			
}
	

  public void visualizar() {
	  
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome do produto: " + this.titulo);
		System.out.println("Preço: " + this.preco);
		System.out.println("Unidades " + this.estoque);
		
  }



}

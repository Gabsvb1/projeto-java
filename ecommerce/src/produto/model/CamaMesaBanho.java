package produto.model;

public class CamaMesaBanho extends produto{
	
	private String cor;

	public CamaMesaBanho(float preco, String titulo, int estoque) {
		super(preco, titulo, estoque);
		this.cor =cor;
		
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}

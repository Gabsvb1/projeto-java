package produto.model;

public class UtensilhosCozinha extends produto{
	
	private String tipo;

	public UtensilhosCozinha(float preco, String titulo, int estoque) {
		super(preco, titulo, estoque);
		this.tipo = "Utensilhos de cozinha";
	}

	

}

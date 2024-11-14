package ecommerce.model;

public abstract class Produto {
	
	private String nomeProduto;
	private int quantidade;
	private float preco;
	
	public Produto(String nomeProduto, int quantidade, int preco) {
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.preco = preco;
	
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void totalProduto(float preco) {

		this.totalProduto(this.getQuantidade() * this.getPreco());

	}
	
}



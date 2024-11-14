package ecommerce.model;

public class Tenis extends Produto {
	
	int tamanho;
	String cor;

	public Tenis(String nomeProduto, int quantidade, int preco, int tamanho, String cor) {
		super(nomeProduto, quantidade, preco);
		this.tamanho = tamanho;
	    this.cor = cor;
	    
		
	}
	
	
}

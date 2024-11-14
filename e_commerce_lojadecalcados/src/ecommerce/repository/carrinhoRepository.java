package ecommerce.repository;
import ecommerce.model.Produto;

public interface carrinhoRepository  {
	
		//Crud do carrinho
		public void adicionarProduto(Produto produto);
		public void removerProduto(String nomeProduto);
		public void listarTodosProdutos();
		
		
		// Método Total da Compra
		public void calcularTotal();
		
}

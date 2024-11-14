package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;

import ecommerce.repository.carrinhoRepository;

public class EcommerceController implements carrinhoRepository{
	
	private ArrayList<Produto> listarProdutos = new ArrayList<Produto>();
	int numero = 0;
	
	public Produto buscarProdutos(String nomeProduto) {
		for(var produto: listarProdutos) {
			if(produto.getNomeProduto() == nomeProduto) {
				return produto;
			}
			
		}
		return null;
	}

	@Override
	public void adicionarProduto(Produto produto) {
		listarProdutos.add(produto);
		
	}

	@Override
	public void removerProduto(String nomeProduto) {
		if (nomeProduto != null) {
			if(listarProdutos.remove(nomeProduto) == true)
				System.out.println("\nA Produto: " + nomeProduto + " foi deletado com sucesso!");
		}else
			System.out.println("\nA Produto " + nomeProduto + " não foi encontrada!");
		
	}

	public void listarTodosProdutos(String produto) {
		
			
		}
		
		
	

	@Override
	public void calcularTotal() {
		float total = 0;
		for (Produto produto : listarProdutos) {
            total += produto.getPreco();
 
        }

	
	}
	

}

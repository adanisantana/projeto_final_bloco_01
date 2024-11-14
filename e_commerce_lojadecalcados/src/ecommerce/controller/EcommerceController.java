package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;

import ecommerce.repository.carrinhoRepository;

public class EcommerceController implements carrinhoRepository{
	
	private ArrayList<Produto> listarProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void adicionarProduto(Produto produto) {
		listarProdutos.add(produto);
		System.out.println("Produto" + produto);
		
		
	}

	@Override
	public void removerProduto(String nomeProduto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodosProdutos(int quantidade, String nomeProduto, float precoTotal) {
		for(var produto: listarProdutos) {
			System.out.println("Produto:" + produto,"Quantidade"+ quantidade,"Custo:", +precoTotal );
		}
		
	}

	@Override
	public void calcularTotal() {
		// TODO Auto-generated method stub
		
	}
	

}

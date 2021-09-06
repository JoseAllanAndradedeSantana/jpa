package teste;

import java.util.List;

import infra.ProdutoDAO;
import model.Produto;

public class ObterProdutoDAO {
	
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos(5,0);
		
		produtos.stream().map(p -> p.getPreco() * p.getQuantidade()).forEach(System.out::println);
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
			
		}
	}

}

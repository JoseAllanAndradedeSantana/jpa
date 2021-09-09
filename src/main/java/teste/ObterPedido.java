package teste;

import java.util.List;

import infra.DAO;
import onetoone.ItemPedido;
import onetoone.Pedido;

public class ObterPedido {
	
	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(3L);
		List<Pedido> pedidoss = dao.obterTodos(10, 4);
		
		for (ItemPedido pedidos : pedido.getItens()) {
			System.out.println(pedidos.getProduto().getNome());
			System.out.println(pedidos.getPreco());
			
		}
		
		pedidoss.stream().map(p -> p.getData()).forEach(System.out::println);
		dao.fechar();
	}

}

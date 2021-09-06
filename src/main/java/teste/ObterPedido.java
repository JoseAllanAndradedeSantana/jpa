package teste;

import infra.DAO;
import onetoone.ItemPedido;
import onetoone.Pedido;

public class ObterPedido {
	
	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(3L);
		
		for (ItemPedido pedidos : pedido.getItens()) {
			System.out.println(pedidos.getProduto().getNome());
			System.out.println(pedidos.getPreco());
			
		}
		
		dao.fechar();
	}

}

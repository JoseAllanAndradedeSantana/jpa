package teste;

import infra.DAO;
import model.Produto;
import onetoone.ItemPedido;
import onetoone.Pedido;

public class NovoPedido {
	
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto(7100517L,"Notebook MAC PRO", 6.000, 10);
		ItemPedido itemPedido = new ItemPedido(pedido, produto, 5);
		
		dao.abrirT().incluir(produto).incluir(pedido).incluir(itemPedido).fecharT().fechar();
	}

}

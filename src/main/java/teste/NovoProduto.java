package teste;

import infra.DAO;
import model.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto(7891025102120L,"Agua Bonafont 500ml",5.50,120);
		dao.abrirT().incluir(produto).fecharT().fechar();
		
		System.out.println(dao);
	}
	

}

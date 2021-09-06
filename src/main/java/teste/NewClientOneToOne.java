package teste;

import infra.DAO;
import onetoone.Assento;
import onetoone.Cliente;

public class NewClientOneToOne {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("16B");
		Cliente cliente = new Cliente("Isaac Santana da Silva", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		   .incluir(assento)
		   .incluir(cliente)
		   .fecharT()
		   .fechar();
	}

}

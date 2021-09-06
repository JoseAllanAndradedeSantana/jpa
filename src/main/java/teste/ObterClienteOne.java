package teste;

import infra.DAO;
import onetoone.Cliente;

public class ObterClienteOne {
	
	public static void main(String[] args) {
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		Cliente cliente = dao.obterPorId(3L);
		
		String passagem = cliente.getAssento().getNome();
		String passagem2 = cliente.getNome();
		System.out.println("===== Dados do Passageiro =====");
		System.out.println("Nome: "+passagem2);
		System.out.println("Assento: "+passagem);
		System.out.println("===============================");
		
		
		dao.fechar();
	}

}

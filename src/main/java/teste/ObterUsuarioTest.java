package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class ObterUsuarioTest {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager en = emf.createEntityManager();
		
		Usuario usuario = en.find(Usuario.class, 1L);
		System.out.println(usuario.getNome());
		emf.close();
		en.close();
		
	}

}

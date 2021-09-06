package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class AlterarUsuarioTest2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager en = emf.createEntityManager();
		
		en.getTransaction().begin();
		Usuario usuario = en.find(Usuario.class, 2L);
		usuario.setEmail("mari@hotmail.com");
		en.merge(usuario);
		System.out.println(usuario.getEmail());
		en.getTransaction().commit();
		
		emf.close();
		en.close();
	}
}

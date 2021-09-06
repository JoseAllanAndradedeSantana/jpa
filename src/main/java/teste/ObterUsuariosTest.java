package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class ObterUsuariosTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager en = emf.createEntityManager();
		
		String jpql = "SELECT u FROM Usuario u";
		TypedQuery<Usuario> query = en.createQuery(jpql, Usuario.class);
		query.setMaxResults(6);
		List<Usuario> usuarios = query.getResultList();
		System.out.println(usuarios);
		usuarios.stream().limit(2).forEach(System.out::println);
		emf.close();
		en.close();
	}

}

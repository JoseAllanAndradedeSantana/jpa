package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager en = emf.createEntityManager();
		
		Usuario usuario = new Usuario("Mariane","Mariane@hotmail.com","1234");
		en.getTransaction().begin();
		en.persist(usuario);
		en.getTransaction().commit();
		
		en.close();
		emf.close();
	}

}

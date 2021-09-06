package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class RemoverUsuarioTest {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager en = emf.createEntityManager();
		
		en.getTransaction().begin();
		Usuario usuario = en.find(Usuario.class, 12L);
		if(usuario != null) {
			
			en.remove(usuario);
			System.out.println(usuario.getEmail());
			en.getTransaction().commit();
			
		}else {
			System.out.println("Usuario não existe na base de dados");
		}
		
		emf.close();
		en.close();
	}

}

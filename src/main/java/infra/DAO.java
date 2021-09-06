package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("jpa");
		}catch (Exception e) {
			// Log sistema...... log4j
			e.printStackTrace();
		}
	}
	
	
	
	public DAO() {
		this(null);
	}



	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> abrirT(){
		em.getTransaction().begin();
		return this;
	}
	public DAO<E> fecharT(){
		em.getTransaction().commit();
		return this;
	}
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	public DAO<E> incluirAtomico(E entidade){
		
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public E obterPorId(Object id) {
		return em.find(classe, id);
	}
	
	public List<E> obterTodos(int qtdade, int desc){
		if(classe == null) {
			throw new UnsupportedOperationException();
		}
		String jpql = "SELECT e FROM " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtdade);
		query.setFirstResult(desc);
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}

}

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePer {

	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	     EntityManager em=emf.createEntityManager();
	     EntityTransaction et=em.getTransaction();
	     
	     Per p=em.find(Per.class, 101);
	     
	     et.begin();
	     em.detach(p);
	     et.commit();
	     
	     
	     
	}

}

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args)
	{
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
       EntityManager em=emf.createEntityManager();
       EntityTransaction et=em.getTransaction();
       
       Per ps=new Per();
     ps.id=5;
     ps.name="GuruPrasad";
     ps.age=25;
     ps.gender="male";
      
      et.begin();
      em.persist(ps);
      et.commit();
	}

}

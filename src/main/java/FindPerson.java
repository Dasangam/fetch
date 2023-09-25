import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPerson {

	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	     EntityManager em=emf.createEntityManager();
	     
	     Per p=em.find(Per.class, 101);
	     
	     System.out.println(p.age);
	     System.out.println(p.gender);
	     System.out.println(p.id);
	     System.out.println(p.name);
	}

}

package Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmp {

	public static void main(String[] args)
	{
      EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
      EntityManager em=emf.createEntityManager();
      EntityTransaction et=em.getTransaction();
      
      Empoloye emp=new Empoloye();
      emp.setid(6);
      emp.setname("Punith");
      emp.setsal(320000);
      emp.setloc("Mallikethi");
      
      et.begin();
      em.persist(emp);
      et.commit();
	}

}

package MobilePack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveVideoPlatform {

	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	     EntityManager em=emf.createEntityManager();
	     EntityTransaction et=em.getTransaction();
	       
	     Platform p1=new Platform();
	     p1.setPid(201);
	     p1.setName("Youtub");
	     
	     Platform p2=new Platform();
	     p2.setPid(202);
	     p2.setName("ULLU");
	     
	     Video v1=new Video();
	     v1.setVid(101);
	     v1.setTitle("learn java");
	     v1.setDuration(10);
	     v1.setP(p1);
	     
	     Video v2=new Video();
	     v2.setVid(102);
	     v2.setTitle("learn sql");
	     v2.setDuration(16);
	     v2.setP(p1);
	     
	     Video v3=new Video();
	     v3.setVid(103);
	     v3.setTitle("Intervie");
	     v3.setDuration(14);
	     v3.setP(p2);
	     
	     Video v4=new Video();
	     v4.setVid(104);
	     v4.setTitle("Job portal");
	     v4.setDuration(20);
	     v4.setP(p2);
	     
	     et.begin();
	     em.persist(p1);
	     em.persist(p2);
	     em.persist(v1);
	     em.persist(v2);
	     em.persist(v3);
	     em.persist(v4);
	     et.commit();
	     
	}

}

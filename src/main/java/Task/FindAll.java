package Task;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;
public class FindAll {

	public static void main(String[] args)
	{
       String htl="SELECT s FROM Empoloye s";
       
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
       EntityManager em=emf.createEntityManager();
       EntityTransaction et=em.getTransaction();
       
       List<Empoloye> s= (List<Empoloye>) em.find(Empoloye.class, 1);
       et.begin();
       for(Empoloye e:s)
       {
    	   System.out.println(e.getid());
    	   System.out.println(e.getname());
    	   System.out.println(e.getsal());
    	   System.out.println(e.getloc());
       }
       et.commit();
	}

}

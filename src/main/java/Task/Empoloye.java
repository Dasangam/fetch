package Task;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empoloye
{
	@Id
   private int id;
   private String name;
   private int sal;
   private String loc;

   public void setid(int i)
   {
	   id=i;
   }
   public int getid()
   {
	   return id;
   }
   public void setname(String n)
   {
	   name=n;
   }
   public String getname()
   {
	   return name;
   }
   public void setsal(int s)
   {
	   sal=s;
   }
   public int getsal()
   {
	   return sal;
   }
   public void setloc(String l)
   {
	   loc=l;
   }
   public String getloc ()
   {
	return loc;
	   
   }
   
}

package MobilePack;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile

{
  @Id
   int mid;
   String brand;
   double price;
  @OneToMany
  List<Sim> sims;
  
  
  
}

package MobilePack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim 
{
   @Id
    int sid;
    String provider;
    String type;

}


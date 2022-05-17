package ua.kaudeveloper.warehouse.models.counterparty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;    
import java.util.Objects;

@Entity
public class Counterparty {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

 private long id;
 private String name;
 private String itin;
 private boolean buyer;
 private boolean contractor;
 private boolean other;
 private long maincounterparty;
public void setId(long id) {
  this.id = id;
}
public long getId() {
   return id;
} 
public void setName(String name) {
  this.name = name;
}
public String getName() {
   return name;
} 
public void setItin(String itin) {
  this.itin = itin;
}
public String getItin() {
   return itin;
} 
public void setBuyer(boolean buyer) {
  this.buyer = buyer;
}
public boolean getBuyer() {
   return buyer;
} 
public void setContractor(boolean contractor) {
  this.contractor = contractor;
}
public boolean getContractor() {
   return contractor;
} 
public void setOther(boolean other) {
  this.other = other;
}
public boolean getOther() {
   return other;
} 
public void setMaincounterparty(long maincounterparty) {
  this.maincounterparty = maincounterparty;
}
public long getMaincounterparty() {
   return maincounterparty;
} 
  @Override
public String toString() {
return "{"+
"\"id\":"+id+","+
"\"name\":\""+name+"\","+
"\"itin\":\""+itin+"\","+
"\"buyer\":"+buyer+","+
"\"contractor\":"+contractor+","+
"\"other\":"+other+","+
"\"maincounterparty\":"+maincounterparty+""
+"}";
}

	 @Override
    public int hashCode() {
        return Objects.hash(id,name,itin,buyer,contractor,other,maincounterparty);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counterparty obj__ = (Counterparty) o;
        return Objects.equals(id, obj__.id) &&
Objects.equals(name, obj__.name) &&
Objects.equals(itin, obj__.itin) &&
Objects.equals(buyer, obj__.buyer) &&
Objects.equals(contractor, obj__.contractor) &&
Objects.equals(other, obj__.other) &&
Objects.equals(maincounterparty, obj__.maincounterparty);

    }

}
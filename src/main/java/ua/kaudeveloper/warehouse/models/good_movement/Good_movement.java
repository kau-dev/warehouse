package ua.kaudeveloper.warehouse.models.good_movement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;    
import java.util.Objects;

@Entity
public class Good_movement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

 private long id;
 private long invoce;
 private long good;
 private long storage;
 private long conterparty;
 private double qty;
public void setId(long id) {
  this.id = id;
}
public long getId() {
   return id;
} 
public void setInvoce(long invoce) {
  this.invoce = invoce;
}
public long getInvoce() {
   return invoce;
} 
public void setGood(long good) {
  this.good = good;
}
public long getGood() {
   return good;
} 
public void setStorage(long storage) {
  this.storage = storage;
}
public long getStorage() {
   return storage;
} 
public void setConterparty(long conterparty) {
  this.conterparty = conterparty;
}
public long getConterparty() {
   return conterparty;
} 
public void setQty(double qty) {
  this.qty = qty;
}
public double getQty() {
   return qty;
} 
  @Override
public String toString() {
return "{"+
"\"id\":"+id+","+
"\"invoce\":"+invoce+","+
"\"good\":"+good+","+
"\"storage\":"+storage+","+
"\"conterparty\":"+conterparty+","+
"\"qty\":"+qty+""
+"}";
}

	 @Override
    public int hashCode() {
        return Objects.hash(id,invoce,good,storage,conterparty,qty);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good_movement obj__ = (Good_movement) o;
        return Objects.equals(id, obj__.id) &&
Objects.equals(invoce, obj__.invoce) &&
Objects.equals(good, obj__.good) &&
Objects.equals(storage, obj__.storage) &&
Objects.equals(conterparty, obj__.conterparty) &&
Objects.equals(qty, obj__.qty);

    }

}
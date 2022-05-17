package ua.kaudeveloper.warehouse.models.my_order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;    
import java.util.Objects;

@Entity
public class My_order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

 private long id;
 private long conterparty;
 private double sum;
 private double tax;
 private double total;
 private long employee;
public void setId(long id) {
  this.id = id;
}
public long getId() {
   return id;
} 
public void setConterparty(long conterparty) {
  this.conterparty = conterparty;
}
public long getConterparty() {
   return conterparty;
} 
public void setSum(double sum) {
  this.sum = sum;
}
public double getSum() {
   return sum;
} 
public void setTax(double tax) {
  this.tax = tax;
}
public double getTax() {
   return tax;
} 
public void setTotal(double total) {
  this.total = total;
}
public double getTotal() {
   return total;
} 
public void setEmployee(long employee) {
  this.employee = employee;
}
public long getEmployee() {
   return employee;
} 
  @Override
public String toString() {
return "{"+
"\"id\":"+id+","+
"\"conterparty\":"+conterparty+","+
"\"sum\":"+sum+","+
"\"tax\":"+tax+","+
"\"total\":"+total+","+
"\"employee\":"+employee+""
+"}";
}

	 @Override
    public int hashCode() {
        return Objects.hash(id,conterparty,sum,tax,total,employee);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        My_order obj__ = (My_order) o;
        return Objects.equals(id, obj__.id) &&
Objects.equals(conterparty, obj__.conterparty) &&
Objects.equals(sum, obj__.sum) &&
Objects.equals(tax, obj__.tax) &&
Objects.equals(total, obj__.total) &&
Objects.equals(employee, obj__.employee);

    }

}
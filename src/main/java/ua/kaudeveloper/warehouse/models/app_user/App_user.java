package ua.kaudeveloper.warehouse.models.app_user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;    
import java.util.Objects;

@Entity
public class App_user {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

 private long id;
 private String email;
 private String password;
 private String name;
 private long employee;
public void setId(long id) {
  this.id = id;
}
public long getId() {
   return id;
} 
public void setEmail(String email) {
  this.email = email;
}
public String getEmail() {
   return email;
} 
public void setPassword(String password) {
  this.password = password;
}
public String getPassword() {
   return password;
} 
public void setName(String name) {
  this.name = name;
}
public String getName() {
   return name;
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
"\"email\":\""+email+"\","+
"\"password\":\""+password+"\","+
"\"name\":\""+name+"\","+
"\"employee\":"+employee+""
+"}";
}

	 @Override
    public int hashCode() {
        return Objects.hash(id,email,password,name,employee);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App_user obj__ = (App_user) o;
        return Objects.equals(id, obj__.id) &&
Objects.equals(email, obj__.email) &&
Objects.equals(password, obj__.password) &&
Objects.equals(name, obj__.name) &&
Objects.equals(employee, obj__.employee);

    }

}
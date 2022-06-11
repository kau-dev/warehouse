package ua.kaudeveloper.warehouse.models.user;

import lombok.Getter;
import lombok.Setter;
import ua.kaudeveloper.warehouse.models.employee.Employee;
import ua.kaudeveloper.warehouse.models.role.Role;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    private Long user_id;
    
    
    private String email;
    
    
    private String password;
    
    
    @Transient
    private String passwordConfirm;
    
    
    private String username;
    
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Role role;
    
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Employee employee;


    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @ManyToMany
    private Set<Role> roles;

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public String getUsername() {
        return username;
    }
}
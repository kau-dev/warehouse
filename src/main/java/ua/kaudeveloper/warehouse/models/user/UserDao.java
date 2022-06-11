package ua.kaudeveloper.warehouse.models.user;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;      
import java.util.Optional;

@Service
public class UserDao  {

  @Autowired
  private UserRepository repository;

  public User save(User user) {
    return repository.save(user);
  }

  public List<User> getAllUsers() {
    List<User> users = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(users::add);
    return users;
  }

  public boolean deleteById(int userId) {
    repository.deleteById(userId);  
    return repository.existsById(userId);
  }  
  public void deleteAll() {
    repository.deleteAll();
  }
  public Optional<User> findById(int userId){
    return repository.findById(userId);
  }
  public long count(){
    return repository.count();
  }

}
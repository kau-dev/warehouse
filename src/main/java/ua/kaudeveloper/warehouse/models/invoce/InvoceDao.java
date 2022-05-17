package ua.kaudeveloper.warehouse.models.invoce;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;      
import java.util.Optional;

@Service
public class InvoceDao {

  @Autowired
  private InvoceRepository repository;

  public Invoce save(Invoce invoce) {
    return repository.save(invoce);
  }

  public List<Invoce> getAllInvoces() {
    List<Invoce> invoces = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(invoces::add);
    return invoces;
  }

  public boolean deleteById(int invoceId) {
    repository.deleteById(invoceId);  
    return repository.existsById(invoceId);
  }  
  public void deleteAll() {
    repository.deleteAll();
  }
  public Optional<Invoce> findById(int invoceId){
    return repository.findById(invoceId);
  }
  public Long count(){
    return repository.count();
  }
}
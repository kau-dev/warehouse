package ua.kaudeveloper.warehouse.models.counterparty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CounterpartyDao {

  @Autowired
  private CounterpartyRepository repository;

  public Counterparty save(Counterparty counterparty) {
    return repository.save(counterparty);
  }

  public List<Counterparty> getAllCounterparties() {
    List<Counterparty> counterparties = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(counterparties::add);
    return counterparties;
  }

  public boolean deleteById(Long counterpartyId) {
    repository.deleteById(counterpartyId);  
    return repository.existsById(counterpartyId);
  }  
  public void deleteAll() {
    repository.deleteAll();
  }
  public Optional<Counterparty> findById(Long counterpartyId){
    return repository.findById(counterpartyId);
  }
  public Long count(){
    return repository.count();
  }
}
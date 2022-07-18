package ua.kaudeveloper.warehouse.models.my_order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class My_orderDao {

  @Autowired
  private My_orderRepository repository;

  public My_order save(My_order my_order) {
    return repository.save(my_order);
  }

  public List<My_order> getAllMy_orders() {
    List<My_order> my_orders = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(my_orders::add);
    return my_orders;
  }

  public boolean deleteById(Long my_orderId) {
    repository.deleteById(my_orderId);  
    return repository.existsById(my_orderId);
  }  
  public void deleteAll() {
    repository.deleteAll();
  }
  public Optional<My_order> findById(Long my_orderId){
    return repository.findById(my_orderId);
  }
  public Long count(){
    return repository.count();
  }
}
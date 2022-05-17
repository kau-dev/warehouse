package ua.kaudeveloper.warehouse.models.good;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;      
import java.util.Optional;

@Service
public class GoodDao {

  @Autowired
  private GoodRepository repository;

  public Good save(Good good) {
    return repository.save(good);
  }

  public List<Good> getAllGoods() {
    List<Good> goods = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(goods::add);
    return goods;
  }

  public boolean deleteById(int goodId) {
    repository.deleteById(goodId);  
    return repository.existsById(goodId);
  }  
  public void deleteAll() {
    repository.deleteAll();
  }
  public Optional<Good> findById(int goodId){
    return repository.findById(goodId);
  }
  public Long count(){
    return repository.count();
  }
}
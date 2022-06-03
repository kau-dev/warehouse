package ua.kaudeveloper.warehouse.models.category;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;      
import java.util.Optional;

@Service
public class CategoryDao {

  @Autowired
  private CategoryRepository repository;

  public Category save(Category category) {
    return repository.save(category);
  }

  public List<Category> getAllCategorys() {
    List<Category> categorys = new ArrayList<>();
    Streamable.of(repository.findAll())
        .forEach(categorys::add);
    return categorys;
  }

  public boolean deleteById(int categoryId) {
    repository.deleteById(categoryId);  
    return repository.existsById(categoryId);
  }  
  public void deleteAll() {
    repository.deleteAll();
  }
  public Optional<Category> findById(int categoryId){
    return repository.findById(categoryId);
  }
  public Long count(){
    return repository.count();
  }
}
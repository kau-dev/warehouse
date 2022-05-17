package ua.kaudeveloper.warehouse.models.invoce;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoceRepository extends CrudRepository<Invoce, Integer> {

}
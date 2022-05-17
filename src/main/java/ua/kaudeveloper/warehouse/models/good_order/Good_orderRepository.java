package ua.kaudeveloper.warehouse.models.good_order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Good_orderRepository extends CrudRepository<Good_order, Integer> {

}
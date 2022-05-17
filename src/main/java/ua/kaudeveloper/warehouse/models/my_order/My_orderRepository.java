package ua.kaudeveloper.warehouse.models.my_order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface My_orderRepository extends CrudRepository<My_order, Integer> {

}
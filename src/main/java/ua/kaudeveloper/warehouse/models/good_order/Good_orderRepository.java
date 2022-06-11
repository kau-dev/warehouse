package ua.kaudeveloper.warehouse.models.good_order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Good_orderRepository extends JpaRepository<Good_order, Integer> {

}
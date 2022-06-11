package ua.kaudeveloper.warehouse.models.my_order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface My_orderRepository extends JpaRepository<My_order, Integer> {

}
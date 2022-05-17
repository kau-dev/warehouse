package ua.kaudeveloper.warehouse.models.good_movement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Good_movementRepository extends CrudRepository<Good_movement, Integer> {

}
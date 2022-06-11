package ua.kaudeveloper.warehouse.models.good_movement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Good_movementRepository extends JpaRepository<Good_movement, Integer> {

}
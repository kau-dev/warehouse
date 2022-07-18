package ua.kaudeveloper.warehouse.models.good_movement;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Good_movementRepository extends PagingAndSortingRepository<Good_movement, Integer> {

}